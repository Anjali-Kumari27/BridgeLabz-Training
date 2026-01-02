package com.encapsulationpolymorphismabstraction.employeemanagementsystem;

//Abstract class representing a Employee
public abstract class Employee implements Department{
	
	// Encapsulation: private fields
    private int employeeId;
    private String name;
    protected double baseSalary;

    private String department;

    // Constructor to initialize employee data
    public Employee(int employeeId, String name, double baseSalary) {
    	
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
        
    }

    // Getters & Setters with validation
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        if (employeeId > 0) {
            this.employeeId = employeeId;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Abstract method (Polymorphism) must be implemented by subclasses
    public abstract double calculateSalary();

    // Concrete method shared by all employees
    public void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + calculateSalary());
        System.out.println("--------------------------------");
    }

    // Interface methods implementation
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

}
