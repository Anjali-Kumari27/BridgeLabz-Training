package com.searching.binarysearch;

import java.util.Scanner;

public class FirstLastOccurrence {

	
	// Method to find the first occurrence using Binary Search
    public static int findFirst(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            // Best Practice: mid calculation to avoid potential integer overflow
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;       // Store potential answer
                right = mid - 1;    // Continue searching the left side for an earlier index
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    // Method to find the last occurrence using Binary Search
    public static int findLast(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            // Best Practice: mid calculation to avoid potential integer overflow
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;       // Store potential answer
                left = mid + 1;     // Continue searching the right side for a later index
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Asking user for the size of the array
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        // Input: Asking user for sorted elements (Best Practice: must be sorted for Binary Search)
        System.out.println("Enter " + n + " integers in sorted order (with duplicates):");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Input: Target value
        System.out.print("Enter the target value: ");
        int target = input.nextInt();

        // 1. & 2. Execute binary searches for first and last positions
        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        // 3. Output results
        if (first != -1) {
            System.out.println("First Occurrence Index: " + first);
            System.out.println("Last Occurrence Index: " + last);
        } else {
            System.out.println("Element not found: -1");
        }

        input.close();
    }

    
}
