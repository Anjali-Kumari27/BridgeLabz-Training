package com.sorting;

import java.util.*;

public class QuickSort {

    // Method to apply Quick Sort on product prices
    public static void quickSort(int[] productPrices, int low, int high) {

        // Check if there are at least two elements to sort
        if (low < high) {
        	
             /* Partition the array:
             * - Pivot element is placed at its correct position
             * - Elements smaller than pivot are on the left
             * - Elements greater than pivot are on the right
             */
            int pi = partition(productPrices, low, high);

            // Recursively apply quick sort on left partition
            quickSort(productPrices, low, pi - 1);

            // Recursively apply quick sort on right partition
            quickSort(productPrices, pi + 1, high);
        }
    }

    // Method to partition the array using last element as pivot
    private static int partition(int[] productPrices, int low, int high) {

        // Choosing last element as pivot
        int pivot = productPrices[high];

        // Index of smaller element
        int i = low - 1;

        // Rearranging elements based on pivot
        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (productPrices[j] < pivot) {
                i++;

                // Swap productPrices[i] and productPrices[j]
                int temp = productPrices[i];
                productPrices[i] = productPrices[j];
                productPrices[j] = temp;
            }
        }

        // Place pivot in its correct position
        int temp = productPrices[i + 1];
        productPrices[i + 1] = productPrices[high];
        productPrices[high] = temp;

        // Return pivot index
        return i + 1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking number of products from user
        System.out.println("Enter number of products:");
        int size = input.nextInt();

        // Declaring array for product prices
        int[] productPrices = new int[size];

        // Taking product prices as input
        System.out.println("Enter product prices:");
        for (int i = 0; i < size; i++) {
            productPrices[i] = input.nextInt();
        }

        // calling Quick Sort method
        quickSort(productPrices, 0, productPrices.length - 1);

        // Displaying sorted product prices
        System.out.println("Sorted Product Prices: " + Arrays.toString(productPrices));

        input.close();
    }
}
