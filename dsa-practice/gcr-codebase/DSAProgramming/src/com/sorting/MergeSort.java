package com.sorting;

import java.util.*;

public class MergeSort {

    // Method to apply Merge Sort on book prices
    public static void mergeSort(int[] bookPrices, int left, int right) {

        // Check if there is more than one element
        if (left < right) {

            // Find middle index to divide array into two halves
            int mid = left + (right - left) / 2;

            // Recursively sort the left half
            mergeSort(bookPrices, left, mid);

            // Recursively sort the right half
            mergeSort(bookPrices, mid + 1, right);

            // Merge the sorted halves
            merge(bookPrices, left, mid, right);
        }
    }

    // Method to merge two sorted halves
    private static void merge(int[] bookPrices, int left, int mid, int right) {

        // Sizes of left and right sub-arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data into temporary arrays
        System.arraycopy(bookPrices, left, leftArr, 0, n1);
        System.arraycopy(bookPrices, mid + 1, rightArr, 0, n2);

        // Indexes for left array, right array and merged array
        int i = 0, j = 0, k = left;

        // Merge elements by comparing both halves
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                bookPrices[k++] = leftArr[i++];
            } else {
                bookPrices[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements of left array
        while (i < n1) {
            bookPrices[k++] = leftArr[i++];
        }

        // Copy remaining elements of right array
        while (j < n2) {
            bookPrices[k++] = rightArr[j++];
        }
    }

    
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking size of array from user
        System.out.println("Enter number of books:");
        int size = input.nextInt();

        // Declaring array for book prices
        int[] bookPrices = new int[size];

        // Taking book prices as input
        System.out.println("Enter book prices:");
        for (int i = 0; i < size; i++) {
            bookPrices[i] = input.nextInt();
        }

        // Applying merge sort
        mergeSort(bookPrices, 0, bookPrices.length - 1);

        // Displaying sorted book prices
        System.out.println("Sorted Book Prices: " + Arrays.toString(bookPrices));

  
        input.close();
    }
}
