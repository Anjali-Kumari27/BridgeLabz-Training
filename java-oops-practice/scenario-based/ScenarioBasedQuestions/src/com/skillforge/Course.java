package com.skillforge;

public class Course {

    private String title;
    private String instructor;
    private double rating;          // encapsulated
    private String[] modules;

    // Default modules constructor
    public Course(String title, String instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Introduction", "Basics", "Advanced"};
        this.rating = 4.5;
    }

    // Custom modules constructor
    public Course(String title, String instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 4.8;
    }

    public void displayCourse() {
        System.out.println("Course: " + title + " | Instructor: " + instructor + " | Rating: " + rating);
        System.out.println("Modules:");
        for (String m : modules) {
            System.out.println("- " + m);
        }
    }

    public int getTotalModules() {
        return modules.length;
    }
}

