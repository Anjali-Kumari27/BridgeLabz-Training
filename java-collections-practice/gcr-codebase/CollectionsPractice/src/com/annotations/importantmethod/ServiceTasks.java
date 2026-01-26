package com.annotations.importantmethod;

public class ServiceTasks {

    // Important method with default level (HIGH)
    @ImportantMethod
    public void saveData() {
        System.out.println("Saving data...");
    }

    // Important method with custom level
    @ImportantMethod(level = "MEDIUM")
    public void updateData() {
        System.out.println("Updating data...");
    }

    // Normal method (no annotation)
    public void viewData() {
        System.out.println("Viewing data...");
    }
}

