package com.jsonhandling.csvtojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvToJson {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        try {
            InputStream inputStream = CsvToJson.class
                    .getClassLoader()
                    .getResourceAsStream("data.csv");

            if (inputStream == null) {
                System.out.println("data.csv not found in resources!");
                return;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {

                // Skip header
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                // Split CSV line
                String[] data = line.split(",");

                // Safety check
                if (data.length < 4) {
                    System.out.println("Skipping invalid row: " + line);
                    continue;
                }

                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                String email = data[3].trim();

                users.add(new User(id, name, age, email));
            }

            // Convert to JSON
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);

            String json = mapper.writeValueAsString(users);
            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
