package com.bagnballorganizer;

//Ball class represents a ball
public class Ball implements Storable {

 // Encapsulated fields
 private int id;
 private String color;
 private String size; // small / medium / large

 // Constructor
 public Ball(int id, String color, String size) {
     this.id = id;
     this.color = color;
     this.size = size;
 }

 // Getter for ID
 public int getId() {
     return id;
 }

 // Display ball details
 @Override
 public void displayInfo() {
     System.out.println("Ball ID: " + id + ", Color: " + color + ", Size: " + size);
 }
}

