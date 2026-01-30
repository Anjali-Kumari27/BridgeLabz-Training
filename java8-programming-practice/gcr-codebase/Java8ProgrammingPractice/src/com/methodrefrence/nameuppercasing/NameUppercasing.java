package com.methodrefrence.nameuppercasing;

import java.util.ArrayList;
import java.util.List;
/*
 * Name Uppercasing
○ Scenario: Convert all employee names in uppercase for an HR letter.
○ Task: Use String::toUpperCase in a stream.
 */
public class NameUppercasing {
	public static void main(String[] args) {
		List<String> employeeName = new ArrayList<>();
		
		employeeName.add("Anjali Singh");
		employeeName.add("Devika Chakravarti");
		employeeName.add("Arpita Singh");
		employeeName.add("Ananya Srivastava");
		
		employeeName.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
