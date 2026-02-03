package com.functionalinterface.streamlogical;

/*
 * 9. Find max number
   Input: [10,25,3,99,45]
   Output: 99

 */


import java.util.Arrays;
import java.util.Scanner;

public class MaxNumber {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter numbers separated by space: ");
      String num =input.nextLine();
      
      // I used mapToInt to find the maximum value in the input stream
      int max = Arrays.stream(num.split("\\s+"))
                      .mapToInt(Integer::parseInt)
                      .max()
                      .getAsInt(); 
          
      System.out.println("Maximum number: " + max);
  }
}