package com.examscanner;

import java.util.List;

public class AnswerSheet<T> {
    T subject;             // Math, Science etc.
    String studentName;
    List<String> answers;

    public AnswerSheet(T subject, String studentName, List<String> answers) {
        this.subject = subject;
        this.studentName = studentName;
        this.answers = answers;
    }
}

