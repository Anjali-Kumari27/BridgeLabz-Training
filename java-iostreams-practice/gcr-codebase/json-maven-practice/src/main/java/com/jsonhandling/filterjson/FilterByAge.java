package com.jsonhandling.filterjson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByAge {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Load JSON array from resources
            InputStream inputStream = FilterByAge.class.getClassLoader()
                                        .getResourceAsStream("users.json");

            if (inputStream == null) {
                System.out.println("users.json not found!");
                return;
            }

            // Step 1: Parse JSON array into List<User>
            List<Student> users = mapper.readValue(inputStream, new TypeReference<List<Student>>() {});

            // Step 2: Filter users with age > 25
            List<Student> filteredUsers = users.stream()
                                            .filter(user -> user.getAge() > 25)
                                            .collect(Collectors.toList());

            // Step 3: Print filtered users
            System.out.println("Users with age > 25:");
            filteredUsers.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
