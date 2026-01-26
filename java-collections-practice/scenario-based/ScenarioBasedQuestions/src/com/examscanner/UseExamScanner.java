package com.examscanner;

import java.util.*;

public class UseExamScanner {

    public static void main(String[] args) {

        // Example answer key
        List<String> mathKey = Arrays.asList("A","B","C","D","A","B","C");

        // Read answer sheets (Generic Subject = "Math")
        List<AnswerSheet<String>> sheets =
                ExamUtils.readAnswerSheets("C:\\Users\\91743\\OneDrive\\Desktop\\maths_mcq.csv", "Math");

        // Grade students
        Map<String, Integer> scores = ExamUtils.gradeAnswerSheets(sheets, mathKey);

        // Display in sorted order
        ExamUtils.displaySortedScores(scores);
    }
}
