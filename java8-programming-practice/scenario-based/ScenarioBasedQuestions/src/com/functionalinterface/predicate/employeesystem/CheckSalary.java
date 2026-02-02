package com.functionalinterface.predicate.employeesystem;
/*
 * 2.In an employee system, check if salary is greater than 30,000 using Predicate.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CheckSalary {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Anjali" , 101, 48000));
		employees.add(new Employee("Ananya" , 105, 29000));
		employees.add(new Employee("Devika" , 111, 47800));
		employees.add(new Employee("Shweta" , 107, 26000));
		
		Predicate<Employee> checkSalary = e -> e.salary >= 30000;
		
		employees.forEach(e ->{
			if(checkSalary.test(e)) {
				System.out.println(e.employeeName + "'s Salary is greater than 30k");
			}else {
				System.out.println(e.employeeName + "'s Salary is NOT greater than 30k");
			}
		});
	}

}
