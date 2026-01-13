package com.homenest;

//Smart Thermostat device
public class Thermostat extends Device {

 public Thermostat(String deviceId) {
     super(deviceId);
 }

 @Override
 public void turnOn() {
     setStatus(true);
     energyUsage += 15;
     System.out.println("Thermostat cooling started");
 }

 @Override
 public void turnOff() {
     setStatus(false);
     System.out.println("Thermostat turned OFF");
 }

 @Override
 public void reset() {
     System.out.println("Thermostat reset to default temperature");
 }
}
