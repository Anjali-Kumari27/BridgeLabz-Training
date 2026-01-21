package com.generics.multileveluniversitycoursemanagement;

public class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        super("Assignment-Based");
    }

    @Override
    public void displayEvaluation() {
        System.out.println("Evaluation: Assignments & Quizzes");
    }
}

