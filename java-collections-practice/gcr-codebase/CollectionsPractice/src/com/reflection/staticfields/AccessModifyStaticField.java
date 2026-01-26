package com.reflection.staticfields;

import java.lang.reflect.Field;

public class AccessModifyStaticField {
    public static void main(String[] args) {
        try {
            // Get Class object
            Class<?> cls = Configuration.class;

            // Access private static field "API_KEY"
            Field apiKeyField = cls.getDeclaredField("API_KEY");

            // Make private field accessible
            apiKeyField.setAccessible(true);

            // Get current value (static fields use null as object)
            String oldKey = (String) apiKeyField.get(null);
            System.out.println("Old API_KEY: " + oldKey);

            // Modify static field
            apiKeyField.set(null, "NEW_SECURE_KEY");

            // Get modified value
            String newKey = (String) apiKeyField.get(null);
            System.out.println("New API_KEY: " + newKey);

            // Optional: call method to verify
            Configuration.showApiKey();

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

