package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class OnlineCourse extends Course {

    protected String platform;
    protected boolean isRecorded;

    // Constructor
    public OnlineCourse(String courseName, int duration,
                        String platform, boolean isRecorded) {

        super(courseName, duration);   // call Course constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding displayCourseDetails()
    @Override
    void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform    : " + platform);
        System.out.println("Recorded    : " + (isRecorded ? "Yes" : "No"));
    }
}