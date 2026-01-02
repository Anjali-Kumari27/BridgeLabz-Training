package com.encapsulationpolymorphismabstraction.bankingsystem;

import java.util.List;
import java.util.ArrayList;

//Main class to simulate a Banking System
public class UseBankingSystem {
	
	public static void main(String[] args) {

		// List to store all bank accounts
        List<BankAccount> accounts = new ArrayList<>();

        // Create a Savings Account and Current account
        accounts.add(new SavingsAccount("SB101", "Anjali", 50000));
        accounts.add(new CurrentAccount("CA201", "Ravi", 100000));

        // Process all accounts (calculate interest, fees, etc.)
        BankService.processAccounts(accounts);
        
    }

}
