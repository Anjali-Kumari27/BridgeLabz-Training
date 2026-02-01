package com.streamapi.filteringexpiremembership;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/*
 Filtering Expiring Memberships
 Given a list of gym members with their membership expiry dates, use Stream API to filter
 out members whose membership expires within the next 30 days.
 */
public class UseFilterExpireMember {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate thirtyDaysFromNow = today.plusDays(30);

		List<Member> members = Arrays.asList(new Member("Himanshu", today.plusDays(10)),
				new Member("Anjali", today.plusDays(45)), new Member("Hrushikesh", today.plusDays(15)),
				new Member("Dhiraj", today.plusDays(60)), new Member("Tisa", today.plusDays(5)));

		// Stream processing
		List<Member> expiringSoon = members.stream() // Input from Collections

				// Filter members based on criteria
				.filter(m -> !m.getExpiryDate().isBefore(today) && m.getExpiryDate().isBefore(thirtyDaysFromNow))

				// Collect result into a list
				.collect(Collectors.toList());

		System.out.println("\n============================================================");
		System.out.println("              Memberships expiring within 30 days             ");
		System.out.println("============================================================\n");
		expiringSoon.forEach(System.out::println);
	}
}