package com.collectors.studentresultgrouping;
/*Student Result Grouping
○ Scenario: Group students by grade level and collect names.
○ Task: Use Collectors.groupingBy().
*/
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseStudentResultGroup {
	public static void main(String[] args) {

        //student data
        List<Student> students = Arrays.asList(
                new Student("Rajeev", "A"),
                new Student("Priya", "B"),
                new Student("Devika", "A"),
                new Student("Ananya", "C"),
                new Student("Himanshu", "B"),
                new Student("Tisa", "A"),
                new Student("Rahul", "C"),
                new Student("Anjali", "B")
        );

        // Group students by grade, collect only names
        Map<String, List<String>> groupedByGrade = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,                   // Key: grade
                        Collectors.mapping(Student::getName, Collectors.toList()) // Value: list of names
                ));

        // Print the grouped result
        System.out.println("\n==================================================");
        System.out.println("         Student Results Grouped by Grade           ");
        System.out.println("==================================================\n");
        groupedByGrade.forEach((grade, names) -> System.out.println(grade + ": " + names));

        //total number of students
        System.out.println("\nTotal Students: " + students.size());
	}

}
