package com.reflection.methodexecution;

import java.lang.reflect.Method;

public class MethodExecutionTimer {

    // Measures execution time of all public methods of a class
    public static void measureExecutionTime(Object obj) {
        Class<?> cls = obj.getClass();

        // Get all public methods
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            try {
                method.setAccessible(true); // access private/protected methods if any

                // Start time
                long startTime = System.nanoTime();

                // Invoke method dynamically
                // Note: assuming no-arg methods for simplicity here
                if (method.getParameterCount() == 0) {
                    method.invoke(obj);
                }

                // End time
                long endTime = System.nanoTime();

                long duration = endTime - startTime; // duration in nanoseconds
                System.out.println("Execution time of " + method.getName() + ": " + duration + " ns");

            } catch (Exception e) {
                System.out.println("Cannot invoke method: " + method.getName());
            }
        }
    }
}
