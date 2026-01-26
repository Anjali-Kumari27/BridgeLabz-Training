package com.csv.searchrecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployeeCSV {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\91743\\OneDrive\\Desktop\\employees.csv";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name to search: ");
        String searchName = sc.nextLine().trim();

        boolean found = false;

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

                String name = data[1];

                //Case-insensitive search
                if (name.equalsIgnoreCase(searchName)) {

                    System.out.println("\nEmployee Found!");
                    System.out.println("Name       : " + data[1]);
                    System.out.println("Department : " + data[2]);
                    System.out.println("Salary     : " + data[3]);

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("\nEmployee not found in CSV file.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

