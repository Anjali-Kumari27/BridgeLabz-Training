package com.sorting.eduresults;

/*
 * 3. EduResults – Rank Sheet Generator (Merge Sort)
Story: An educational board compiles marks of thousands of students from different districts.
Each district submits a sorted list of students by score. The main server needs to merge and
sort all these lists into a final state-wise rank list. Merge Sort ensures efficiency and maintains
stability for duplicate scores.
Concepts Involved:
● Merge Sort
● Merging sorted sublists
● Large datasets with stable sorting

 */

import java.util.Scanner;

public class MergeSortRankSheet {

    // Merge Sort method
    public static void mergeSort(int[] marks, String[] names, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(marks, names, left, mid);

            // Sort right half
            mergeSort(marks, names, mid + 1, right);

            // Merge both halves
            merge(marks, names, left, mid, right);
        }
    }

    // Merge two sorted parts
    public static void merge(int[] marks, String[] names, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftMarks = new int[n1];
        int[] rightMarks = new int[n2];

        String[] leftNames = new String[n1];
        String[] rightNames = new String[n2];

        // Copy data
        for (int i = 0; i < n1; i++) {
            leftMarks[i] = marks[left + i];
            leftNames[i] = names[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightMarks[j] = marks[mid + 1 + j];
            rightNames[j] = names[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merge while comparing
        while (i < n1 && j < n2) {
            if (leftMarks[i] <= rightMarks[j]) {   // stable sorting
                marks[k] = leftMarks[i];
                names[k] = leftNames[i];
                i++;
            } else {
                marks[k] = rightMarks[j];
                names[k] = rightNames[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            marks[k] = leftMarks[i];
            names[k] = leftNames[i];
            i++;
            k++;
        }

        while (j < n2) {
            marks[k] = rightMarks[j];
            names[k] = rightNames[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n==============================================");
        System.out.println("        EduResults - Rank Sheet Generator     ");
        System.out.println("==============================================");

        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        input.nextLine(); 

        String[] names = new String[n];
        int[] marks = new int[n];

        // Input student data
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter student name: ");
            names[i] = input.nextLine();

            System.out.print("Enter marks: ");
            marks[i] = input.nextInt();
            input.nextLine();
        }

        // Sort using Merge Sort
        mergeSort(marks, names, 0, n - 1);

        // Display rank list
        System.out.println("\n----------------------------------------------");
        System.out.println("        State-Level Rank List (Sorted)        ");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ": " + names[i] + " secured " + marks[i] + " Marks ");
        }

        input.close();
    }
}
