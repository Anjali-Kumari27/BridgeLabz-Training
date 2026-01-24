package com.regex.validateipaddress;

import java.util.Scanner;
import java.util.regex.*;
public class IPAddress {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter IP Address : ");
	String ip = input.nextLine();
	
	String regex = "^(\\d{1,3}\\.){3}\\d{1,3}$";
	Pattern pattern = Pattern.compile(regex);
	
	Matcher matcher = pattern.matcher(ip);
	
	if(matcher.matches()) {
		System.out.println("IP Address is Valid");
	}
	else {
		System.out.println("Invalid IP Address !!!!");
	}
	
	input.close();
	}
}
