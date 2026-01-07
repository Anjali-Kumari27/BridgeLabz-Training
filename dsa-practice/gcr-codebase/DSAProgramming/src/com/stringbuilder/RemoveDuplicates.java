package com.stringbuilder;

import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to remove duplicates: ");
        String str = input.nextLine();

        HashSet<Character> seen = new HashSet<>();
        // Initializing with input length to avoid resizing
        StringBuilder result = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen.contains(ch)) {
                result.append(ch);
                seen.add(ch);
            }
        }

        System.out.println("Unique Characters: " + result.toString());
        input.close();
    }
}
