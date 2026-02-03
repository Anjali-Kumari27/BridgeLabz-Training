package com.streamlogical;

/*
 * 10. Reverse each string in list
   Input: ["java","api"]
   Output: ["avaj","ipa"]
 */


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseString {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter words separated by space: ");
      String s = input.nextLine();
      
      List<String> words = Arrays.asList(s.split("\\s+"));
      
      // I used StringBuilder's reverse() to flip each word inside the map function
      List<String> reversed = words.stream()
          .map(st -> new StringBuilder(st).reverse().toString())
          .collect(Collectors.toList());
          
      System.out.println("Reversed list: " + reversed);
  }
}
