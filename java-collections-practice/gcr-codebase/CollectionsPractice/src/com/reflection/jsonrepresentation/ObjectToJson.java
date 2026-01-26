package com.reflection.jsonrepresentation;

import java.lang.reflect.Field;

public class ObjectToJson {

    // Converts any object to a JSON-like string
    public static String toJson(Object obj) {
        if (obj == null) return "null";

        StringBuilder json = new StringBuilder("{");

        Field[] fields = obj.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true); // allow access to private fields
            try {
                String name = field.getName();
                Object value = field.get(obj);

                // Add field name
                json.append("\"").append(name).append("\":");

                // Add value
                if (value == null) {
                    json.append("null");
                } else if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else if (value instanceof Character) {
                    json.append("\"").append(value).append("\"");
                } else { // numbers, boolean
                    json.append(value);
                }

                // Add comma if not last field
                if (i < fields.length - 1) {
                    json.append(", ");
                }

            } catch (IllegalAccessException e) {
                System.out.println("Failed to access field: " + field.getName());
            }
        }

        json.append("}");
        return json.toString();
    }
}
