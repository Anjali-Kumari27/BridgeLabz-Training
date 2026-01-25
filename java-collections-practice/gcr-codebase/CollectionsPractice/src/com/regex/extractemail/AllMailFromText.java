package com.regex.extractemail;
import java.util.Scanner;
import java.util.regex.*;
public class AllMailFromText {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Enter text with some mail in it :");
		String text = input.nextLine();
		
		String regex ="\\b[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()){
			System.out.println("Extracted Email : " + matcher.group());
		}
	}

}
