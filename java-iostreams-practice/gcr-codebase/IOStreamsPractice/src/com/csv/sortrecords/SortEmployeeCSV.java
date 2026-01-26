package com.csv.sortrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeCSV {

    // Employee data holder class
    static class Employee {
        String id;
        String name;
        String department;
        double salary;

        Employee(String id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {

        String filePath = "C:\\Users\\91743\\OneDrive\\Desktop\\updated_employees.csv";

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                // Skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                // Skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                // Safety check
                if (data.length < 4) {
                    continue;
                }

                String id = data[0];
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                employees.add(new Employee(id, name, department, salary));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Sort by salary in DESCENDING order
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.salary, e1.salary);
            }
        });

        System.out.println("Top 5 Highest Paid Employees:\n");

        // Print top 5 employees
        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            Employee e = employees.get(i);
            System.out.println("Name       : " + e.name);
            System.out.println("Department : " + e.department);
            System.out.println("Salary     : " + e.salary);
            System.out.println("---------------------------");
        }
    }
}

