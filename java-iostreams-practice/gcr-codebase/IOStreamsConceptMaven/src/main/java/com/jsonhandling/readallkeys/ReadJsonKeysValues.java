package com.jsonhandling.readallkeys;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;

public class ReadJsonKeysValues {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Load JSON from resources
            InputStream inputStream = ReadJsonKeysValues.class.getClassLoader()
                                        .getResourceAsStream("user.json");

            if (inputStream == null) {
                System.out.println("user.json not found!");
                return;
            }

            // Parse JSON
            JsonNode rootNode = mapper.readTree(inputStream);

            // Print all keys and values recursively
            printJson(rootNode, "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Recursive method to print keys and values
    public static void printJson(JsonNode node, String indent) {
        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                System.out.print(indent + entry.getKey() + " : ");
                printJson(entry.getValue(), indent + "  ");
            }
        } else if (node.isArray()) {
            System.out.println();
            for (JsonNode arrayElement : node) {
                printJson(arrayElement, indent + "  ");
            }
        } else {
            // Value node (String, Number, Boolean)
            System.out.println(node.asText());
        }
    }
}
