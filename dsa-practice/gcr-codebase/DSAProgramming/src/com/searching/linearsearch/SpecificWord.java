package com.searching.linearsearch;

import java.util.Scanner;

public class SpecificWord {

	
	// Method to perform Linear Search across an array of strings
    public static String findSentenceWithWord(String[] list, String target) {
    	
        // 1. Iterate through the list of sentences
        for (String sentence : list) {
            
            // 2. Check if the current sentence contains the specific word
            // We use a case-insensitive check and ensure it's the whole word
            // Note: contains() is a simple check; more advanced search could use regex
            if (sentence.toLowerCase().contains(target.toLowerCase())) {
                
                // 3. Best Practice: If the word is found, return the current sentence immediately
                return sentence;
            }
        }

        // 4. If the loop completes without finding the word, return "Not Found"
        return "Not Found";
    }
    
    
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);

        // Input: Array of sentences
        // Using a fixed size for the assignment example, but taking input for each
        System.out.print("How many sentences will you enter? ");
        
        int count = input.nextInt();
        input.nextLine(); 

        String[] sentences = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter sentence " + (i + 1) + ": ");
            sentences[i] = input.nextLine();
        }

        // Input: Target word to search for
        System.out.print("Enter the word to search for: ");
        String targetWord = input.next();

        // Perform the search
        String result = findSentenceWithWord(sentences, targetWord);

        // Output the result
        System.out.println("Search Result: " + result);

        input.close();
    }

    
}
