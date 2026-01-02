package com.universitycourseenrollmentsystem;

//Postgraduate class represents a postgraduate student
//Extends the base Student class
public class Postgraduate extends Student {
	
	// Research topic of the postgraduate student
    private String researchTopic;

    // Constructor to initialize postgraduate student details
    public Postgraduate(String name, String studentId, String researchTopic) {
    	
    	// Call parent Student constructor
        super(name, studentId);
        this.researchTopic = researchTopic;
    }

    // Override GPA calculation for postgraduate students
    @Override
    public void calculateGPA() {
    	
        // Postgrad grading (only A and B count significantly)
        double totalPoints = 0;
        
        for (String grade : transcript.values()) {
        	
            if (grade.equals("A")) totalPoints += 4.0;
            else if (grade.equals("B")) totalPoints += 3.5;
        }
        if (!transcript.isEmpty()) {
            setGpa(totalPoints / transcript.size());
        }
    }
}
