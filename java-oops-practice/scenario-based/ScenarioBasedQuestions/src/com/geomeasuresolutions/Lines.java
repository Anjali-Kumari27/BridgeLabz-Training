package com.geomeasuresolutions;

//Line class represents a line segment between two points
public class Lines {

 // Encapsulation: private fields
 private double x1, y1;
 private double x2, y2;

 // Constructor to initialize the line object
 public Lines(double x1, double y1, double x2, double y2) {
     // Using 'this' keyword to differentiate between instance variables and parameters
     this.x1 = x1;
     this.y1 = y1;
     this.x2 = x2;
     this.y2 = y2;
 }

 // Method to calculate the length of the line using distance formula
 public double getLength() {
     return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
 }

 // Optional: Display line coordinates (for clarity)
 public void displayCoordinates() {
     System.out.println("\nLine from (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");
 }
}

