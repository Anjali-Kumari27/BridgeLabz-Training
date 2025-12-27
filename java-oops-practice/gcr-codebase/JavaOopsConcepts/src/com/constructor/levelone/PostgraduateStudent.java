package com.constructor.levelone;

//PostgraduateStudent is a subclass of Student
//It inherits the properties and methods of Student
public class PostgraduateStudent extends Student {

	
        //Parameterized constructor of PostgraduateStudent
	    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
	    	
	    	//super keyword is used to pass values to the parent class
	        super(rollNumber, name, CGPA);
	        
	    }

	    
	    // Demonstrates access to public and protected members
	    public void displayStudentDetails() {
	        System.out.println("Roll Number : " + rollNumber);
	        System.out.println("Name of the student: " + name);
	        System.out.println("CGPA : " + getCGPA());
	        
	    }

	    
	    
	    
	    public static void main(String[] args) {
	    	
	    	//created object for PostgraduateStudent
	        PostgraduateStudent student = new PostgraduateStudent(40, "Anjali", 7.98);

	        student.displayStudentDetails();

	        //updating CGPA using setter method
	        student.setCGPA(8.56);
	        System.out.println("Updated CGPA : " + student.getCGPA());
	        
	    }

}
