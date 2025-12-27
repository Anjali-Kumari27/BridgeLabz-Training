package com.constructor.levelone;

public class Student {

		    // Public
		    public int rollNumber;

		    // Protected
		    protected String name;

		    // Private: only accessible within the class
		    private double CGPA;

		    //public Parameterized constructor
		    public Student(int rollNumber, String name, double CGPA) {
		    	
		    	//this keyword is used to refer instance variables
		        this.rollNumber = rollNumber;
		        this.name = name;
		        this.CGPA = CGPA;
		        
		    }

		    // Updates CGPA through setter method
		    public void setCGPA(double CGPA) {
		    	
		        this.CGPA = CGPA;
		        
		    }

		    // Returns CGPA using getter method
		    public double getCGPA() {
		    	
		        return CGPA;
		        
		    }

		    
		    
		    // Displays student details
		    public void displayStudentDetails() {
		    	
		        System.out.println("Roll Number : " + rollNumber);
		        System.out.println("Name of the Student : " + name);
		        System.out.println("CGPA : " + CGPA);
		        
		    }

}
