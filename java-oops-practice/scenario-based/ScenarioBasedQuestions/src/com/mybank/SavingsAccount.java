package com.mybank;

public class SavingsAccount extends Account {
	
	// Interest rate for savings account (4% per year)
    private double interestRate = 4.0;

    // Constructor to initialize account number and balance
    public SavingsAccount(String accNo, double initialBalance) {
    	
    	// Calls parent (Account) class constructor
        super(accNo, initialBalance);
    }

    @Override
    // Method to calculate and add interest to balance
    public void calculateInterest() {
    	
    	// Calculating interest using formula: balance * rate / 100
        double interest = (checkBalance() * interestRate) / 100;
        
        // Updating balance after adding interest
        updateBalance(checkBalance() + interest);
        
        // Displaying credited interest
        System.out.println("Interest Credited: ₹" + interest);
    }
}