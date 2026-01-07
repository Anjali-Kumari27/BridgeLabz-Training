package com.searching.binarysearch;

import java.util.Scanner;

public class PeakElement {

    // Method to find a peak element using the Binary Search approach
    public static int findPeak(int[] arr) {
        int n = arr.length;

        // Base case: If the array has only one element, it is the peak
        if (n == 1) return arr[0];

        // 1. Initialize left as 0 and right as n - 1
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            // Best Practice: mid calculation to avoid potential integer overflow
            int mid = left + (right - left) / 2;

            // 2. Perform a binary search and check neighbors
            // We use boundary checks to ensure we don't get ArrayIndexOutOfBoundsException
            boolean greaterThanLeft = (mid == 0 || arr[mid] >= arr[mid - 1]);
            boolean greaterThanRight = (mid == n - 1 || arr[mid] >= arr[mid + 1]);

            // If mid is greater than both its neighbors, it's a peak
            if (greaterThanLeft && greaterThanRight) {
                return arr[mid];
            }

            // If the element to the left is greater, a peak must exist in the left half
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            } 
            // Otherwise, a peak must exist in the right half
            else {
                left = mid + 1;
            }
        }

        return -1; // Should not reach here for valid inputs
    }
	
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Asking user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        // Input: Asking user for the elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Executing the search for a peak element
        int peak = findPeak(arr);

        // Output: Printing the result
        System.out.println("A peak element in the array is: " + peak);

        input.close();
    }
}
