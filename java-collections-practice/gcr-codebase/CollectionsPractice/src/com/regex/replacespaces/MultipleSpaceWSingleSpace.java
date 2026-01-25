package com.regex.replacespaces;

import java.util.Scanner;
import java.util.regex.*;
public class MultipleSpaceWSingleSpace {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Sentence : ");
		String sentence = input.nextLine();
		String replaceText = sentence.replaceAll("\\s+", " ");
		
		System.out.println("Original sentence : \n" + sentence);
		System.out.println("\nModified sentence after replacing multiple spaces with single space : \n" + replaceText);
		
		input.close();
	}
}
