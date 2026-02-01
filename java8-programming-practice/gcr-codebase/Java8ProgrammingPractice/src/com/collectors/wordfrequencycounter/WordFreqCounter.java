package com.collectors.wordfrequencycounter;
/*
 * 2. Word Frequency Counter
 ○ Scenario: Analyze a paragraph for word occurrence.
 ○ Task: Use Collectors.toMap().
 */
import java.util.*;
import java.util.stream.Collectors;

public class WordFreqCounter {
    public static void main(String[] args) {

        // Paragraph
        String paragraph = "Java is simple and Java is powerful. " +
                "Java supports streams and collectors. Collectors in Java help aggregation.";

        // Split paragraph into words
        // Remove punctuation and convert to lowercase
        String[] words = paragraph.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");

        // Count frequency using Collectors.toMap()
        Map<String, Integer> wordCount = Arrays.stream(words)
                .collect(Collectors.toMap(
                        word -> word,       // Key: the word itself
                        word -> 1,          // Value: 1 for initial count
                        Integer::sum        // Merge function: sum counts if key repeats
                ));

        //Print results
        System.out.println("Word Frequency:");
        wordCount.forEach((word, count) -> System.out.println(word + " -> " + count));
    }
}

