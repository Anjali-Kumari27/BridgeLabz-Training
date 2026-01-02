package com.hospitalpatientmanagementsystem;

public class UseHospitalPatientManagementSystem {
	    public static void main(String[] args) {

	    	//created object for doctor
	        Doctor d1 = new Doctor(101, "Dr. Mehta" , "Orthopedic");
	        d1.displayInfo();

	        // Polymorphism (Patient reference)
	        Patient p1 = new InPatient(1, "Anjali", 4, 2500);
	        Patient p2 = new InPatient(2, "Devika" , 3 , 1950);
	        Patient p3 = new OutPatient(3, "Ravi", 600);

	        System.out.println("\n**************************");
	        System.out.println("     InPatient ");
	        System.out.println("**************************");
	        
	        //Runtime polymorphism
	        p1.displayInfo();
	        p2.displayInfo();
	        
	        System.out.println("\n**************************");
	        System.out.println("     OutPatient ");
	        System.out.println("**************************");
	        p3.displayInfo();
	        
            //created bill object
	        Bill bill = new Bill(12000);
	        System.out.println("\n----------------------------");
	        System.out.println("Final Bill Amount: ₹" + bill.calculatePayment());
	        System.out.println("----------------------------");
	    }

}
