package com.jsonhandling.validatejson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.InputStream;

public class ValidateJson {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Load JSON schema
            InputStream schemaStream = ValidateJson.class.getClassLoader()
                    .getResourceAsStream("schema.json");
            JsonNode schemaNode = mapper.readTree(schemaStream);

            // Load JSON data
            InputStream jsonStream = ValidateJson.class.getClassLoader()
                    .getResourceAsStream("user.json");
            JsonNode jsonNode = mapper.readTree(jsonStream);

            // Create schema validator
            JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
            JsonSchema schema = factory.getJsonSchema(schemaNode);

            // Validate
            ProcessingReport report = schema.validate(jsonNode);

            if (report.isSuccess()) {
                System.out.println("JSON is valid!");
            } else {
                System.out.println("JSON is invalid!");
                System.out.println(report);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

