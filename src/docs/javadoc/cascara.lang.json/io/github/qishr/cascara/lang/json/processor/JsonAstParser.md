Package [io.github.qishr.cascara.lang.json.processor](index.md)

# Class JsonAstParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.internal.AbstractJsonProcessor](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.json/io/github/qishr/cascara/lang/json/internal/AbstractJsonProcessor.html)<[io.github.qishr.cascara.lang.json.processor.JsonAstParser](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonAstParser.md)><br/>
                io.github.qishr.cascara.lang.json.processor.JsonAstParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)<[JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md), [JsonToken](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonToken.md), [JsonTokenizer](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonTokenizer.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonAstParser__<br/>extends [AbstractJsonProcessor](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.json/io/github/qishr/cascara/lang/json/internal/AbstractJsonProcessor.html)<[JsonAstParser](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonAstParser.md)>
</span>

A recursive descent parser for JSON/JSON5.


## Constructor Summary

| Constructor     | Description                 |
|-----------------|-----------------------------|
| JsonAstParser() | Default constructor for SPI |



## Method Summary

| Modifier and Type                                                                                                                                                                       | Method                                                                                                                                                                                                   | Description                                       |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------|
| public [JsonAstParser](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonAstParser.md)                                                                               | [setOptions](#setoptions)([JsonOptions](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonOptions.md) options)                                                                             |                                                   |
| protected [JsonAstParser](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonAstParser.md)                                                                            | [self](#self)()                                                                                                                                                                                          |                                                   |
| public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)                                                                                               | [parse](#parse)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                       |                                                   |
| public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)                                                                                               | [parse](#parse)(byte[] data)                                                                                                                                                                             |                                                   |
| public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)                                                                                               | [parse](#parse)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)                                                                                       |                                                   |
| public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)                                                                                               | [parse](#parse)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)                                                                                 |                                                   |
| public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)                                                                                               | [parse](#parse)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonToken](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonToken.md)> tokens) | Eager API: List<JsonToken> (adapter to streaming) |
| public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)                                                                                               | [parse](#parse)([JsonTokenizer](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonTokenizer.md) tokenizer)                                                                            | Streaming API: Tokenizer<JsonToken>               |
| public [JsonTokenizer](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonTokenizer.md)                                                                               | [getTokenizer](#gettokenizer)()                                                                                                                                                                          |                                                   |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonToken](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonToken.md)> | [getTokens](#gettokens)()                                                                                                                                                                                |                                                   |



## Method Details

### setOptions

<span style="font-family: monospace; font-size: 80%;">public [JsonAstParser](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonAstParser.md) __setOptions__([JsonOptions](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonOptions.md) options)</span>




---

### self

<span style="font-family: monospace; font-size: 80%;">protected [JsonAstParser](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonAstParser.md) __self__()</span>




---

### parse

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) __parse__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>



**Specified By:**

[AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) __parse__(byte[] data)</span>




---

### parse

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) __parse__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)</span>



**Specified By:**

[AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) __parse__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>



**Specified By:**

[AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) __parse__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonToken](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonToken.md)> tokens)</span>

Eager API: List<JsonToken> (adapter to streaming)

**Specified By:**

[AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) __parse__([JsonTokenizer](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonTokenizer.md) tokenizer)</span>

Streaming API: Tokenizer<JsonToken>


---

### getTokenizer

<span style="font-family: monospace; font-size: 80%;">public [JsonTokenizer](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonTokenizer.md) __getTokenizer__()</span>



**Specified By:**

[AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)


---

### getTokens

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonToken](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonToken.md)> __getTokens__()</span>



**Specified By:**

[AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)


---

