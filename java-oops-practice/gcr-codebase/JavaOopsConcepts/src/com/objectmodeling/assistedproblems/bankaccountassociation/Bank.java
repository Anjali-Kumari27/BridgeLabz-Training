package com.objectmodeling.assistedproblems.bankaccountassociation;

import java.util.ArrayList;
public class Bank {
	private String bankName;
    private ArrayList<Customer> customers; // List of customers associated with the bank

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, double initialBalance) {
        customer.setBank(this); // Associate the customer with this bank
        customer.setBalance(initialBalance); // Set initial balance
        customers.add(customer); // Add customer to bank's list
        System.out.println("Account opened for " + customer.getName() + " with balance: ₹" + initialBalance );
    }

    // Method to show all customers of the bank
    public void showAllCustomers() {
    	System.out.println("");
        System.out.println("\n-----------Customers of " + bankName + "-----------");
        for (Customer c : customers) {
            System.out.println(c.getName() + " - Balance: ₹" + c.getBalance());
        }
    }

    // Getter for bank name
    public String getBankName() {
        return bankName;
    }

}

