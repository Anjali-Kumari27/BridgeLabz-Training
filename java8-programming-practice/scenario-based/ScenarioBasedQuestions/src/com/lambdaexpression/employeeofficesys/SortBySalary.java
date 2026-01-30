package com.lambdaexpression.employeeofficesys;

import java.util.ArrayList;
import java.util.List;

public class SortBySalary {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
    	employees.add(new Employee("Anjali", "IT", 59000, 4.5));
    	employees.add(new Employee("Devika", "IT", 59000, 4));
    	employees.add(new Employee("Arpita", "HR", 45000, 3));
    	employees.add(new Employee("Shivani", "PM", 60000, 5.6));
    	
    	employees.sort((e1,e2) -> e1.salary - e2.salary);
    	
    	for(Employee e : employees){
    		System.out.println(e.name + " - Salary: " + e.salary);
    	}
	}

}
