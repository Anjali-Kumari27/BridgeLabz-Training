package com.csv.filterrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterStudentCSV {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\91743\\OneDrive\\Desktop\\students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            System.out.println("Students scoring more than 80:\n");

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
                    continue;
                }

                double marks = Double.parseDouble(data[3]);

                if (marks > 80) {
                    System.out.println("ID    : " + data[0]);
                    System.out.println("Name  : " + data[1]);
                    System.out.println("Age   : " + data[2]);
                    System.out.println("Marks : " + data[3]);
                    System.out.println("-----------------------");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
