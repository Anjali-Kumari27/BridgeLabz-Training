package com.hospitalpatientmanagementsystem;

public class Doctor {

    private int doctorId;
    private String name;
    private String specialization;

    //Constructor
    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    //method to display doctor details
    public void displayInfo() {
        System.out.println("Doctor: " + name + " , Specialization: " + specialization);
    }
    
}


