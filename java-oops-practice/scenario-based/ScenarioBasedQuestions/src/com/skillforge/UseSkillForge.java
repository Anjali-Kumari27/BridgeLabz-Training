package com.skillforge;

import java.util.Scanner;

public class UseSkillForge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // STUDENT INPUT
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Student student = new Student(id, name, email);

        // COURSES
        Course course1 = new Course(
                "Java Full Course",
                "Ankit Sharma",
                new String[]{"Java Basics", "OOP", "Collections", "Mini Project"}
        );

        Course course2 = new Course(
                "Python for Beginners",
                "Neha Verma",
                new String[]{"Syntax", "Loops", "Functions", "Projects"}
        );

        Course course3 = new Course(
                "Web Development",
                "Rohit Meena",
                new String[]{"HTML", "CSS", "JavaScript", "Website Project"}
        );

        while (true) {

            System.out.println("\n======================================================");
            System.out.println("                    SkillForge                          ");
            System.out.println("========================================================\n");
            student.displayUser();

            System.out.println("\n1. View Available Courses");
            System.out.println("2. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) {
                System.out.println("Thank you for using SkillForge!");
                break;
            }

            if (choice == 1) {

                System.out.println("\n----------------------------------------");
                System.out.println("             Available Courses            ");
                System.out.println("-------------------------------------------");
                System.out.println("1. Java Full Course (Instructor: Ankit Sharma)");
                System.out.println("2. Python for Beginners (Instructor: Neha Verma)");
                System.out.println("3. Web Development (Instructor: Rohit Meena)");

                System.out.print("\nSelect course number: ");
                int courseChoice = sc.nextInt();
                sc.nextLine();

                Course selectedCourse = null;

                switch (courseChoice) {
                    case 1:
                        selectedCourse = course1;
                        break;
                    case 2:
                        selectedCourse = course2;
                        break;
                    case 3:
                        selectedCourse = course3;
                        break;
                    default:
                        System.out.println("Invalid course choice");
                        continue;
                }

                System.out.println("\n-----------------------------------------");
                System.out.println("              Course Details               ");
                System.out.println("--------------------------------------------");
                selectedCourse.displayCourse();

                System.out.print("\nDo you want to enroll in this course? (yes/no): ");
                String enroll = sc.nextLine();

                if (enroll.equalsIgnoreCase("yes")) {

                    // Course completion (simple simulation)
                    student.updateProgress(
                            selectedCourse.getTotalModules(),
                            selectedCourse.getTotalModules()
                    );
                    student.addMarks(75);

                    System.out.println("\n---------- Course Status -----------");
                    student.displayProgress();

                    System.out.println("\n----------- Certificate -------------");
                    student.generateCertificate();

                } else {
                    System.out.println("Enrollment cancelled.");
                }
            }
        }
    }
}
