package com.variousinterfaces.queueinterface.hospitaltiragesystem;

/*
 * Hospital Triage System
Simulate a hospital triage system using a PriorityQueue where patients with higher severity are treated first.
Example:
Patients: [("John", 3), ("Alice", 5), ("Bob", 2)] → Order: Alice, John, Bob.

 */

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

public class UseHospitalTirageSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // PriorityQueue to treat patients based on severity
        // Higher severity patients come first
        PriorityQueue<Patient> pq = new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                return p2.severity - p1.severity; // higher severity first
            }
        });

        // Read number of patients
        System.out.println("\n==========================================================================");
        System.out.println("                         HOSPITAL TIRAGE SYSTEM                             ");
        System.out.println("==========================================================================\n");
        System.out.print("Enter number of patients: ");
        int n = input.nextInt();
        input.nextLine(); 

        // Read patient details and add to queue
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter patient " + (i+1) + " name : ");
            String name = input.nextLine();

            System.out.print("Enter severity (higher number = more severe): ");
            int severity = input.nextInt();
            input.nextLine(); 
            //System.out.println(" ");

            // Create Patient object and add to queue
            pq.add(new Patient(name, severity));
        }

        // Treat patients in order of severity
        System.out.println("\n======================================================");
        System.out.println("                    Treatment order                     ");
        System.out.println("======================================================\n");
        while (!pq.isEmpty()) {
            Patient p = pq.remove();  // remove patient with highest severity
            System.out.println(p.name + " (Severity: " + p.severity + ")");
        }
    }
}

