public class SimpleTokenize {
    public static void main(String args[]) {
        InputStream is = SimplePushParse.class.getResourceAsStream("subject.yaml");
        YamlTokenizer tokenizer = new YamlTokenizer();
        List<YamlToken> tokens = tokenizer.tokenize(is);
        for (YamlToken token : tokens) {
            System.out.println(token.getType() + " " + token.getLexeme());
        }
    }
}