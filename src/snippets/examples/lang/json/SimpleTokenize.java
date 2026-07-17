public class SimpleTokenize {
    public static void main(String args[]) {
        String text = "person: {\n" +
                      "  name: Dave\n" +
                      "  age: 31\n" +
                      "}";

        JsonTokenizer tokenizer = new JsonTokenizer();
        List<JsonToken> tokens = tokenizer.tokenize(text);
        for (JsonToken token : tokens) {
            System.out.println(token.getType() + " " + token.getLexeme());
        }
    }
}