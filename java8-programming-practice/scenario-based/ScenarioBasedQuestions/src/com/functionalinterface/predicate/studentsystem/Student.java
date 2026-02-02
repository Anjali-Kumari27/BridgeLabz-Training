package com.functionalinterface.predicate.studentsystem;

public class Student {
	protected String studentName;
	protected int studentID;
	protected double attendance;
	
	public Student(String studentName, int studentID, double attendance) {
		this.studentName = studentName;
		this.studentID = studentID;
		this.attendance = attendance;
	}
	
	@Override
	public String toString() {
		return "[ Student Name : " +studentName + " | ID : " + studentID + " | Attendance : "
				+ attendance + " ]";
	}

}
