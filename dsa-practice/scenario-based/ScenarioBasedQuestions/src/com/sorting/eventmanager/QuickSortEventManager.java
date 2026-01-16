package com.sorting.eventmanager;

/*
 * EventManager – Ticket Price Optimizer (Quick Sort)
Story: An event booking portal sorts millions of tickets by price before showing the top 50
cheapest or most expensive. Since speed is crucial and data is unsorted, Quick Sort is used for
its average-case performance.
Key Concepts:
● Fast average time
● Recursive partitioning
● Ideal for large, random datasets

 */

import java.util.Scanner;

// EventManager Ticket Price Optimizer using Quick Sort
public class QuickSortEventManager {

    // Quick Sort method
    static void quickSort(int[] prices, int low, int high) {
        if (low < high) {

            // Partition index
            int pivotIndex = partition(prices, low, high);

            // Recursively sort left and right parts
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition method
    static int partition(int[] prices, int low, int high) {

        int pivot = prices[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // If current price is smaller than pivot
            if (prices[j] < pivot) {
                i++;
                // Swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1; // pivot index
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n=================================================");
        System.out.println("        EventManager - Ticket Price Optimizer     ");
        System.out.println("=================================================");

        // Input number of tickets
        System.out.print("Enter number of ticket prices: ");
        int n = input.nextInt();

        int[] prices = new int[n];

        // Input ticket prices
        System.out.println("Enter ticket prices:");
        for (int i = 0; i < n; i++) {
            System.out.print("Ticket " + (i + 1) + " Price: INR ");
            prices[i] = input.nextInt();
        }

        // Sort ticket prices
        quickSort(prices, 0, n - 1);

        // Display sorted prices
        System.out.println("\n------------------------------------------------");
        System.out.println("        Sorted Ticket Prices                     ");
        System.out.println("------------------------------------------------");

        for (int price : prices) {
            System.out.println(price);
        }

        input.close();
    }
}

