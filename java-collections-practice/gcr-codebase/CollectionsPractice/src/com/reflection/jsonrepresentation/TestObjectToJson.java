package com.reflection.jsonrepresentation;


import java.lang.reflect.Field;
import java.util.Scanner;

public class TestObjectToJson{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Dynamically create User object
            Class<?> cls = User.class;
            Object obj = cls.getDeclaredConstructor().newInstance(); // use no-arg constructor

            // Loop through all fields to take input
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                System.out.print("Enter " + field.getName() + " (" + field.getType().getSimpleName() + "): ");
                String input = sc.nextLine();

                // Set field value based on type
                if (field.getType() == int.class) {
                    field.set(obj, Integer.parseInt(input));
                } else { // treat everything else as String
                    field.set(obj, input);
                }
            }

            // Convert object to JSON
            String json = ObjectToJson.toJson(obj);
            System.out.println("\nGenerated JSON:");
            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
