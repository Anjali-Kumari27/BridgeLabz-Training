package com.reflection.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class UseMethodInvocation {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            // Create MathOperations object
            MathOperations mathOps = new MathOperations();
            Class<?> cls = mathOps.getClass();

            // Ask user for method name
            System.out.print("Enter method name (add, subtract, multiply, divide): ");
            String methodName = input.nextLine();

            // Ask for two integer arguments
            System.out.print("Enter first number: ");
            int a = input.nextInt();
            System.out.print("Enter second number: ");
            int b = input.nextInt();

            // Get Method object dynamically
            Method method = cls.getMethod(methodName, int.class, int.class);

            // Invoke method dynamically
            int result = (int) method.invoke(mathOps, a, b);

            System.out.println("Result: " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("Method not found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

