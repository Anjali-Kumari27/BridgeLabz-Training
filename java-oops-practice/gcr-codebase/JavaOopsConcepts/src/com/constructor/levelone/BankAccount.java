package com.constructor.levelone;

public class BankAccount {
	
	// Public
    public int accountNumber;

    // Protected
    protected String accountHolder;

    // Private
    private double balance;

    //public Parameterized constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
    	
    	//this keyword used to refer instance variables
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        
    }

    // Updates balance through setter method
    public void setBalance(double balance) {
    	
        this.balance = balance;
        
    }

    // Returns balance using getter method
    public double getBalance() {
    	
        return balance;
        
    }

    
    
    // Displays Account details
    public void displayAccountDetails() {
    	
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account holder Name : " + accountHolder);
        System.out.println("Balance : " + balance);
        
    }

}
