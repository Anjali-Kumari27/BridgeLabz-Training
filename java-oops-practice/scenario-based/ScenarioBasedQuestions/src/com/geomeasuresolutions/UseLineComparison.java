package com.geomeasuresolutions;

import java.util.ArrayList;
import java.util.Scanner;

public class UseLineComparison {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Lines> lines = new ArrayList<>(); // To store multiple lines
		int choice;

		System.out.println("Welcome to GeoMeasure Line Comparison App!");

		do {
			System.out.println("\n******************************");
			System.out.println("Menu for Following Operations:");
			System.out.println("******************************\n");
			System.out.println("1. Add a Line");
			System.out.println("2. Compare Two Lines");
			System.out.println("3. Display All Lines");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = input.nextInt();

			switch (choice) {

			case 1:
				// Input coordinates for a new line
				System.out.print("\nEnter x1: ");
				double x1 = input.nextDouble();
				System.out.print("Enter y1: ");
				double y1 = input.nextDouble();
				System.out.print("Enter x2: ");
				double x2 = input.nextDouble();
				System.out.print("Enter y2: ");
				double y2 = input.nextDouble();

				// Create Line object using constructor
				Lines line = new Lines(x1, y1, x2, y2);
				lines.add(line); // Store in list
				System.out.println("Line added successfully!");
				break;

			case 2:
				// Compare lengths of two lines
				if (lines.size() < 2) {
					System.out.println("Please add at least two lines first!");
					break;
				}

				System.out.println("Select first line (1 to " + lines.size() + "): ");
				int first = input.nextInt() - 1;
				System.out.println("Select second line (1 to " + lines.size() + "): ");
				int second = input.nextInt() - 1;

				if (first < 0 || first >= lines.size() || second < 0 || second >= lines.size()) {
					System.out.println("Invalid line selection!");
					break;
				}

				Lines line1 = lines.get(first);
				Lines line2 = lines.get(second);

				double len1 = line1.getLength();
				double len2 = line2.getLength();

				System.out.println("\n-----------------------------------------------------");
				System.out.printf("Length of Line %d: %.2f\n", first + 1, len1);
				System.out.printf("Length of Line %d: %.2f\n", second + 1, len2);
				System.out.println("-----------------------------------------------------\n");
				if (len1 == len2) {
					System.out.println("Both lines are of equal length.");
					System.out.println("----------------------------------------------------\n");
				} else if (len1 > len2) {
					System.out.println("First line is longer than the second line.");
					System.out.println("----------------------------------------------------\n");
				} else
					System.out.println("Second line is longer than the first line.");
				System.out.println("----------------------------------------------------\n");
				break;

			case 3:
				// Display all lines
				System.out.println("All Lines:");
				for (int i = 0; i < lines.size(); i++) {
					System.out.print((i + 1) + ". ");
					lines.get(i).displayCoordinates();
					System.out.printf("   Length: %.2f\n", lines.get(i).getLength());
				}
				break;

			case 4:
				System.out.println("\n----------------------------------------------------------");
				System.out.println("          Leaving GeoMeasure Line Comparison System!!!      ");
				System.out.println("----------------------------------------------------------\n");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 4);

		input.close();
	}
}
