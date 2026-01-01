package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class PaidOnlineCourse extends OnlineCourse {

    private double fee;
    private double discount;   // in percentage

    // Constructor
    public PaidOnlineCourse(String courseName, int duration,
                            String platform, boolean isRecorded,
                            double fee, double discount) {

        super(courseName, duration, platform, isRecorded); // call OnlineCourse constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Overriding displayCourseDetails()
    @Override
    void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Course Fee  : ₹" + fee);
        System.out.println("Discount    : " + discount + "%");
        System.out.println("Final Price : ₹" + (fee - (fee * discount / 100)));
    }

    // Main method
    public static void main(String[] args) {

        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Full Stack",
                120,
                "Coursera",
                true,
                12000,
                20
        );

        course.displayCourseDetails();
    }
}