package com.junit.bankingtransactions;

//Class representing a bank account
public class BankAccount {

 private double balance = 0.0; // initial balance

 // Deposit money into account
 public void deposit(double amount) {
     if (amount <= 0) {
         throw new IllegalArgumentException("Invalid deposit amount");
     }
     balance += amount;
 }

 // Withdraw money from account
 public void withdraw(double amount) {
     if (amount <= 0) {
         throw new IllegalArgumentException("Invalid withdrawal amount");
     }
     if (amount > balance) {
         throw new IllegalArgumentException("Insufficient funds");
     }
     balance -= amount;
 }

 // Get current balance
 public double getBalance() {
     return balance;
 }
}

