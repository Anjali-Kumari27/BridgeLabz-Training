package com.jsonhandling.carjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class CarToJson {

    public static void main(String[] args) {
        try {
            // Step 1: Create ObjectMapper
            ObjectMapper mapper = new ObjectMapper();

            // Step 2: Create Car object
            Car car = new Car("Toyota", "Corolla", 2023, 25000.0);

            // Step 3: Convert Car object to JSON String
            String jsonString = mapper.writeValueAsString(car);
            System.out.println("JSON String:");
            System.out.println(jsonString);

            // Step 4 (Optional): Write JSON to file
            File file = new File("src/main/resources/car.json");
            mapper.writeValue(file, car);
            System.out.println("JSON file created at src/main/resources/car.json");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

