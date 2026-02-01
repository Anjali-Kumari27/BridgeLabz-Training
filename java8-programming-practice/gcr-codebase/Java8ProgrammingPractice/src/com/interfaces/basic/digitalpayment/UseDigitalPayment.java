package com.interfaces.basic.digitalpayment;

import java.util.Scanner;

public class UseDigitalPayment {
	
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        System.out.println("\n======================================================");
        System.out.println("                  Digital Payment Method                ");
        System.out.println("======================================================\n");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Wallet");

        System.out.print("\nEnter your Choice : ");
        int choice = input.nextInt();

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        System.out.println("\n---------------------------------------------");
        if (choice == 1) {
            upi.pay(amount);
        } 
        else if (choice == 2) {
            card.pay(amount);
        } 
        else if (choice == 3) {
            wallet.pay(amount);
        } 
        else {
            System.out.println("Invalid choice");
        }

        input.close();
    }

}
