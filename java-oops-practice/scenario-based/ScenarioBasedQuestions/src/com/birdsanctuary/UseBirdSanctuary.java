package com.birdsanctuary;

import java.util.*;

public class UseBirdSanctuary {

	// Static ArrayList to store all birds in the sanctuary
	// 'static' is used so that this list can be accessed
	// inside the static main() method without creating an object
	// Only one common list will exist for the entire program
	static ArrayList<Bird> birds = new ArrayList<>();

	// Static Scanner object to take input from the user
	// 'static' is used so that this Scanner can be accessed
	// inside the static main() method and other static methods
	// without creating an object of the class
	// One Scanner object is shared throughout the program
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int choice;

		do {
			System.out.println("\n=============================================");
			System.out.println("             EcoWing Bird Sanctuary            ");
			System.out.println("=============================================\n");
			System.out.println("1. Add Bird");
			System.out.println("2. Display All Birds");
			System.out.println("3. Display Flying Birds");
			System.out.println("4. Display Swimming Birds");
			System.out.println("5. Display Fly + Swim Birds");
			System.out.println("6. Remove Bird by ID");
			System.out.println("7. Sanctuary Report");
			System.out.println("8. Exit");
			System.out.print("\nEnter choice: ");

			choice = input.nextInt();

			switch (choice) {
			case 1:
				addBird();
				break;
			case 2:
				displayAll();
				break;
			case 3:
				displayFlying();
				break;
			case 4:
				displaySwimming();
				break;
			case 5:
				displayBoth();
				break;
			case 6:
				removeBird();
				break;
			case 7:
				report();
				break;
			case 8:
				System.out.println("\n------------------------------------------------");
				System.out.println("             Thank you for Visiting!!!!           ");
				System.out.println("------------------------------------------------\n");
				break;
			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 8); // loop continues until Exit
	}

	// Method to add a bird
	public static void addBird() {
		System.out.print("\nEnter ID: ");
		int id = input.nextInt();
		input.nextLine();

		System.out.print("Enter Name: ");
		String name = input.nextLine();

		System.out.println("Select Type: 1.Eagle 2.Duck 3.Penguin 4.Kiwi");
		int type = input.nextInt();

		Bird bird = null;

		// Creating object based on bird type
		if (type == 1)
			bird = new Eagle(id, name);
		else if (type == 2)
			bird = new Duck(id, name);
		else if (type == 3)
			bird = new Penguin(id, name);
		else if (type == 4)
			bird = new Kiwi(id, name);

		// Adding bird to list
		birds.add(bird);
		System.out.println("Bird added successfully!");
	}

	// Display all birds with their abilities
	public static void displayAll() {
		for (Bird b : birds) {
			b.displayInfo();
			b.eat();

			// Polymorphism: checking abilities at runtime
			if (b instanceof Flyable)
				((Flyable) b).fly();

			if (b instanceof Swimmable)
				((Swimmable) b).swim();

			System.out.println("-------------------");
		}
	}

	// Display only flying birds
	public static void displayFlying() {
		System.out.println(" ");
		for (Bird b : birds)
			if (b instanceof Flyable)
				b.displayInfo();
	}

	// Display only swimming birds
	public static void displaySwimming() {
		System.out.println(" ");
		for (Bird b : birds)
			if (b instanceof Swimmable)
				b.displayInfo();
	}

	// Display birds that can both fly and swim
	public static void displayBoth() {
		System.out.println(" ");
		for (Bird b : birds)
			if (b instanceof Flyable && b instanceof Swimmable)
				b.displayInfo();
	}

	// Remove bird using ID
	public static void removeBird() {
		System.out.print("Enter ID to remove: ");
		int id = input.nextInt();

		// Creating iterator to safely traverse the ArrayList
		Iterator<Bird> it = birds.iterator();

		// Loop through the list until all birds are checked
		while (it.hasNext()) {

			// Get the next bird object
			Bird b = it.next();

			// Check if entered ID matches bird's ID
			if (b.getId() == id) {

				// Remove the bird safely using iterator
				it.remove();
			}
		}

		System.out.println("Bird removed if existed.");
	}

	// Sanctuary report
	public static void report() {
		System.out.println(" ");
		int fly = 0, swim = 0, both = 0, neither = 0;

		for (Bird b : birds) {
			boolean f = b instanceof Flyable;
			boolean s = b instanceof Swimmable;

			if (f && s)
				both++;
			else if (f)
				fly++;
			else if (s)
				swim++;
			else
				neither++;
		}

		System.out.println("Flyable: " + fly);
		System.out.println("Swimmable: " + swim);
		System.out.println("Both: " + both);
		System.out.println("Neither: " + neither);
	}
}
