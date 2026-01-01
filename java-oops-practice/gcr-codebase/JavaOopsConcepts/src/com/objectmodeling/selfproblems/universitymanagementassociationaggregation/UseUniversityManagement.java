package com.objectmodeling.selfproblems.universitymanagementassociationaggregation;

public class UseUniversityManagement {
	public static void main(String[] args) {

        // Create Students
        Student s1 = new Student("Anjali");
        Student s2 = new Student("Ananya");
        Student s3 = new Student("Anushka");

        // Create Professor
        Professor prof = new Professor("Dr. Verma");

        // Create Course
        Course course = new Course("Object Oriented Programming");

        // Assign Professor to Course
        course.assignProfessor(prof);

        // Students enroll in Course
        s1.enrollCourse(course);
        s2.enrollCourse(course);
        s3.enrollCourse(course);

        // Show Course Details
        course.showCourseDetails();
    }

}
