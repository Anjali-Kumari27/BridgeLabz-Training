package com.encapsulationpolymorphismabstraction.hospitalpatientmanagement;

import java.util.List;
import java.util.ArrayList;

//Main class to use the Hospital Patient Management System
public class UseHospitalPatientManagement {
	
	public static void main(String[] args) {

		// List to store all patients in the hospital
        List<Patient> patients = new ArrayList<>();

        // Create an In-Patient (admitted in hospital)
        InPatient p1 = new InPatient(1, "Anjali", 25, 5, 2000);
        p1.addRecord("Appendicitis");

        // Create an Out-Patient (visits hospital but not admitted)
        OutPatient p2 = new OutPatient(2, "Ravi", 30, 500);
        
        // Add medical record
        p2.addRecord("Fever");

        // Add patients to the list
        patients.add(p1);
        patients.add(p2);

        // Process all patients (display details, calculate bills, etc.)
        HospitalService.processPatients(patients);
        
    }

}
