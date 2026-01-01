package com.objectmodeling.selfproblems.schoolstudentaggregationassociation;

public class SchoolStudentAggregation {

    public static void main(String[] args) {

        // Create students (independent objects)
        Student anjali = new Student("Anjali");
        Student rohan = new Student("Rohan");

        // Create school
        School school = new School("Green Valley School");

        // Add students to school (Aggregation)
        school.addStudent(anjali);
        school.addStudent(rohan);

        // Display students
        school.showStudents();
    }
}

