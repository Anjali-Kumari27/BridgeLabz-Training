package com.examresultupdater;
/*
 * ExamResultUploader – Bulk Marks Processing
Story: A school system uploads student marks as .csv files:
RollNo,Name,Subject,Marks
101,Ravi,Math,95
102,Anita,Science,88
The ExamResultUploader tool must:
● Read the file using FileReader and BufferedReader
● Validate each line with Regex (no missing fields, correct marks format)
● Use Map<String, List<Integer>> to store subject-wise marks
● Calculate top scorer per subject using PriorityQueue
● Use Generics to allow support for mid-term, finals, or internal exams
● Throw custom exceptions for invalid formats or missing marks
 */

public class UseExamResult {

    public static void main(String[] args) {

        String filePath = "C:/Users/91743/Desktop/exam_marks.csv";

        try {
            // MidTerm exam
            ExamResult<String> midTermResult = ExamUtils.readExamFile(filePath, "MidTerm");

            // Display top scorers
            ExamUtils.displayTopScorers(midTermResult);

        } catch (Exception e) {
            System.out.println("Error processing exam file: " + e.getMessage());
        }
    }
}

