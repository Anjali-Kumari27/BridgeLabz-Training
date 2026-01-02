package com.hospitalpatientmanagementsystem;

//OutPatient class inherits Patient
public class OutPatient extends Patient {

    private double consultationFee;

    //Constructor
    public OutPatient(int id, String name, double fee) {
        super(id, name);
        this.consultationFee = fee;
    }

    //getter method
    public double getConsultationFee() {
        return consultationFee;
    }

    // Polymorphism (overriding abstract method)
    @Override
    public void displayInfo() {
        System.out.println(getSummary());
    }
}
