package com.streamapi.transformingnames;


import java.util.*;
import java.util.stream.Collectors;

/*
 Transforming Names for Display
 Given a list of customer names, use .map() to convert them to uppercase and
 .sorted() to display them alphabetically.
 */
public class UseTransformingName {

	public static void main(String[] args) {

		List<Customer> customers = Arrays.asList(
				new Customer("Anjali"),
				new Customer("Himanshu"),
				new Customer("Bobby"),
				new Customer("Dhiraj"),
				new Customer("Tisa")
		);

		// Stream processing
		List<String> formattedNames = customers.stream() // Takes input from the Collection 

				// Transform names to uppercase using map
				.map(customer -> customer.getName().toUpperCase()) // Produces a new stream of Strings 

				// Sort alphabetically using sorted
				.sorted() 

				// Collect result into a list
				.collect(Collectors.toList()); // Terminal operation to produce result 

		
		System.out.println("\n====================================================");
		System.out.println("                Processed Customer Names              ");
		System.out.println("====================================================\n");
		formattedNames.forEach(System.out::println); 
	}
}