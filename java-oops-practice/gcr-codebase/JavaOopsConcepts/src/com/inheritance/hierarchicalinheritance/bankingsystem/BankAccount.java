package com.inheritance.hierarchicalinheritance.bankingsystem;

public class BankAccount {

    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Common method
    void displayAccountDetails() {
        System.out.println("\nAccount Number   : " + accountNumber);
        System.out.println("Balance          : ₹" + balance);
    }
}
