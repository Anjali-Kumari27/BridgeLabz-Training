package com.constructor.levelone;

public class Employee {

	    // Public: can be accessed from anywhere
	    public int employeeID;

	    // Protected: accessed within same package or by subclass
	    protected String department;

	    // Private: only accessed inside a class
	    private double salary;

	    //public Parameterized constructor
	    public Employee(int employeeID, String department, double salary) {
	    	
	    	//this keyword used to refer instance variables
	        this.employeeID = employeeID;
	        this.department = department;
	        this.salary = salary;
	        
	    }

	    // Updates salary through setter method
	    public void setSalary(double salary) {
	    	
	        this.salary = salary;
	        
	    }

	    // Returns salary using getter method
	    public double getSalary() {
	    	
	        return salary;
	        
	    }

	    
	    
	    // Displays employee details
	    public void displayEmployeeDetails() {
	    	
	        System.out.println("Employee ID: " + employeeID);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: " + salary);
	        
	    }

}
