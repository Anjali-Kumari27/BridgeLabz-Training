package com.exceptionhandling.throwvsthrows;

import java.util.Scanner;

public class CalculateInterest {

	// Method to calculate simple interest
	// Uses 'throws' to propagate exception
	public static double calculateInterest(double amount, double rate, double years) throws IllegalArgumentException {

		// Validate input
		if (amount < 0 || rate < 0) {
			// 'throw' is used to explicitly throw exception
			throw new IllegalArgumentException("Amount and rate must be positive");
		}

		// Simple Interest formula
		return (amount * rate * years) / 100;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			// Taking user input
			System.out.print("Enter amount: ");
			double amount = input.nextDouble();

			System.out.print("Enter rate of interest: ");
			double rate = input.nextDouble();

			System.out.print("Enter number of years: ");
			double years = input.nextDouble();

			// Calling method
			double interest = calculateInterest(amount, rate, years);

			// Print result
			System.out.println("Calculated Interest: " + interest);

		} catch (IllegalArgumentException e) {
			// Handling  exception
			System.out.println("Invalid input: Amount and rate must be positive");
		} finally {
			
			input.close();
		}
	}
}
