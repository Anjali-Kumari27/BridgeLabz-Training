package com.inputstreamreader;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ReadUserInput {

	
	// Method to read console input and write it to a text file
    public static void saveConsoleToFile(String fileName) {
    	
        // 1. Create an InputStreamReader to read from System.in
        // 2. Wrap the InputStreamReader in a BufferedReader for efficient reading
        // 3. Create a FileWriter to write to the file
        try (InputStreamReader isr = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        		
             BufferedReader br = new BufferedReader(isr);
             FileWriter writer = new FileWriter(fileName)) {

            System.out.println("Start typing (type 'exit' on a new line to finish):");

            String inputLine;
            
            // 4. Read user input using readLine() 
            // 5. Repeat until the user enters "exit"
            while ((inputLine = br.readLine()) != null) {
            	
                // Check if the input is the stop command
                if (inputLine.equalsIgnoreCase("exit")) {
                	
                    break;
                }
                
                // Write the input to the file and add a newline character
                writer.write(inputLine + System.lineSeparator());
            }
            
            System.out.println("Data successfully saved to " + fileName);

        } catch (IOException e) {
            // Handling IOExceptions properly as per best practices
            System.out.println("An error occurred during file writing: " + e.getMessage());
        }
        // 6. The 'try-with-resources' block automatically closes the file and reader
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Asking the user for the destination file name
        System.out.print("Enter the destination file name: ");
        String fileName = input.nextLine();
        
        // Execute the writing process
        saveConsoleToFile(fileName);
        
        input.close();
    }

    
}
