package com.homenest;

//Smart Light device
public class Light extends Device {

 public Light(String deviceId) {
     super(deviceId);
 }

 @Override
 public void turnOn() {
     setStatus(true);
     energyUsage += 5; // operator usage
     System.out.println("Light turned ON");
 }

 @Override
 public void turnOff() {
     setStatus(false);
     System.out.println("Light turned OFF");
 }

 @Override
 public void reset() {
     energyUsage = 0;
     System.out.println("Light reset: brightness & energy cleared");
 }
}
