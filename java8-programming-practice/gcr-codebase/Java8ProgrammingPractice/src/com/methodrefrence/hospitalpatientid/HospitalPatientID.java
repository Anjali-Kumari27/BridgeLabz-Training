package com.methodrefrence.hospitalpatientid;
/*
 * Hospital Patient ID Printing
○ Scenario: Need to print all patient IDs from a list for admin verification.
○ Task: Use method references instead of lambdas.
 */
import java.util.ArrayList;
import java.util.List;

public class HospitalPatientID {

    public static void main(String[] args) {

        List<Integer> patientIds = new ArrayList<>();

        patientIds.add(10101);
        patientIds.add(10102);
        patientIds.add(10103);
        patientIds.add(10104);

        // Printing patient IDs using method reference
        patientIds.forEach(System.out::println);
    }
}
