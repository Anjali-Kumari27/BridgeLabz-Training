package com.universitycourseenrollmentsystem;

//Enrollment class represents a student enrolling in a course
//Implements Graded interface to assign grades to students
//Demonstrates Polymorphism: works for any type of Student (Undergrad/Postgrad)
public class Enrollment implements Graded {
	
	// Reference to the student enrolled
    private Student student;
    
    // Name of the course for which enrollment is done
    private String courseName;

    
    // Constructor to initialize enrollment details
    public Enrollment(Student student, String courseName) {
        this.student = student;
        this.courseName = courseName;
    }

    
    // Method to assign grade to the enrolled student
    @Override
    public void assignGrade(String grade) {
    	
    	// Add grade to the student's transcript
        // Works for any subclass of Student (Polymorphism)
        student.addGradeToTranscript(courseName, grade);
        
        // Recalculate GPA after adding the grade
        student.calculateGPA();
        System.out.println("Grade '" + grade + "' assigned to " + student.name + " for " + courseName);
    }
}