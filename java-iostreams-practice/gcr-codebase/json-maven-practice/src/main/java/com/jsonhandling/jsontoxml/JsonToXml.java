package com.jsonhandling.jsontoxml;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.InputStream;

public class JsonToXml {

    public static void main(String[] args) {
        try {
            ObjectMapper jsonMapper = new ObjectMapper();
            XmlMapper xmlMapper = new XmlMapper();

            // Load JSON file from resources
            InputStream jsonStream = JsonToXml.class.getClassLoader()
                                        .getResourceAsStream("user1.json");
            if (jsonStream == null) {
                System.out.println("user1.json not found!");
                return;
            }

            // Step 1: Read JSON as JsonNode
            JsonNode jsonNode = jsonMapper.readTree(jsonStream);

            // Step 2: Convert JsonNode to XML string
            String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

            // Step 3: Print XML
            System.out.println(xml);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

