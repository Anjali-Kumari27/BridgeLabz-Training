package com.inheritance.hierarchicalinheritance.bankingsystem;

public class FixedDepositAccount extends BankAccount {

    private int tenure; // in years

    public FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Account Type : Fixed Deposit Account");
        System.out.println("Tenure       : " + tenure + " years");
    }
}
