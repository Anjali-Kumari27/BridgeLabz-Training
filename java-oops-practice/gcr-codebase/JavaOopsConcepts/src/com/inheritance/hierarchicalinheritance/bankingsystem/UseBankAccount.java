package com.inheritance.hierarchicalinheritance.bankingsystem;

public class UseBankAccount {
	public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("SA101", 50000, 4.0);
        CheckingAccount ca = new CheckingAccount("CA202", 30000, 10000);
        FixedDepositAccount fd = new FixedDepositAccount("FD303", 100000, 5);

        System.out.println("----------Savings Account---------");
        sa.displayAccountDetails();
        sa.displayAccountType();

        System.out.println("\n---------Checking Account----------");
        ca.displayAccountDetails();
        ca.displayAccountType();

        System.out.println("\n-------Fixed Deposit Account-------");
        fd.displayAccountDetails();
        fd.displayAccountType();
    }


}
