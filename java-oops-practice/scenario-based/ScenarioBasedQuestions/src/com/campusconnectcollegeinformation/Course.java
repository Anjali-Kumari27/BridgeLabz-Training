package com.campusconnectcollegeinformation;

import java.util.ArrayList;

public class Course {

	// Name of the course
    private String courseName;
    
    // List to store enrolled students
    private ArrayList<Student> students;
    
    // Faculty assigned to this course
    private Faculty faculty;

    // Constructor to initialize course with a name
    public Course(String courseName) {
        this.courseName = courseName;
        
        // Initialize the students list
        students = new ArrayList<>();
    }

    // Getter method for course name
    public String getCourseName() {
        return courseName;
    }

    // Method to add a student to the course
    public void addStudent(Student student) {
    	
    	//Avoid duplicate students
        if (!students.contains(student)) {
        	students.add(student);
        }
    }

    // Method to remove a student from the course
    public void removeStudent(Student student) {
        students.remove(student);
    }
 
    // Method to assign a faculty to the course
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    
    // Method to print course details including faculty and enrolled students
    public void printCourseDetails() {
        System.out.println("\n--- Course: " + courseName + " ---");
        System.out.println("Faculty: " + (faculty != null ? faculty.name : "Not Assigned"));
        System.out.println("Enrolled Students: ");
        
        if (students.isEmpty()) {
        	// No students enrolled
        	System.out.println("  None");
        }
        
         // Print each student name
        else for (Student s : students) {
        	System.out.println("  " + s.name);
        }
    }
}
