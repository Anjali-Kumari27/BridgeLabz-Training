package com.lambdaexpression.studentschoolsys;

public class WelcomeMsg {
    public static void main(String[] args) {

        // lambda expression
        Welcome w = (name) -> System.out.println("Welcome to the school, " + name);

        w.message("Anjali");
    }
}
