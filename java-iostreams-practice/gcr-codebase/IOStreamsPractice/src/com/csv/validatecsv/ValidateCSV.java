package com.csv.validatecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSV {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\91743\\OneDrive\\Desktop\\students.csv";

        //Regex patterns
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Pattern phonePattern = Pattern.compile("^\\d{10}$");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;
            int rowNumber = 0;

            while ((line = br.readLine()) != null) {
                rowNumber++;

                // Skip header row
                if (isHeader) {
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
                    System.out.println("Row " + rowNumber + " is invalid: Not enough columns");
                    continue;
                }

                String email = data[2].trim();
                String phone = data[3].trim();

                boolean isValid = true;

                if (!emailPattern.matcher(email).matches()) {
                    System.out.println("Row " + rowNumber + " invalid email: " + email);
                    isValid = false;
                }

                if (!phonePattern.matcher(phone).matches()) {
                    System.out.println("Row " + rowNumber + " invalid phone number: " + phone);
                    isValid = false;
                }

                if (isValid) {
                    System.out.println("Row " + rowNumber + " is valid: " + data[1]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

