package com.jdbc.crudoperation;


import java.util.List;
import java.util.Scanner;

public class UseEmployee {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        EmployeeCrudOp dao = new  EmployeeCrudOp();

        while (true) {
            System.out.println("\n===========================================");
            System.out.println("          Employee Management System         ");
            System.out.println("===========================================\n");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee by Name");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input.... Enter number only.");
                continue;
            }

            switch (choice) {
                case 1 :{
                    System.out.print("Enter name: ");
                    String name = input.nextLine();

                    System.out.print("Enter email: ");
                    String email = input.nextLine();

                    System.out.print("Enter salary: ");
                    double salary = Double.parseDouble(input.nextLine());

                    Employee emp = new Employee(name, email, salary);
                    boolean added = dao.addEmployee(emp);

                    System.out.println(added ? "Employee added!" : "Failed to add employee.");
                    break;
                }
                case 2 :{
                    List<Employee> employees = dao.getAllEmployees();
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                    	System.out.println("\n----------------------------");
                        System.out.println("           EMPLOYEES          ");
                        System.out.println("----------------------------\n");
                        employees.forEach(System.out::println);
                    }
                    break;
                }
                case 3 :{
                    System.out.print("Enter employee id: ");
                    int id = Integer.parseInt(input.nextLine());

                    System.out.print("Enter new salary: ");
                    double newSalary = Double.parseDouble(input.nextLine());

                    boolean updated = dao.updateSalary(id, newSalary);
                    System.out.println(updated ? "Salary updated!" : "Employee not found / update failed.");
                    
                    break;
                }
                case 4 :{
                    System.out.print("Enter employee id to delete: ");
                    int id = Integer.parseInt(input.nextLine());

                    boolean deleted = dao.deleteEmployee(id);
                    System.out.println(deleted ? "Employee deleted!" : "Employee not found / delete failed.");
                    
                    break;
                }
                case 5 :{
                    System.out.print("Enter name to search: ");
                    String nameKey = input.nextLine();

                    List<Employee> result = dao.searchByName(nameKey);
                    if (result.isEmpty()) {
                        System.out.println("No matching employees found.");
                    } else {
                    	System.out.println("\n----------------------------");
                        System.out.println("       SEARCH RESULT    ");
                        System.out.println("----------------------------\n");
                        result.forEach(System.out::println);
                    }
                    
                    break;
                }

                case 0 :{
                    System.out.println("\n----------------------------");
                    System.out.println("       Exiting the system     ");
                    System.out.println("----------------------------\n");
                    input.close();
                    return;
                }

                default :
                	System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

