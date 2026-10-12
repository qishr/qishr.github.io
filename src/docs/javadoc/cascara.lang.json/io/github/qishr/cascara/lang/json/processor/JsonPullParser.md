Package [io.github.qishr.cascara.lang.json.processor](index.md)

# Class JsonPullParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.internal.AbstractJsonProcessor](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.json/io/github/qishr/cascara/lang/json/internal/AbstractJsonProcessor.html)<[io.github.qishr.cascara.lang.json.processor.JsonPullParser](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonPullParser.md)><br/>
                io.github.qishr.cascara.lang.json.processor.JsonPullParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [PullParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/PullParser.md)<[JsonStreamingEvent](../../../../../../../io/github/qishr/cascara/lang/json/streaming/JsonStreamingEvent.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonPullParser__<br/>extends [AbstractJsonProcessor](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.json/io/github/qishr/cascara/lang/json/internal/AbstractJsonProcessor.html)<[JsonPullParser](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonPullParser.md)>
</span>


## Constructor Summary

| Constructor                                                                                                                | Description                  |
|----------------------------------------------------------------------------------------------------------------------------|------------------------------|
| JsonPullParser()                                                                                                           | Default constructor for SPI. |
| JsonPullParser([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) input) |                              |



## Method Summary

| Modifier and Type                                                                                                   | Method                | Description |
|---------------------------------------------------------------------------------------------------------------------|-----------------------|-------------|
| protected [JsonPullParser](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonPullParser.md)      | [self](#self)()       |             |
| public boolean                                                                                                      | [hasNext](#hasnext)() |             |
| public [JsonStreamingEvent](../../../../../../../io/github/qishr/cascara/lang/json/streaming/JsonStreamingEvent.md) | [next](#next)()       |             |
| public void                                                                                                         | [close](#close)()     |             |



## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [JsonPullParser](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonPullParser.md) __self__()</span>




---

### hasNext

<span style="font-family: monospace; font-size: 80%;">public boolean __hasNext__()</span>



**Specified By:**

[PullParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/PullParser.md)


---

### next

<span style="font-family: monospace; font-size: 80%;">public [JsonStreamingEvent](../../../../../../../io/github/qishr/cascara/lang/json/streaming/JsonStreamingEvent.md) __next__()</span>



**Specified By:**

[PullParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/PullParser.md)


---

### close

<span style="font-family: monospace; font-size: 80%;">public void __close__()</span>



**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)


---

