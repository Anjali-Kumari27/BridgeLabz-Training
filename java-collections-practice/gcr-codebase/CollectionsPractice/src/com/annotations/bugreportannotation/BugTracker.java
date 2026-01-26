package com.annotations.bugreportannotation;

public class BugTracker {

    // Applying BugReport annotation twice on same method
    @BugReport(description = "NullPointerException occurs")
    @BugReport(description = "UI freezes on submit button")
    public void submitForm() {

        System.out.println("Form submitted");
    }
}
