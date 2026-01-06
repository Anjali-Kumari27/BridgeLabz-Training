package com.edumentor;

public class ShortCourse implements ICertifiable {
    private double percentage;

    public ShortCourse(double percentage) {
        this.percentage = percentage;
    }

    //genrate certificate on the basis of percentage he or she gets
    @Override
    public void generateCertificate() {
        if (percentage >= 50) {
            System.out.println("Short Course Certificate Generated");
        } else {
            System.out.println("Not eligible for Short Course Certificate");
        }
    }
}

