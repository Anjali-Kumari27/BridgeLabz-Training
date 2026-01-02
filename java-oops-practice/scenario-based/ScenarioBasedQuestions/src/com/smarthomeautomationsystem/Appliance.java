package com.smarthomeautomationsystem;

//Abstract class representing a common appliance
public abstract class Appliance {
	
	// Name of the device
    private String deviceName;
    
    // Power consumption of the device (in Watts)
    // Protected so subclasses can access it
    protected double powerRating; 
    
    // Stores ON/OFF status of the appliance
    private boolean isOn;

    // Constructor to initialize appliance details
    public Appliance(String deviceName, double powerRating) {
    	
        this.deviceName = deviceName;
        this.powerRating = powerRating;
        
        // Device is OFF by default
        this.isOn = false;
    }

    // Encapsulation: Getter/Setter for internal state (on/off)
    public boolean getStatus() { 
    	
    	return isOn; 
    }
    
     // Protected setter to update device status
    // Accessible only within package or subclasses
    protected void setStatus(boolean status) { 
    	
        this.isOn = status; 
        
        // Display current state of the device
        System.out.println(deviceName + (status ? " is now ON." : " is now OFF."));
    }

    // Getter method to get device name
    public String getDeviceName() { 
    	return deviceName;
    }

    // Method to compare power consumption between two appliances
    public void compareEnergy(Appliance other) {
    	
        if (this.powerRating > other.powerRating) {
        	
            System.out.println(this.deviceName + " consumes more power than " + other.deviceName);
        } 
        else {
            System.out.println(this.deviceName + " is more energy-efficient than " + other.deviceName);
        }
    }
}