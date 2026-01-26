package com.reflection.methodexecution;

public class MathOperations {

    public void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public void multiplyNumbers(int a, int b) {
        int product = a * b;
        System.out.println("Product: " + product);
    }

    public void longTask() {
        // Simulate a long task
        try {
            Thread.sleep(500); // sleep for 500 ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Long task completed");
    }
}

