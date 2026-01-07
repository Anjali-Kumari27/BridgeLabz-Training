package com.parkease;
 
/*
  * "ParkEase – Smart Parking Management System"
Story: A city wants a smart parking solution that can assign parking slots, calculate charges,
and track availability in real time.
Requirements:
● ParkingSlot class: slotId, isOccupied, vehicleTypeAllowed.
● Vehicle base class → Car, Bike, Truck subclasses.
● IPayable interface with calculateCharges(duration) method.
● Encapsulation: Slot availability shouldn't be altered externally.
● Use constructors for slot initialization with location, vehicle type.
● Operators: (baseRate × hours) + (penalty if over time).
● Polymorphism: calculateCharges() differs by vehicle type.
● Access Modifiers: internal booking records are private, exposed via logs.
  */

import java.util.ArrayList;
import java.util.Scanner;

public class UseParkEase {

    public static void main(String[] args) {

    	// Create Scanner object to take input
        Scanner input = new Scanner(System.in);
        
        // List to store parking slots
        ArrayList<ParkingSlot> slots = new ArrayList<>();

        // Initialize 3 slots for demo
        slots.add(new ParkingSlot(101, "Sector A", "Car"));
        slots.add(new ParkingSlot(102, "Sector B", "Bike"));
        slots.add(new ParkingSlot(103, "Sector C", "Truck"));

        System.out.println("===== Welcome to ParkEase =====");

        boolean runApp = true;

        // Main loop for the program
        while (runApp) {

        	// Display menu to select vehicle type
            System.out.println("\nSelect Vehicle Type to Park:");
            System.out.println("1. Car");
            System.out.println("2. Bike");
            System.out.println("3. Truck");
            System.out.println("4. Exit");

            int choice = input.nextInt();
            input.nextLine();

            // Exit option
            if (choice == 4) {
                System.out.println("Exiting ParkEase...");
                break;
            }

            // Take vehicle number input
            System.out.print("Enter Vehicle Number: ");
            String number = input.nextLine();

            Vehicle vehicle;
            String type = "";

            // Create vehicle object based on user choice
            if (choice == 1) {
                vehicle = new Car(number);
                type = "Car";
            } 
            else if (choice == 2) {
                vehicle = new Bike(number);
                type = "Bike";
            } else {
                vehicle = new Truck(number);
                type = "Truck";
            }

            // Find first available slot for this vehicle type
            ParkingSlot assignedSlot = null;
            for (ParkingSlot s : slots) {
                if (!s.isOccupied() && s.getVehicleTypeAllowed().equals(type)) {
                    assignedSlot = s;
                    break;
                }
            }

            // No slot available
            if (assignedSlot == null) {
                System.out.println("No available slots for " + type + " at the moment.");
                continue; // go back to main menu
            }

            // Ask parking duration
            System.out.print("Enter Parking Duration (hours): ");
            int hours = input.nextInt();
            input.nextLine();

            // Assign slot to vehicle
            assignedSlot.assignSlot(vehicle);

            // Calculate parking charges
            double charge = vehicle.calculateCharges(hours);

            // Show bill
            System.out.println("\n===== Parking Bill =====\n");
            System.out.println("Vehicle Type : " + vehicle.getType());
            System.out.println("Vehicle No   : " + number);
            System.out.println("Hours Parked : " + hours);
            System.out.println("Location     : " + assignedSlot.getLocation());
            System.out.println("Total Charge : ₹" + charge);
            assignedSlot.showLog();

            // Release slot automatically
            assignedSlot.releaseSlot();
        }

        input.close();
    }
}
