package com.feedbackguru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackUtils {

    // Regex to extract rating like 9/10, 7/10
    static Pattern ratingPattern = Pattern.compile("(\\d{1,2})/10");

    // Read feedback files from folder
    public static List<String> readFeedbackFiles(String folderPath) {

        List<String> lines = new ArrayList<>();
        File folder = new File(folderPath);

        File[] files = folder.listFiles();

        if (files == null) return lines;

        for (File file : files) {

            if (!file.getName().endsWith(".txt")) continue;

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {

                String line;
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                }

            } catch (Exception e) {
                System.out.println("Error reading " + file.getName());
            }
        }
        return lines;
    }

    // Extract rating using regex
    public static int extractRating(String feedback) {

        Matcher matcher = ratingPattern.matcher(feedback);

        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return -1; // invalid rating
    }

    // Categorize feedback
    public static String getCategory(int rating) {

        if (rating >= 8) return "Positive";
        if (rating >= 5) return "Neutral";
        return "Negative";
    }
}
