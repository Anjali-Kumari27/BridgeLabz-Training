package com.runtimeanalysis;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class SortingLargeData {

	// Bubble Sort: O(N^2) - Repeated swapping
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    // Merge Sort: O(N log N) - Divide and Conquer
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }


    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, left, temp.length);
    }


    // Quick Sort: O(N log N) - Partition-based
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }


    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();


        // Best Practice: Profile performance using different dataset sizes
        System.out.print("Enter the dataset size (e.g., 10000): ");
        int n = input.nextInt();
        int[] original = new int[n];


        for (int i = 0; i < n; i++) {
            original[i] = random.nextInt(n * 10);
        }


        // 1. Benchmarking Bubble Sort O(N^2)
        // Best Practice: Avoid Bubble Sort for N > 10,000 as it becomes unfeasible
        if (n <= 10000) {
            int[] bubbleData = original.clone();
            long startBubble = System.nanoTime();
            bubbleSort(bubbleData);
            long endBubble = System.nanoTime();
            System.out.println("Bubble Sort Time: " + (endBubble - startBubble) / 1000000.0 + " ms");
        } else {
            System.out.println("Bubble Sort: Skipped (Unfeasible for large N)");
        }


        // 2. Benchmarking Merge Sort O(N log N)
        int[] mergeData = original.clone();
        long startMerge = System.nanoTime();
        mergeSort(mergeData, 0, n - 1);
        long endMerge = System.nanoTime();
        System.out.println("Merge Sort Time: " + (endMerge - startMerge) / 1000000.0 + " ms");


        // 3. Benchmarking Quick Sort O(N log N)
        int[] quickData = original.clone();
        long startQuick = System.nanoTime();
        quickSort(quickData, 0, n - 1);
        long endQuick = System.nanoTime();
        System.out.println("Quick Sort Time: " + (endQuick - startQuick) / 1000000.0 + " ms");


        input.close();
    }
}