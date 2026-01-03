package com.cabbygoridehailingapp;

import java.util.Scanner;

public class UseCabbyGoRideHailing {
	    public static void main(String[] args) {
	    	
	    	// Scanner object to take input from user
	        Scanner input = new Scanner(System.in);

	        // Creating driver object with name and license number
	        Driver assignedDriver = new Driver("Rajesh Kumar", "DL-BOOK-2026");
	        
	        // Vehicle number already assigned
	        String assignedVehicleNo = "MH-01-AX-7788";

	        System.out.println("=== Welcome to CabbyGo ===");
	        System.out.println("Driver Assigned: " + assignedDriver.getName());

	        // Asking user to select vehicle type
	        System.out.println("\nSelect Vehicle Type:");
	        System.out.println("1. Mini (INR 80/km)\n2. Sedan (INR 100/km)\n3. SUV (INR 125/km)");
	        System.out.print("Enter choice: ");
	        
	        // Taking vehicle choice from user
	        int choice = input.nextInt();
	        input.nextLine(); 

	        // Reference of Vehicle class
	        Vehicle vehicle;
	        
	        // Creating vehicle object based on user choice
	        switch(choice) {
	            case 1: 
	            	vehicle = new Mini(assignedVehicleNo);
	            	break;
	            case 2: 
	            	vehicle = new Sedan(assignedVehicleNo); 
	            	break;
	            case 3: 
	            	vehicle = new SUV(assignedVehicleNo); 
	            	break;
	            default: 
	            	
	            	// Default vehicle if choice is wrong
	                System.out.println("Invalid choice. Defaulting to Mini.");
	                vehicle = new Mini(assignedVehicleNo);
	        }

	        // Taking pickup and drop location from user
	        System.out.print("Enter Pickup Point: ");
	        String pick = input.nextLine();
	        System.out.print("Enter Drop Point: ");
	        String drop = input.nextLine();
	        
	        // Booking the ride
	        vehicle.bookRide(pick, drop);

	        // Taking distance travelled
	        System.out.print("\nEnter Distance Travelled (km): ");
	        double dist = input.nextDouble();
	        
	        // Ending the ride and calculating fare
	        vehicle.endRide(dist);

	        //Taking rating from user for driver
	        System.out.print("Rate your ride with " + assignedDriver.getName() + " (1-5 stars): ");
	        double userRating = input.nextDouble();
	        assignedDriver.setRating(userRating);

	        // Printing final invoice
	        System.out.println("\n----------- INVOICE -----------");
	        System.out.println("Driver: " + assignedDriver.getName());
	        System.out.println("Your Rating: " + assignedDriver.getRating() + " / 5.0");
	        System.out.println("Vehicle: " + vehicle.getType() + " [" + assignedVehicleNo + "]");
	        System.out.println("Total Fare: INR" + vehicle.getFare());
	        System.out.println("-------------------------------");

	        input.close();
	    }
}
