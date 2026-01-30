package com.lambdaexpression.employeeofficesys;

import java.util.ArrayList;
import java.util.List;

public class DisplayEmployee {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
    	employees.add(new Employee("Anjali", "IT", 59000, 4.5));
    	employees.add(new Employee("Devika", "IT", 59000, 4));
    	employees.add(new Employee("Arpita", "HR", 45000, 3));
    	employees.add(new Employee("Shivani", "PM", 60000, 5.6));
    	
    	employees.forEach(e -> System.out.println(e.toString()));
	}

}
