public class SimplePullParse {
    public static void main(String args[]) {
        InputStream is = SimplePullParse.class.getResourceAsStream("subject.yaml");
        try (YamlPullParser parser = new YamlPullParser(is)) {
            while (parser.hasNext()) {
                StreamingEvent event = parser.next();
                if (event.getType() == StreamingEventType.FIELD_NAME) {
                    String fieldName = event.getContent();
                    if ("name".equals(fieldName)) {
                        while (parser.hasNext()) {
                            StreamingEvent subEvent = parser.next();
                            if (subEvent.getType() == StreamingEventType.END_OBJECT) break;
                            if (subEvent.getType() == StreamingEventType.VALUE_SCALAR) {
                                System.out.println(subEvent.getContent());
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}