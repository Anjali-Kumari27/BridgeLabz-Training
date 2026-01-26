package com.csv.readandprint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentCSV {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\91743\\OneDrive\\Desktop\\students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                // Skip header row
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                System.out.println("Student ID : " + data[0]);
                System.out.println("Name       : " + data[1]);
                System.out.println("Age        : " + data[2]);
                System.out.println("Marks      : " + data[3]);
                System.out.println("----------------------");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

