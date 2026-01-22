package com.variousinterfaces.additionalquestion.votingsystem;

import java.util.*;

public class VotingManager {

    // Stores votes (fast access)
    HashMap<String, Integer> hashMap = new HashMap<>();

    // Maintains insertion order
    LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

    // Displays results in sorted order (by candidate name)
    TreeMap<String, Integer> treeMap = new TreeMap<>();

    // Add vote for a candidate
    void addVote(String name, int votes) {

        hashMap.put(name, votes);
        linkedHashMap.put(name, votes);
        treeMap.put(name, votes);
    }

    // Display votes from HashMap
    void showHashMapVotes() {
        System.out.println("Votes (HashMap):");
        for (String key : hashMap.keySet()) {
            System.out.println(key + " => " + hashMap.get(key));
        }
    }

    // Display votes in insertion order
    void showLinkedHashMapVotes() {
        System.out.println("Votes (LinkedHashMap - Insertion Order):");
        for (String key : linkedHashMap.keySet()) {
            System.out.println(key + " => " + linkedHashMap.get(key));
        }
    }

    // Display votes in sorted order
    void showTreeMapVotes() {
        System.out.println("Votes (TreeMap - Sorted Order):");
        for (String key : treeMap.keySet()) {
            System.out.println(key + " => " + treeMap.get(key));
        }
    }
}

