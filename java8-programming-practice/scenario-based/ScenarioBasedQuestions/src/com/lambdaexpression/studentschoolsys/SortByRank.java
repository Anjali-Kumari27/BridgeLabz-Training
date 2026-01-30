package com.lambdaexpression.studentschoolsys;

import java.util.ArrayList;
import java.util.List;

public class SortByRank {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Devika", 20, 70, 3));
        students.add(new Student("Anjali", 22, 85, 1));
        students.add(new Student("Aarya", 19, 60, 2));

        // lambda for sorting by rank
        students.sort((s1, s2) -> s1.rank - s2.rank);

        for (Student s : students) {
            System.out.println(s.name + " - Rank: " + s.rank);
        }
    }
}
