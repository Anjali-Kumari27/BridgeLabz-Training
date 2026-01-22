package com.exceptionhandling.multiplecatchblock;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            // Accept array size
            System.out.print("Enter array size: ");
            int size = input.nextInt();

            // Declare array
            int[] arr = new int[size];

            // Accept array elements
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }

            // Accept index number
            System.out.print("Enter index to retrieve value: ");
            int index = input.nextInt();

            // Retrieve and print value at given index
            System.out.println("Value at index " + index + ": " + arr[index]);
        }
        // Handles invalid index access
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        // Handles null array reference
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        finally {
            
        	input.close();
        }
    }
}

