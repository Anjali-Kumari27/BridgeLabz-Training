package com.reflection.methodexecution;

public class TestMethodTimer {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        System.out.println("Measuring method execution times:\n");
        MethodExecutionTimer.measureExecutionTime(mathOps);
    }
}

