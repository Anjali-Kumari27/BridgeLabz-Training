package com.streams.fiterstreams;

import java.io.*;

public class UppercaseToLowercase {

    public static void main(String[] args) {

        try {
            // Read from input file
            BufferedReader br =
                    new BufferedReader(new FileReader("C:\\Users\\91743\\OneDrive\\Desktop\\upper.txt"));

            // Write to output file
            BufferedWriter bw =
                    new BufferedWriter(new FileWriter("C:\\Users\\91743\\OneDrive\\Desktop\\lower.txt"));

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {

                // Convert to lowercase
                bw.write(line.toLowerCase());
                bw.newLine(); // move to next line
            }

            br.close();
            bw.close();

            System.out.println("File converted successfully!");

        } catch (IOException e) {
            System.out.println("File error occurred.");
        }
    }
}
