package com.interfaces.staticmethod.dateformatutility;

/*
 * Date Format Utility
   ○ Scenario: An invoice generator must format dates in multiple formats.
   ○ Task: Use a static interface method to format dates.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateUtils {

	// format as DD-MM-YYYY
	static String formatDDMMYYYY(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	// format as YYYY/MM/DD
	static String formatYYYYMMDD(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
	}

	// format with full month name (e.g., 01 February 2026)
	static String formatFullMonth(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
	}

	// format in invoice-friendly style (e.g., February 01, 2026)
	static String formatInvoice(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
	}

	// get current date in chosen style
	static String getCurrentDate(String style) {
		LocalDate today = LocalDate.now();

		if (style.equalsIgnoreCase("ddmmyyyy")) {
			return formatDDMMYYYY(today);
		} else if (style.equalsIgnoreCase("yyyymmdd")) {
			return formatYYYYMMDD(today);
		} else if (style.equalsIgnoreCase("fullmonth")) {
			return formatFullMonth(today);
		} else if (style.equalsIgnoreCase("invoice")) {
			return formatInvoice(today);
		} else {
			return formatDDMMYYYY(today); // default format
		}
	}
}
