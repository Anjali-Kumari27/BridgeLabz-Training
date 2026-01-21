package com.generics.multileveluniversitycoursemanagement;

public class ResearchCourse extends CourseType {

    public ResearchCourse() {
        super("Research-Based");
    }

    @Override
    public void displayEvaluation() {
        System.out.println("Evaluation: Research Paper & Presentation");
    }
}

