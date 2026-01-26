package com.annotations.customannotation;

public class TaskManager {

    // Applying custom annotation on method
    @TaskInfo(priority = "High", assignedTo = "Anjali")
    public void completeTask() {

        System.out.println("Task is being completed");
    }
}

