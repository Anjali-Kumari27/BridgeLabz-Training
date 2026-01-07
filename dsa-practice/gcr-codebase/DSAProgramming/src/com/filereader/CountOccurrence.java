package com.filereader;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class CountOccurrence {

	
	// Method to read a file and count occurrences of a specific word
    public static void countWordInFile(String fileName, String targetWord) {
        // 2. Initialize a counter variable
        int count = 0;

        // 1. Create a FileReader and wrap it in a BufferedReader
        // Using try-with-resources for automatic file closing and error handling
        try (FileReader fr = new FileReader(fileName); 
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            
            // 3. Loop through each line in the file
            while ((line = br.readLine()) != null) {
            	
                // Split the line into words using whitespace as a delimiter
                // This converts the line into an array of strings
                String[] words = line.split("\\s+");
                
                for (String word : words) {
                	
                    // Remove punctuation and check if the word matches the target (case-insensitive)
                    // 4. Increment the counter each time the word is found
                    if (word.replaceAll("[^a-zA-Z]", "").equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            // 5. Print the final count
            System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");

        } catch (IOException e) {
            // Handling IOExceptions as per best practices
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Requesting file name and target word from the user
        System.out.print("Enter the file name to read: ");
        String fileName = input.nextLine();
        
        System.out.print("Enter the word to count: ");
        String targetWord = input.nextLine();
        
        // Execute the counting logic
        countWordInFile(fileName, targetWord);
        
        input.close();
    }

    
}
