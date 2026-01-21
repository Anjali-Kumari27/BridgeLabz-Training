package com.generics.multileveluniversitycoursemanagement;

public class ExamCourse extends CourseType {

    public ExamCourse() {
        super("Exam-Based");
    }

    @Override
    public void displayEvaluation() {
        System.out.println("Evaluation: Written Exams");
    }
}

