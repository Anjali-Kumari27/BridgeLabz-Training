package com.annotations.bugreportannotation;

import java.lang.reflect.Method;

public class UseRepeatableAnnotation {

	public static void main(String[] args) throws Exception {

		// Creating object of BugTracker
		BugTracker tracker = new BugTracker();

		// Getting Method object using reflection
		Method method = tracker.getClass().getMethod("submitForm");

		// Getting all BugReport annotations
		BugReport[] reports = method.getAnnotationsByType(BugReport.class);

		// Printing all bug descriptions
		for (BugReport report : reports) {
			System.out.println("Bug: " + report.description());
		}

		// Calling the actual method
		tracker.submitForm();
	}

}
