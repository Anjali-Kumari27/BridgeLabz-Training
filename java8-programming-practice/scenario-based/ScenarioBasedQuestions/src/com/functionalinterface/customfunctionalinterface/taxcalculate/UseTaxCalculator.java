package com.functionalinterface.customfunctionalinterface.taxcalculate;
/*
 * 3.Create a custom functional interface to calculate tax.
 */
import java.util.Scanner;

public class UseTaxCalculator {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter income : ");

		double income = input.nextDouble();

		// Lambda expression
		TaxCalculator tax = salary -> {
			if (salary <= 250000) {
				return 0;
			} else if (salary <= 500000) {
				// 5% tax
				return salary * 0.05;
			} else {
				return salary * 0.10;
			}
		};

		System.out.println("Income : " + income);
		System.out.println("Tax to be paid : " + tax.calculateTax(income));
	}
}
