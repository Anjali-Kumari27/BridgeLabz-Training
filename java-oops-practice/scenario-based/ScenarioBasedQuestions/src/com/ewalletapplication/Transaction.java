package com.ewalletapplication;

import java.util.Date;

//Transaction class represents a single wallet transaction
public class Transaction {
	
	// Type of transaction (like Deposit, Transfer, Referral Bonus)
    private String type;
    private double amount;
    private Date timestamp;

    // Constructor to initialize transaction details
    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        
        // store current date and time
        this.timestamp = new Date();
    }

    // Override toString to display transaction details neatly
    @Override
    public String toString() {
        return timestamp + " | " + type + ": ₹" + amount;
    }
}
