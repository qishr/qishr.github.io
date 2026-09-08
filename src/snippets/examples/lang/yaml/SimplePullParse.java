public class SimplePullParse {
    public static void main(String args[]) {
        InputStream is = SimplePullParse.class.getResourceAsStream("subject.yaml");
        try (YamlPullParser parser = new YamlPullParser(is)) {
            while (parser.hasNext()) {
                YamlStreamingEvent event = parser.next();
                if (event.getType() == YamlStreamingEventType.KEY) {
                    String fieldName = event.getContent();
                    if ("name".equals(fieldName)) {
                        while (parser.hasNext()) {
                            YamlStreamingEvent subEvent = parser.next();
                            if (subEvent.getType() == YamlStreamingEventType.END_MAP) break;
                            if (subEvent.getType() == YamlStreamingEventType.VALUE_SCALAR) {
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