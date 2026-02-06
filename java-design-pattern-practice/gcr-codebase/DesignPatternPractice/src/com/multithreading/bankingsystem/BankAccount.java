package com.multithreading.bankingsystem;

public class BankAccount {

    private int balance = 10000;

    public int getBalance() {
        return balance;
    }

    public boolean withdraw(int amount) {

        if (balance >= amount) {
            // Simulate processing delay
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance = balance - amount;
            return true;
        }
        return false;
    }
}

