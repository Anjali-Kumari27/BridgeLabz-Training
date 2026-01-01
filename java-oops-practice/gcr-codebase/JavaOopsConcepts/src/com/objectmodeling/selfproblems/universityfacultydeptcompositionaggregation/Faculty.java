package com.objectmodeling.selfproblems.universityfacultydeptcompositionaggregation;

public class Faculty {

    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void showFaculty() {
        System.out.println("Faculty Name: " + facultyName);
    }
}
