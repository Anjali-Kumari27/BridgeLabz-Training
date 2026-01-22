package com.variousinterfaces.additionalquestion.votingsystem;

public class Candidate {

    String name;
    int votes;

    // Constructor
    public Candidate(String name, int votes) {
        this.name = name;
        this.votes = votes;
    }

    // Display candidate details
    public String toString() {
        return name + " => " + votes;
    }
}

