package com.lambdaexpression.notificationfiltering;
/*
 * Notification Filtering
○ Scenario: A hospital app sends patient alerts. Based on user preference, only
certain alerts should be shown.
○ Task: Use lambdas with Predicate to filter alerts.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NotificationFiltering {

	static class Alert {
		String message;

		// Type defines department in (EMERGENCY, MEDICATION, APPOINTMENT, GENERAL)
		String type;

		Alert(String message, String type) {
			this.message = message;
			this.type = type;
		}

		public String toString() {
			return type + " ALERT: " + message;
		}
	}

	public static void main(String[] args) {

		List<Alert> alerts = new ArrayList<>();

		alerts.add(new Alert("Heart rate critical", "EMERGENCY"));
		alerts.add(new Alert("Take insulin at 8 AM", "MEDICATION"));
		alerts.add(new Alert("Doctor appointment tomorrow", "APPOINTMENT"));
		alerts.add(new Alert("Hospital maintenance notice", "GENERAL"));

		// User preference: show only EMERGENCY alerts
		Predicate<Alert> emergencyOnly = alert -> alert.type.equals("EMERGENCY");

		System.out.println("\n================================================================================");
		System.out.println("                              Showing Emergency Alerts                            ");
		System.out.println("================================================================================\n");
		for (Alert alert : alerts) {
			if (emergencyOnly.test(alert)) {
				System.out.println(alert);
			}
		}

		// User preference: show MEDICATION alerts
		Predicate<Alert> medicationOnly = alert -> alert.type.equals("MEDICATION");

		System.out.println("\n================================================================================");
		System.out.println("                              Showing Medication Alerts                           ");
		System.out.println("================================================================================\n");
		for (Alert alert : alerts) {
			if (medicationOnly.test(alert)) {
				System.out.println(alert);
			}
		}
	}
}
