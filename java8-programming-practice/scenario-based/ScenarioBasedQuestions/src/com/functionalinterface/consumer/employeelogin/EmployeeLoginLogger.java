package com.functionalinterface.consumer.employeelogin;
/*
 * 2.Log employee login activity using Consumer.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class EmployeeLoginLogger {
	public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("E001", "Anjali"));
        employees.add(new Employee("E002", "Ananya"));
        employees.add(new Employee("E003", "Sneha"));

        // Consumer to log login activity
        Consumer<Employee> logLogin = emp -> 
            System.out.println("Employee Logged In: ID = " + emp.id + ", Name = " + emp.name);

        // Simulate employee login
        System.out.println("\n=====================================================");
        System.out.println("            Logging Employee Login Activity            ");
        System.out.println("=====================================================\n");
        for (Employee emp : employees) {
        	
        	// perform action using Consumer
            logLogin.accept(emp); 
        }
    }

}
