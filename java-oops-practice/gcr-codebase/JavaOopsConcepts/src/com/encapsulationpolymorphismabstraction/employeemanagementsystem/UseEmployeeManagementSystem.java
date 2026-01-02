package com.encapsulationpolymorphismabstraction.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class UseEmployeeManagementSystem {
	
	public static void main(String[] args) {

        // Polymorphism: Employee reference
        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Anjali", 40000, 10000);
        Employee e2 = new PartTimeEmployee(102, "Ravi", 80, 500);

        e1.assignDepartment("IT");
        e2.assignDepartment("HR");

        employees.add(e1);
        employees.add(e2);

        // Polymorphic behavior
        for (Employee emp : employees) {
            emp.displayDetails();
        }
	}
}
