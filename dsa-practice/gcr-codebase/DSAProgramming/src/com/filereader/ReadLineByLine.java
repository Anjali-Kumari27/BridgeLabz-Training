package com.filereader;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadLineByLine {

	// Method to read a file line by line with proper buffering
    public static void readFileContent(String fileName) {
    	
        // Using try-with-resources to ensure the reader closes automatically
        // This handles your best practice of "Close the file" efficiently
        try (FileReader fr = new FileReader(fileName); 
        		
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            
            // 3. Use a loop to read each line using the readLine() method
            // readLine() returns null when the end of the file is reached
            while ((line = br.readLine()) != null) {
            	
                // Printing the current line to the console
                System.out.println(line);
            }

        } catch (IOException e) {
        	
            // 2. Handle IOExceptions properly as per best practices
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Asking the user for the file path/name
        System.out.print("Enter the name of the file to read (e.g., test.txt): ");
        String fileName = input.nextLine();
        
        // Calling the method to read the file content
        readFileContent(fileName);
        
       input.close();
    }

}
