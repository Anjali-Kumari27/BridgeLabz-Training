package com.inputstreamreader;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ConvertByteStream {

	
	// Method to convert a binary file stream into human-readable characters
    public static void convertAndPrintFile(String fileName) {
    	
        // 1. Create a FileInputStream to read the raw binary data
        // 2. Wrap it in an InputStreamReader specifying UTF-8 charset
        // 3. Wrap in BufferedReader for efficient line-by-line reading
        // Using try-with-resources handles step 4 (closing) automatically
        try (FileInputStream fis = new FileInputStream(fileName);
        		
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            System.out.println("--- File Content Start ---");

            // 4. Read the file line by line and print to console
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            System.out.println("--- File Content End ---");

        } catch (IOException e) {
            // 5. Handle any encoding or IO exceptions properly
            System.out.println("Error processing the file: " + e.getMessage());
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Requesting file name from the user to read binary data
        System.out.print("Enter the name of the file to read (encoded in UTF-8): ");
        String fileName = input.nextLine();
        
        // Execute the file reading and conversion process
        convertAndPrintFile(fileName);
        
        input.close();
    }

    
}