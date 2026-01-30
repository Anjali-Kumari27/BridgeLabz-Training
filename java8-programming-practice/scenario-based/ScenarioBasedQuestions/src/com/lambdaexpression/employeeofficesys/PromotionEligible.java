package com.lambdaexpression.employeeofficesys;

import java.util.ArrayList;
import java.util.List;

public class PromotionEligible{
    public static void main(String[] args) {
    	List<Employee> employees = new ArrayList<>();
    	employees.add(new Employee("Anjali", "IT", 59000, 4.5));
    	employees.add(new Employee("Devika", "IT", 59000, 4));
    	employees.add(new Employee("Arpita", "HR", 45000, 3));
    	employees.add(new Employee("Shivani", "PM", 60000, 5.6));
    	
           //Promotion p = (experience) -> experience > 3;
           employees.forEach(e -> {
               if (e.experience > 3) {
                   System.out.println(e.name + " is Eligible for the Promotion");
               }else {
            	   System.out.println(e.name + "is not Eligible for the Promotion");
               }
           });
           
    }
}

