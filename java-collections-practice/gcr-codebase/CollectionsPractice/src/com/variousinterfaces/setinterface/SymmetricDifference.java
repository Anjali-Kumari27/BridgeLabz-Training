package com.variousinterfaces.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SymmetricDifference {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Create two sets
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		// Read first set
		System.out.print("Enter size of Set1: ");
		int n1 = input.nextInt();
		System.out.println("Enter elements of Set1:");
		for (int i = 0; i < n1; i++) {
			set1.add(input.nextInt());
		}

		// Read second set
		System.out.print("Enter size of Set2: ");
		int n2 = input.nextInt();
		System.out.println("Enter elements of Set2:");
		for (int i = 0; i < n2; i++) {
			set2.add(input.nextInt());
		}

		// Symmetric Difference logic
		Set<Integer> symDiff = new HashSet<>(set1); // copy set1

		// union of both sets
		symDiff.addAll(set2);

		Set<Integer> tmp = new HashSet<>(set1); // copy set1

		// intersection of both sets
		tmp.retainAll(set2);

		symDiff.removeAll(tmp); // remove common elements

		// Print result
		System.out.println("Symmetric Difference: " + symDiff);
	}
}
