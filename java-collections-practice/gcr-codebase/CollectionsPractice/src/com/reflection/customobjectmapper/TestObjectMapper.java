package com.reflection.customobjectmapper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestObjectMapper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Object> properties = new HashMap<>();

        System.out.print("Enter name: ");
        properties.put("name", input.nextLine());

        System.out.print("Enter age: ");
        properties.put("age", input.nextLine()); // store as string, mapper converts to int

        System.out.print("Enter email: ");
        properties.put("email", input.nextLine());

        // Create User object dynamically
        User user = CustomObjectMapper.toObject(User.class, properties);

        if (user != null) {
            System.out.println("\nUser object created dynamically:");
            user.display();
        }

        input.close();
    }
}
