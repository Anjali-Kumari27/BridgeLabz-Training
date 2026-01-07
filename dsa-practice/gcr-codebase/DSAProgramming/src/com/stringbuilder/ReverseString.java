package com.stringbuilder;

import java.util.Scanner;

public class ReverseString {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = input.nextLine();

        // 1. Initialize StringBuilder with specific capacity
        StringBuilder sb = new StringBuilder(str.length());
        
        // 2. & 3. Append and use the reverse method
        sb.append(str);
        sb.reverse();

        // 4. Convert back to string and output
        System.out.println("Reversed Result: " + sb.toString());
        input.close();
    }
}
