package com.examresultupdater;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamUtils {

    // Regex pattern: RollNo,Name,Subject,Marks
    static Pattern linePattern = Pattern.compile("^(\\d+),([^,]+),([^,]+),(\\d{1,3})$");

    // Read CSV file and return ExamResult object
    public static <T> ExamResult<T> readExamFile(String filePath, T examType) throws IOException {
        ExamResult<T> result = new ExamResult<>(examType);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNo = 0;

            while ((line = br.readLine()) != null) {
                lineNo++;
                line = line.trim();
                if (line.isEmpty()) continue;

                Matcher matcher = linePattern.matcher(line);

                if (!matcher.matches()) {
                    throw new InvalidExamDataException("Invalid format at line " + lineNo + ": " + line);
                }

                String rollNo = matcher.group(1);
                String name = matcher.group(2);
                String subject = matcher.group(3);
                int marks = Integer.parseInt(matcher.group(4));

                result.addMarks(subject, marks);
            }
        } catch (InvalidExamDataException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    // Get top scorer per subject
    public static void displayTopScorers(ExamResult<?> result) {
        System.out.println("\n==============================");
        System.out.println(" TOP SCORERS (" + result.getExamType() + ") ");
        System.out.println("==============================");

        for (String subject : result.getSubjectMarks().keySet()) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            pq.addAll(result.getSubjectMarks().get(subject));
            System.out.println(subject + " : " + pq.peek() + " marks");
        }
    }
}
