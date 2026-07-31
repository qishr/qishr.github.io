public class SimpleAstParse {
    public static void main(String args[]) {
        InputStream is = SimpleAstParse.class.getResourceAsStream("subject.json");
        JsonAstParser parser = new JsonAstParser();
        JsonNode root = parser.parse(is);
        if (root instanceof JsonObject obj) {
            System.out.println(obj.getString("name"));
            System.out.println(obj.getString("age"));
        }
    }
}