package com.objectmodeling.selfproblems.schoolstudentaggregationassociation;

public class StudentCourseAssociation {

    public static void main(String[] args) {

        // Create students
        Student anjali = new Student("Anjali");
        Student rohan = new Student("Rohan");

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Association: student ↔ course
        anjali.enrollCourse(math);
        anjali.enrollCourse(science);

        rohan.enrollCourse(math);

        // Course keeps track of students
        math.addStudent(anjali);
        math.addStudent(rohan);

        science.addStudent(anjali);

        // Display results
        anjali.viewCourses();
        rohan.viewCourses();

        math.showStudents();
        science.showStudents();
    }
}


