package com.reflection.staticfields;

public class Configuration {
    private static String API_KEY = "DEFAULT_KEY";

    // Optional: public method to print key
    public static void showApiKey() {
        System.out.println("API_KEY: " + API_KEY);
    }
}

