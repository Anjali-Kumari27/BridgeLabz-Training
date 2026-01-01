package com.objectmodeling.selfproblems.universityfacultydeptcompositionaggregation;

public class CompositionAggregation {
	public static void main(String[] args) {

        // Faculty exists independently (Aggregation)
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        // Create University
        University uni = new University("Tech University");

        // Add Departments (Composition)
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");

        // Add Faculty (Aggregation)
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Show details
        uni.showUniversityDetails();

        // Delete University
        uni.deleteUniversity();

        // Faculty still exists after university deletion
        System.out.println("\n******Faculty still exists independently******\n");
        f1.showFaculty();
        f2.showFaculty();
    }

}
