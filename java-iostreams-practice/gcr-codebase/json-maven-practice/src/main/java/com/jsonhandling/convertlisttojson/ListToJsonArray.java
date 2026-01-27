package com.jsonhandling.convertlisttojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

public class ListToJsonArray {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Step 1: Create a list of User objects
            List<User> users = Arrays.asList(
                    new User(101, "Anjali", "kr7anjali@gmail.com", Arrays.asList("Java", "Spring")),
                    new User(102, "Devika", "devika03@example.com", Arrays.asList("Python", "Django")),
                    new User(103, "Ananya", "ananya@example.com", Arrays.asList("JavaScript", "React"))
            );

            // Step 2: Convert list to JSON array string
            String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);

            // Step 3: Print JSON array
            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

