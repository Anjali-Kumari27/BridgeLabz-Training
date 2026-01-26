package com.annotations.todoannotation;

import java.lang.reflect.Method;

public class UseToDo {

    public static void main(String[] args) {

        // Getting Class object
        Class<ProjectTasks> cls = ProjectTasks.class;

        // Getting all methods of the class
        Method[] methods = cls.getDeclaredMethods();

        // Loop through each method
        for (Method method : methods) {

            // Check if Todo annotation is present
            if (method.isAnnotationPresent(Todo.class)) {

                // Get Todo annotation object
                Todo todo = method.getAnnotation(Todo.class);

                // Print task details
                System.out.println("Method Name : " + method.getName());
                System.out.println("Task        : " + todo.task());
                System.out.println("Assigned To : " + todo.assignedTo());
                System.out.println("Priority    : " + todo.priority());
                System.out.println("--------------------------------------------");
            }
        }
    }
}
