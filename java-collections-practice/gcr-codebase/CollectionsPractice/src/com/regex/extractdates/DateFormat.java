package com.regex.extractdates;

import java.util.Scanner;
import java.util.regex.*;
public class DateFormat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter sentence with date in it of format(dd/mm/yyyy) : ");
		String sentence = input.nextLine();
		
		String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(sentence);
		
		while(matcher.find()) {
			System.out.println("Date Found : " + matcher.group());
		}
		input.close();
	}

}
