package com.mybank;

public class CurrentAccount extends Account {
	
	// Constructor to initialize current account details
    public CurrentAccount(String accNo, double initialBalance) {
    	
    	// Calls parent (Account) class constructor
        super(accNo, initialBalance);
    }

    @Override
    // Current accounts do not provide interest
    public void calculateInterest() {
        System.out.println("Current Account does not earn interest.");
    }
}