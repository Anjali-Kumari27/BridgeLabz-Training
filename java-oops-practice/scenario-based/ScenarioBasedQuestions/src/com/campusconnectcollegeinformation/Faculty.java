package com.campusconnectcollegeinformation;

import java.util.ArrayList;

public class Faculty extends Person {

	// List to store courses assigned to this faculty
    private ArrayList<Course> assignedCourses;

    // Constructor to initialize faculty with name, email, and ID
    public Faculty(String name, String email, int id) {
    	
    	// Call parent class (Person) constructor
    	super(name, email, id);
    	
    	// Initialize the assigned courses list
        assignedCourses = new ArrayList<>();
    }

    
    // Method to assign a course to this faculty
    public void assignCourse(Course course) {
    	
    	// Add course to faculty's list
        assignedCourses.add(course);
        
        // Set this faculty as the course's faculty
        course.setFaculty(this);
    }

    
    // Override the printDetails method from Person class
    @Override
    public void printDetails() {
        System.out.println("\n--- Faculty Details ---");
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Email: " + email);
        System.out.println("Courses Assigned: ");
       
        if (assignedCourses.isEmpty()) {
        	
        	// No courses assigned
        	System.out.println("  None");
        }
        
        // Print each assigned course name
        else for (Course c : assignedCourses) {
        	System.out.println("  " + c.getCourseName());
        }
    }
}
