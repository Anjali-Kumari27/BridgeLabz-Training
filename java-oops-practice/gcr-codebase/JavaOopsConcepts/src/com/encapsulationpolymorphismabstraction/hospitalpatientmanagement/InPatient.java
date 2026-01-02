package com.encapsulationpolymorphismabstraction.hospitalpatientmanagement;

public class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String diagnosis) {
        addMedicalHistory(diagnosis);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + getMedicalHistory());
    }
}
