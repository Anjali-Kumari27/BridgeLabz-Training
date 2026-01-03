package com.mybank;

public interface ITransaction {
	
	// Method to deposit money into the account
    void deposit(double amount);
    
    // Method to withdraw money from the account
    void withdraw(double amount);
    
    // Method to check current account balance
    double checkBalance();
}
