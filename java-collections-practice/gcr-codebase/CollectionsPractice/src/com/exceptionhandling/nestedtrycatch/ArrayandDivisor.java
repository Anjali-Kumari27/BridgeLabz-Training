package com.exceptionhandling.nestedtrycatch;

import java.util.Scanner;

public class ArrayandDivisor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            // Taking array size
            System.out.print("Enter array size: ");
            int size = input.nextInt();

            // Creating array
            int[] arr = new int[size];

            // Taking array elements
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }

            // Taking index input
            System.out.print("Enter index to access: ");
            int index = input.nextInt();

            try {
                // Accessing array element (may throw ArrayIndexOutOfBoundsException)
                int value = arr[index];

                // Taking divisor input
                System.out.print("Enter divisor: ");
                int divisor = input.nextInt();

                try {
                    // Division operation (may throw ArithmeticException)
                    int result = value / divisor;
                    System.out.println("Result: " + result);

                } catch (ArithmeticException e) {
                    // Handles division by zero
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                // Handles invalid array index
                System.out.println("Invalid array index!");
            }

        } finally {
            
        	input.close();
        }
    }
}
