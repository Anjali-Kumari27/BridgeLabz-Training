package com.interfaces.functional.stringlengthchecker;

/*
 * 2. String Length Checker
   ○ Scenario: Check if a message exceeds character limit.
   ○ Task: Use Function<String, Integer>.
 */
import java.util.Scanner;
import java.util.function.Function;

public class StringLength {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// sets the character limit
		final int limit = 20;

		// take message from user
		System.out.print("Enter message: ");
		String message = input.nextLine();

		// Function: String -> Integer (returns length)
		Function<String, Integer> lengthCheck = msg -> msg.length();

		int length = lengthCheck.apply(message);

		// check length
		if (length > limit) {
			System.out.println("Message exceeds character limit.....");
		} else {
			System.out.println("Message is within limit.");
		}

		input.close();
	}
}
