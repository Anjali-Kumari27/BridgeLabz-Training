package com.variousinterfaces.additionalquestion.bankingsystem;

public class Account {

    int accountNumber;
    double balance;

    // Constructor
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Display account details
    public String toString() {
        return "Account No: " + accountNumber + ", Balance: " + balance;
    }
}

