package com.universitycourseenrollmentsystem;

//Course class represents a university or college course
public class Course {

    private String courseCode;
    private String courseName;
    private int credits;

    // Constructor to initialize course details
    public Course(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    // Getter for course credits
    public int getCredits() {
        return credits;
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }
}

