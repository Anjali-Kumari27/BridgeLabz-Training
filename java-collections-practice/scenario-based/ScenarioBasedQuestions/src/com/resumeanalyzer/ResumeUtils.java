package com.resumeanalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResumeUtils {

    // Regex patterns
    static Pattern emailPattern =
            Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com");

    static Pattern phonePattern =
            Pattern.compile("\\b\\d{10}\\b");

    static String[] keywords = {"Java", "Python", "Spring"};

    // Read resume file using I/O Streams
    public static String readFile(File file) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            content.append(line).append(" ");
        }
        br.close();

        return content.toString();
    }

    // Extract email or phone using Regex
    public static String extract(Pattern pattern, String text) {

        Matcher matcher = pattern.matcher(text);
        return matcher.find() ? matcher.group() : null;
    }

    // Extract matching skills
    public static List<String> extractSkills(String text) {

        List<String> matched = new ArrayList<>();

        for (String skill : keywords) {
            if (text.toLowerCase().contains(skill.toLowerCase())) {
                matched.add(skill);
            }
        }
        return matched;
    }
}
