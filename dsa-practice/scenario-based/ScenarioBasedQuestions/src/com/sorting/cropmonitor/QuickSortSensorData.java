package com.sorting.cropmonitor;

/*
 * CropMonitor – Sensor Data Ordering (Quick Sort)
Story: An agri-tech firm uses drone sensors that record soil temperatures at random intervals.
The large data needs to be sorted quickly by timestamp before visualization. Quick Sort is
chosen due to its fast average performance.
Key Concepts:
● Unordered sensor data
● High-speed sorting
● Quick partitioning based on timestamps
 */

import java.util.InputMismatchException;
import java.util.Scanner;

// CropMonitor Sensor Data Ordering using Quick Sort
public class QuickSortSensorData {

    static void quickSort(long[] timestamps, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(timestamps, low, high);
            quickSort(timestamps, low, pivotIndex - 1);
            quickSort(timestamps, pivotIndex + 1, high);
        }
    }

    static int partition(long[] timestamps, int low, int high) {
        long pivot = timestamps[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (timestamps[j] < pivot) {
                i++;
                long temp = timestamps[i];
                timestamps[i] = timestamps[j];
                timestamps[j] = temp;
            }
        }

        long temp = timestamps[i + 1];
        timestamps[i + 1] = timestamps[high];
        timestamps[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n=================================================");
        System.out.println("       CropMonitor - Sensor Data Ordering        ");
        System.out.println("=================================================");

        int n = 0;

        // Keep asking until valid number is entered
        while (true) {
            try {
                System.out.print("Enter number of sensor readings: ");
                n = input.nextInt();

                if (n <= 0) {
                    System.out.println("Number must be greater than 0.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter an integer.");
                input.next(); 
            }
        }

        long[] timestamps = new long[n];

        System.out.println("Enter sensor timestamps (whole numbers only):");

        // ✅ Retry for each timestamp
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Reading " + (i + 1) + " Timestamp: ");
                    timestamps[i] = input.nextLong();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Enter whole number only.");
                    input.next(); 
                }
            }
        }

        quickSort(timestamps, 0, n - 1);

        System.out.println("\n------------------------------------------------");
        System.out.println("       Sorted Sensor Data (by Timestamp)        ");
        System.out.println("------------------------------------------------");

        for (long t : timestamps) {
            System.out.println(t);
        }

        input.close();
        System.out.println("\nProgram is completed Here.");
    }
}
