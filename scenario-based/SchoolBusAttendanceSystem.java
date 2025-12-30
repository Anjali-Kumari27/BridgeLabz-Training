/*
 School Bus Attendance System 🚍
 - Stores names of 10 students
 - Uses for-each loop to check attendance
 - Asks user whether student is Present or Absent
*/


import java.util.Scanner;

public class SchoolBusAttendanceSystem {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Array storing names of 10 students
        String[] students = {
            "Ananya", "Riya", "Rahul", "Neha", "Karan",
            "Priya", "Suman", "Anjali", "Himanshu", "Pooja"
        };

        //to count number of present students and absentees
        int presentCount = 0;
        int absentCount = 0;

        System.out.println(" School Bus Attendance System\n");

        // for-each loop to check attendance
        for (String name : students) {

            System.out.print("Is " + name + " Present or Absent? : ");
            String status = input.nextLine();

            if (status.equalsIgnoreCase("Present")) {
                presentCount++;
            } 
            else if (status.equalsIgnoreCase("Absent")) {
                absentCount++;
            }

            // Confirmation output
            System.out.println(name + " marked as " + status);
            System.out.println("--------------------------------");
        }

        // Final attendance summary
        System.out.println("\n Attendance Summary");
        System.out.println("Total Present Students : " + presentCount);
        System.out.println("Total Absent Students  : " + absentCount);

        input.close();
    }
}
