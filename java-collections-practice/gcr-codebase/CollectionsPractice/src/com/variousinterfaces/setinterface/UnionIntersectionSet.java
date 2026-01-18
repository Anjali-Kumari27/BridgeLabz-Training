package com.variousinterfaces.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionIntersectionSet {
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

		// Union
		Set<Integer> unionSet = new HashSet<>(set1); // copy set1
		
		// add all elements from set2
		unionSet.addAll(set2); 

		// Intersection
		Set<Integer> intersectionSet = new HashSet<>(set1); // copy set1

		// keep only elements present in set2
		intersectionSet.retainAll(set2);

		// Print results
		System.out.println("Union: " + unionSet);
		System.out.println("Intersection: " + intersectionSet);
	}
}
