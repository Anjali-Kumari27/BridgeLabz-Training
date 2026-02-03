package com.functionalinterface.streamlogical;
/*
 * 3. Find even numbers from list
   Input: [2,5,7,8,10,13]
   Output: [2,8,10]
 */


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenNumber {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter numbers separated by space: ");
      String num = input.nextLine();
      
      // I am taking the string input and converting it into a List of Integers
      List<Integer> numbers = Arrays.stream(num.split("\\s+"))
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toList());
      
      // Filtering even numbers using the modulo operator
      List<Integer> evens = numbers.stream()
          .filter(n -> n % 2 == 0)
          .collect(Collectors.toList());
          
      System.out.println("Even numbers: " + evens);
  }
}