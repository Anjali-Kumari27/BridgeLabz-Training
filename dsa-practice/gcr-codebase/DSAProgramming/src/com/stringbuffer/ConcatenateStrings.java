package com.stringbuffer;

import java.util.Scanner;

public class ConcatenateStrings {
	
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        System.out.print("How many words do you want to concatenate? ");
        int count = input.nextInt();
        input.nextLine(); 

        // 1. Initialize StringBuffer
        StringBuffer sb = new StringBuffer();

        // 2. Iterate and append user-provided strings
        for (int i = 0; i < count; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            sb.append(input.nextLine());
        }

        // 3. Output result
        System.out.println("Final Concatenated String: " + sb.toString());
        input.close();
    }
}
