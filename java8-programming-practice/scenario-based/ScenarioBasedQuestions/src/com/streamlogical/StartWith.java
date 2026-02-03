package com.functionalinterface.streamlogical;
/*
 * 6. Count strings starting with ‘a’
   Input: ["apple","banana","ant","car"]
   Output: 2
 */

import java.util.Arrays;
import java.util.Scanner;

public class StartWith {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter words separated by space: ");
      String str =input.nextLine();
      
      String[] words = str.split("\\s+");
      
      // Filtering only the words that start with the letter 'a'
      long count = Arrays.stream(words)
          .filter(s -> s.toLowerCase().startsWith("a"))
          .count();
          
      System.out.println("Count: " + count);
  }
}