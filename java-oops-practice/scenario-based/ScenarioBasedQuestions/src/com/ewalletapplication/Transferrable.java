package com.ewalletapplication;

public interface Transferrable {
	
    // Abstract method to define the contract for sending money
    boolean transferTo(User receiver, double amount);
    
}
