package com.jsonhandling.iplanalyzer;

public class CensorUtil {

    public static String maskTeamName(String team) {
        if (team == null || team.isEmpty()) return team;
        String firstWord = team.split(" ")[0];
        return firstWord + " ***";
    }

    public static String redactPlayer() {
        return "REDACTED";
    }
}
