package com.generics.multileveluniversitycoursemanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseUniversityCourseSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Course<?>> courses = new ArrayList<>();

        System.out.println("\n===================================================");
        System.out.println("                 COURSE MANAGEMENT                   ");
        System.out.println("===================================================\n");
        System.out.print("Enter number of courses: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nCourse " + (i + 1));
            System.out.println("1. Exam-Based");
            System.out.println("2. Assignment-Based");
            System.out.println("3. Research-Based");
            System.out.print("Choose course type: ");
            int choice = input.nextInt();
            input.nextLine();

            System.out.print("Enter course name: ");
            String courseName = input.nextLine();

            System.out.print("Enter department: ");
            String department = input.nextLine();

            switch (choice) {
                case 1:
                    courses.add(new Course<>(courseName, department, new ExamCourse()));
                    break;

                case 2:
                    courses.add(new Course<>(courseName, department, new AssignmentCourse()));
                    break;

                case 3:
                    courses.add(new Course<>(courseName, department, new ResearchCourse()));
                    break;

                default:
                    System.out.println("Invalid choice!");
                    i--;
            }
        }

        // Display all courses

        System.out.println("\n--------------------------------------");
        System.out.println("            Course Details              ");
        System.out.println("--------------------------------------\n");
        for (Course<?> course : courses) {
            course.displayCourseInfo();
            System.out.println();
        }

        input.close();
    }
}

