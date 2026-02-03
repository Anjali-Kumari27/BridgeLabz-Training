package com.functionalinterface.streamlogical;
/*
 * 2. Count number of words in a sentence
   Input: "Java is very powerful"
   Output: 4
 */

import java.util.Scanner;

public class CountWords{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a sentence: ");
      String sentence = input.nextLine();
      
      // used trim() to remove extra spaces at the start/end before splitting
      String[] words = sentence.trim().split("\\s+");
      
      System.out.println("Number of words: " + words.length);
  }
}