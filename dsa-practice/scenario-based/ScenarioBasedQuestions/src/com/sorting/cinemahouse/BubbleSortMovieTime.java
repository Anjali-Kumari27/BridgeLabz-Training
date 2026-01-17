package com.sorting.cinemahouse;

/*
 *  CinemaHouse – Movie Time Sorting (Bubble Sort)
Story: A small local cinema lists daily movie shows. The screen manager updates showtimes
manually and prefers a simple sorting logic. Since the number of shows is small (~10), Bubble
Sort is used.
Key Concepts:
● Manual data entry, simple logic
● Small dataset
● Minimal code complexity

 */

import java.util.Scanner;

// CinemaHouse Movie Time Sorting using Bubble Sort
public class BubbleSortMovieTime {

	// Method to sort movie show timings using Bubble Sort
	public static void bubbleSort(int[] times) {

		int n = times.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - 1 - i; j++) {

				// Compare adjacent show times
				if (times[j] > times[j + 1]) {

					// Swap timings
					int temp = times[j];
					times[j] = times[j + 1];
					times[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("\n=================================================");
		System.out.println("        CinemaHouse - Movie Time Schedule        ");
		System.out.println("=================================================");

		// Input number of shows
		System.out.print("Enter number of movie shows: ");
		int n = input.nextInt();

		int[] times = new int[n];

		// Input show timings
		System.out.println("Enter movie show times (24-hour format):");
		for (int i = 0; i < n; i++) {
			System.out.print("Show " + (i + 1) + " Time: ");
			times[i] = input.nextInt();
		}

		// Sort movie times
		bubbleSort(times);

		// Display sorted showtimes
		System.out.println("\n------------------------------------------------");
		System.out.println("        Sorted Movie Show Times                 ");
		System.out.println("------------------------------------------------");

		for (int t : times) {
			System.out.println(t);
		}

		input.close();
	}
}
