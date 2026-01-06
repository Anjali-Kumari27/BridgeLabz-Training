package com.campusconnectcollegeinformation;

/*CampusConnect – College Information System"
Story: Your university launches CampusConnect, a portal to manage students, teachers, and
courses. You're developing the academic module.
Requirements:
● Person (base class): common fields like name, email, id.
● Student and Faculty extend Person (use inheritance).
● ICourseActions interface with methods like enrollCourse() and dropCourse().
● Course class has a list of students and a faculty assigned.
● Use constructors to initialize students and courses.
● Use access modifiers: student grades must be private.
● Use operators to calculate GPA based on grades.
● Polymorphism: printDetails() works differently for Student and Faculty.
*/


import java.util.ArrayList;
import java.util.Scanner;

public class UseCampusConnect {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== Welcome to CampusConnect =====");

        // Faculty
        System.out.print("Enter Faculty Name: ");
        String fname = input.nextLine();
        System.out.print("Enter Faculty Email: ");
        String femail = input.nextLine();
        System.out.print("Enter Faculty ID: ");
        int fid = input.nextInt();
        input.nextLine();
        Faculty faculty = new Faculty(fname, femail, fid);

        ArrayList<Student> allStudents = new ArrayList<>();
        ArrayList<Course> allCourses = new ArrayList<>();

        boolean runApp = true;

        while (runApp) {

            System.out.println("\nSelect Option:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student in Course");
            System.out.println("4. Drop Student from Course");
            System.out.println("5. Assign Course to Faculty");
            System.out.println("6. Show Details");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1: // Add student
                    System.out.print("Enter Student Name: ");
                    String sname = input.nextLine();
                    System.out.print("Enter Student Email: ");
                    String semail = input.nextLine();
                    System.out.print("Enter Student ID: ");
                    int sid = input.nextInt();
                    input.nextLine();
                    Student student = new Student(sname, semail, sid);
                    allStudents.add(student);
                    System.out.println("Student added: " + sname);
                    break;

                case 2: // Add course
                    System.out.print("Enter Course Name: ");
                    String cname = input.nextLine();
                    Course course = new Course(cname);
                    allCourses.add(course);
                    System.out.println("Course added: " + cname);
                    break;

                case 3: // Enroll student
                    if (allStudents.isEmpty() || allCourses.isEmpty()) {
                        System.out.println("Add students and courses first!");
                        break;
                    }

                    System.out.println("Select Student ID:");
                    for (Student s : allStudents) {
                        System.out.println(s.id + ": " + s.name);
                    }
                    int enrollSid = input.nextInt();
                    input.nextLine();

                    System.out.println("Select Course:");
                    for (int i = 0; i < allCourses.size(); i++) {
                        System.out.println((i + 1) + ": " + allCourses.get(i).getCourseName());
                    }
                    int courseIndex = input.nextInt() - 1;
                    input.nextLine();

                    Student enrollStudent = null;
                    for (Student s : allStudents) {
                        if (s.id == enrollSid) enrollStudent = s;
                    }

                    if (enrollStudent != null && courseIndex >= 0 && courseIndex < allCourses.size()) {
                        enrollStudent.enrollCourse(allCourses.get(courseIndex));
                    } else {
                        System.out.println("Invalid selection.");
                    }
                    break;

                case 4: // Drop student
                    if (allStudents.isEmpty() || allCourses.isEmpty()) {
                        System.out.println("Add students and courses first!");
                        break;
                    }

                    System.out.println("Select Student ID to drop:");
                    for (Student s : allStudents) {
                        System.out.println(s.id + ": " + s.name);
                    }
                    int dropSid = input.nextInt();
                    input.nextLine();

                    System.out.println("Select Course to drop:");
                    for (int i = 0; i < allCourses.size(); i++) {
                        System.out.println((i + 1) + ": " + allCourses.get(i).getCourseName());
                    }
                    int dropIndex = input.nextInt() - 1;
                    input.nextLine();

                    Student dropStudent = null;
                    for (Student s : allStudents) {
                        if (s.id == dropSid) dropStudent = s;
                    }

                    if (dropStudent != null && dropIndex >= 0 && dropIndex < allCourses.size()) {
                        dropStudent.dropCourse(allCourses.get(dropIndex));
                    } else {
                        System.out.println("Invalid selection.");
                    }
                    break;

                case 5: // Assign course to faculty
                    if (allCourses.isEmpty()) {
                        System.out.println("Add courses first!");
                        break;
                    }
                    System.out.println("Select Course to assign:");
                    for (int i = 0; i < allCourses.size(); i++) {
                        System.out.println((i + 1) + ": " + allCourses.get(i).getCourseName());
                    }
                    int assignIndex = input.nextInt() - 1;
                    input.nextLine();

                    if (assignIndex >= 0 && assignIndex < allCourses.size()) {
                        faculty.assignCourse(allCourses.get(assignIndex));
                        System.out.println("Course assigned to " + faculty.name);
                    } else {
                        System.out.println("Invalid selection.");
                    }
                    break;

                case 6: // Show details
                    faculty.printDetails();
                    System.out.println("\n========= Students ========");
                    for (Student s : allStudents) {
                        s.printDetails();
                    }
                    System.out.println("\n========== Courses ==========");
                    for (Course c : allCourses) {
                        c.printCourseDetails();
                    }
                    break;

                case 7: // Exit
                    runApp = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        input.close();
        System.out.println("Exiting CampusConnect...");
    }
}
