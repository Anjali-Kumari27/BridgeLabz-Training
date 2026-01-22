package com.exceptionhandling.banktransactionsystem;

public class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientBalanceException {

        // Negative amount check
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        // Insufficient balance check
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        // Successful withdrawal
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

