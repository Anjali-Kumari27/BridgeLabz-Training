package com.encapsulationpolymorphismabstraction.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02; // 2% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Business loan applied for amount: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 10;
    }
}
