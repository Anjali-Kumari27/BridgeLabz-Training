package com.functionalinterface.predicate.numbercheck;
/*
 * 5.Use Predicate to check whether a number is even or odd.

 */
import java.util.Scanner;
import java.util.function.Predicate;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive number : ");
		int number = input.nextInt();
		
		Predicate<Integer> checkEvenOdd = n -> n % 2 == 0;
		
		if(checkEvenOdd.test(number)) {
			System.out.println(number + " is Even Number");
		}else {
			System.out.println(number + " is Odd Number");
		}
	}

}
