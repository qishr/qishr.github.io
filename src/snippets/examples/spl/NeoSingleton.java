public class NeoSingleton {
    public static void main(String args[]) {
        ContentTypeResolver contentTypes = SPL.load(ContentTypeResolver.class);
        ContentType contentType = contentTypes.resolve(".yaml");
        System.out.println("YAML Content Type: " + contentType);
    }
}