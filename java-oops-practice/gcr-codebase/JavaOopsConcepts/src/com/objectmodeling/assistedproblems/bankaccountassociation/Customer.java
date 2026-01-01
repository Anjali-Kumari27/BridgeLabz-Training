package com.objectmodeling.assistedproblems.bankaccountassociation;

public class Customer {
	private String name;
    private double balance;
    private Bank bank; // Associated bank

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.balance = 0.0; // Default balance
        this.bank = null; // No bank initially
    }

    // Set associated bank
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    // Set initial balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // View balance
    public void viewBalance() {
    	System.out.println(" ");
        if (bank != null) {
            System.out.print(name + "'s balance in " + bank.getBankName() + " is: ₹" + balance);
        } else {
            System.out.println(name + " does not have an account in any bank yet.");
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

}

