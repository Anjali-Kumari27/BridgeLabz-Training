package com.csv.detectduplicatesincsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateCSV {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\91743\\OneDrive\\Desktop\\students.csv";

        Set<String> uniqueIds = new HashSet<>();
        Set<String> duplicateIds = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                // Skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",", -1);

                if (data.length < 1) continue;

                String id = data[0].trim();

                // Check for duplicates
                if (!uniqueIds.add(id)) {
                    // Already present = duplicate
                    duplicateIds.add(id);
                }
            }

            if (duplicateIds.isEmpty()) {
                System.out.println("No duplicates found based on ID.");
            } else {
                System.out.println("Duplicate IDs found: " + duplicateIds);

                // Optional: Print full duplicate records
                System.out.println("\nDuplicate Records:");
                try (BufferedReader br2 = new BufferedReader(new FileReader(filePath))) {
                    isHeader = true;
                    while ((line = br2.readLine()) != null) {

                        if (line.trim().isEmpty()) continue;

                        if (isHeader) { isHeader = false; continue; }

                        String[] data = line.split(",", -1);
                        String id = data[0].trim();

                        if (duplicateIds.contains(id)) {
                            System.out.println(line);
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
