package com.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamUtils {

    // Regex: check line format: name,A,B,C,D...
    static Pattern linePattern = Pattern.compile("^[A-Za-z ]+(,[A-D])+$");

    // Read CSV file and return list of AnswerSheet
    public static <T> List<AnswerSheet<T>> readAnswerSheets(String filePath, T subject) {

        List<AnswerSheet<T>> sheets = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {

                // Validate format
                Matcher matcher = linePattern.matcher(line);
                if (!matcher.matches()) {
                    System.out.println("Invalid format skipped: " + line);
                    continue;
                }

                String[] parts = line.split(",");
                String studentName = parts[0];
                List<String> answers = Arrays.asList(Arrays.copyOfRange(parts, 1, parts.length));

                sheets.add(new AnswerSheet<>(subject, studentName, answers));
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return sheets;
    }

    // Compare with answer key and return Map<StudentName, Score>
    public static Map<String, Integer> gradeAnswerSheets(List<AnswerSheet<String>> sheets, List<String> answerKey) {

        Map<String, Integer> scores = new HashMap<>();

        for (AnswerSheet<?> sheet : sheets) {
            List<String> answers = sheet.answers;
            int score = 0;
            for (int i = 0; i < Math.min(answers.size(), answerKey.size()); i++) {
                if (answers.get(i).equalsIgnoreCase(answerKey.get(i))) {
                    score++;
                }
            }
            scores.put(sheet.studentName, score);
        }

        return scores;
    }

    // Sort and display using PriorityQueue
    public static void displaySortedScores(Map<String, Integer> scores) {

        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(scores.entrySet());

        System.out.println("\n==============================");
        System.out.println(" STUDENT SCORES (Highest First) ");
        System.out.println("==============================");

        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

