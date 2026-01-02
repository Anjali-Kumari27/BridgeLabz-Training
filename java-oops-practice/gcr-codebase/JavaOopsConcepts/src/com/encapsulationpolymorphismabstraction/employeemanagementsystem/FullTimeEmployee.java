package com.encapsulationpolymorphismabstraction.employeemanagementsystem;

//Full-time employee has a fixed salary
public class FullTimeEmployee extends Employee{
	
	private double bonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    // Salary calculation for full-time employee
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

}
