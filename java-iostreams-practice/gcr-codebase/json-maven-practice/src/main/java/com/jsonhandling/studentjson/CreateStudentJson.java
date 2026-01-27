package com.jsonhandling.studentjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;

public class CreateStudentJson {

    public static void main(String[] args) {
        try {
            // ObjectMapper is used to convert Java objects to JSON
            ObjectMapper mapper = new ObjectMapper();

            // Creating Student object
            Student student = new Student(
                    "Anjali",
                    21,
                    Arrays.asList("Java", "DBMS", "OS")
            );

            // Converting Student object to JSON string
            String json = mapper.writeValueAsString(student);

            // Printing generated JSON
            System.out.println("Generated JSON:");
            System.out.println(json);

        } catch (Exception e) {
            // Handling any exception
            e.printStackTrace();
        }
    }
}
