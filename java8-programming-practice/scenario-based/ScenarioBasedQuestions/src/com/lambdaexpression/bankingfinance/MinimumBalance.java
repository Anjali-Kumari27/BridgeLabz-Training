package com.lambdaexpression.bankingfinance;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MinimumBalance {
	public static void main(String[] args) {
		List<BankAccount> accountDetail = new ArrayList<>();
		accountDetail.add(new BankAccount("Anjali", "PNB", 1253, 28900));
		accountDetail.add(new BankAccount("Arpita", "SBI", 1200, 300));
		accountDetail.add(new BankAccount("Ananya", "ICCI", 1190, 8500));
		accountDetail.add(new BankAccount("Himanshu", "PNB", 1030, 1800));

		// Predicate to check minimum balance
		Predicate<BankAccount> minBalance = a -> a.balance >= 2000;

		accountDetail.forEach(a -> {
			if (minBalance.test(a)) {
				System.out.println(a.accHolder + " follows the minimum balance rule");
			} else {
				System.out.println(a.accHolder + " does NOT have enough balance");
			}
		});

	}

}
