package com.objectmodeling.selfproblems.hospitaldoctorpatientassociationcommunication;

public class Doctor {

    private String doctorName;

    public Doctor(String doctorName) {
        this.doctorName = doctorName;
    }

    // Communication between Doctor and Patient
    public void consult(Patient patient) {
        System.out.println("Doctor " + doctorName +
                " is consulting Patient " + patient.getPatientName());
    }
}
