package com.streams.serialization;

import java.util.*;

public class SaveRetriveObject {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = input.nextInt();

        // Taking user input
        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter details for Employee " + i);

            System.out.print("ID: ");
            int id = input.nextInt();
            input.nextLine(); // clear buffer

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Department: ");
            String department = input.nextLine();

            System.out.print("Salary: ");
            double salary = input.nextDouble();

            employeeList.add(new Employee(id, name, department, salary));
        }

        String fileName = "employees.ser";

        // Serialize employee list
        EmployeeFileHandler.saveEmployees(employeeList, fileName);

        // Deserialize and display
        List<Employee> listFromFile =
                EmployeeFileHandler.readEmployees(fileName);

        System.out.println("\nEmployees read from file:");
        for (Employee emp : listFromFile) {
            System.out.println(emp);
        }

        input.close();
    }
}
