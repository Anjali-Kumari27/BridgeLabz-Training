package com.encapsulationpolymorphismabstraction.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public abstract class Patient {
	
	 // Encapsulation: private fields
    private int patientId;
    private String name;
    private int age;

    // Sensitive medical data (secured)
    private List<String> medicalHistory = new ArrayList<>();

    protected Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters only (secured access)
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Protected medical data access
    protected void addMedicalHistory(String diagnosis) {
        medicalHistory.add(diagnosis);
    }

    protected List<String> getMedicalHistory() {
        return medicalHistory;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
    }

}
