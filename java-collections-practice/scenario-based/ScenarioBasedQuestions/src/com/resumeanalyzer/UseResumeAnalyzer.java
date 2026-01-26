package com.resumeanalyzer;

/*
 * ResumeAnalyzer – Smart Resume Filtering System
Story: At HireRight Technologies, HRs receive hundreds of resumes daily. An automated
system called ResumeAnalyzer is being developed to process .txt and .pdf resumes stored
in a folder.
The goal is to read each resume (using I/O Streams), extract contact details (email, phone)
using Regex, and index them into a Map<String, ResumeData>, where the key is the
candidate's email.
The system should support:
● Reading resumes from a folder
● Extracting keywords (Java, Python, Spring) using regex
● Storing candidates in a list sorted by keyword match count
● Skipping resumes with invalid formats using exception handling
 */
import java.io.File;
import java.util.*;

public class UseResumeAnalyzer {

    public static void main(String[] args) {

        File folder = new File("C:\\Users\\91743\\OneDrive\\Desktop\\resumes");

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Resume folder not found!");
            return;
        }

        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No resumes found!");
            return;
        }

        Map<String, ResumeData> resumeMap = new HashMap<>();
        List<ResumeData> resumeList = new ArrayList<>();

        for (File file : files) {

            try {
                if (!file.getName().endsWith(".txt")) {
                    throw new Exception("Invalid resume format");
                }

                String content = ResumeUtils.readFile(file);

                String email =
                        ResumeUtils.extract(ResumeUtils.emailPattern, content);
                String phone =
                        ResumeUtils.extract(ResumeUtils.phonePattern, content);

                if (email == null || phone == null) {
                    throw new Exception("Missing contact details");
                }

                List<String> skills =
                        ResumeUtils.extractSkills(content);

                ResumeData data =
                        new ResumeData(email, phone, skills);

                resumeMap.put(email, data);
                resumeList.add(data);

            } catch (Exception e) {
                System.out.println("Skipped " + file.getName()
                        + " : " + e.getMessage());
            }
        }

        resumeList.sort((a, b) -> b.skillCount - a.skillCount);

        System.out.println("\n=============================================");
        System.out.println("            Shortlisted Candidates             ");
        System.out.println("=============================================\n");
        for (ResumeData r : resumeList) {
            System.out.println(r.email + " | Skills: " + r.skills);
        }
    }
}
