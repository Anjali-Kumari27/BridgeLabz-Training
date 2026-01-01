package com.inheritance.hierarchicalinheritance.schoolsystem;

public class UsePerson {
	public static void main(String[] args) {

        Teacher teacher = new Teacher("Anita", 35, "Mathematics");
        Student student = new Student("Rahul", 16, "10th Grade");
        Staff staff = new Staff("Suresh", 40, "Administration");

        System.out.println("---- Teacher ----");
        teacher.displayBasicInfo();
        teacher.displayRole();

        System.out.println("\n---- Student ----");
        student.displayBasicInfo();
        student.displayRole();

        System.out.println("\n---- Staff ----");
        staff.displayBasicInfo();
        staff.displayRole();
    }

}
