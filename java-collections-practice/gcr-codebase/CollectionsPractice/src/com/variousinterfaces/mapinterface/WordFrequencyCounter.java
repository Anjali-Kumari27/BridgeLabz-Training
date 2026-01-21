package com.variousinterfaces.mapinterface;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        // HashMap to store word and its count
        Map<String, Integer> wordCount = new HashMap<>();

        try {
            // Read file (file should be in same folder as program)
            File file = new File("C:\\Users\\91743\\OneDrive\\Desktop\\java.txt");
            Scanner input = new Scanner(file);

            // Read file line by line
            while (input.hasNextLine()) {

                String line = input.nextLine();

                // Convert line to lowercase
                line = line.toLowerCase();

                // Remove punctuation
                line = line.replaceAll("[^a-z ]", "");

                // Split line into words
                String[] words = line.split(" ");

                // Count each word
                for (String word : words) {

                    if (word.isEmpty())
                        continue;

                    // If word already exists, increase count
                    if (wordCount.containsKey(word)) {
                        wordCount.put(word, wordCount.get(word) + 1);
                    }
                    // If word is new, add with count 1
                    else {
                        wordCount.put(word, 1);
                    }
                }
            }

            input.close();

            // Print result
            System.out.println("Word Frequency: " + wordCount);

        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}

