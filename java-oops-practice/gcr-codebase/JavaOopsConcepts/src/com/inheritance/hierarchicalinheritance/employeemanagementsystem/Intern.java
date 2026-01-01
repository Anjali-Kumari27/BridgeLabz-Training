package com.inheritance.hierarchicalinheritance.employeemanagementsystem;

public class Intern extends Employee {

    private int duration; // in months

    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role     : Intern");
        System.out.println("Duration : " + duration + " months");
    }
}
