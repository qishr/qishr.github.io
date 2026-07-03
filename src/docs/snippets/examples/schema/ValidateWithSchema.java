public class ValidateWithSchema {
    public static void main(String args[]) throws LocalizableException {
        // Load the schema from resources
        InputStream is = ValidateWithSchema.class.getResourceAsStream("schema.json");
        JsonNode schemaAst = new JsonAstParser().parse(is);

        // Compile the schema
        Schema schema = new SchemaCompiler().compile(schemaAst);

        try {
            // Validate valid JSON
            is = ValidateWithSchema.class.getResourceAsStream("valid.json");
            JsonNode validData = new JsonAstParser().parse(is);
            schema.validate(validData);

            // Validate invalid JSON
            is = ValidateWithSchema.class.getResourceAsStream("invalid.json");
            JsonNode invalidData = new JsonAstParser().parse(is);
            schema.validate(invalidData);
        } catch (ValidationException e) {
            System.err.println("Validation error: " + e.getMessage());
        }
    }
}