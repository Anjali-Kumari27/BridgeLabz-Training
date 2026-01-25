package com.regex.findrepeatingword;

import java.util.Scanner;
import java.util.regex.*;
public class RepeatingWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter sentence in which some words are repeated : ");
		String sentence = input.nextLine();
		
		String regex = "\\b(\\w+)\\s+\\1\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(sentence);
		
		while(matcher.find()) {
			System.out.println("Repeated word : " + matcher.group());
		}
		
		input.close();
	}

}
