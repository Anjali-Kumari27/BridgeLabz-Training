package com.bagnballorganizer;

/*
 * 2. Bag-n-Ball Organizer
 OOP Concepts:
Classes, Objects, Inheritance (optional), Encapsulation, Method Design
Scenario:
You’re building a toy storage system for TinyTown Play School, which wants to keep track of
bags and the balls inside them.
Each Bag has:
● A unique ID, color, and capacity (number of balls it can hold)
Each Ball has:
● A unique ID, color, and size (small/medium/large)

 Problem Statement:
Develop a Java system to:
● Add balls to a bag (up to capacity)
● Remove a ball from a bag
● Display all balls in a bag
● Display all bags and their ball count
● Prevent adding a ball if the bag is full

Encapsulate fields, use appropriate getters/setters, and model real-world object
relations through composition (i.e., Bag "has-a" list of Balls)
Bonus: Use an interface to define Storable behavior for both Bag and Ball.

 */

import java.util.ArrayList;
import java.util.Scanner;

public class UseBagnBallOrganizer {

    static ArrayList<Bag> bags = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n==============================================");
            System.out.println("              Bag-n-Ball Organizer              ");
            System.out.println("==============================================\n");
            System.out.println("1. Add Bag");
            System.out.println("2. Add Ball to Bag");
            System.out.println("3. Remove Ball from Bag");
            System.out.println("4. Display Balls in a Bag");
            System.out.println("5. Display All Bags");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    addBag();
                    break;

                case 2:
                    addBallToBag();
                    break;

                case 3:
                    removeBallFromBag();
                    break;

                case 4:
                    displayBallsInBag();
                    break;

                case 5:
                    displayAllBags();
                    break;

                case 6:
                    System.out.println("\n------------------------------------------------------------------");
                    System.out.println("             Thank you for using Bag-n-Ball Organizer               ");
                    System.out.println("------------------------------------------------------------------\n");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }

    // Add new bag
    static void addBag() {
        System.out.print("Enter Bag ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Bag Color: ");
        String color = input.nextLine();

        System.out.print("Enter Bag Capacity: ");
        int capacity = input.nextInt();

        bags.add(new Bag(id, color, capacity));
        System.out.println("Bag added successfully!");
    }

    // Add ball to selected bag
    static void addBallToBag() {
        System.out.print("Enter Bag ID: ");
        int bagId = input.nextInt();

        for (Bag bag : bags) {
            if (bag.getId() == bagId) {

                System.out.print("Enter Ball ID: ");
                int ballId = input.nextInt();
                input.nextLine();

                System.out.print("Enter Ball Color: ");
                String color = input.nextLine();

                System.out.print("Enter Ball Size (small/medium/large): ");
                String size = input.nextLine();

                bag.addBall(new Ball(ballId, color, size));
                return;
            }
        }
        System.out.println("Bag not found!");
    }

    // Remove ball from bag
    static void removeBallFromBag() {
        System.out.print("Enter Bag ID: ");
        int bagId = input.nextInt();

        System.out.print("Enter Ball ID to remove: ");
        int ballId = input.nextInt();

        for (Bag bag : bags) {
            if (bag.getId() == bagId) {
                bag.removeBall(ballId);
                return;
            }
        }
        System.out.println("Bag not found!");
    }

    // Display balls inside a bag
    static void displayBallsInBag() {
        System.out.print("Enter Bag ID: ");
        int bagId = input.nextInt();

        for (Bag bag : bags) {
            if (bag.getId() == bagId) {
                bag.displayBalls();
                return;
            }
        }
        System.out.println("Bag not found!");
    }

    // Display all bags
    static void displayAllBags() {
        for (Bag bag : bags) {
            bag.displayInfo();
        }
    }
}
