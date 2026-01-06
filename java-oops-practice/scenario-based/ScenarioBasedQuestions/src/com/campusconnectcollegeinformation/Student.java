package com.campusconnectcollegeinformation;

import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Person implements ICourseActions {

	// Map to store grades for each course (Course -> Grade)
    private HashMap<Course, String> grades; // course -> grade
    
    // List to store courses the student is enrolled in
    private ArrayList<Course> enrolledCourses;

    // Constructor to initialize student with name, email, and ID
    public Student(String name, String email, int id) {
    	
    	// Call parent class (Person) constructor
        super(name, email, id);
        
        // Initialize grades map
        grades = new HashMap<>();
        
        // Initialize enrolled courses list
        enrolledCourses = new ArrayList<>();
    }

    
    // Enroll the student in a course
    @Override
    public void enrollCourse(Course course) {
    	
    	// Check if not already enrolled
        if (!enrolledCourses.contains(course))
        {
        	// Add course to student's list
            enrolledCourses.add(course);
            
            // Add student to course
            course.addStudent(this);
            System.out.println(name + " enrolled in " + course.getCourseName());
        } 
        else {
            System.out.println(name + " is already enrolled in " + course.getCourseName());
        }
    }

    
    // Drop the student from a course
    @Override
    public void dropCourse(Course course) {
    	
    	// Check if student is enrolled
        if (enrolledCourses.contains(course)) {
        	
        	// Remove course from student's list
            enrolledCourses.remove(course);
            
            // Remove student from course
            course.removeStudent(this);
            System.out.println(name + " dropped " + course.getCourseName());
        } 
        else {
            System.out.println(name + " is not enrolled in " + course.getCourseName());
        }
    }
    

    // Set grade for a course (only if student is enrolled)
    public void setGrade(Course course, String grade) {
    	
    	// Store grade in the map
        if (enrolledCourses.contains(course)) {
            grades.put(course, grade);
        }
    }

    
    // Calculate GPA based on grades
    public double calculateGPA() {
        if (grades.isEmpty()) return 0;
        double totalPoints = 0;
        
        // Convert grades to grade points and sum them
        for (String grade : grades.values()) {
            switch (grade.toUpperCase()) {
                case "A": totalPoints += 4; break;
                case "B": totalPoints += 3; break;
                case "C": totalPoints += 2; break;
                case "D": totalPoints += 1; break;
                case "F": totalPoints += 0; break;
            }
        }
        return totalPoints / grades.size();
    }

    
    // Print student details including enrolled courses and GPA
    @Override
    public void printDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Email: " + email);
        System.out.println("Courses Enrolled: ");
        
        if (enrolledCourses.isEmpty()) {
        	
        	// No courses enrolled
        	System.out.println("  None");
        }
        
        // Print each course name
        else for (Course c : enrolledCourses) {
        	System.out.println("  " + c.getCourseName());
        }
        System.out.println("GPA  : " + calculateGPA());
    }
}
