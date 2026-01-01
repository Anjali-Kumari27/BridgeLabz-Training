package com.inheritance.hierarchicalinheritance.bankingsystem;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type   : Savings Account");
        System.out.println("Interest Rate  : " + interestRate + "%\n");
    }
}
