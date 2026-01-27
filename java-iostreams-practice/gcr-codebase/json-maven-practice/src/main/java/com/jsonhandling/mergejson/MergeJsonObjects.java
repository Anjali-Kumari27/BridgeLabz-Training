package com.jsonhandling.mergejson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.InputStream;

public class MergeJsonObjects {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Load first JSON
            InputStream is1 = MergeJsonObjects.class.getClassLoader()
                                    .getResourceAsStream("file1.json");
            JsonNode json1 = mapper.readTree(is1);

            // Load second JSON
            InputStream is2 = MergeJsonObjects.class.getClassLoader()
                                    .getResourceAsStream("file2.json");
            JsonNode json2 = mapper.readTree(is2);

            // Convert first JSON to ObjectNode so we can merge
            ObjectNode merged = (ObjectNode) json1;

            // Merge second JSON into first
            merged.setAll((ObjectNode) json2);

            // Print merged JSON
            System.out.println("Merged JSON:");
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(merged));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

