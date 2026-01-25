package com.regex.validatelicenseplatenumber;

import java.util.Scanner;
import java.util.regex.*;
public class LicensePlateNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter License Plate Number : ");
		String license = input.nextLine();
		
		String regex ="^[A-Z][A-Z][0-9]{4}$"; //we can also do with "^[A-Z]{2}\\d{4}$"
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(license);
		
		if(matcher.matches()) {
			System.out.println("License Plate Number is Valid");
		}
		else {
			System.out.println("Invalid Plate Number");
		}
		
		input.close();
	}

}
