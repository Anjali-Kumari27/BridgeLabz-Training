package com.generics.airesumescreeningsystem;

public class ResumeUtility {

    public static <T extends JobRole> void process(Resume<T> resume) {
        resume.processResume();
    }
}

