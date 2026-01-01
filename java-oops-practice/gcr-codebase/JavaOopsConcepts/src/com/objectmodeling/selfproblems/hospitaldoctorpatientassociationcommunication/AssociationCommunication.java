package com.objectmodeling.selfproblems.hospitaldoctorpatientassociationcommunication;

public class AssociationCommunication {
	 public static void main(String[] args) {

	        // Create Hospital
	        Hospital hospital = new Hospital("City Care Hospital");

	        // Create Doctors
	        Doctor d1 = new Doctor("Dr. Gupta");
	        Doctor d2 = new Doctor("Dr. Rao");

	        // Create Patients
	        Patient p1 = new Patient("Amit");
	        Patient p2 = new Patient("Neha");

	        // Add doctors and patients to hospital
	        hospital.addDoctor(d1);
	        hospital.addDoctor(d2);

	        hospital.addPatient(p1);
	        hospital.addPatient(p2);

	        hospital.showHospitalDetails();

	        System.out.println("\n==================Consultations=================");

	        // Many-to-Many Association
	        d1.consult(p1);
	        d1.consult(p2);

	        d2.consult(p1);
	        d2.consult(p2);
	    }

}
