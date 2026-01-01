package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Teacher extends Person {

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role    : Teacher");
        System.out.println("Subject : " + subject + "\n");
    }
}
