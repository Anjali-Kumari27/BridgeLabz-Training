package com.smarthomeautomationsystem;

//Light class represents a Light device
//It extends Appliance and implements Controllable interface
public class Light extends Appliance implements Controllable {
	
	// Stores brightness level of the light
    private int brightness;

    // Constructor to initialize light name and power consumption
    public Light(String name, double power) {
    	
    	// Call parent class constructor
        super(name, power);
        this.brightness = 50; // Default brightness
    }

    // Method to turn ON the light
    @Override
    public void turnOn() {
        System.out.print("[Light Protocol] Energizing LED... ");
        setStatus(true);
    }

    @Override
    public void turnOff() {
        setStatus(false);
    }
}