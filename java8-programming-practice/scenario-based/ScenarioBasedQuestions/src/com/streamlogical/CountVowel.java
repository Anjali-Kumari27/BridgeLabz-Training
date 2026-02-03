package com.streamlogical;

/*
 * 1. Count vowels in a string using Stream
   Input: "programming"
   Output: 3
 */
import java.util.stream.Stream;

public class CountVowel {
	public static void main(String[] args) {
		String input = "programming";

		// Converting the string to lowercase first to ensure 'A' and 'a' are both
		// counted
		long count = input.toLowerCase().chars().filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')

				// Counting the filtered characters that match vowels
				.count();

		System.out.println("Output: " + count);
	}
}