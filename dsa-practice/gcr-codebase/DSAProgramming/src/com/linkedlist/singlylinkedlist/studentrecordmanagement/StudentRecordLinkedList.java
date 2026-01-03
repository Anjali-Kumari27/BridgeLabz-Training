package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentRecordLinkedList {
	
	// Head of the linked list (first student record)
	private StudentNode head;
	
	//adding data at beginning
	public void addAtBeginning(String name , int age , int rollNumber , char grade) {
		StudentNode node = new StudentNode(name, age, rollNumber, grade);
		
		// Point new node to current head
		node.next = head;
		
		// Make new node the new head
		head = node;
	}
	
	//adding data at end
	public void addAtEnd(String name , int age , int rollNumber , char grade) {
		StudentNode node = new StudentNode(name, age, rollNumber, grade);
		
		if (head == null) {
			// If list is empty, new node becomes head
			head = node;
			
			return ;
		}
		
		// Traverse to the end of the list
		StudentNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		// Append new node at the end
		temp.next = node;
	}
	
	//method to add student data at specific position
	public void addAtPosition(int position, String name, int age, int rollNumber, char grade) {
		if(position <= 0) {
			System.out.println("Invalid Position");
			return;
		}
		
		if (position == 1) {
            addAtBeginning( name, age,rollNumber,grade);
            return;
        }

        StudentNode newNode = new StudentNode(name, age,rollNumber,grade);
        StudentNode temp = head;

        // Move to the node before the desired position
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        // Link new node to the next nod
        newNode.next = temp.next;
        temp.next = newNode;  // Link previous node to new node
    }

    //Delete by Roll Number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.rollNumber == rollNumber) {
        	// First node matches
        	// Remove head
            head = head.next;
            return;
        }

        StudentNode temp = head;
        // Traverse to find the node before the one to delete
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("*****Student not found*****");
        } else {
            temp.next = temp.next.next; // unlink node
        }
        System.out.println("\nDeleted Successfully");
    }

    // Search by Roll Number
    public void searchByRollNumber(int rollNumber) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("\n*****Student Found*****");
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("\n*****Student not found*****");
    }

    //Update Grade by Roll Number
    public void updateGrade(int rollNumber, char newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("\nGrade updated successfully of rollNumber " + rollNumber + " with grade " + newGrade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("\n*****Student not found*****");
    }

    // method to Display All Students
    public void displayAll() {
        if (head == null) {
            System.out.println("\nNo student records available");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            displayStudent(temp);
            temp = temp.next;
        }
    }

    // Helper method (Modular Code)
    private void displayStudent(StudentNode student) {
        System.out.println(
            "Roll No: " + student.rollNumber +
            ", Name: " + student.name +
            ", Age: " + student.age +
            ", Grade: " + student.grade
        );
    }
}
