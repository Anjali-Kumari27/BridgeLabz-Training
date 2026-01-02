package com.smarthomeautomationsystem;

//AC class represents an Air Conditioner device
//It extends Appliance and implements Controllable interface
public class AC extends Appliance implements Controllable {
	
	// Variable to store temperature of the AC
    private int temperature;

    // Constructor to initialize AC name and power consumption
    public AC(String name, double power) {
    	
    	// Call parent class constructor
        super(name, power);
        this.temperature = 24; // Default eco-temp
    }

    // Method to turn ON the AC
    @Override
    public void turnOn() {
        System.out.print("[AC Protocol]    Starting Compressor... ");
        setStatus(true);
    }

    @Override
    public void turnOff() {
        System.out.print("[AC Protocol]     Purging air vents... ");
        setStatus(false);
    }
}
