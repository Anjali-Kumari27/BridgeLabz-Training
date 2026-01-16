package com.sorting.examcell;

/*
 * ExamCell – Student Rank Generator (Merge Sort)
Story: An online exam system collects scores from multiple test centers. To publish a
state-level rank list, student scores are merged and sorted using Merge Sort, ensuring
performance and accuracy.
Key Concepts:
● Merging pre-sorted center-wise scores
● Sorting across centers
● High efficiency for big data

 */

import java.util.Scanner;

// ExamCell Student Rank Generator using Merge Sort
public class MergeSortExamCell {

    // Merge Sort method
    static void mergeSort(int[] scores, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(scores, left, mid);

            // Sort right half
            mergeSort(scores, mid + 1, right);

            // Merge both halves
            merge(scores, left, mid, right);
        }
    }

    // Merge two sorted sub-arrays
    static void merge(int[] scores, int left, int mid, int right) {

        int size = right - left + 1;
        int[] temp = new int[size];

        int i = left;      // left sub-array
        int j = mid + 1;   // right sub-array
        int k = 0;         // temp index

        // Compare and merge (stable)
        while (i <= mid && j <= right) {
            if (scores[i] >= scores[j]) { // Higher score = better rank
                temp[k++] = scores[i++];
            } else {
                temp[k++] = scores[j++];
            }
        }

        // Copy remaining elements
        while (i <= mid) {
            temp[k++] = scores[i++];
        }

        while (j <= right) {
            temp[k++] = scores[j++];
        }

        // Copy back to original array
        for (int x = 0; x < size; x++) {
            scores[left + x] = temp[x];
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Header
        System.out.println("\n=================================================");
        System.out.println("        ExamCell - Student Rank Generator         ");
        System.out.println("=================================================");

        // Input number of students
        System.out.print("Enter total number of students: ");
        int n = input.nextInt();

        int[] scores = new int[n];

        // Input student scores
        System.out.println("Enter student scores:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " Score: ");
            scores[i] = input.nextInt();
        }

        // Sort scores (highest first)
        mergeSort(scores, 0, n - 1);

        // Display rank list
        System.out.println("\n------------------------------------------------");
        System.out.println("        State-Level Rank List                    ");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + " : " + scores[i]);
        }

        input.close();
    }
}
