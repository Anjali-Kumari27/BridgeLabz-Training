package com.tourmate;

import java.util.Scanner;

public class UseTourMate {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Predefined domestic and international trips
		Trip[] trips = {

				new DomesticTrip("Manali", 5, 12000, 4000,
						new String[] { "Snow Trekking", "Rohtang Pass Visit", "Bonfire Night" }),

				new DomesticTrip("Goa", 4, 15000, 5000,
						new String[] { "Beach Party", "Scuba Diving", "Cruise Dinner" }),

				new InternationalTrip("Paris", 7, 60000, 25000,
						new String[] { "Eiffel Tower Tour", "Seine River Cruise", "Museum Visit" }),

				new InternationalTrip("Dubai", 5, 50000, 20000,
						new String[] { "Desert Safari", "Burj Khalifa Visit", "Dhow Cruise" }) };

		// Loop to allow multiple trip viewing
		while (true) {

			System.out.println("\n=======================================================");
			System.out.println("                  Welcome to TourMate App                ");
			System.out.println("=======================================================\n");
			System.out.println("Available Trips:\n");

			// Display all available trips
			for (int i = 0; i < trips.length; i++) {
				System.out.println((i + 1) + ". " + trips[i].destination + " (" + trips[i].getTripType() + ")");
			}

			 // Ask user to select a trip
			System.out.print("\nSelect trip number to view details (0 to Exit): ");
			int choice = input.nextInt();

			// Exit option
			if (choice == 0) {
				System.out.println("Thank you for using TourMate!");
				break;
			}

			// Invalid choice check
			if (choice < 1 || choice > trips.length) {
				System.out.println("Invalid choice!");
				continue;
			}

			// Get selected trip
			Trip selectedTrip = trips[choice - 1];

			// Display selected trip details
			System.out.println("\n---------------------------------------");
			System.out.println("             Trip Details                ");
			System.out.println("---------------------------------------\n");
			selectedTrip.displayTripDetails();

			// Ask user for booking decision
			System.out.print("\nDo you want to book this trip? (yes/no): ");
			String decision = input.next();

			if (decision.equalsIgnoreCase("yes")) {
				System.out.println("Trip Booked Successfully");
			} else {
				System.out.println("Trip Cancelled");
			}
		}

		input.close();
	}
}
