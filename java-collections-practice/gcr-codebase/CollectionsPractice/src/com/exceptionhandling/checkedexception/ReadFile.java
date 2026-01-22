package com.exceptionhandling.checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {

        // Try-with-resources automatically closes the file
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\91743\\OneDrive\\Desktop\\collectionFramework.txt"))) {

            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handles file not found or any IO error
            System.out.println("File not found");
        }
    }
}

