package com.ewalletapplication;

//PersonalWallet class represents a personal user wallet
//Extends the abstract Wallet class
public class PersonalWallet extends Wallet {
	
	// Constructor to create a PersonalWallet with an optional referral bonus
    public PersonalWallet(double bonus) {
    	
    	// Call parent Wallet constructor
        super(bonus);
    }

    // Personal wallets have no extra fees
}
