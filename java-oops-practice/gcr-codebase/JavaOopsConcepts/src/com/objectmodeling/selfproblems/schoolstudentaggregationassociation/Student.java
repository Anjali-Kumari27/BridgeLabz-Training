package com.objectmodeling.selfproblems.schoolstudentaggregationassociation;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Course> courses; // Association

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Enroll in course (association)
    public void enrollCourse(Course course) {
        courses.add(course);
    }

    // View enrolled courses
    public void viewCourses() {
        System.out.println("----------Courses of " + name + "----------");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
        System.out.println(" ");
    }

    public String getName() {
        return name;
    }
}


