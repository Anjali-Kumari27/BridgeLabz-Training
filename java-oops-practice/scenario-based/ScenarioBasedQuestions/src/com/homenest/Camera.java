package com.homenest;

//Smart Camera device
public class Camera extends Device {

 public Camera(String deviceId) {
     super(deviceId);
 }

 @Override
 public void turnOn() {
     setStatus(true);
     energyUsage += 10;
     System.out.println("Camera recording started");
 }

 @Override
 public void turnOff() {
     setStatus(false);
     System.out.println("Camera turned OFF");
 }

 @Override
 public void reset() {
     System.out.println("Camera reset: footage cleared");
 }
}
