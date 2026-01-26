package com.csv.writecsv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\91743\\OneDrive\\Desktop\\employees.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            // Writing header
            writer.write("ID,Name,Department,Salary");
            writer.newLine();

            // Writing employee records
            writer.write("101,Anjali,HR,50000");
            writer.newLine();

            writer.write("102,Rahul,Engineering,65000");
            writer.newLine();

            writer.write("103,Amit,Marketing,55000");
            writer.newLine();

            writer.write("104,Neha,Finance,60000");
            writer.newLine();

            writer.write("105,Vikram,Sales,58000");
            writer.newLine();

            System.out.println("Employee CSV file created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

