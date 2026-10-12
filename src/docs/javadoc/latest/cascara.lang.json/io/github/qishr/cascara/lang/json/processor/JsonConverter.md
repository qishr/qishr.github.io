Package [io.github.qishr.cascara.lang.json.processor](index.md)

# Class JsonConverter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.internal.AbstractJsonProcessor](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.json/io/github/qishr/cascara/lang/json/internal/AbstractJsonProcessor.html)<[io.github.qishr.cascara.lang.json.processor.JsonConverter](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonConverter.md)><br/>
                io.github.qishr.cascara.lang.json.processor.JsonConverter<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstConverter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstConverter.md)<[JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonConverter__<br/>extends [AbstractJsonProcessor](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.json/io/github/qishr/cascara/lang/json/internal/AbstractJsonProcessor.html)<[JsonConverter](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonConverter.md)>
</span>


## Constructor Summary

| Constructor     | Description |
|-----------------|-------------|
| JsonConverter() |             |



## Method Summary

| Modifier and Type                                                                                               | Method                                                                                                                          | Description |
|-----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [JsonConverter](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonConverter.md)    | [self](#self)()                                                                                                                 |             |
| public [ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md) | [getContentType](#getcontenttype)()                                                                                             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)             | [toString](#tostring)([AstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) ast) |             |
| public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)                       | [fromAst](#fromast)([AstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) from)  |             |



## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [JsonConverter](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonConverter.md) __self__()</span>




---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md) __getContentType__()</span>



**Overrides:**

[AbstractJsonProcessor](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.json/io/github/qishr/cascara/lang/json/internal/AbstractJsonProcessor.html#getcontenttype)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__([AstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) ast)</span>



**Specified By:**

[AstConverter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstConverter.md)


---

### fromAst

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) __fromAst__([AstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) from)</span>



**Specified By:**

[AstConverter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstConverter.md)


---

