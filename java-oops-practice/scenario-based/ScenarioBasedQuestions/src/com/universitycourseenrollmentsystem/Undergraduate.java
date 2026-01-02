package com.universitycourseenrollmentsystem;

//Undergraduate class represents an undergraduate student
//Extends the abstract Student class
public class Undergraduate extends Student {
    
	// Constructor to initialize undergraduate student details
    public Undergraduate(String name, String studentId) {
    	
    	// Call parent Student constructor
        super(name, studentId);
    }

    // Override GPA calculation for undergraduate students
    @Override
    public void calculateGPA() {
    	
        // Logic for Undergrad: A=4, B=3, etc.
        double totalPoints = 0;
        for (String grade : transcript.values()) {
            if (grade.equals("A")) totalPoints += 4.0;
            else if (grade.equals("B")) totalPoints += 3.0;
        }
        if (!transcript.isEmpty()) {
            setGpa(totalPoints / transcript.size());
        }
    }
}
