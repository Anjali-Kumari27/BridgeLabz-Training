package com.searching.binarysearch;

import java.util.Scanner;

public class RotationPoint {

	
	// Method to find the rotation point using Binary Search
    public static int findRotationPoint(int[] arr) {
    	
        // Handle empty array case
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // 1. Initialize left as 0 and right as n - 1
        int left = 0;
        int right = arr.length - 1;

        // 2. Perform a binary search
        while (left < right) {
            // Best Practice: mid calculation to avoid potential integer overflow
            int mid = left + (right - left) / 2;

            // Logic: Compare mid with the right-most element
            // If mid element is greater than the right element, the pivot is to the right
            if (arr[mid] > arr[right]) {
            	
                // The smallest element must be in the right half
                left = mid + 1;
            } 
            
            // If mid element is smaller than the right element, the pivot is at mid or to the left
            else {
            	
                // The smallest element is in the left half (including mid)
                right = mid;
            }
        }

        // 3. When left == right, the rotation point is found
        return arr[left];
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Array size
        System.out.print("Enter the number of elements in the rotated array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        // Input: Array elements (e.g., 4, 5, 6, 1, 2, 3)
        System.out.println("Enter the elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Execute search for the smallest element (rotation point)
        int rotationPointValue = findRotationPoint(arr);

        // Output the result
        System.out.println("The smallest element (rotation point) is: " + rotationPointValue);

        input.close();
    }
}
