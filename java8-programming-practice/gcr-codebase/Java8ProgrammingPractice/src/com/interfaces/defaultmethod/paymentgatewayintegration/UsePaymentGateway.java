package com.interfaces.defaultmethod.paymentgatewayintegration;

import java.util.Scanner;
public class UsePaymentGateway {
	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        PaymentProcessor upi = new UPI();
	        PaymentProcessor card = new CreditCard();
	        PaymentProcessor wallet = new Wallet();

	        System.out.println("\n==================================================================");
	        System.out.println("                    Payment Gateway Providers                       ");
	        System.out.println("==================================================================\n");
	        System.out.println("1-UPI");
	        System.out.println("2-CreditCard");
	        System.out.println("3-Wallet");
	        
	        System.out.print("\nEnter your choice : ");
	        int choice = input.nextInt();
	        System.out.print("Enter amount: ");
	        double amount = input.nextDouble();

	        PaymentProcessor selected;

	        if (choice == 1) selected = upi;
	        else if (choice == 2) selected = card;
	        else if (choice == 3) selected = wallet;
	        else {
	            System.out.println("Invalid choice");
	            input.close();
	            return;
	        }

	        // pay
	        selected.pay(amount);

	        // refund using default method
	        System.out.print("Do you want to refund? (yes/no): ");
	        input.nextLine(); 
	        String refundChoice = input.nextLine();
	        if (refundChoice.equalsIgnoreCase("yes")) {
	            selected.refund(amount);
	        } else {
	            System.out.println("No refund processed.");
	        }

	        input.close();
	    }
}
