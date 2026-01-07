package com.parkease;

public class ParkingSlot {

	// Unique ID of the parking slot
    private int slotId;
    
    // Location of the slot
    private String location; 
    
    // Slot availability status
    private boolean isOccupied;
    
    // Type of vehicle allowed in this slot (Bike/Car)
    private String vehicleTypeAllowed;

    // Internal record of booking
    private String bookingLog; 

    // Constructor to initialize parking slot
    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        
        // Initially slot is free
        this.isOccupied = false;  
    }

    // Assign slot to vehicle if available and type matches
    public boolean assignSlot(Vehicle vehicle) {

        if (isOccupied) {
        	// Check if slot is already taken
            System.out.println("Slot already occupied.");
            return false;
        }

        if (!vehicle.getType().equals(vehicleTypeAllowed)) {
        	
        	// Check vehicle type
            System.out.println("Slot not allowed for " + vehicle.getType());
            return false;
        }

        
        // Mark slot as occupied
        isOccupied = true; 
        bookingLog = "Slot " + slotId + " at " + location + " booked for " + vehicle.getType();
        return true; // Booking successful
    }

    // Release the slot after vehicle leaves
    public void releaseSlot() {
        isOccupied = false;
    }

    // Show booking record of this slot
    public void showLog() {
        System.out.println("Booking Log: " + bookingLog);
    }

    // Getter methods for main program
    // Check if slot is occupied
    public boolean isOccupied() {
        return isOccupied;
    }

    // Get type of vehicle allowed in this slot
    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }

    // Get location of the slot
    public String getLocation() {
        return location;
    }
}
