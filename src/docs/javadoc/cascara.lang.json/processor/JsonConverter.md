Package [io.github.qishr.cascara.lang.json.processor](index.md)

# Class JsonConverter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.processor.AbstractJsonProcessor](AbstractJsonProcessor.md)<[io.github.qishr.cascara.lang.json.processor.JsonConverter](JsonConverter.md)><br/>
                io.github.qishr.cascara.lang.json.processor.JsonConverter<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstConverter](../../cascara.common/lang/processor/AstConverter.md)<[JsonNode](../ast/JsonNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonConverter__<br/>extends [AbstractJsonProcessor](AbstractJsonProcessor.md)<[JsonConverter](JsonConverter.md)>
</span>


## Constructor Summary

| Constructor     | Description |
|-----------------|-------------|
| JsonConverter() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                        | Description |
|-----------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------|-------------|
| protected [JsonConverter](JsonConverter.md)                                                         | [self](#self)()                                                               |             |
| public [ContentType](../../cascara.common/util/ContentType.md)                                      | [getContentType](#getcontenttype)()                                           |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toText](#totext)([AstNode](../../cascara.common/lang/ast/AstNode.md) ast)    |             |
| public [JsonNode](../ast/JsonNode.md)                                                               | [fromAst](#fromast)([AstNode](../../cascara.common/lang/ast/AstNode.md) from) |             |


### Methods inherited from [AbstractJsonProcessor](AbstractJsonProcessor.md)

setReporter, getOptions, getServiceProperties, getReporter, setOptions


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [JsonConverter](JsonConverter.md) __self__()</span>



**Overrides:**

[AbstractJsonProcessor](../cascara.lang.json/processor/AbstractJsonProcessor.md#self)


---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [ContentType](../../cascara.common/util/ContentType.md) __getContentType__()</span>



**Overrides:**

[AbstractJsonProcessor](../cascara.lang.json/processor/AbstractJsonProcessor.md#getcontenttype)


---

### toText

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toText__([AstNode](../../cascara.common/lang/ast/AstNode.md) ast)</span>



**Specified By:**

[AstConverter](../../cascara.common/lang/processor/AstConverter.md)


---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../ast/JsonNode.md) __fromAst__([AstNode](../../cascara.common/lang/ast/AstNode.md) from)</span>



**Specified By:**

[AstConverter](../../cascara.common/lang/processor/AstConverter.md)


---

