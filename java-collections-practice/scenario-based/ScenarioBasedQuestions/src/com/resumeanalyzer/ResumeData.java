package com.resumeanalyzer;

import java.util.List;

public class ResumeData {

    String email;
    String phone;
    List<String> skills;
    int skillCount;

    // Constructor
    public ResumeData(String email, String phone, List<String> skills) {
        this.email = email;
        this.phone = phone;
        this.skills = skills;
        this.skillCount = skills.size();
    }
}

