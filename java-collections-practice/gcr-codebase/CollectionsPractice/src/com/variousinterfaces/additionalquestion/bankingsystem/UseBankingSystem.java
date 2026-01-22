package com.variousinterfaces.additionalquestion.bankingsystem;

import java.util.Scanner;

public class UseBankingSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.print("Enter number of accounts: ");
        int n = input.nextInt();

        // Take account details
        for (int i = 0; i < n; i++) {

            System.out.print("Enter account number: ");
            int accNo = input.nextInt();

            System.out.print("Enter balance: ");
            double balance = input.nextDouble();

            bank.addAccount(accNo, balance);
        }

        // Withdrawal requests
        System.out.print("\nEnter number of withdrawal requests: ");
        int w = input.nextInt();

        for (int i = 0; i < w; i++) {
            System.out.print("Enter account number for withdrawal: ");
            bank.addWithdrawalRequest(input.nextInt());
        }

        System.out.print("Enter withdrawal amount: ");
        double amount = input.nextDouble();

        System.out.println();
        bank.processWithdrawals(amount);

        System.out.println();
        bank.showAccounts();

        System.out.println();
        bank.showSortedByBalance();

        input.close();
    }
}
