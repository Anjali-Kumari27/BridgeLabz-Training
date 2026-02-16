package com.jdbc.transactionmanage;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankDao {

	public BigDecimal getBalance(int accountId) {
		String sql = "SELECT balance FROM accounts WHERE account_id = ?";
		try (Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setInt(1, accountId);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next())
					return rs.getBigDecimal("balance");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; // account not found
	}

	public List<String> getTransactionHistory(int accountId) {
		String sql = "SELECT txn_id, from_account, to_account, amount, txn_type, status, txn_time, remarks FROM transactions WHERE from_account = ? OR to_account = ? ORDER BY txn_time DESC";

		List<String> history = new ArrayList<>();

		try (Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setInt(1, accountId);
			ps.setInt(2, accountId);

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					history.add("TXN#" + rs.getLong("txn_id") + " | " + rs.getTimestamp("txn_time") + " | type="
							+ rs.getString("txn_type") + " | status=" + rs.getString("status") + " | from="
							+ rs.getObject("from_account") + " | to=" + rs.getObject("to_account") + " | amt="
							+ rs.getBigDecimal("amount") + " | remarks=" + rs.getString("remarks"));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return history;
	}

	// Transfer using TRANSACTION (commit/rollback)
	public boolean transferMoney(int fromAcc, int toAcc, BigDecimal amount) {
		if (fromAcc == toAcc) {
			System.out.println("From and To account cannot be same.");
			return false;
		}
		if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
			System.out.println("Amount must be > 0.");
			return false;
		}

		String lockFrom = "SELECT balance FROM accounts WHERE account_id = ? FOR UPDATE";
		String lockTo = "SELECT balance FROM accounts WHERE account_id = ? FOR UPDATE";
		String debit = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
		String credit = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";
		String insertTxn = 
			    "INSERT INTO transactions(from_account, to_account, amount, txn_type, status, remarks) " +
			    "VALUES (?, ?, ?, ?, ?, ?)";


		Connection con = null;

		try {
			con = DBUtil.getConnection();
			con.setAutoCommit(false); // start transaction

			BigDecimal fromBal;
			BigDecimal toBal;

			// 1) Lock + read from-account balance
			try (PreparedStatement ps = con.prepareStatement(lockFrom)) {
				ps.setInt(1, fromAcc);
				try (ResultSet rs = ps.executeQuery()) {
					if (!rs.next()) {
						insertTransaction(con, insertTxn, fromAcc, toAcc, amount, "TRANSFER", "FAILED",
								"From account not found");
						con.rollback();
						return false;
					}
					fromBal = rs.getBigDecimal("balance");
				}
			}

			// 2) Lock + read to-account balance
			try (PreparedStatement ps = con.prepareStatement(lockTo)) {
				ps.setInt(1, toAcc);
				try (ResultSet rs = ps.executeQuery()) {
					if (!rs.next()) {
						insertTransaction(con, insertTxn, fromAcc, toAcc, amount, "TRANSFER", "FAILED",
								"To account not found");
						con.rollback();
						return false;
					}
					toBal = rs.getBigDecimal("balance");
				}
			}

			// 3) Validate sufficient balance
			if (fromBal.compareTo(amount) < 0) {
				insertTransaction(con, insertTxn, fromAcc, toAcc, amount, "TRANSFER", "FAILED", "Insufficient balance");
				con.rollback();
				return false;
			}

			// 4) Debit
			try (PreparedStatement ps = con.prepareStatement(debit)) {
				ps.setBigDecimal(1, amount);
				ps.setInt(2, fromAcc);
				int r1 = ps.executeUpdate();
				if (r1 != 1) {
					insertTransaction(con, insertTxn, fromAcc, toAcc, amount, "TRANSFER", "FAILED", "Debit failed");
					con.rollback();
					return false;
				}
			}

			// 5) Credit
			try (PreparedStatement ps = con.prepareStatement(credit)) {
				ps.setBigDecimal(1, amount);
				ps.setInt(2, toAcc);
				int r2 = ps.executeUpdate();
				if (r2 != 1) {
					insertTransaction(con, insertTxn, fromAcc, toAcc, amount, "TRANSFER", "FAILED", "Credit failed");
					con.rollback();
					return false;
				}
			}

			// 6) Insert SUCCESS transaction record
			insertTransaction(con, insertTxn, fromAcc, toAcc, amount, "TRANSFER", "SUCCESS", "Transfer completed");

			con.commit(); // commit transaction
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				if (con != null)
					con.rollback(); // rollback on error
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return false;

		} finally {
			try {
				if (con != null) {
					con.setAutoCommit(true);
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private void insertTransaction(Connection con, String insertTxnSql, Integer fromAcc, Integer toAcc,
			BigDecimal amount, String type, String status, String remarks) throws SQLException {

		try (PreparedStatement ps = con.prepareStatement(insertTxnSql)) {
			if (fromAcc == null)
				ps.setNull(1, Types.INTEGER);
			else
				ps.setInt(1, fromAcc);
			if (toAcc == null)
				ps.setNull(2, Types.INTEGER);
			else
				ps.setInt(2, toAcc);
			ps.setBigDecimal(3, amount);
			ps.setString(4, type);
			ps.setString(5, status);
			ps.setString(6, remarks);
			ps.executeUpdate();
		}
	}
}
