package com.annotations.customannotation;

import java.lang.reflect.Method;

public class UseCustomAnnotation {

    public static void main(String[] args) throws Exception {

        // Creating object of TaskManager
        TaskManager manager = new TaskManager();

        // Getting Method object using reflection
        Method method = manager.getClass().getMethod("completeTask");

        // Checking if TaskInfo annotation is present
        if (method.isAnnotationPresent(TaskInfo.class)) {

            // Getting annotation object
            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

            // Printing annotation values
            System.out.println("Priority: " + taskInfo.priority());
            System.out.println("Assigned To: " + taskInfo.assignedTo());
        }

        // Calling the actual method
        manager.completeTask();
    }
}
