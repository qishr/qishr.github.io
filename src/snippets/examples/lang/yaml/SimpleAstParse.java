public class SimpleAstParse {
    public static void main(String args[]) {
        InputStream is = SimpleAstParse.class.getResourceAsStream("subject.yaml");
        YamlAstParser parser = new YamlAstParser();
        YamlNode yaml = parser.parse(is);
        if (yaml instanceof YamlMapNode map) {
            System.out.println(map.getString("name"));
            System.out.println(map.getString("age"));
        }
    }
}