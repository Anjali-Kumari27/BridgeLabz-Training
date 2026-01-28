package com.jsonhandling.readjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;

public class ReadUserJson {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Load file from classpath
            InputStream inputStream = ReadUserJson.class.getClassLoader()
                                      .getResourceAsStream("user.json");

            if (inputStream == null) {
                System.out.println("File not found!");
                return;
            }

            // Map JSON to POJO
            User user = mapper.readValue(inputStream, User.class);

            System.out.println(user);
            System.out.println("Name: " + user.getName());
            System.out.println("Email: " + user.getEmail());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
