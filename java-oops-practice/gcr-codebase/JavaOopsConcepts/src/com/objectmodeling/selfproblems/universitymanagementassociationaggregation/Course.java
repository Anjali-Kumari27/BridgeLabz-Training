package com.objectmodeling.selfproblems.universitymanagementassociationaggregation;

import java.util.ArrayList;

public class Course {

    private String courseName;

    // Aggregation
    private ArrayList<Student> students = new ArrayList<>();
    private Professor professor;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    // Communication: Assign professor to course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getProfessorName() +
                " assigned to course " + courseName + "\n");
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);

        if (professor != null) {
            System.out.println("Professor: " + professor.getProfessorName());
        }

        System.out.println("\nEnrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.getStudentName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}
