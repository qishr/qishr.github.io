Package [io.github.qishr.cascara.lang.json.processor](index.md)

# Class JsonAstParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.processor.AbstractJsonProcessor](AbstractJsonProcessor.md)<[io.github.qishr.cascara.lang.json.processor.JsonAstParser](JsonAstParser.md)><br/>
                io.github.qishr.cascara.lang.json.processor.JsonAstParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstParser](../../../cascara.common/lang/processor/AstParser.md)<[JsonNode](../ast/JsonNode.md), [JsonToken](../token/JsonToken.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonAstParser__<br/>extends [AbstractJsonProcessor](AbstractJsonProcessor.md)<[JsonAstParser](JsonAstParser.md)>
</span>

A recursive descent parser for JSON/JSON5.


## Constructor Summary

| Constructor     | Description                 |
|-----------------|-----------------------------|
| JsonAstParser() | Default constructor for SPI |



## Method Summary

| Modifier and Type                           | Method                                                                                                                                               | Description |
|---------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [JsonAstParser](JsonAstParser.md)    | [setOptions](#setoptions)([JsonOptions](../util/JsonOptions.md) options)                                                                             |             |
| protected [JsonAstParser](JsonAstParser.md) | [self](#self)()                                                                                                                                      |             |
| public [JsonNode](../ast/JsonNode.md)       | [parse](#parse)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                   |             |
| public [JsonNode](../ast/JsonNode.md)       | [parse](#parse)(byte[] data)                                                                                                                         |             |
| public [JsonNode](../ast/JsonNode.md)       | [parse](#parse)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)                                   |             |
| public [JsonNode](../ast/JsonNode.md)       | [parse](#parse)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)                             |             |
| public [JsonNode](../ast/JsonNode.md)       | [parse](#parse)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonToken](../token/JsonToken.md)> tokens) |             |
| public [JsonNode](../ast/JsonNode.md)       | [parse](#parse)([Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)<[JsonToken](../token/JsonToken.md)> tokenizer)                      |             |


### Methods inherited from [AbstractJsonProcessor](AbstractJsonProcessor.md)

setReporter, getOptions, getContentType, getServiceProperties, getVersion, getReporter, [setOptions](#setoptions), getTextResource


## Method Details

### setOptions

<span style="font-family: monospace; font-size: 80%;">public [JsonAstParser](JsonAstParser.md) __setOptions__([JsonOptions](../util/JsonOptions.md) options)</span>




---

### self

<span style="font-family: monospace; font-size: 80%;">protected [JsonAstParser](JsonAstParser.md) __self__()</span>



**Overrides:**

[AbstractJsonProcessor](../cascara.lang.json/json/processor/AbstractJsonProcessor.md#self)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../ast/JsonNode.md) __parse__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>



**Specified By:**

[AstParser](../../../cascara.common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../ast/JsonNode.md) __parse__(byte[] data)</span>




---

### parse

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../ast/JsonNode.md) __parse__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)</span>



**Specified By:**

[AstParser](../../../cascara.common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../ast/JsonNode.md) __parse__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>



**Specified By:**

[AstParser](../../../cascara.common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../ast/JsonNode.md) __parse__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonToken](../token/JsonToken.md)> tokens)</span>



**Specified By:**

[AstParser](../../../cascara.common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../ast/JsonNode.md) __parse__([Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)<[JsonToken](../token/JsonToken.md)> tokenizer)</span>



**Specified By:**

[AstParser](../../../cascara.common/lang/processor/AstParser.md)


---

