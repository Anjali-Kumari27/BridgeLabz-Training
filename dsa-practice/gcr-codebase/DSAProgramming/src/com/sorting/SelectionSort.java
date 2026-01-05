package com.sorting;

import java.util.*;

public class SelectionSort {

    // Method to apply Selection Sort on exam scores
    public static void selectionSort(int[] examScores) {

        int n = examScores.length;

         /* - The array is divided into sorted and unsorted parts
         * - In each pass, the minimum element from the unsorted part is selected
         * - It is swapped with the first element of the unsorted part
         */

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {

            // Assume the first unsorted element is the minimum
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (examScores[j] < examScores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = examScores[minIndex];
            examScores[minIndex] = examScores[i];
            examScores[i] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking number of students
        System.out.println("Enter number of students:");
        int size = input.nextInt();

        // Declaring array for exam scores
        int[] examScores = new int[size];

        // Taking exam scores as input
        System.out.println("Enter exam scores:");
        for (int i = 0; i < size; i++) {
            examScores[i] = input.nextInt();
        }

        // calling selection sort method
        selectionSort(examScores);

        // Displaying sorted exam scores
        System.out.println("Sorted Exam Scores: " + Arrays.toString(examScores));

        input.close();
    }
}

