package com.reflection.invokeprivatemethod;

import java.lang.reflect.Method;

public class UseInvokePrivateMethod {
    public static void main(String[] args) {
        try {
            // Create Calculator object
            Calculator calc = new Calculator();

            // Get Class object
            Class<?> cls = calc.getClass();

            // Access private method "multiply" with parameter types int, int
            Method multiplyMethod = cls.getDeclaredMethod("multiply", int.class, int.class);

            // Make private method accessible
            multiplyMethod.setAccessible(true);

            // Invoke the method dynamically
            int result = (int) multiplyMethod.invoke(calc, 6, 7);

            // Display result
            System.out.println("Multiplication Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
