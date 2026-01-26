package com.reflection.getclassinfo;

import java.util.Scanner;
import java.lang.reflect.*;

public class ClassInformation {
	public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter fully qualified class name (with package if any): ");
            String className = input.nextLine();

            // Get Class object
            Class<?> cls = Class.forName(className);

            // Display class name
            System.out.println("\nClass Name: " + cls.getName());

            // Display Fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                System.out.println(Modifier.toString(f.getModifiers()) + " " + f.getType().getSimpleName() + " " + f.getName());
            }

            // Display Methods
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method m : methods) {
                System.out.print(Modifier.toString(m.getModifiers()) + " " + m.getReturnType().getSimpleName() + " " + m.getName() + "(");
                Class<?>[] params = m.getParameterTypes();
                for (int i = 0; i < params.length; i++) {
                    System.out.print(params[i].getSimpleName());
                    if (i < params.length - 1) System.out.print(", ");
                }
                System.out.println(")");
            }

            // Display Constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> c : constructors) {
                System.out.print(Modifier.toString(c.getModifiers()) + " " + c.getName() + "(");
                Class<?>[] params = c.getParameterTypes();
                for (int i = 0; i < params.length; i++) {
                    System.out.print(params[i].getSimpleName());
                    if (i < params.length - 1) System.out.print(", ");
                }
                System.out.println(")");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        }
    }

}
