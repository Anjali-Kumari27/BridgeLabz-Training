package com.smarthomeautomationsystem;

//Fan class represents a Fan device
//It extends Appliance and implements Controllable interface
public class Fan extends Appliance implements Controllable {
	
	// Stores fan speed (range: 0 to 5)
    private int speed; 

    // Constructor to initialize fan name and power consumption
    public Fan(String name, double power) {
    	
    	// Call parent class constructor
        super(name, power);
        this.speed = 3; // Default medium speed
    }

    // Helper Method to update speed safely
    public void setSpeed(int newSpeed) {
    	
    	// Check if speed is within valid range
        if (newSpeed >= 0 && newSpeed <= 5) {
            this.speed = newSpeed;
            System.out.println(getDeviceName() + " speed set to: " + speed);
        } 
        else {
            System.out.println("Invalid speed level.");
        }
    }

    // Method to turn ON the fan
    @Override
    public void turnOn() {
        System.out.print("[Fan Protocol]   Motor spinning up... ");
     
        // Set appliance status to ON
        setStatus(true);
    }

    @Override
    public void turnOff() {
        System.out.print("[Fan Protocol]    Motor slowing down... ");
        setStatus(false);
    }
}
