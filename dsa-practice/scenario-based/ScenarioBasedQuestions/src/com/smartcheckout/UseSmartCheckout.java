package com.smartcheckout;

/*
 * SmartCheckout – Supermarket Billing Queue (Queue + HashMap)
Story: At a supermarket, each checkout counter maintains a Queue of customers. Each
customer has a list of items, and a HashMap is used to fetch price and stock quickly.
Requirements:
● Add/remove customers from the queue.
● Fetch item prices from map.
● Update stock on purchase.
 */

import java.util.Scanner;

public class UseSmartCheckout {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ItemStore store = new ItemStore();
		CheckoutQueue checkout = new CheckoutQueue();

		int choice;

		do {
			System.out.println("\n=====================================================");
			System.out.println("                     SmartCheckout                     ");
			System.out.println("=====================================================\n");
			System.out.println("1. Add Customer");
			System.out.println("2. Process Customer");
			System.out.println("3. Exit");
			System.out.print("Enter choice: ");
			choice = input.nextInt();
			input.nextLine();

			switch (choice) {

			case 1:
				// Shows the List of items available in the store
				store.displayAvailableItems();

				// enter customer's name
				System.out.print("\nEnter customer name: ");
				String name = input.nextLine();

				// number of items customer wants to buy
				System.out.print("Number of items: ");
				int n = input.nextInt();
				input.nextLine();

				// String array which stores item names
				String[] items = new String[n];

				// iterating through loop for accessing each item present in the list
				for (int i = 0; i < n; i++) {
					System.out.print("Enter item " + (i + 1) + ": ");
					items[i] = input.nextLine();
				}

				// add other customer
				checkout.addCustomer(new Customer(name, items));
				break;

			// process customer for billing of their products
			case 2:
				checkout.processCustomer(store);
				break;
				
			case 3:
				System.out.println("\n---------------------------------------------------------");
				System.out.println("              Thank you for using SmartCheckout            ");
				System.out.println("---------------------------------------------------------\n");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 3);

		input.close();
	}
}
