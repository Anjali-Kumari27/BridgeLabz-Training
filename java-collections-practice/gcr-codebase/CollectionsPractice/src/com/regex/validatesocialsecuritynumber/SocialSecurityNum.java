package com.regex.validatesocialsecuritynumber;

import java.util.Scanner;
import java.util.regex.*;
public class SocialSecurityNum {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Social Security Number : ");
		String securityNumber = input.nextLine();
		
		String regex = "^(\\d{1,3}\\-)(\\d{1,2}\\-)(\\d{1,4})$"; //another way ^[0-9]{3}-[0-9]{2}-[0-9]{4}$
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(securityNumber);
		
		if(matcher.matches()) {
			System.out.println("Social Security Number is valid");
		}else {
			System.out.println("Invalid Social Security Number !!!!");
		}
		
		input.close();
	}

}
