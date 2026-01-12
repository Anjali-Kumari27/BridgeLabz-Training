package com.traincompanion;

/*
 *  TrainCompanion – Compartment Navigation System (Doubly Linked
List)
Story: In a long-distance train app, passengers can walk to the next or previous compartment,
or search for services (like pantry, WiFi). Each compartment is a node in a Doubly Linked List.
Requirements:
● Traverse forward or backward.
● Insert/Remove compartments dynamically.
● Display adjacent compartments for quick decisions.
 */

import java.util.Scanner;

public class UseTrainCompanion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Train train = new Train();
        int choice;

        do {
            System.out.println("\n==================================================");
            System.out.println("                Train Companion Menu                ");
            System.out.println("==================================================\n");
            System.out.println("1. Add Compartment");
            System.out.println("2. Move Forward");
            System.out.println("3. Move Backward");
            System.out.println("4. Show Adjacent Compartments");
            System.out.println("5. Search Service (Pantry/WiFi)");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter compartment name: ");
                    String name = input.nextLine();

                    System.out.print("Enter service available: ");
                    String service = input.nextLine();

                    train.addCompartment(name, service);
                    break;

                case 2:
                    train.moveForward();
                    break;

                case 3:
                    train.moveBackward();
                    break;

                case 4:
                    train.showAdjacent();
                    break;

                case 5:
                    System.out.print("Enter service to search: ");
                    String s = input.nextLine();
                    train.searchService(s);
                    break;

                case 6:
                    System.out.println("\n**************************");
                    System.out.println("    Your Journey is Ended   ");
                    System.out.println("***************************\n");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        input.close();
    }
}
