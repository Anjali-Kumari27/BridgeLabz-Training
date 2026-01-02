package com.hospitalpatientmanagementsystem;

//Abstract parent class
public abstract class Patient {

   //private variables (encapsulation)
   private int patientId;
   private String name;
   private String medicalHistory; // sensitive data

   //Constructor Normal admission
   public Patient(int patientId, String name) {
       this.patientId = patientId;
       this.name = name;
       this.medicalHistory = "Not Provided";
   }

   //Constructor Emergency admission (Constructor Overloading)
   public Patient(int patientId, String name, String medicalHistory) {
       this.patientId = patientId;
       this.name = name;
       this.medicalHistory = medicalHistory;
   }
 
 
   // getter method to show sumary only(safe data)
   public String getSummary() {
       return "ID: " + patientId + ", Name: " + name;
   }

   // Abstract method MUST be overridden (child class must implement) 
   public abstract void displayInfo();
   
}
