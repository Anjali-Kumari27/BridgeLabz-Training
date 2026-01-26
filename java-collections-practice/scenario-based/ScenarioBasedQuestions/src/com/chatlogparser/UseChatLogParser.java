package com.chatlogparser;

/*
 * ChatLogParser – Messaging Pattern Analyzer
Story: A company wants to analyze employee chat logs for productivity. The logs are stored in
plain text files like:
[12:02 PM] John: Hey, the build failed again!
[12:03 PM] Mary: I’ll check the Jenkins pipeline.
Your task is to build ChatLogParser, a tool that:
● Reads chat logs using BufferedReader
● Uses Regex to extract timestamp, user, and message
● Stores results in a Map<String, List<String>> (user → messages)
● Filters out “idle chat” based on keyword list ("lol", "brb", etc.)
● Uses TreeMap to automatically sort users alphabetically
● Supports generic filtering rules using interfaces like MessageFilter<T>
 */
import java.util.*;

public class UseChatLogParser {

    public static void main(String[] args) {

        String filePath = "C:/Users/91743/Desktop/chatlog.txt";

        // Idle chat keywords
        List<String> idleKeywords = Arrays.asList("lol", "brb", "omg");

        // Implement MessageFilter using lambda
        MessageFilter<String> idleFilter = message -> {
            for (String word : idleKeywords) {
                if (message.toLowerCase().contains(word)) return false; // skip idle
            }
            return true; // include message
        };

        // Parse chat log
        Map<String, List<String>> userMessages = ChatLogParser.parseChatLog(filePath, idleFilter);

        // Display messages user-wise
        System.out.println("\n==============================");
        System.out.println(" CHAT LOG ANALYSIS ");
        System.out.println("==============================");

        for (String user : userMessages.keySet()) {
            System.out.println("\n" + user + ":");
            for (String msg : userMessages.get(user)) {
                System.out.println(msg);
            }
        }
    }
}

