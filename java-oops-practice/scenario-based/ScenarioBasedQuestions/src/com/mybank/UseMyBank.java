package com.mybank;

/*    "MyBank – Managing Customer Accounts"
Story: You're building the core banking module for MyBank, a digital-first bank. Your job is to
manage customer accounts, deposits, and interest calculations.
Requirements:
● Account (base class): fields like accountNumber, balance.
● Derived classes: SavingsAccount, CurrentAccount (using inheritance).
● ITransaction interface: deposit(), withdraw(), checkBalance().
● Use constructors for account initialization with or without an opening balance.
● Encapsulation: balance must be private and only modifiable through methods.
● Use operators for interest: balance * interestRate / 100.
● Polymorphism in calculateInterest() – varies by account type.
● Use access modifiers: protect account data, expose only required operations  */

import java.util.Scanner;

public class UseMyBank {
    public static void main(String[] args) {
    	
    	// Scanner object to take user input
        Scanner input = new Scanner(System.in);

        System.out.println("=== Welcome to MyBank Digital Portal ===");
        
        // Taking account number from user
        System.out.print("Enter Account Number: ");
        String accNum = input.nextLine();

        // Asking user to select account type
        System.out.println("Select Account Type: \n1. Savings\n2. Current");
        int type = input.nextInt();

         // Taking opening balance
        System.out.print("Enter Opening Balance: ");
        double initial = input.nextDouble();

        // Account reference (polymorphism)
        Account myAccount;
        
        // Creating account object based on selected type
        if (type == 1) {
            myAccount = new SavingsAccount(accNum, initial);
        } else {
            myAccount = new CurrentAccount(accNum, initial);
        }

        // Loop to show banking menu until user exits
        boolean exit = false;
        while (!exit) {
        	
        	// Displaying available operation
        	System.out.println("\n--- Select Operation ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Add Interest");
            System.out.println("5. Exit");
            
            // Taking user choice
            int choice = input.nextInt();

            // Performing operation based on choice
            switch (choice) {
                case 1:
                	// Deposit money
                    System.out.print("Enter amount to deposit: ");
                    myAccount.deposit(input.nextDouble());
                    break;
                case 2:
                	// Withdraw money
                    System.out.print("Enter amount to withdraw: ");
                    myAccount.withdraw(input.nextDouble());
                    break;
                case 3:
                	// Display current balance
                    System.out.println("Current Balance: ₹" + myAccount.checkBalance());
                    break;
                case 4:
                	// Calculate interest ( for Savings Account)
                    myAccount.calculateInterest();
                    break;
                case 5:
                	// Exit from application
                    exit = true;
                    System.out.println("Thank you for banking with MyBank!");
                    break;
                    
                default:
                	 // Invalid menu option
                    System.out.println("Invalid Option.");
            }
        }
        
        input.close();
        
    }
}