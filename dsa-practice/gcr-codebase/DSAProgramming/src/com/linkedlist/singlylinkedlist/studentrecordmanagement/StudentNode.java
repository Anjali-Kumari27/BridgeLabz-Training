package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentNode {
	
	//Attributes
	String name;
	int rollNumber;
	int age;
	char grade;
	
	//pointer to point next node
	StudentNode next;
	
	//Constructor for  initializing 
	public StudentNode(String name, int rollNumber, int age, char grade) {
		
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.grade = grade;
		this.next = null;
	}
	
}
