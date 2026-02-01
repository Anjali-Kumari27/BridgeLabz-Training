package com.streamapi.foreachmethod.emailnotifications;

import java.util.*;

/*
 Email Notifications
 Given a list of user emails, use forEach() to send a notification email to each user.
 emails.forEach(email -> sendEmailNotification(email));
 */
public class UseEmailNotification{

	public static void main(String[] args) {

		List<User> users = Arrays.asList(
				new User("john.doe@example.com"),
				new User("jane.smith@example.com"),
				new User("dev.expert@java.org"),
				new User("student.placement@univ.edu")
		);

		System.out.println("\n--------------------------------------------------------");
		System.out.println("          Starting Email Notification Service...          ");
		System.out.println("--------------------------------------------------------\n");

		// Stream processing
		// forEach() to send a notification email to each user
		users.stream()
				/*
				 * forEach() is a terminal operation
				 * It loops over the stream elements, calling the supplied function on each element.
				 */
				.forEach(user -> sendEmailNotification(user.getEmail()));

		System.out.println("\n***********************************");
		System.out.println(" All notifications processed.");
		System.out.println("***********************************\n");
	}

	/*
	 * Mock method to simulate sending an email
	 */
	public static void sendEmailNotification(String email) {
		System.out.println(">>> Sending notification email to: " + email);
	}
}