package com.variousinterfaces.additionalquestion.bankingsystem;

import java.util.*;

public class Bank {

    // HashMap: accountNumber -> balance
    HashMap<Integer, Double> accounts = new HashMap<>();

    // Queue for withdrawal requests
    Queue<Integer> withdrawalQueue = new LinkedList<>();

    // Add account
    void addAccount(int accNo, double balance) {
        accounts.put(accNo, balance);
    }

    // Add withdrawal request
    void addWithdrawalRequest(int accNo) {
        withdrawalQueue.add(accNo);
    }

    // Process withdrawal requests
    void processWithdrawals(double amount) {

        while (!withdrawalQueue.isEmpty()) {

            int accNo = withdrawalQueue.remove();

            if (accounts.containsKey(accNo)) {

                double bal = accounts.get(accNo);

                if (bal >= amount) {
                    accounts.put(accNo, bal - amount);
                    System.out.println("Withdrawal successful for Account " + accNo);
                } else {
                    System.out.println("Insufficient balance for Account " + accNo);
                }
            }
        }
    }

    // Display all accounts
    void showAccounts() {
        System.out.println("All Accounts:");
        for (int accNo : accounts.keySet()) {
            System.out.println("Account No: " + accNo +
                               ", Balance: " + accounts.get(accNo));
        }
    }

    // Display accounts sorted by balance
    void showSortedByBalance() {

        // TreeMap: balance -> accountNumber
        TreeMap<Double, Integer> sorted = new TreeMap<>();

        for (int accNo : accounts.keySet()) {
            sorted.put(accounts.get(accNo), accNo);
        }

        System.out.println("Accounts sorted by balance:");
        for (double bal : sorted.keySet()) {
            System.out.println("Account No: " +
                               sorted.get(bal) +
                               ", Balance: " + bal);
        }
    }
}

