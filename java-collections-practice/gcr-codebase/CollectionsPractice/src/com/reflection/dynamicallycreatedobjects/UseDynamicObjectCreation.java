package com.reflection.dynamicallycreatedobjects;

import java.lang.reflect.Constructor;

public class UseDynamicObjectCreation {
    public static void main(String[] args) {
        try {
            // Get Class object
            Class<?> cls = Student.class;

            // Get constructor with parameters String and int
            Constructor<?> constructor = cls.getConstructor(String.class, int.class);

            // Create instance dynamically using newInstance()
            Student student = (Student) constructor.newInstance("Anjali", 22);

            // Call method to display details
            student.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

