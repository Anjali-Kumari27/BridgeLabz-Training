package com.csv.dataintoobjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVToStudentObjects {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\91743\\OneDrive\\Desktop\\students.csv";

        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                // Skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                // Skip header row
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                // Safety check
                if (data.length < 4) {
                    System.out.println("Skipping invalid row: " + line);
                    continue;
                }

                String id = data[0].trim();
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                double marks = Double.parseDouble(data[3].trim());

                // Create Student object
                Student student = new Student(id, name, age, marks);

                // Add to list
                students.add(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print all Student objects
        System.out.println("All Students:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

