package com.parceltracker;

/*
 * ParcelTracker – Delivery Chain Management (Singly Linked List)
Story: A courier company tracks parcels through stages like Packed → Shipped → In Transit →
Delivered. Each stage is a node in a Singly Linked List.
Requirements:
● Forward tracking through stages.
● Add custom intermediate checkpoints.
● Handle lost/missing parcels (null pointers).
 */

import java.util.Scanner;

public class UseParcelTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ParcelTracker tracker = new ParcelTracker();

        int choice;

        do {
            System.out.println("\n===========================================================");
            System.out.println("                    Parcel Tracker Menu                      ");
            System.out.println("===========================================================\n");
            System.out.println("1. Track Parcel");
            System.out.println("2. Add Checkpoint");
            System.out.println("3. Mark Parcel Lost");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    tracker.trackParcel();
                    break;

                case 2:
                    System.out.print("Add after which stage? ");
                    String after = input.nextLine();

                    System.out.print("Enter new checkpoint name: ");
                    String checkpoint = input.nextLine();

                    tracker.addCheckpoint(after, checkpoint);
                    break;

                case 3:
                    System.out.print("Enter stage where parcel got lost: ");
                    String lostStage = input.nextLine();

                    tracker.markLost(lostStage);
                    break;

                case 4:
                    System.out.println("\n-----------------------------------------------");
                    System.out.println("        Tracking of Parcel is closed!!!!!!       ");
                    System.out.println("-----------------------------------------------\n");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        input.close();
    }
}

