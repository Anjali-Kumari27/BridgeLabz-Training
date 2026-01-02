package com.universitycourseenrollmentsystem;

public class UseUniversityCourseEnrollmentSystem {
	
	    public static void main(String[] args) {
	        // 1. Create Students
	        Student s1 = new Undergraduate("Anjali", "UG2023");
	        Student s2 = new Postgraduate("Anaya", "PG2023", "AI Ethics");

	        // 2. Create Faculty
	        Faculty professor = new Faculty("Dr. Smith");

	        // 3. Create Enrollments
	        Enrollment e1 = new Enrollment(s1, "Data Structures");
	        Enrollment e2 = new Enrollment(s2, "Advanced Algorithms");

	        // 4. Assign Grades via Faculty
	        professor.giveGrade(e1, "A");
	        professor.giveGrade(e2, "A");

	        // 5. Output Results
	        s1.displayTranscript();
	        s2.displayTranscript();
	    }
}
