package com.encapsulationpolymorphismabstraction.hospitalpatientmanagement;

public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
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
