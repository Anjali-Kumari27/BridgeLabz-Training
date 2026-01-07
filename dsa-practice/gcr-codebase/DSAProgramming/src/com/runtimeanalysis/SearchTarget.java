package com.runtimeanalysis;

import java.util.Scanner;
import java.util.Arrays;


public class SearchTarget {


	// Linear Search Implementation: O(N)
    public static int performLinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            // Best Practice: Return early to reduce unnecessary iterations
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }


    // Binary Search Implementation: O(log N)
    public static int performBinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;


        while (low <= high) {
            // Best Practice: Calculate mid to avoid integer overflow
            int mid = low + (high - low) / 2;


            if (arr[mid] == target) {
                return mid; // Found target
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Best Practice: Profile & benchmark performance using user input for scale
        System.out.print("Enter the dataset size (e.g., 1000000): ");
        int n = input.nextInt();
        int[] data = new int[n];


        // Best Practice: Precompute/initialize sorted data for Binary Search
        for (int i = 0; i < n; i++) {
            data[i] = i * 2; // Generating a sorted even-number sequence
        }


        System.out.print("Enter target value to search: ");
        int target = input.nextInt();


        // 1. Benchmarking Linear Search O(N)
        long startLinear = System.nanoTime();
        int linearIndex = performLinearSearch(data, target);
        long endLinear = System.nanoTime();


        // 2. Benchmarking Binary Search O(log N)
        long startBinary = System.nanoTime();
        int binaryIndex = performBinarySearch(data, target);
        long endBinary = System.nanoTime();


        // Output and Comparative Analysis
        System.out.println("\n--- Performance Results ---");
        System.out.println("Linear Search Index: " + linearIndex + " | Time: " + (endLinear - startLinear) + " ns");
        System.out.println("Binary Search Index: " + binaryIndex + " | Time: " + (endBinary - startBinary) + " ns");
        
        // Best Practice: Explain efficiency based on results
        System.out.println("\nNote: Binary Search is significantly faster for N=" + n + " due to O(log N) complexity.");
        
        input.close();
    }
}
