package com.csv.csvreport;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class DbToCSVReport {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/testdb"; // replace with your DB URL
        String username = "root";
        String password = "password";
        String outputFile = "C:\\Users\\91743\\OneDrive\\Desktop\\employees_report.csv";

        String sql = "SELECT id, name, department, salary FROM employees";

        try (
                Connection conn = DriverManager.getConnection(jdbcURL, username, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            // Write CSV header
            bw.write("Employee ID,Name,Department,Salary");
            bw.newLine();

            // Write each record
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                double salary = rs.getDouble("salary");

                // Write row
                bw.write(id + "," + name + "," + department + "," + salary);
                bw.newLine();
            }

            System.out.println("CSV report generated successfully at " + outputFile);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
