package com.exceptionhandling.banktransactionsystem;

import java.util.Scanner;

public class UseBankTransactionnSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            // User input
            System.out.print("Enter initial balance: ");
            double balance = input.nextDouble();

            System.out.print("Enter withdrawal amount: ");
            double amount = input.nextDouble();

            BankAccount account = new BankAccount(balance);

            // Method call
            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            // Handles custom checked exception
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            // Handles invalid amount
            System.out.println(e.getMessage());

        } finally {
        	input.close();
        }
    }
}
