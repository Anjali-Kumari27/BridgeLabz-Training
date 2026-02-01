package com.collectors.employeesalarycategorization;
/*
 *4.Employee Salary Categorization
   You have a list of employees with their departments and salaries. Use
   Collectors.groupingBy() to group employees by department and calculate the
   average salary for each department.
   Map<String, Double> avgSalaryByDept = employees.stream()
   .collect(Collectors.groupingBy(Employee::getDepartment,
   Collectors.averagingDouble(Employee::getSalary)));
 */
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryCategorization {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Anjali", "IT", 70000),
				new Employee("Devika", "HR", 50000), new Employee("Chhavi", "IT", 80000),
				new Employee("Dheeraj", "Finance", 60000), new Employee("Eesha", "HR", 55000),
				new Employee("Madhu", "Finance", 65000), new Employee("Ananya", "IT", 75000));

		// Group employees by department
		Map<String, List<Employee>> employeesByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		// Group by department and calculate average salary
		Map<String, Double> avgSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, // Key
																														// =
																														// department
				Collectors.averagingDouble(Employee::getSalary) // Value = avg salary
		));

		// Print grouped employees
		System.out.println("\n==============================================================");
		System.out.println("               Employees Grouped by Department                  ");
		System.out.println("==============================================================\n");
		employeesByDept.forEach((dept, empList) -> {
			System.out.println(dept + ": " + empList);
		});

		// Print average salary
		System.out.println("\n==============================================================");
		System.out.println("                 Average Salary by Department                   ");
		System.out.println("===============================================================\n");
		avgSalaryByDept.forEach((dept, avgSalary) -> System.out.println(dept + ": " + avgSalary));
	}
}
