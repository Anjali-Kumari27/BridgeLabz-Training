package com.regex.extractprogramminglangname;
/*
 * 1️⃣2️⃣ Extract Programming Language Names from a Text
🔹 Example Text:
"I love Java, Python, and JavaScript, but I haven't tried Go yet."
🔹 Expected Output:
Java, Python, JavaScript, Go

 */
import java.util.Scanner;
import java.util.regex.*;
public class ProgrammingLanguageNames {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text with some programming lang. names in it : ");
		String text = input.nextLine();
		
		String regex = "\\b(Java|Python|C\\+\\+| Go|JavaScript)\\b";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println("Language found : " + matcher.group());
		}
		
		input.close();
	}

}
