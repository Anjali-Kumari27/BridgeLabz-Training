package com.objectmodeling.selfproblems.universitymanagementassociationaggregation;

public class Student {

    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    // Communication: Student enrolling in a course
    public void enrollCourse(Course course) {
        course.addStudent(this);
        System.out.println("Student " + studentName +
                " enrolled in course " + course.getCourseName());
    }

    public String getStudentName() {
        return studentName;
    }
}