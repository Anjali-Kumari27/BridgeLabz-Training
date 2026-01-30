package com.lambdaexpression.employeeofficesys;

/*
 * Scenario 2: Employee / Office System

1.Use lambda to calculate employee bonus (salary > 30,000).

2.Sort employees by salary using lambda.

3.Use lambda to check promotion eligibility (experience > 3 years).

4.Use lambda to print employee details.

5.Use lambda to compare two employees’ salaries.

 */
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

		Comparator<Employee> compareSalary = (emp1, emp2) -> Double.compare(emp1.salary, emp2.salary);
		Employee e1 = new Employee("Anjali", "IT", 45000, 4);
		Employee e2 = new Employee("Devika", "IT", 28000, 2);
		int result = compareSalary.compare(e1, e2);

		if (result > 0) {
			System.out.println(e1.name + " has higher salary than " + e2.name);
		} else if (result < 0) {
			System.out.println(e1.name + " has lower salary than " + e2.name);
		} else {
			System.out.println("Both have equal salary");
		}
	}

}
