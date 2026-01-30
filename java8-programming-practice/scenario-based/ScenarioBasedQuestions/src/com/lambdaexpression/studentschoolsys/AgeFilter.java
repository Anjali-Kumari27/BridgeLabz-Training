package com.lambdaexpression.studentschoolsys;

import java.util.ArrayList;
import java.util.List;

public class AgeFilter {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Devika", 20, 70, 3));
        students.add(new Student("Anjali", 22, 85, 1));
        students.add(new Student("Aarya", 17, 60, 2));

        // lambda to filter age
        students.forEach(s -> {
            if (s.age > 18) {
                System.out.println(s.name + " is above 18");
            }
        });
    }
}

