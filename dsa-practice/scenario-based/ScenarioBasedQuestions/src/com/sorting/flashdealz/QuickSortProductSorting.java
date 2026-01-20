package com.sorting.flashdealz;

/*
 * 4. FlashDealz – Product Sorting by Discount (Quick Sort)
Story: An e-commerce platform runs a flash sale with millions of products, each offering
different discounts. Users want to see the top discounted products instantly. To quickly sort
such large data, the backend uses Quick Sort, known for its fast average-case performance
and efficiency.
Concepts Involved:
● Quick Sort
● Large unsorted data
● Performance optimization
 */
import java.util.Scanner;

public class QuickSortProductSorting {

	// Quick Sort method
	public static void quickSort(int[] discounts, String[] products, int low, int high) {

		if (low < high) {

			int pivotIndex = partition(discounts, products, low, high);

			quickSort(discounts, products, low, pivotIndex - 1);
			quickSort(discounts, products, pivotIndex + 1, high);
		}
	}

	// Partition method
	public static int partition(int[] discounts, String[] products, int low, int high) {

		int pivot = discounts[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {

			// Sort in descending order (higher discount first)
			if (discounts[j] > pivot) {

				i++;

				// Swap discounts
				int tempDiscount = discounts[i];
				discounts[i] = discounts[j];
				discounts[j] = tempDiscount;

				// Swap product names
				String tempProduct = products[i];
				products[i] = products[j];
				products[j] = tempProduct;
			}
		}

		// Place pivot at correct position
		int tempDiscount = discounts[i + 1];
		discounts[i + 1] = discounts[high];
		discounts[high] = tempDiscount;

		String tempProduct = products[i + 1];
		products[i + 1] = products[high];
		products[high] = tempProduct;

		return i + 1;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("\n==============================================");
		System.out.println("     FlashDealz - Product Discount Sorting    ");
		System.out.println("==============================================");

		System.out.print("Enter number of products: ");
		int n = input.nextInt();
		input.nextLine(); 

		String[] products = new String[n];
		int[] discounts = new int[n];

		// Input product data
		for (int i = 0; i < n; i++) {
			System.out.print("\nEnter product name: ");
			products[i] = input.nextLine();

			System.out.print("Enter discount percentage: ");
			discounts[i] = input.nextInt();
			input.nextLine();
		}

		// Sort using Quick Sort
		quickSort(discounts, products, 0, n - 1);

		// Display sorted products
		System.out.println("\n----------------------------------------------");
		System.out.println("      Products Sorted by Highest Discount     ");
		System.out.println("----------------------------------------------");

		for (int i = 0; i < n; i++) {
			System.out.println(products[i] + " = > " + discounts[i] + "% OFF");
		}

		input.close();
	}
}
