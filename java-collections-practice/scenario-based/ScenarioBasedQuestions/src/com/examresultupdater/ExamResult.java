package com.examresultupdater;

import java.util.*;

public class ExamResult<T> {
    T examType; // MidTerm, Final, Internal

    // Map<Subject, List<Marks>>
    Map<String, List<Integer>> subjectMarks;

    public ExamResult(T examType) {
        this.examType = examType;
        subjectMarks = new HashMap<>();
    }

    public void addMarks(String subject, int marks) {
        subjectMarks.computeIfAbsent(subject, k -> new ArrayList<>()).add(marks);
    }

    public Map<String, List<Integer>> getSubjectMarks() {
        return subjectMarks;
    }

    public T getExamType() {
        return examType;
    }
}
