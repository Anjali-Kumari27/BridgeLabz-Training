package com.edumentor;

public class Quiz {

    private String[] questions;          
    private final int[] correctAnswers;  
    private int score;

    public Quiz(String difficulty) {
        if (difficulty.equalsIgnoreCase("easy")) {
            questions = new String[]{
                "Java is platform independent? (1-Yes, 0-No)",
                "OOPS stands for Object Oriented Programming System? (1-Yes, 0-No)"
            };
            correctAnswers = new int[]{1, 1};
        } else {
            questions = new String[]{
                "JVM converts bytecode to machine code? (1-Yes, 0-No)",
                "Interface supports multiple inheritance? (1-Yes, 0-No)",
                "Encapsulation means data hiding? (1-Yes, 0-No)"
            };
            correctAnswers = new int[]{1, 1, 1};
        }
    }

    public void showQuestions() {
        for (String q : questions) System.out.println(q);
    }

    public void attemptQuiz(int[] answers) {
        score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (answers[i] == correctAnswers[i]) score++;
        }
    }

    public double calculatePercentage() {
        return (score * 100.0) / correctAnswers.length;
    }

    public int getScore() {
        return score;
    }
}
