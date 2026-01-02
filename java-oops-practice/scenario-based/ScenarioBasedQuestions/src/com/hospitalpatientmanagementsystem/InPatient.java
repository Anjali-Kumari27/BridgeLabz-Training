package com.hospitalpatientmanagementsystem;

//InPatient class inherits Patient
public class InPatient extends Patient {

	//data for InPatient
    private int daysAdmitted;
    private double dailyCharge;

    //Constructor
    public InPatient(int id, String name, int days, double charge) {
        super(id, name);
        this.daysAdmitted = days;
        this.dailyCharge = charge;
    }

    //method to calculate stay cost
    public double calculateStayCost() {
        return daysAdmitted * dailyCharge;
    }

    // Polymorphism (runtime poly.) method overriding
    //overriding abstract method
    @Override
    public void displayInfo() {
        System.out.println(getSummary());
    }
}
