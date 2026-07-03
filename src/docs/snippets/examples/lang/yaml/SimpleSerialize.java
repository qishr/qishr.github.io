public class SimpleSerialize {
    public static void main(String args[]) {
        Person person = new Person("Dave", 31);
        YamlSerializer serializer = new YamlSerializer();
        String yamlString = serializer.toText(person);
        System.out.println("Serialized YAML:\n" + yamlString);
    }
}