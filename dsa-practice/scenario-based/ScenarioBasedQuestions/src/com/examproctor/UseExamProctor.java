package com.examproctor;

/*
 * ExamProctor – Online Exam Review System (Stack + HashMap +
Functions)
Story: During an online exam, each student’s question navigation is recorded using a Stack
(last visited question). Answers are stored in a HashMap: questionID → answer.
A function auto-calculates the score once the student submits.
Requirements:
● Track navigation with stack.
● Store answers in a map.
● Evaluate using functions for scoring logic.
 */

import java.util.HashMap;
import java.util.Scanner;

public class UseExamProctor {

	// Manual stack using array
	static int[] navStack = new int[10];
	static int top = -1;

	// Store student answers
	static HashMap<Integer, String> answerMap = new HashMap<>();

	// Store correct answers
	static HashMap<Integer, String> correctMap = new HashMap<>();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Correct answers
		correctMap.put(1, "A");
		correctMap.put(2, "B");
		correctMap.put(3, "C");
		correctMap.put(4, "D");
		correctMap.put(5, "A");

		int choice;

		do {
			System.out.println("\n===================================");
			System.out.println("        ExamProctor Menu");
			System.out.println("===================================");
			System.out.println("1. Visit Question");
			System.out.println("2. Answer Question");
			System.out.println("3. Go Back");
			System.out.println("4. Submit Exam");
			System.out.print("Enter choice: ");

			choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter Question ID (1-5): ");
				int qid = input.nextInt();
				push(qid);
				System.out.println("Visited Question " + qid);
				break;

			case 2:
				System.out.print("Enter Question ID: ");
				int aid = input.nextInt();
				System.out.print("Enter Answer (A/B/C/D): ");
				String ans = input.next();
				answerMap.put(aid, ans);
				System.out.println("Answer Saved.");
				break;

			case 3:
				int last = pop();
				if (last == -1) {
					System.out.println("No previous question.");
				} else {
					System.out.println("Back from Question " + last);
				}
				break;

			case 4:
				int score = calculateScore();
				System.out.println("\nExam Submitted Successfully!");
				System.out.println("Final Score: " + score + " / 5");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 4);

		input.close();
	}

	// Push operation
	public static void push(int qid) {
		navStack[++top] = qid;
	}

	// Pop operation
	public static int pop() {
		if (top == -1) {
			return -1;
		}
		return navStack[top--];
	}

	// Score calculation function
	public static int calculateScore() {
		int score = 0;

		for (int qid : correctMap.keySet()) {
			if (answerMap.containsKey(qid)) {
				if (answerMap.get(qid).equalsIgnoreCase(correctMap.get(qid))) {
					score++;
				}
			}
		}
		return score;
	}
}
