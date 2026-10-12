Package [io.github.qishr.cascara.lang.json.processor](index.md)

# Class JsonPushParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.internal.AbstractJsonProcessor](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.json/io/github/qishr/cascara/lang/json/internal/AbstractJsonProcessor.html)<[io.github.qishr.cascara.lang.json.processor.JsonPushParser](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonPushParser.md)><br/>
                io.github.qishr.cascara.lang.json.processor.JsonPushParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [PushParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/PushParser.md)<[JsonStreamingEventType](../../../../../../../io/github/qishr/cascara/lang/json/streaming/JsonStreamingEventType.md), [JsonStreamingEvent](../../../../../../../io/github/qishr/cascara/lang/json/streaming/JsonStreamingEvent.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonPushParser__<br/>extends [AbstractJsonProcessor](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.json/io/github/qishr/cascara/lang/json/internal/AbstractJsonProcessor.html)<[JsonPushParser](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonPushParser.md)>
</span>


## Constructor Summary

| Constructor      | Description |
|------------------|-------------|
| JsonPushParser() |             |



## Method Summary

| Modifier and Type                                                                                              | Method                                                                                                                                                                                                                                                                                                                                                                    | Description |
|----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                    | [parse](#parse)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) input, [StreamHandler](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/streaming/StreamHandler.md)<[JsonStreamingEvent](../../../../../../../io/github/qishr/cascara/lang/json/streaming/JsonStreamingEvent.md)> handler) |             |
| protected [JsonPushParser](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonPushParser.md) | [self](#self)()                                                                                                                                                                                                                                                                                                                                                           |             |



## Method Details

### parse

<span style="font-family: monospace; font-size: 80%;">public void __parse__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) input, [StreamHandler](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/streaming/StreamHandler.md)<[JsonStreamingEvent](../../../../../../../io/github/qishr/cascara/lang/json/streaming/JsonStreamingEvent.md)> handler)</span>



**Throws:**

[ParserException](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/diagnostic/ParserException.md)

**Specified By:**

[PushParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/PushParser.md)


---

### self

<span style="font-family: monospace; font-size: 80%;">protected [JsonPushParser](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonPushParser.md) __self__()</span>




---

