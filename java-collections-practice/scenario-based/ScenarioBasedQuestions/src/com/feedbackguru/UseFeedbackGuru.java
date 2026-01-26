package com.feedbackguru;

import java.util.*;

public class UseFeedbackGuru {

    public static void main(String[] args) {

        String folderPath = "C:/Users/91743/Desktop/feedback"; // folder path

        List<String> feedbackLines =
                FeedbackUtils.readFeedbackFiles(folderPath);

        // Category = List of feedbacks
        Map<String, List<String>> feedbackMap = new HashMap<>();

        feedbackMap.put("Positive", new ArrayList<>());
        feedbackMap.put("Neutral", new ArrayList<>());
        feedbackMap.put("Negative", new ArrayList<>());

        for (String line : feedbackLines) {

            try {
                int rating = FeedbackUtils.extractRating(line);

                if (rating == -1) {
                    throw new Exception("Invalid rating");
                }

                String category = FeedbackUtils.getCategory(rating);
                feedbackMap.get(category).add(line);

            } catch (Exception e) {
                System.out.println("Skipped feedback: " + line);
            }
        }

        // Display output nicely
        for (String category : feedbackMap.keySet()) {

            System.out.println("\n==============================");
            System.out.println(" " + category.toUpperCase() + " FEEDBACK");
            System.out.println("==============================");

            for (String fb : feedbackMap.get(category)) {
                System.out.println("- " + fb);
            }
        }
    }
}
