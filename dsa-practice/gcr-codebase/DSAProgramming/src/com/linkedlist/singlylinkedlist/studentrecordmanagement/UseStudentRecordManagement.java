package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class UseStudentRecordManagement {
	
	public static void main(String[] args) {

		//created object list  of StudentRecordLinkedList
        StudentRecordLinkedList list = new StudentRecordLinkedList();

        //Add student records
        list.addAtBeginning("Anjali", 401, 22,'A');
        list.addAtEnd("Riya", 402, 20, 'B');
        list.addAtEnd("Rahul", 403, 24, 'C');

        //adding "devika" at second position
        list.addAtPosition(2, "Devika", 408, 22 ,'A');

        System.out.println("\n================= All Student Records =====================\n");
        list.displayAll();

        //Search for student by roll number
        System.out.println("\n------------------------------------------------------------");
        System.out.println("Searching for Roll No 402:");
        list.searchByRollNumber(402);

        //Update grade of a student
        System.out.println("\n------------------------------------------------------------");
        System.out.println("Updating Grade:");
        list.updateGrade(403, 'B');

        //Delete a student record by roll number
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Deleting Roll No 403:");
        list.deleteByRollNumber(403);

        //Display final student records
        System.out.println("\n=========================================================");
        System.out.println("             Final Records                  ");
        System.out.println("=========================================================");
        list.displayAll();
        
    }

}
