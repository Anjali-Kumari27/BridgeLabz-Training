package com.universitycourseenrollmentsystem;

//Faculty class represents a teacher/professor in the system
public class Faculty {
    private String name;

    // Constructor to initialize faculty with a name
    public Faculty(String name) {
        this.name = name;
    }

     // Method for the faculty to assign a grade to a student
    // Demonstrates programming to interface: interacts with Graded, not concrete Enrollment
    public void giveGrade(Graded enrollment, String grade) {
    	
        // Faculty interacts with the Interface, not the concrete classes
        enrollment.assignGrade(grade);
    }
}
