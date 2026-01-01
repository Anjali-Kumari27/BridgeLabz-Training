package com.objectmodeling.selfproblems.universityfacultydeptcompositionaggregation;

import java.util.ArrayList;

public class University {

    private String universityName;

    // Composition: University owns Departments
    private ArrayList<Department> departments = new ArrayList<>();

    // Aggregation: Faculty exists independently
    private ArrayList<Faculty> faculties = new ArrayList<>();

    public University(String universityName) {
        this.universityName = universityName;
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showUniversityDetails() {
        System.out.println("University: " + universityName);

        System.out.println("\n------------Departments------------");
        for (Department d : departments) {
            d.showDepartment();
        }

        System.out.println("\n------------Faculties------------");
        for (Faculty f : faculties) {
            f.showFaculty();
        }
    }

    // Simulating deletion of University
    public void deleteUniversity() {
        departments.clear();   // Departments destroyed
        System.out.println("\nUniversity deleted!!! All departments removed.\n");
    }
}
