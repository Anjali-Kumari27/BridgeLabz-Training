package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class Course {

    protected String courseName;
    protected int duration;   // in hours

    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    void displayCourseDetails() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " hours");
    }
}
