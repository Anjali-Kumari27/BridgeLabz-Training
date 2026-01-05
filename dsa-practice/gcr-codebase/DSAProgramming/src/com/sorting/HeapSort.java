package com.sorting;

import java.util.*;

public class HeapSort {

    // Method to apply Heap Sort on salary demands
    public static void heapSort(int[] salaries) {

        int n = salaries.length;

         /* Step 1: Build a Max Heap
         * Start from the last non-leaf node and heapify each node
         */
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        
        /* Step 2: Extract elements one by one from the heap
         * Move current root (largest element) to the end
         * and reheapify the remaining heap
         */
        for (int i = n - 1; i > 0; i--) {

            // Swap root (maximum) with last element
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Heapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Method to maintain Max Heap property
    private static void heapify(int[] salaries, int heapSize, int rootIndex) {

    	// Assume root is largest
        int largest = rootIndex;   
        
        // Left child index
        int left = 2 * rootIndex + 1;  
        
        // Right child index
        int right = 2 * rootIndex + 2;  

        
        // Check if left child exists and is greater than root
        if (left < heapSize && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // Check if right child exists and is greater than largest so far
        if (right < heapSize && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If largest is not root, swap and continue heapifying
        if (largest != rootIndex) {
            int swap = salaries[rootIndex];
            salaries[rootIndex] = salaries[largest];
            salaries[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(salaries, heapSize, largest);
        }
    }
    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking number of job applicants
        System.out.println("Enter number of job applicants:");
        int size = input.nextInt();

        // Declaring array for salary demands
        int[] salaries = new int[size];

        // Taking salary demands as input
        System.out.println("Enter expected salary demands:");
        for (int i = 0; i < size; i++) {
            salaries[i] = input.nextInt();
        }

        // Applying Heap Sort
        heapSort(salaries);

        // Displaying sorted salary demands
        System.out.println("Sorted Salary Demands: " + Arrays.toString(salaries));

        input.close();
    }
}
