package com.regex.validatehexcolorcode;

import java.util.Scanner;
import java.util.regex.*;
public class HexColorCode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter hex color code : ");
		String hexCode = input.nextLine();
		
		String regex = "^[#][a-fA-F0-9]{6}$";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(hexCode);
		
		if(matcher.matches()) {
			System.out.println("HexCode is Valid");
		}
		else {
			System.out.println("Invalid HexCode !!!!");
		}
		
		input.close();
	}

}
