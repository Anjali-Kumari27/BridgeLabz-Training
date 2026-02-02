package com.functionalinterface.consumer.studentdetails;
/*
 * Scenario 3: Consumer (Perform Action)

   1.Print student details using Consumer.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StudentSystem  {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Anjali", 101, 85));
        students.add(new Student("Ananya", 102, 78));
        students.add(new Student("Devika", 103, 90));

        // Consumer to print student details
        Consumer<Student> printStudent = s -> {
            System.out.println("Name   : " + s.name);
            System.out.println("RollNo : " + s.rollNo);
            System.out.println("Marks  : " + s.marks);
            System.out.println("-------------------");
        };

        // Using Consumer
        students.forEach(printStudent);
    }
}
