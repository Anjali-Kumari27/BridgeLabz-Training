package com.streamlogical;
/*
 * 7. Remove empty strings
   Input: ["java","","spring","","boot"]
   Output: ["java","spring","boot"]
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveEmptyStrings {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      // Splitting by comma so the teacher can see empty spaces
      System.out.print("Enter words separated by commas (e.g. java,,spring): ");
      String word = input.nextLine();
      
      List<String> words = Arrays.asList(word.split(",", -1));
      
      // Filtering out any string that has a length of 0
      List<String> result = words.stream()
          .filter(s -> !s.trim().isEmpty())
          .collect(Collectors.toList());
          
      System.out.println("Filtered list: " + result);
  }
}