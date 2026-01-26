package com.annotations.loggingmethodexecutiontime;

import java.lang.reflect.Method;

public class UseLoginExecution {

    public static void main(String[] args) throws Exception {

        // Create object of class
        PerformanceTest test = new PerformanceTest();

        // Get all methods of the class
        Method[] methods = test.getClass().getDeclaredMethods();

        // Loop through all methods
        for (Method method : methods) {

            // Check if LogExecutionTime annotation is present
            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                // Start time before method execution
                long startTime = System.nanoTime();

                // Invoke method using reflection
                method.invoke(test);

                // End time after method execution
                long endTime = System.nanoTime();

                // Calculate execution time
                long executionTime = endTime - startTime;

                // Print method name and time taken
                System.out.println(
                    method.getName() + " executed in " +
                    executionTime + " nanoseconds"
                );
            }
        }
    }
}
