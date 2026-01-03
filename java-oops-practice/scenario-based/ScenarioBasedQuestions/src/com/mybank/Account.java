package com.mybank;

public abstract class Account implements ITransaction {
	
	// Stores account number
    protected String accountNumber;
    
    // Stores current account balance
    private double balance;

    // Constructor to initialize account number and balance
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    // Method to deposit money into account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: ₹" + amount);
        }
    }

    @Override
    // Method to withdraw money from account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
        	
        	// Deduct amount from balance
            balance -= amount;
            
            System.out.println("Successfully withdrawn: ₹" + amount);
        } 
        else {
            System.out.println("Error: Insufficient balance or invalid amount.");
        }
    }

    @Override
    // Method to return current balance
    public double checkBalance() {
        return balance;
    }

    // Allows child classes to update balance (used for interest)
    protected void updateBalance(double newBalance) {
        this.balance = newBalance;
    }

    // Abstract method to be implemented by Savings / Current account
    public abstract void calculateInterest();
}