package com.artify;

public class User {

    private String name;
    private double walletBalance;

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void deductBalance(double amount) {
        walletBalance -= amount;   // Operator usage
    }

    public void displayUser() {
        System.out.println("User: " + name +
                " | Wallet Balance: ₹" + walletBalance);
    }
}
