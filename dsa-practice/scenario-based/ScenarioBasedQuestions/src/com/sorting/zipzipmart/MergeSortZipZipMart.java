package com.sorting.zipzipmart;

import java.util.Scanner;

// ZipZipMart Daily Sales Summary using Merge Sort
public class MergeSortZipZipMart {

	// Method to perform Merge Sort
	public static void mergeSort(int[] sales, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			// Divide the array
			mergeSort(sales, left, mid);
			mergeSort(sales, mid + 1, right);

			// Merge sorted halves
			merge(sales, left, mid, right);
		}
	}

	// Method to merge two sorted sub-arrays
	public static void merge(int[] sales, int left, int mid, int right) {

		int size = right - left + 1;
		int[] temp = new int[size];

		int i = left; // left sub-array index
		int j = mid + 1; // right sub-array index
		int k = 0; // temp array index

		// Compare and merge
		while (i <= mid && j <= right) {
			if (sales[i] <= sales[j]) { // Stable sorting
				temp[k++] = sales[i++];
			} else {
				temp[k++] = sales[j++];
			}
		}

		// Copy remaining elements
		while (i <= mid) {
			temp[k++] = sales[i++];
		}

		while (j <= right) {
			temp[k++] = sales[j++];
		}

		// Copy back to original array
		for (int x = 0; x < size; x++) {
			sales[left + x] = temp[x];
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Header
		System.out.println("\n=================================================");
		System.out.println("        ZipZipMart - Daily Sales Report           ");
		System.out.println("=================================================");

		// Input number of sales records
		System.out.print("Enter number of sales records: ");
		int n = input.nextInt();

		int[] sales = new int[n];

		// Input sales amounts
		System.out.println("Enter daily sales amounts:");
		for (int i = 0; i < n; i++) {
			System.out.print("Sale " + (i + 1) + " Amount: ");
			sales[i] = input.nextInt();
		}

		// Sort sales data
		mergeSort(sales, 0, n - 1);

		// Display sorted report
		System.out.println("\n------------------------------------------------");
		System.out.println("        Sorted Daily Sales Report                ");
		System.out.println("------------------------------------------------");

		for (int amount : sales) {
			System.out.println(amount);
		}

		input.close();
	}
}
