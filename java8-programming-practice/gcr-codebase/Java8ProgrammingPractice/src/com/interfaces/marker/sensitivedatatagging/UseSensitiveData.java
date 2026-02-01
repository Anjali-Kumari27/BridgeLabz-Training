package com.interfaces.marker.sensitivedatatagging;

/*
 * Sensitive Data Tagging
   ○ Scenario: Mark sensitive data classes for encryption.
   ○ Task: Create a custom marker interface.
 */
import java.util.Scanner;

public class UseSensitiveData {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// sensitive object
		CustomerAccount account = new CustomerAccount("Anjali", "ACC12345");

		// non-sensitive object
		ProductInfo product = new ProductInfo("Mobile", 25000);

		System.out.println("Sensitive Data Tagging Demo");
		System.out.println("1. Process Customer Account (Sensitive)");
		System.out.println("2. Process Product Info (Not Sensitive)");
		System.out.print("Enter your choice (1-2): ");

		int choice = input.nextInt();

		Object data;

		if (choice == 1) {
			data = account;
		} else if (choice == 2) {
			data = product;
		} else {
			System.out.println("Invalid choice");
			input.close();
			return;
		}

		System.out.println("\nProcessing data...");
		EncryptionProcessor.process(data);

		input.close();
	}
}
