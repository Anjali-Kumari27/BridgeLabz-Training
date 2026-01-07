package com.searching.linearsearch;

import java.util.Scanner;

public class FirstNegativeNumber {

	
	// Method to perform Linear Search to find the first negative value
    public static int findFirstNegative(int[] arr) {
        // 1. Iterate through the array from the start
        for (int i = 0; i < arr.length; i++) {
            // 2. Check if the current element is negative
            if (arr[i] < 0) {
                // 3. Best Practice: Return early as soon as the negative number is found
                // This prevents unnecessary checks of the remaining elements
                return i;
            }
        }
        
        // 4. Return -1 if the loop completes without finding any negative value
        return -1;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Asking user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        // Input: Asking user for array elements
        System.out.println("Enter " + size + " integers (including some negative ones):");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        // Executing the search
        int index = findFirstNegative(numbers);

        // Output: Displaying results to the user
        if (index != -1) {
            System.out.println("The first negative number was found at index: " + index);
            System.out.println("Value: " + numbers[index]);
        } else {
            System.out.println("No negative number found in the array.");
        }

        input.close();
    }

}
