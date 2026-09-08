public class SimpleSerialize {
    public static void main(String args[]) {
        Person person = new Person("Dave", 31);
        JsonSerializer serializer = new JsonSerializer();
        String text = serializer.toString(person);
        System.out.println("Serialized JSON:\n" + text);
    }
}