public class ValidateWithCollector {
    public static void main(String args[]) throws LocalizableException {
        // Tell IOUtils to use this class when reading resources
        IOUtils.setResourceProvider(UriScheme.RES, new ResResourceProvider(AgnosticValidationExample.class));

        SilentCollectingReporter reporter = new SilentCollectingReporter();
        reporter.setDiagnosticCollector(problem -> {
            System.err.println("Validation error: " + problem.getMessage());
        });

        // Validate valid JSON
        InputStream is = ValidateWithCollector.class.getResourceAsStream("valid.json");
        JsonNode validData = new JsonAstParser().parse(is);
        new SchemaValidator(reporter).validate(validData);

        // Validate invalid JSON
        is = ValidateWithCollector.class.getResourceAsStream("invalid.json");
        JsonNode invalidData = new JsonAstParser().parse(is);
        new SchemaValidator(reporter).validate(invalidData);
    }
}