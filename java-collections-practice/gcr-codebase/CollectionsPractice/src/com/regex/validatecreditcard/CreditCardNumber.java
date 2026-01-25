package com.regex.validatecreditcard;

/*
 * Validate a Credit Card Number (Visa, MasterCard, etc.)
A Visa card number starts with 4 and has 16 digits.
A MasterCard starts with 5 and has 16 digits.

 */
import java.util.Scanner;
import java.util.regex.*;
public class CreditCardNumber {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//taking user input for visa number
		System.out.print("Enter Visa number : ");
		String visa = input.nextLine();
		String regex = "^[4][0-9]{15}$";
		Pattern pattern1 = Pattern.compile(regex);
		
		Matcher matcher = pattern1.matcher(visa);
		if(matcher.matches()) {
			System.out.println("Visa number is Valid");
		}
		else {
			System.out.println("Invalid visa number");
		}
		
		//taking user input for master card number
		System.out.print("Enter MasterCard number : ");
		String masterCard = input.nextLine();
		
		String regex2 = "^[5][0-9]{15}$";
		Pattern pattern2 = Pattern.compile(regex2);
		
		Matcher matcher2 = pattern2.matcher(regex2);
		if(matcher.matches()) {
			System.out.println("MasterCard number is Valid");
		}
		else {
			System.out.println("Invalid MasterCard number");
		}
		
	}

}
