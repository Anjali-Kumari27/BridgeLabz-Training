package com.smartuniversitylibrarymanagementsystem;

public class Student extends AbstractUser {

    public Student(String name) {
        super(name);
    }

    @Override
    public void showRole() {
        System.out.println(name + " is a Student.");
    }

    @Override
    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}
