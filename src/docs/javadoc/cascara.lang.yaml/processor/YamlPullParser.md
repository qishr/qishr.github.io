Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlPullParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.internal.AbstractYamlProcessor](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/internal/AbstractYamlProcessor.html)<[io.github.qishr.cascara.lang.yaml.processor.YamlPullParser](YamlPullParser.md)><br/>
                [io.github.qishr.cascara.lang.yaml.internal.AbstractYamlParser](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/internal/AbstractYamlParser.html)<[io.github.qishr.cascara.lang.yaml.processor.YamlPullParser](YamlPullParser.md)><br/>
                        io.github.qishr.cascara.lang.yaml.processor.YamlPullParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [PullParser](../../cascara.common/lang/processor/PullParser.md)<[YamlStreamingEvent](../streaming/YamlStreamingEvent.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlPullParser__<br/>extends [AbstractYamlParser](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/internal/AbstractYamlParser.html)<[YamlPullParser](YamlPullParser.md)>
</span>


## Constructor Summary

| Constructor                                                                                                                | Description                  |
|----------------------------------------------------------------------------------------------------------------------------|------------------------------|
| YamlPullParser()                                                                                                           | Default constructor for SPI. |
| YamlPullParser([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) input) |                              |



## Method Summary

| Modifier and Type                                               | Method                                                                                      | Description |
|-----------------------------------------------------------------|---------------------------------------------------------------------------------------------|-------------|
| protected [YamlPullParser](YamlPullParser.md)                   | [self](#self)()                                                                             |             |
| public boolean                                                  | [hasNext](#hasnext)()                                                                       |             |
| public [YamlStreamingEvent](../streaming/YamlStreamingEvent.md) | [next](#next)()                                                                             |             |
| public void                                                     | [close](#close)()                                                                           |             |
| protected void                                                  | [handleEvent](#handleevent)([YamlStreamingEvent](../streaming/YamlStreamingEvent.md) event) |             |



## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [YamlPullParser](YamlPullParser.md) __self__()</span>




---

### hasNext

<span style="font-family: monospace; font-size: 80%;">public boolean __hasNext__()</span>



**Specified By:**

[PullParser](../../cascara.common/lang/processor/PullParser.md)


---

### next

<span style="font-family: monospace; font-size: 80%;">public [YamlStreamingEvent](../streaming/YamlStreamingEvent.md) __next__()</span>



**Specified By:**

[PullParser](../../cascara.common/lang/processor/PullParser.md)


---

### close

<span style="font-family: monospace; font-size: 80%;">public void __close__()</span>



**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)


---

### handleEvent

<span style="font-family: monospace; font-size: 80%;">protected void __handleEvent__([YamlStreamingEvent](../streaming/YamlStreamingEvent.md) event)</span>




---

