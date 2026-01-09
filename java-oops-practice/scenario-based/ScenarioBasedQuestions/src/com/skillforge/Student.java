package com.skillforge;

public class Student extends User implements ICertifiable {

    private int progress;     // percentage
    private int marks;

    public Student(int id, String name, String email) {
        super(id, name, email);
    }

    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules;   // operator usage
    }

    public void addMarks(int score) {
        marks += score;
    }

    @Override
    public void generateCertificate() {
        if (progress >= 100 && marks >= 40) {
            System.out.println("Certificate Generated for " + name);
            System.out.println("Status: PASSED");
        } else {
            System.out.println("Certificate not generated (Course incomplete or failed)");
        }
    }

    public void displayProgress() {
        System.out.println("Progress: " + progress + "% | Marks: " + marks);
    }
}
