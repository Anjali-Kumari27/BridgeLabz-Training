package com.constructor.levelone;

//SavingsAccount is a subclass of class BankAccount
//It inherits methods and properties of BankAccount
public class SavingsAccount extends BankAccount{
	
	//Parameterized constructor
	public SavingsAccount(int accountNumber, String accountHolder, double balance) {
    	
		//super keyword used to pass values to parent class
        super(accountNumber, accountHolder, balance);
        
    }

    
    // Demonstrates access to public and protected members
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder name : " + accountHolder);
        System.out.println("Balance : " + getBalance());
        
    }

    
    
    
    public static void main(String[] args) {
    	
    	//created object of SavingsAccount
    	SavingsAccount account = new SavingsAccount(1289004567, "Anjali Singh", 75000);

        account.displayAccountDetails();

        //updating balance using setter method
        account.setBalance(95000);
        System.out.println("Updated Balance : " + account.getBalance());
        
    }

}
