package com.objectmodeling.assistedproblems.companydepartmentcomposition;

import java.util.ArrayList;

public class Company {

    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>(); // ✅ MUST
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showCompanyDetails() {
    	System.out.println("******************************");
        System.out.println("Company: " + companyName);
        System.out.print("******************************\n");
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    public void closeCompany() {
        for (Department d : departments) {
            d.removeAllEmployees();
        }
        departments.clear();
        System.out.println("\nCompany closed successfully.");
    }
}

