package com.objectmodeling.selfproblems.schoolstudentaggregationassociation;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Student> students; // Association

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Add student to course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Show enrolled students
    public void showStudents() {
        System.out.println("\nStudents in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}


