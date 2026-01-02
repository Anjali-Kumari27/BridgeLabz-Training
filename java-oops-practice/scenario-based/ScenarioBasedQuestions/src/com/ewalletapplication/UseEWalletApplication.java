package com.ewalletapplication;

//Main class to run the E-Wallet Application
public class UseEWalletApplication {
	
	    public static void main(String[] args) {
	        // Create a Personal User with a 50 rupee bonus
	        User amit = new User("Anushka", new PersonalWallet(50.0));
	        
	        // Create a Business User with no bonus
	        User shopify = new User("Shopify Store", new BusinessWallet(0.0));

	        // Display Amit's account info before any transactions
	        amit.showAccountInfo();
	        
	        // Transferring
	        amit.transferTo(shopify, 30.0);
	        
	        // Business wallet transfer (will include 2% tax)
	        shopify.transferTo(amit, 10.0);

	        // Display account info of both users after transactions
	        amit.showAccountInfo();
	        shopify.showAccountInfo();
	    }

}
