package com.objectmodeling.selfproblems.schoolstudentaggregationassociation;

import java.util.ArrayList;

public class School {

    private String schoolName;
    private ArrayList<Student> students; // Aggregation

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Add existing student to school
    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

