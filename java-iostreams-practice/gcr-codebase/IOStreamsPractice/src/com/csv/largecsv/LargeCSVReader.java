package com.csv.largecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeCSVReader {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\91743\\OneDrive\\Desktop\\largefile.csv";

        int batchSize = 100; // process 100 lines at a time
        int batchCount = 0;
        int totalCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                // Skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                if (line.trim().isEmpty()) continue;

                batchCount++;
                totalCount++;

                // Process line (e.g., parse CSV columns)
                // For demonstration, we just print line number
                System.out.println("Processing record: " + totalCount);

                // Check if batch is complete
                if (batchCount == batchSize) {
                    System.out.println("Processed " + batchCount + " records in this batch.");
                    batchCount = 0; // reset for next batch
                }
            }

            // Print any remaining records in the last batch
            if (batchCount > 0) {
                System.out.println("Processed " + batchCount + " records in last batch.");
            }

            System.out.println("Total records processed: " + totalCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

