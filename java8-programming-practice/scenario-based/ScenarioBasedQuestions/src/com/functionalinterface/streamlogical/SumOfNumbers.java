package com.functionalinterface.streamlogical;
/*
 * 8. Sum of all numbers using stream
   Input: [1,2,3,4,5]
   Output: 15

 */


import java.util.Arrays;
import java.util.Scanner;

public class SumOfNumbers{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter numbers separated by space: ");
      String number = input.nextLine();
      
      // Converting string input to stream, then to int, then summing them up
      int totalSum = Arrays.stream(number.split("\\s+"))
                           .mapToInt(Integer::parseInt)
                           .sum();
          
      System.out.println("Total sum: " + totalSum);
  }
}