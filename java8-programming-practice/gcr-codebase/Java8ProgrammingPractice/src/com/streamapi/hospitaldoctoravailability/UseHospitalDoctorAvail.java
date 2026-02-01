package com.streamapi.hospitaldoctoravailability;

import java.util.*;
import java.util.stream.Collectors;

/*
 Hospital Doctor Availability
 ○ Scenario: Find doctors available on weekends and sort by specialty.
 ○ Task: Use streams with filter() and sorted().
 */
public class UseHospitalDoctorAvail  {

    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Sharma", "Cardiology", true),
                new Doctor("Verma", "Neurology", false),
                new Doctor("Iyer", "Pediatrics", true),
                new Doctor("Reddy", "Cardiology", false),
                new Doctor("Patel", "Neurology", true),
                new Doctor("Das", "Orthopedics", true),
                new Doctor("Nair", "Pediatrics", false)
        );

        // Stream processing 
        List<Doctor> availableDoctors = doctors.stream() // Takes input from the Collection 

                //Filter doctors available on weekends
                .filter(Doctor::isAvailableOnWeekend)

                //Sort by specialty 
                .sorted(Comparator.comparing(Doctor::getSpecialty))

                // Collect result into a list 
                .collect(Collectors.toList());
 
        System.out.println("\n------------------------------------------------------------------");
        System.out.println("         Doctors Available on Weekends (Sorted by Specialty)        ");
        System.out.println("------------------------------------------------------------------\n");
        availableDoctors.forEach(System.out::println);
    }
}