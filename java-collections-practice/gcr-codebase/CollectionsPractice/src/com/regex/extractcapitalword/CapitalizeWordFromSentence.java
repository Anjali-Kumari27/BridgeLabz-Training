package com.regex.extractcapitalword;

import java.util.regex.*;
public class CapitalizeWordFromSentence {
	public static void main(String[] args) {
		String text = "Hello Hii !! I am Anjali from CSE";
		
		String regex = "\\b[A-Z][a-z]*\\b";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println("Capital Word : " + matcher.group());
		}
		
	}

}
