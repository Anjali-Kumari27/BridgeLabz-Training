package com.annotations.importantmethod;
import java.lang.reflect.Method;

public class UseImportantMethod {

    public static void main(String[] args) {

        // Getting Class object using reflection
        Class<ServiceTasks> cls = ServiceTasks.class;

        // Getting all methods of the class
        Method[] methods = cls.getDeclaredMethods();

        // Loop through all methods
        for (Method method : methods) {

            // Check if method has ImportantMethod annotation
            if (method.isAnnotationPresent(ImportantMethod.class)) {

                // Get annotation object
                ImportantMethod im = method.getAnnotation(ImportantMethod.class);

                // Print method name and importance level
                System.out.println(
                    "Method: " + method.getName() +
                    ", Level: " + im.level()
                );
            }
        }
    }
}
