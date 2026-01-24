package com.regex.validateusername;

import java.util.Scanner;
import java.util.regex.*;
public class ValidUsername {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter username : ");
		String username = input.nextLine();
		String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(username);
		
		if(matcher.matches()) {
			System.out.println("Username is valid");
		}
		else {
			System.out.println("Invalid username");
		}
		
		input.close();
	}

}
