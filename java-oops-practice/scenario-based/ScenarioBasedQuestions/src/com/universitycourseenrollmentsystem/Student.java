package com.universitycourseenrollmentsystem;

import java.util.HashMap;
import java.util.Map;

//Abstract Student class representing common attributes and behaviors
//Encapsulation is used to protect GPA, while transcript and basic info are accessible to subclasses
public abstract class Student {
	
    protected String name;
    protected String studentId;
    
    // GPA is private to prevent external modification
    private double gpa; 
    protected Map<String, String> transcript; // Course Name -> Grade

    // Constructor to initialize student details
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.transcript = new HashMap<>();
        this.gpa = 0.0;
    }

    // Add a grade to the transcript for a specific course
    public void addGradeToTranscript(String courseName, String grade) {
        transcript.put(courseName, grade);
    }

    // Public method to access private GPA data securely
    public double getGpa() {
        return gpa;
    }

    // Protected setter to update GPA (only subclasses can modify)
    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Abstract method to calculate GPA (implemented differently by subclasses)
    public abstract void calculateGPA();

    // Display full transcript and current GPA
    public void displayTranscript() {
    	System.out.println("--------------------------------------------------");
        System.out.println("Transcript for " + name + " (" + studentId + "):" + "\n");
        transcript.forEach((course, grade) -> System.out.println(course + ": " + grade));
        System.out.println("Current GPA: " + gpa);
    }
}