public class SimpleTokenize {
    public static void main(String args[]) {
        InputStream is = SimpleAstParse.class.getResourceAsStream("subject.yaml");
        Tokenizer<?> tokenizer = new ProcessorFactory().createTokenizer("text/yaml");
        List<? extends Token> tokens = tokenizer.tokenize(is);
        for (Token token : tokens) {
            System.out.println(token.getType() + " " + token.getLexeme());
        }
    }
}