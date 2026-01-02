package com.ewalletapplication;

import java.util.ArrayList;
import java.util.List;

//Abstract Wallet class represents a generic e-wallet
//Encapsulation is used to protect the balance and transaction history
public abstract class Wallet {
	
	// Private balance to protect user's money
    private double balance; 
    
    // List to store all transactions
    protected List<Transaction> history;

    // Default constructor initializes balance and transaction history
    public Wallet() {
        this.balance = 0.0;
        this.history = new ArrayList<>();
    }

    //Constructor with referral bonus
    // Adds bonus to balance and records the transaction
    public Wallet(double referralBonus) {
        this();
        this.balance = referralBonus;
        recordTransaction("Referral Bonus", referralBonus);
    }

    // Getter to check current balance
    public double getBalance() { return balance; }

    // Method to deposit money into wallet
    public void deposit(double amount) {
        if (amount > 0) {
        	
            balance += amount;
            
            // Record deposit
            recordTransaction("Deposit", amount);
        }
    }

    
     // Method to withdraw money from wallet
    // Protected so only subclasses or package can call it
    protected boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Record a transaction in history
    protected void recordTransaction(String type, double amount) {
        history.add(new Transaction(type, amount));
    }

    
    // Display all transaction history and final balance
    public void viewHistory() {
        System.out.println("\n-------Transaction History-------\n");
        for (Transaction t : history) {
            System.out.println(t);
        }
        System.out.println("Final Balance: ₹" + balance);
    }
}
