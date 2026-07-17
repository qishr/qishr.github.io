public class SimpleTokenize {
    public static void main(String args[]) {
        InputStream is = SimpleTokenize.class.getResourceAsStream("subject.xml");
        XmlTokenizer tokenizer = new XmlTokenizer();
        List<XmlToken> tokens = tokenizer.tokenize(is);
        for (XmlToken token : tokens) {
            System.out.println(token.getType() + " " + token.getLexeme());
        }
    }
}