package com.sorting.hospitalqueue;

import java.util.Scanner;
public class BubbleSortHospitalQueue {

    public static void bubbleSort(int[] criticality) {
        int n = criticality.length;

        // Sorting using Bubble Sort 
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (criticality[j] > criticality[j + 1]) {
                    // Swap
                    int temp = criticality[j];
                    criticality[j] = criticality[j + 1];
                    criticality[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);

        // Input number of patients
        System.out.println("\n===================================================");
        System.out.println("                     Apollo Hospital                 ");
        System.out.println("===================================================\n");
        System.out.print("Enter number of patients: ");
        int n = input.nextInt();

        int[] patients = new int[n];

        // Input criticality levels patient wise
        System.out.println("\n---------------------------------------------");
        System.out.println("   Provide Patient criticality levels (1–10)   ");
        System.out.println("---------------------------------------------\n");
        for (int i = 0; i < n; i++) {
        	System.out.print("Critical Level of Patient " + (i+1) + " : ");
            patients[i] = input.nextInt();
        }

        // Sorting patients
        bubbleSort(patients);

        // Display sorted list
        System.out.println("\n***************************************");
        System.out.println("Patients sorted by criticality:");
        for (int p : patients) {
            System.out.print(p + " ");
        }

        input.close();
    }
}

