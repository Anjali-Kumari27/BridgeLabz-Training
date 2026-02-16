package com.jdbc.transactionmanage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/jdbc";
    private static final String USER = "root";
    private static final String PASSWORD = "anjali123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
