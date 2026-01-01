package com.inheritance.singleinheritance.smarthomedevices;

public class Thermostat extends Device {

    private int temperatureSetting;

    // Constructor calling superclass constructor
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);   // calling Device constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus()
    @Override
    void displayStatus() {
        super.displayStatus();   // call Device method
        System.out.println("Temperature Setting : " + temperatureSetting + "°C");
    }

    // Main method for testing
    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat(
                "THERMO-101",
                "ON",
                24
        );

        thermostat.displayStatus();
    }
}
