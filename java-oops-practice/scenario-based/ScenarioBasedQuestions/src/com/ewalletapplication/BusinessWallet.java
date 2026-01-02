package com.ewalletapplication;

//BusinessWallet class represents a wallet for business users
//Extends the abstract Wallet class and applies a 2% tax on outbound transfers
public class BusinessWallet extends Wallet {
	
	// Constant tax rate of 2% on transfers
    private static final double TAX_RATE = 0.02; 

    // Constructor to create a BusinessWallet with optional referral bonus
    public BusinessWallet(double bonus) {
    	
    	// Call parent Wallet constructor
        super(bonus);
        
    }

    // Override withdraw to include 2% tax for business transfers
    @Override
    protected boolean withdraw(double amount) {
        double totalDeduction = amount + (amount * TAX_RATE);
        if (totalDeduction <= getBalance()) {
        	
        	// Deduct total amount (including tax) using parent logic
            return super.withdraw(totalDeduction); 
            
        }
        
        return false;
    }
}
