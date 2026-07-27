Package [io.github.qishr.cascara.lang.json.processor](index.md)

# Class JsonPushParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.processor.AbstractJsonProcessor](AbstractJsonProcessor.md)<[io.github.qishr.cascara.lang.json.processor.JsonPushParser](JsonPushParser.md)><br/>
                io.github.qishr.cascara.lang.json.processor.JsonPushParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [PushParser](../../../cascara.common/lang/processor/PushParser.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonPushParser__<br/>extends [AbstractJsonProcessor](AbstractJsonProcessor.md)<[JsonPushParser](JsonPushParser.md)>
</span>


## Constructor Summary

| Constructor      | Description |
|------------------|-------------|
| JsonPushParser() |             |



## Method Summary

| Modifier and Type                             | Method                                                                                                                                                                                                        | Description |
|-----------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                   | [parse](#parse)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) input, [StreamHandler](../../../cascara.common/lang/streaming/StreamHandler.md) handler) |             |
| protected [JsonPushParser](JsonPushParser.md) | [self](#self)()                                                                                                                                                                                               |             |


### Methods inherited from [AbstractJsonProcessor](AbstractJsonProcessor.md)

setReporter, getOptions, getContentType, getServiceProperties, getVersion, getReporter, setOptions, getTextResource


## Method Details

### parse

<span style="font-family: monospace; font-size: 80%;">public void __parse__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) input, [StreamHandler](../../../cascara.common/lang/streaming/StreamHandler.md) handler)</span>



**Throws:**

[ParserException](../../../cascara.common/lang/exception/ParserException.md)

**Specified By:**

[PushParser](../../../cascara.common/lang/processor/PushParser.md)


---

### self

<span style="font-family: monospace; font-size: 80%;">protected [JsonPushParser](JsonPushParser.md) __self__()</span>



**Overrides:**

[AbstractJsonProcessor](../cascara.lang.json/json/processor/AbstractJsonProcessor.md#self)


---

