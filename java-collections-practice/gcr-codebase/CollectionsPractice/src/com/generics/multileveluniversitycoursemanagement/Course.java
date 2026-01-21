package com.generics.multileveluniversitycoursemanagement;

public class Course<T extends CourseType> {

    private String courseName;
    private String department;
    private T courseType;

    public Course(String courseName, String department, T courseType) {
        this.courseName = courseName;
        this.department = department;
        this.courseType = courseType;
    }

    public void displayCourseInfo() {
        System.out.println(
            "Course: " + courseName +
            " | Department: " + department +
            " | Type: " + courseType.getEvaluationType()
        );
        courseType.displayEvaluation();
    }
}

