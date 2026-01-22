package com.exceptionhandling.exceptionpropogation;

public class Propogation {

    // Method 1: Causes ArithmeticException
    static void method1() {
        // This will cause ArithmeticException (divide by zero)
        int result = 10 / 0;
    }

    // Method 2: Calls method1()
    static void method2() {
        method1(); // Exception propagates from here
    }

    public static void main(String[] args) {

        try {
            // Calling method2()
            method2();
        }
        // Handling propagated exception in main()
        catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
