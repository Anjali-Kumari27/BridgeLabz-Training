package com.ewalletapplication;

//User class represents an individual or business using the e-wallet
//Implements Transferrable to allow sending money to other users
public class User implements Transferrable {
    private String name;
    
    // Each user has a Wallet (can be PersonalWallet or BusinessWallet)
    private Wallet wallet;

    // Constructor to initialize user with name and wallet
    public User(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    
    // Method to transfer money to another user
    @Override
    public boolean transferTo(User receiver, double amount) {
    	
        // Polymorphism: withdraw() behaves differently if wallet is Business or Personal
        if (this.wallet.withdraw(amount)) {
        	
        	// Deposit into receiver's wallet
            receiver.wallet.deposit(amount);
            
            // Record the transaction in sender's wallet history
            this.wallet.recordTransaction("Transfer to " + receiver.name, amount);
            System.out.println("Transfer successful from " + this.name + " to " + receiver.name);
            
            return true;
        } 
        else {
        	
        	// Handle insufficient funds
            System.out.println("Transfer failed: Insufficient funds for " + this.name);
            return false;
        }
    }

    // Display user's account info and transaction history
    public void showAccountInfo() {
    	System.out.println("\n******************");
        System.out.println("User: " + name);
        System.out.println("******************");
        
        // Show all wallet transactions
        wallet.viewHistory();
    }
}
