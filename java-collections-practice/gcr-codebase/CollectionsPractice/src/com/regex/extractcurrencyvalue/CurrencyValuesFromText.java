package com.regex.extractcurrencyvalue;
/*
 * 1️3️.Extract Currency Values from a Text
🔹 Example Text:
"The price is $45.99, and the discount is 10.50."
🔹 Expected Output:
$45.99, 10.50

 */
import java.util.Scanner;
import java.util.regex.*;
public class CurrencyValuesFromText {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter text which contains some currency value : ");
		String text = input.nextLine();
		
		String regex ="[$]\\s?\\d+(?:,\\d{3})*(?:\\.\\d{2})?";
		/* [$] = currency sign
		 * \s? = checks for optional space
		 * \d+ = one or more digits
		 * (?:,\d{3})* = optional commas
		 * (?:\\.\\d{2})? = checks for optional decimal part
		 */
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println("Currency Value : " + matcher.group());
		}
		
		input.close();
	}

}
