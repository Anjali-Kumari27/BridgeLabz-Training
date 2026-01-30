package com.lambdaexpression.employeeofficesys;

//simple employee class
public class Employee {

String name;
String department;
int salary;
double experience;

// constructor
public Employee(String name, String department, int salary, double experience) {
   this.name = name;
   this.department = department;
   this.salary = salary;
   this.experience = experience;
}

@Override
public String toString() {
	return "Employee { " +
            "Name : '" + name + '\'' +
            ", Department : " + department +
            ", Salary : " + salary +
            ", Experience : " + experience +
            '}';
            
 }
}

