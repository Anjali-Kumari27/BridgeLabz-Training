package com.constructor.levelone;

//created subclass Manager of class Employee
//It inherits properties and methods of Employee
public class Manager extends Employee {

	    //Parameterized constructor for Manager class
	    public Manager(int employeeID, String department, double salary) {
	    	
	    	//super keyword used to pass values to the parent class constructor
	        super(employeeID, department, salary);
	        
	    }

	    
	    // Demonstrates access to public and protected members
	    //method to display Manager details
	    public void displayManagerDetails() {
	    	
	    	//employeeID is accessed directly because it is public in Employee
	        System.out.println("Employee ID: " + employeeID);
	        
	        //department is accessed directly because it is protected in Employee
	        System.out.println("Department: " + department);
	        
	       //salary is accessed using getter method because it is private in Employee
	        System.out.println("Salary: " + getSalary());
	        
	    }

	    
	    
	    
	    public static void main(String[] args) {
	    	//created object of Manager class and values are passed to the constructor
	        Manager manager = new Manager(450, "IT", 75000);

	        //displaying details of the manager
	        manager.displayManagerDetails();

	        //updating salary using setter method
	        manager.setSalary(95000);
	        System.out.println("Updated Salary: " + manager.getSalary());
	        
	    }

}
