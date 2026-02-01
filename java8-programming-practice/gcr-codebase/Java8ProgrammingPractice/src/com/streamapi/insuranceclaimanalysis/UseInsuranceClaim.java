package com.streamapi.insuranceclaimanalysis;

import java.util.*;
import java.util.stream.Collectors;

/*
 Insurance Claim Analysis
 ○ Scenario: Find the average claim amount for each claim type.
 ○ Task: Use groupingBy() and averagingDouble().
 */
public class UseInsuranceClaim {

	public static void main(String[] args) {

		List<Claim> claims = Arrays.asList(
				new Claim("Health", 15000.50),
				new Claim("Auto", 45000.00),
				new Claim("Health", 25000.75),
				new Claim("Home", 120000.00),
				new Claim("Auto", 30000.25),
				new Claim("Health", 10000.00),
				new Claim("Home", 80000.50)
		);

		// Stream processing
		// Group claims by their type 
		// Apply a mapping function to calculate the average for each group 
		Map<String, Double> averageClaimsByType = claims.stream()
				.collect(Collectors.groupingBy(
						Claim::getType, 
						Collectors.averagingDouble(Claim::getAmount)
				));

		// Display result
		System.out.println("\n---------------------------------------------------");
		System.out.println("            Average Claim Amount per Type            ");
		System.out.println("---------------------------------------------------\n");
		averageClaimsByType.forEach((type, avg) -> 
				System.out.println(type + " - > Average: " + String.format("%.2f", avg)));
	}
}