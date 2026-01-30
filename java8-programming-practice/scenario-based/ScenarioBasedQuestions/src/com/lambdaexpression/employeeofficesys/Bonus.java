package com.lambdaexpression.employeeofficesys;

import java.util.ArrayList;
import java.util.List;

public class Bonus {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
    	employees.add(new Employee("Anjali", "IT", 59000, 4.5));
    	employees.add(new Employee("Devika", "IT", 59000, 4));
    	employees.add(new Employee("Arpita", "HR", 29000, 3));
    	employees.add(new Employee("Shivani", "PM", 60000, 5.6));
    	
    	//Promotion p = (experience) -> experience > 3;
        employees.forEach(e -> {
            if (e.salary > 30000) {
                System.out.println(e.name + "'s Calculated Bonus is " + (e.salary- (e.salary*0.83)));
            }else {
            	System.out.println(e.name + "'s Not Applicable for Bonus");
            }
        });
        
		
	}

}
