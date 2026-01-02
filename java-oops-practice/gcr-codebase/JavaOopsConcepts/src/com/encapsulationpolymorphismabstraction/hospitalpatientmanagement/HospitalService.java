package com.encapsulationpolymorphismabstraction.hospitalpatientmanagement;

import java.util.List;

public class HospitalService {

    public static void processPatients(List<Patient> patients) {

        for (Patient patient : patients) {

            patient.getPatientDetails();
            System.out.println("Total Bill : " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.viewRecords();
            }

            System.out.println("--------------------------------");
        }
    }
}
