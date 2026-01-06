package com.edumentor;

public class FullTimeCourse implements ICertifiable {
    private double percentage;

    public FullTimeCourse(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public void generateCertificate() {
        if (percentage >= 75) {
            System.out.println("🎓 Full-Time Course Certificate Generated");
        } else {
            System.out.println("❌ Not eligible for Full-Time Certificate");
        }
    }
}

