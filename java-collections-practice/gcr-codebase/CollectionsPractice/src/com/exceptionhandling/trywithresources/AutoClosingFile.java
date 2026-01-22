package com.exceptionhandling.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosingFile {

    public static void main(String[] args) {

        // try-with-resources ensures BufferedReader is auto-closed
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\91743\\OneDrive\\Desktop\\dummy.txt"))) {

            // Read and print the first line of the file
            String line = br.readLine();
            System.out.println(line);

        }
        // Handles file not found or any IO related issue
        catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

