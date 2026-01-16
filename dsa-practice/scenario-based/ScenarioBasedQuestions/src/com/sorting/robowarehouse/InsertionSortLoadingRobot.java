package com.sorting.robowarehouse;

/*
 * RoboWarehouse – Shelf Loading Robot (Insertion Sort)
Story: A robot loads packages onto shelves based on weight. It adds one package at a time
and must maintain an ascending order by weight for balance. Insertion Sort helps since new
items are inserted into the sorted list dynamically.
Key Concepts:
● Insertion into sorted lists
● Low memory footprint
● Ideal for streaming insertions
 */


import java.util.Scanner;

// RoboWarehouse Shelf Loading using Insertion Sort
public class InsertionSortLoadingRobot {

    // Method to sort package weights using Insertion Sort
    static void insertionSort(int[] weights) {

        for (int i = 1; i < weights.length; i++) {

            int key = weights[i];   // current package weight
            int j = i - 1;

            // Shift heavier packages to the right
            while (j >= 0 && weights[j] > key) {
                weights[j + 1] = weights[j];
                j--;
            }

            // Insert package at correct position
            weights[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n=================================================");
        System.out.println("      RoboWarehouse - Shelf Loading Robot        ");
        System.out.println("=================================================");

        // Input number of packages
        System.out.print("Enter number of packages: ");
        int n = input.nextInt();

        int[] weights = new int[n];

        // Input package weights
        System.out.println("Enter package weights:");
        for (int i = 0; i < n; i++) {
            System.out.print("Package " + (i + 1) + " Weight: ");
            weights[i] = input.nextInt();
        }

        // Sort weights
        insertionSort(weights);

        // Display sorted weights
        System.out.println("\n------------------------------------------------");
        System.out.println("      Packages Sorted by Weight (Ascending)     ");
        System.out.println("------------------------------------------------");

        for (int w : weights) {
            System.out.println(w);
        }

        input.close();
    }
}

