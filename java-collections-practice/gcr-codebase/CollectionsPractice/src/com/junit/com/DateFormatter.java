package com.junit.dateformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/*
 * Create a DateFormatter class with:
formatDate(String inputDate): Converts yyyy-MM-dd format to dd-MM-yyyy.
 */

public class DateFormatter {
	// Converts yyyy-MM-dd to dd-MM-yyyy
	public String formatDate(String inputDate) {

		try {
			// Define input and output formats
			DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

			// Parse input date
			LocalDate date = LocalDate.parse(inputDate, inputFormat);

			// Format date to new pattern
			return date.format(outputFormat);

		} catch (DateTimeParseException e) {
			// Handle invalid date format
			throw new IllegalArgumentException("Invalid date format");
		}
	}

}
