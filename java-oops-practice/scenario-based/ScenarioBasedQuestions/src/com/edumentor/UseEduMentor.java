package com.edumentor;

/*"EduMentor – Personalized Learning Platform"
Story: EduMentor is an AI-based learning platform. You're tasked with implementing the module
to manage courses, quizzes, and learner progress.

Requirements:
● User base class: name, email, userId.
● Learner and Instructor inherit from User.
● ICertifiable interface with method generateCertificate().
● Quiz class: fields for questions, answers, and score.
● Use constructors to create quizzes with variable difficulty.
● Encapsulation for quiz answers (can’t be modified once set).
● Use operators to score the quiz and generate a percentage.
● Polymorphism: generateCertificate() works differently for short courses vs
full-time.
● Apply access modifiers: internal question banks must remain private.
*/

import java.util.Scanner;

public class UseEduMentor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean runApp = true;

        System.out.println("===== Welcome to EduMentor Learning Platform =====");

        while (runApp) {

            System.out.println("\nSelect User Type:");
            System.out.println("1. Learner");
            System.out.println("2. Instructor");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            int userChoice = input.nextInt();
            input.nextLine();  // clear buffer

            if (userChoice == 3) {
                System.out.println("Exiting Platform...");
                break;
            }

            System.out.print("Enter Name: ");
            String name = input.nextLine();
            System.out.print("Enter Email: ");
            String email = input.nextLine();
            System.out.print("Enter User ID: ");
            int userId = input.nextInt();
            input.nextLine();

            User user;
            if (userChoice == 1) {
                user = new Learner(name, email, userId);
            } else {
                user = new Instructor(name, email, userId);
            }

            user.displayUser();
            user.roleInfo();

            if (user instanceof Learner) {

                boolean quizLoop = true;

                while (quizLoop) {

                    System.out.println("\nSelect Quiz Difficulty:");
                    System.out.println("1. Easy");
                    System.out.println("2. Hard");
                    System.out.println("3. Exit");
                    System.out.print("Choice: ");
                    int quizChoice = input.nextInt();
                    input.nextLine();

                    if (quizChoice == 3) break;

                    String difficulty = (quizChoice == 1) ? "easy" : "hard";
                    Quiz quiz = new Quiz(difficulty);

                    System.out.println("\n--- Quiz Started (" + difficulty + " level) ---");
                    quiz.showQuestions();

                    int[] userAnswers = new int[(difficulty.equals("easy")) ? 2 : 3];

                    for (int i = 0; i < userAnswers.length; i++) {
                        System.out.print("Answer for Question " + (i + 1) + ": ");
                        userAnswers[i] = input.nextInt();
                    }

                    quiz.attemptQuiz(userAnswers);
                    double percentage = quiz.calculatePercentage();

                    System.out.println("\nScore: " + quiz.getScore());
                    System.out.println("Percentage: " + percentage + "%");

                    System.out.println("\nSelect Course Type for Certificate:");
                    System.out.println("1. Short Course");
                    System.out.println("2. Full-Time Course");
                    System.out.print("Choice: ");
                    int courseChoice = input.nextInt();

                    ICertifiable course;
                    if (courseChoice == 1) {
                        course = new ShortCourse(percentage);
                    } else {
                        course = new FullTimeCourse(percentage);
                    }

                    course.generateCertificate();

                    System.out.println("\nDo you want to attempt another quiz? (y/n)");
                    String cont = input.next();
                    if (cont.equalsIgnoreCase("n")) {
                        quizLoop = false;
                    }
                }
            } else {
                System.out.println("Instructor cannot take quizzes.");
            }

            System.out.println("\nDo you want to add another user? (y/n)");
            String contUser = input.next();
            if (contUser.equalsIgnoreCase("n")) {
                runApp = false;
            }
        }

        input.close();
        System.out.println("Thank you for using EduMentor!");
    }
}
