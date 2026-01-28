package com.jsonhandling.validateemail;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.InputStream;

public class ValidateEmail {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Load JSON schema
            InputStream schemaStream = ValidateEmail.class.getClassLoader()
                                            .getResourceAsStream("schema.json");
            JsonNode schemaNode = mapper.readTree(schemaStream);

            // Load JSON data
            InputStream jsonStream = ValidateEmail.class.getClassLoader()
                                          .getResourceAsStream("user1.json");
            JsonNode jsonNode = mapper.readTree(jsonStream);

            // Create JSON Schema Validator
            JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
            JsonSchema schema = factory.getJsonSchema(schemaNode);

            // Validate JSON
            ProcessingReport report = schema.validate(jsonNode);

            if (report.isSuccess()) {
                System.out.println("JSON is valid and email format is correct!");
            } else {
                System.out.println("Invalid JSON or email format!");
                System.out.println(report);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
