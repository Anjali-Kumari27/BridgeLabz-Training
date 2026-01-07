package com.challengeproblem;

import java.util.Scanner;
import java.util.Arrays;

public class Searching {

	// Approach 1: Linear Search for the first missing positive integer
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;

        // Step 1: Mark numbers as visited
        // We use a boolean array as a "separate array" to track positive values
        boolean[] visited = new boolean[n + 2]; 

        for (int num : arr) {
            // Only mark if the number is within a valid positive range for this array size
            if (num > 0 && num <= n) {
                visited[num] = true;
            }
        }

        // Step 2: Traverse the visited array to find the first unmarked positive integer
        for (int i = 1; i <= n + 1; i++) {
            if (!visited[i]) {
                return i; // Found the missing positive
            }
        }
        return 1;
    }

    // Approach 2: Binary Search for the target index
    public static int performBinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // Best Practice: Overflow-safe middle calculation
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Return immediately if found
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Return -1 if not found
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Array size
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        // Input: Array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // 1. Linear Search for the first missing positive integer
        int missingPositive = findFirstMissingPositive(arr.clone());
        System.out.println("First missing positive integer: " + missingPositive);

        // 2. Binary Search for the target index
        // Requirement: Sort the array first for Binary Search
        Arrays.sort(arr);
        System.out.println("Array sorted for Binary Search: " + Arrays.toString(arr));
        
        System.out.print("Enter target number to find index: ");
        int target = input.nextInt();
        
        int targetIndex = performBinarySearch(arr, target);
        
        if (targetIndex != -1) {
            System.out.println("Target " + target + " found at index: " + targetIndex);
        } else {
            System.out.println("Target " + target + " not found (-1).");
        }

        input.close();
    }   
}
