public class NeoSingletonFromFactory {
    public static void main(String args[]) {
        ContentTypeResolver contentTypes = new ServiceProviderFactory().getContentTypeResolver();
        ContentType contentType = contentTypes.resolve(".yaml");
        System.out.println("YAML Content Type: " + contentType);
    }
}