package com.csv.modifycsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateEmployeeCSV {

    public static void main(String[] args) {

        String inputFile = "C:\\Users\\91743\\OneDrive\\Desktop\\employees.csv";
        String outputFile = "C:\\Users\\91743\\OneDrive\\Desktop\\updated_employees.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                // Write header as-is
                if (isHeader) {
                    bw.write(line);
                    bw.newLine();
                    isHeader = false;
                    continue;
                }

                // Skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                // Safety check
                if (data.length < 4) {
                    continue;
                }

                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                // Increase salary by 10% for IT department
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                // Write updated record
                bw.write(data[0] + "," + data[1] + "," + department + "," + (int) salary);
                bw.newLine();
            }

            System.out.println("CSV file updated successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

