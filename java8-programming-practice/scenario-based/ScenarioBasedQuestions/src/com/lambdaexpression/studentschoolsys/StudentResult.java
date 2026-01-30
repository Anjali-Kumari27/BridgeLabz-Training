package com.lambdaexpression.studentschoolsys;

public class StudentResult {
    public static void main(String[] args) {

        Result r = (marks) -> marks >= 40;

        int marks = 55;

        if (r.isPass(marks)) {
            System.out.println("Student is PASS");
        } else {
            System.out.println("Student is FAIL");
        }
    }
}

