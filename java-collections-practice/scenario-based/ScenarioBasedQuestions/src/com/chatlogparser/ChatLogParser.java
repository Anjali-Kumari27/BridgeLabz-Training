package com.chatlogparser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogParser {

    // Regex to parse line: [HH:MM AM/PM] User: message
    static Pattern logPattern = Pattern.compile("\\[(.*?)\\]\\s+(.*?):\\s+(.*)");

    // Reads chat log file and returns user → messages map
    public static Map<String, List<String>> parseChatLog(String filePath, MessageFilter<String> filter) {

        Map<String, List<String>> userMessages = new TreeMap<>(); // sorted by user alphabetically

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                Matcher matcher = logPattern.matcher(line);

                if (matcher.matches()) {
                    String timestamp = matcher.group(1);
                    String user = matcher.group(2);
                    String message = matcher.group(3);

                    // Apply filter (skip idle chat)
                    if (filter != null && !filter.filter(message)) continue;

                    // Add message to user's list
                    userMessages.computeIfAbsent(user, k -> new ArrayList<>())
                                .add("[" + timestamp + "] " + message);
                } else {
                    System.out.println("Skipped invalid line: " + line);
                }
            }

        } catch (Exception e) {
            System.out.println("Error reading chat log: " + e.getMessage());
        }

        return userMessages;
    }
}
