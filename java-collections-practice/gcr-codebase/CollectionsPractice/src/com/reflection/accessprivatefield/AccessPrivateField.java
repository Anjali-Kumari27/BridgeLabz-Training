package com.reflection.accessprivatefield;

import java.lang.reflect.Field;

public class AccessPrivateField {
    public static void main(String[] args) {
        try {
            // Create Person object
            Person person = new Person();

            // Get Class object of Person
            Class<?> cls = person.getClass();

            // Access private field "age"
            Field ageField = cls.getDeclaredField("age");

            // Make private field accessible
            ageField.setAccessible(true);

            // Get current value
            int oldAge = (int) ageField.get(person);
            System.out.println("Old Age: " + oldAge);

            // Modify field value
            ageField.set(person, 40);

            // Get modified value
            int newAge = (int) ageField.get(person);
            System.out.println("New Age: " + newAge);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
