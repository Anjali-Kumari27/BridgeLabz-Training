package com.annotations.jsonfield;

import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object obj) throws IllegalAccessException {

        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {

            if (field.isAnnotationPresent(JsonField.class)) {

                field.setAccessible(true);

                JsonField annotation = field.getAnnotation(JsonField.class);
                String key = annotation.name();
                Object value = field.get(obj);

                json.append("\"")
                    .append(key)
                    .append("\":\"")
                    .append(value)
                    .append("\",");
            }
        }

        // Remove last comma
        json.deleteCharAt(json.length() - 1);

        json.append("}");
        return json.toString();
    }
}
