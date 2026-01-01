package com.objectmodeling.assistedproblems.companydepartmentcomposition;

import java.util.ArrayList;

public class Department {

    private String departmentName;
    private ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>(); // ✅ MUST
    }

    public void addEmployee(String name) {
        employees.add(new Employee(name));
    }

    public void showEmployees() {
        System.out.println("\nDepartment: " + departmentName);
        for (Employee e : employees) {
            System.out.println("  - " + e.getEmployeeName());
        }
    }

    public void removeAllEmployees() {
        employees.clear();
    }
}

