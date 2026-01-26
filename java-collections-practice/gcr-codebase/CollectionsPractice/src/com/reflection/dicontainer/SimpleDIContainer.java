package com.reflection.dicontainer;

import java.lang.reflect.Field;

// Simple DI Container using Reflection
public class SimpleDIContainer {

    // Create an instance of the class and inject dependencies
    public static <T> T getInstance(Class<T> clazz) {
        try {
            // Create main object
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Iterate all fields
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                // Check if field is annotated with @Inject
                if (field.isAnnotationPresent(Inject.class)) {
                    field.setAccessible(true);

                    // Create an instance of the dependency
                    Object dependency = field.getType().getDeclaredConstructor().newInstance();

                    // Inject the dependency
                    field.set(obj, dependency);
                }
            }

            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

