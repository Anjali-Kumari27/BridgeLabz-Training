package com.constructor.levelone;

public class Course {
			
			//Instance variables
			private String courseName;
			private int duration;
			private double fee;
			
			//class variable (static) shared among all product objects
			static String instituteName = "Technocrats";
			
			
			//Parameterized constructor
			Course(String courseName , int duration , double fee){
				
				//this keyword used to refer instance variable
				this.courseName = courseName;
				this.duration = duration;
				this.fee = fee;
				
			}
			
			
			//Instance method to display details of Course
			void displayCourseDetails() {
				
				System.out.println("Course Name : " + courseName);
				System.out.println("Duration of the course : " + duration);
				System.out.println("Fee : " + fee);
				System.out.println("Institue name : " + instituteName);
				System.out.println();
				
			}

			
			//static method to update name of Institute 
			static void updateInstituteName(String newInstituteName) {
				
				instituteName = newInstituteName;
			}
			
			
			
			
			
			public static void main(String[] main) {
				
				//created objects for Course
				Course course1 = new Course("B.tech" , 4 , 150000);
				Course course2 = new Course("MBA" , 2 , 175000);
				
				//calling instance method using object
				course1.displayCourseDetails();
				course2.displayCourseDetails();
				
				//update institute name
				Course.updateInstituteName("RGPV University");
				
				//Display updated Institute name
				System.out.println("Updated Institue Name : " + Course.instituteName);
				
			}
}
