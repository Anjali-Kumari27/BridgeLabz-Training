package com.streamlogical;
/*
 * 4. Convert list of strings to uppercase
   Input: ["java","spring","boot"]
   Output: ["JAVA","SPRING","BOOT"]
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringsToUppercase {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter words separated by space: ");
      String str = input.nextLine();
      
      List<String> words = Arrays.asList(str.split("\\s+"));
      
      // Using the map function to transform every string to uppercase
      List<String> upperCaseList = words.stream()
          .map(String::toUpperCase)
          .collect(Collectors.toList());
          
      System.out.println("Uppercase list: " + upperCaseList);
  }
}