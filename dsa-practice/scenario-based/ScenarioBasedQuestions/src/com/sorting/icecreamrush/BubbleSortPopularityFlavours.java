package com.sorting.icecreamrush;

/*
 * 1. IceCreamRush – Sorting Flavors by Popularity (Bubble Sort)
Story: At “IceCreamRush,” a small local vendor sells 8 different ice cream flavors. At the end of
each week, the shopkeeper wants to sort these flavors based on how many times each was
sold. Since the list is short and he updates it manually, he prefers a simple sorting method —
Bubble Sort — where he repeatedly compares adjacent sales figures and swaps them if
Needed.

Concepts Involved:
● Bubble Sort
● Small data size
● Repeated adjacent comparisons

 */

import java.util.Scanner;

public class BubbleSortPopularityFlavours {

    // Bubble Sort based on sales count
    static void bubbleSort(String[] flavors, int[] sales, int totalFlavour) {

        for (int i = 0; i < totalFlavour - 1; i++) {

            for (int j = 0; j < totalFlavour - 1 - i; j++) {

                // Compare adjacent sales
                if (sales[j] > sales[j + 1]) {

                    // Swap sales
                    int tempSales = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = tempSales;

                    // Swap corresponding flavor names
                    String tempFlavor = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = tempFlavor;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n================================================================");
        System.out.println("                     Welcome to Ice-Cream Rush                    ");
        System.out.println("================================================================\n");

        System.out.println("There's total 8 Flavours of Ice-Cream Present Here ");
        int totalFlavour = 8;

        String[] flavors = new String[totalFlavour];
        int[] sales = new int[totalFlavour];

        // Input flavor names and sales
        for (int i = 0; i < 8; i++) {
            System.out.print("\nEnter flavor " + (i+1) + " name: ");
            flavors[i] = input.nextLine();

            System.out.print("Enter sales count: ");
            sales[i] = input.nextInt();
            input.nextLine(); 
        }

        // Sort using Bubble Sort
        bubbleSort(flavors, sales, totalFlavour);

        // Display sorted result
        System.out.println("\n----------------------------------------------");
        System.out.println("   Ice Cream Flavors Sorted by Popularity     ");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < 8; i++) {
            System.out.println(flavors[i] + "  =>  " + sales[i] + " sales");
        }

        input.close();
    }
}
