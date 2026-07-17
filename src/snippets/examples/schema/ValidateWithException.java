public class ValidateWithException {
    public static void main(String args[]) throws IOException {
        // Tell IOUtils to use this class when reading resources
        IOUtils.setResourceProvider(UriScheme.RES, new ResResourceProvider(AgnosticValidationExample.class));

        try {
            // Validate valid JSON
            InputStream is = ValidateWithException.class.getResourceAsStream("valid.json");
            JsonNode validData = new JsonAstParser().parse(is);
            new SchemaValidator().validate(validData);

            // Validate invalid JSON
            is = ValidateWithException.class.getResourceAsStream("invalid.json");
            JsonNode invalidData = new JsonAstParser().parse(is);
            new SchemaValidator().validate(invalidData);
        } catch (ValidationException e) {
            System.err.println("Validation error: " + e.getMessage());
        }
    }
}