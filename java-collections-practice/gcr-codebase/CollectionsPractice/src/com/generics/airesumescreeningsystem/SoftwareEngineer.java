package com.generics.airesumescreeningsystem;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public void evaluateSkills() {
        System.out.println("Evaluating: Java, DSA, System Design");
    }
}

