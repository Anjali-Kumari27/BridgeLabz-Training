package com.regex.censorbadwords;

/*
 * Censor Bad Words in a Sentence
Given a list of bad words, replace them with ****.
🔹 Example Input:
"This is a damn bad example with some stupid words."
🔹 Expected Output:
"This is a **** bad example with some **** words."

 */
import java.util.Scanner;
import java.util.regex.*;
public class wordsInSentence {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String replace = sentence.replaceAll("\\b(stupid|damn|fool)\\b", "****");
		
		//Pattern pattern = Pattern.compile(replace);
		//Matcher matcher = pattern.matcher(sentence);
		
	    System.out.println("After replacing : " + replace);
	    input.close();
	}

}
