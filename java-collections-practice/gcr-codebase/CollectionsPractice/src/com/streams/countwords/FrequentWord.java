package com.streams.countwords;

import java.io.*;
import java.util.*;

public class FrequentWord {

    public void countWords(String filePath) {

        HashMap<String, Integer> wordMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Convert to lowercase and split words
                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sort words by frequency
            List<Map.Entry<String, Integer>> list =
                    new ArrayList<>(wordMap.entrySet());

            list.sort((a, b) -> b.getValue() - a.getValue());

            System.out.println("\nTop 5 most frequent words:");
            for (int i = 0; i < Math.min(5, list.size()); i++) {
                System.out.println(list.get(i).getKey() + " : " + list.get(i).getValue());
            }

        } catch (IOException e) {
            System.out.println("Error reading file!");
        }
    }
}
