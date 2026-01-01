package com.objectmodeling.assistedproblems.bankaccountassociation;

public class BankCustomerAssociation {
	
	public static void main(String[] args) {
        // Create bank
        Bank sbi = new Bank("State Bank of India");

        // Create customers
        Customer anjali = new Customer("Anjali");
        Customer ananya = new Customer("Ananya");

        // Open accounts
        sbi.openAccount(anjali, 10000);
        sbi.openAccount(ananya, 5000);

        // View balances
        anjali.viewBalance();
        ananya.viewBalance();

        // Show all customers of the bank
        sbi.showAllCustomers();
    }

}

