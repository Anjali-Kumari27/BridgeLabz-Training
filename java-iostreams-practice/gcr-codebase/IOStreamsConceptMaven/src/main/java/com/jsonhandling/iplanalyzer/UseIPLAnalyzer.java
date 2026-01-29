package com.jsonhandling.iplanalyzer;

public class UseIPLAnalyzer {

    public static void main(String[] args) {

        try {
            JsonCensorProcessor.processJson(
                    "C:\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConceptMaven\\src\\main\\resources\\ipl_matches.json",
                    "C:\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConceptMaven\\src\\main\\resources\\ipl_matches_censored.json"
            );

            CsvCensorProcessor.processCsv(
                    "C:\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConceptMaven\\src\\main\\resources\\ipl_matches.csv",
                    "C:\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConceptMaven\\src\\main\\resources\\ipl_matches_censored.csv"
            );

            System.out.println("Censorship completed successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
