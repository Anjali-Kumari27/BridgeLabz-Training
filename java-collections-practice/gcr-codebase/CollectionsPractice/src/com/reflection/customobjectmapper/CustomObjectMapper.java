package com.reflection.customobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create instance using no-arg constructor
            T obj = clazz.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                try {
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true);

                    // Convert type if necessary
                    Class<?> fieldType = field.getType();
                    if (fieldType == int.class && fieldValue instanceof String) {
                        field.set(obj, Integer.parseInt((String) fieldValue));
                    } else if (fieldType == double.class && fieldValue instanceof String) {
                        field.set(obj, Double.parseDouble((String) fieldValue));
                    } else {
                        field.set(obj, fieldValue);
                    }
                } catch (NoSuchFieldException e) {
                    System.out.println("No such field: " + fieldName);
                }
            }
            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

