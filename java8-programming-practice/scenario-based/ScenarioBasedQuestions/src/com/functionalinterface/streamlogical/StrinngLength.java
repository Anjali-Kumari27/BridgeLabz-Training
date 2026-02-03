package com.functionalinterface.streamlogical;

/*
 * 5. Find string length list
   Input: ["cat","elephant","dog"]
   Output: [3,8,3]
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StrinngLength {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter words separated by space: ");
      String word = input.nextLine();
      
      List<String> words = Arrays.asList(word.split("\\s+"));
      
      // I used map to get the length of each word and store it in a new list
      List<Integer> lengths = words.stream()
          .map(String::length)
          .collect(Collectors.toList());
          
      System.out.println("Lengths: " + lengths);
  }
}