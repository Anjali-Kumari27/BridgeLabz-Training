package com.interfaces.staticmethod.passwordstrengthvalidator;

import java.util.Scanner;

public class UsePasswordStrength {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your password: ");
		String password = input.nextLine();

		// call static method from interface
		if (SecurityUtils.isStrongPassword(password)) {
			System.out.println("Password is strong.");
		} else {
			System.out.println("Password is weak....");
			System.out.println("It should have: min 8 chars, 1 uppercase, 1 number, 1 special char");
		}

		input.close();
	}

}
