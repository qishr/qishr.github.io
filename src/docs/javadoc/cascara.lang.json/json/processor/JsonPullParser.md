Package [io.github.qishr.cascara.lang.json.processor](index.md)

# Class JsonPullParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.processor.AbstractJsonProcessor](AbstractJsonProcessor.md)<[io.github.qishr.cascara.lang.json.processor.JsonPullParser](JsonPullParser.md)><br/>
                io.github.qishr.cascara.lang.json.processor.JsonPullParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [PullParser](../../../cascara.common/lang/processor/PullParser.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonPullParser__<br/>extends [AbstractJsonProcessor](AbstractJsonProcessor.md)<[JsonPullParser](JsonPullParser.md)>
</span>


## Constructor Summary

| Constructor                                                                                                                | Description                  |
|----------------------------------------------------------------------------------------------------------------------------|------------------------------|
| JsonPullParser()                                                                                                           | Default constructor for SPI. |
| JsonPullParser([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) input) |                              |



## Method Summary

| Modifier and Type                                                                 | Method                | Description |
|-----------------------------------------------------------------------------------|-----------------------|-------------|
| protected [JsonPullParser](JsonPullParser.md)                                     | [self](#self)()       |             |
| public boolean                                                                    | [hasNext](#hasnext)() |             |
| public [StreamingEvent](../../../cascara.common/lang/streaming/StreamingEvent.md) | [next](#next)()       |             |
| public void                                                                       | [close](#close)()     |             |


### Methods inherited from [AbstractJsonProcessor](AbstractJsonProcessor.md)

setReporter, getOptions, getContentType, getServiceProperties, getVersion, getReporter, setOptions, getTextResource


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [JsonPullParser](JsonPullParser.md) __self__()</span>



**Overrides:**

[AbstractJsonProcessor](../cascara.lang.json/json/processor/AbstractJsonProcessor.md#self)


---

### hasNext

<span style="font-family: monospace; font-size: 80%;">public boolean __hasNext__()</span>



**Specified By:**

[PullParser](../../../cascara.common/lang/processor/PullParser.md)


---

### next

<span style="font-family: monospace; font-size: 80%;">public [StreamingEvent](../../../cascara.common/lang/streaming/StreamingEvent.md) __next__()</span>



**Specified By:**

[PullParser](../../../cascara.common/lang/processor/PullParser.md)


---

### close

<span style="font-family: monospace; font-size: 80%;">public void __close__()</span>



**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)


---

