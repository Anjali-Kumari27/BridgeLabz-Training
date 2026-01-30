package com.lambdaexpression.employeeofficesys;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.lambdaexpression.studentschoolsys.Student;

public class CompareSalary {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
    	employees.add(new Employee("Anjali", "IT", 59000, 4.5));
    	employees.add(new Employee("Devika", "IT", 59000, 4));
    	employees.add(new Employee("Arpita", "HR", 45000, 3));
    	employees.add(new Employee("Shivani", "PM", 60000, 5.6));
    	
    	//employees.sort(Comparator.comparing(Student::getSalary));

        for (Employee e : employees) {
            System.out.println(e.name);
        }
	}

}
