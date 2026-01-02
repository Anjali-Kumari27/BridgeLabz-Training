package com.encapsulationpolymorphismabstraction.bankingsystem;

import java.util.List;

public class BankService {

	// Method to process a list of bank accounts
    public static void processAccounts(List<BankAccount> accounts) {

    	// Loop through each account
        for (BankAccount account : accounts) {

        	// Calculate interest earned for the account
            double interest = account.calculateInterest();

            // Display account details
            account.displayAccountDetails();
            System.out.println("Interest Earned : " + interest);

            
            // Check if the account implements Loanable interface
            if (account instanceof Loanable) {
            	
            	// Cast to Loanable to call loan eligibility method
                Loanable loanable = (Loanable) account;
                System.out.println("Loan Eligibility : " + loanable.calculateLoanEligibility());
            }

            System.out.println("--------------------------------");
        }
    }
}
