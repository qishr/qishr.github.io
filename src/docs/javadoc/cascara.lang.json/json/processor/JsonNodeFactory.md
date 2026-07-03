Package [io.github.qishr.cascara.lang.json.processor](index.md)

# Class JsonNodeFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.json.processor.JsonNodeFactory<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)<[JsonNode](../ast/JsonNode.md), [JsonScalarNode](../ast/JsonScalarNode.md), [JsonSequenceNode](../ast/JsonSequenceNode.md), [JsonMapNode](../ast/JsonMapNode.md), [JsonMapEntryNode](../ast/JsonMapEntryNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonNodeFactory__</span>


## Constructor Summary

| Constructor       | Description |
|-------------------|-------------|
| JsonNodeFactory() |             |



## Method Summary

| Modifier and Type                                     | Method                                                                                                                                                                                                            | Description |
|-------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [JsonScalarNode](../ast/JsonScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) primitiveValue)                                                                |             |
| public [JsonScalarNode](../ast/JsonScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key, [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) quoteStyle) |             |
| public [JsonScalarNode](../ast/JsonScalarNode.md)     | [createScalarNode](#createscalarnode)([Primitive](../../../cascara.common/lang/type/Primitive.md) primitive)                                                                                                      |             |
| public [JsonScalarNode](../ast/JsonScalarNode.md)     | [createScalarKeyNode](#createscalarkeynode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                     |             |
| public [JsonSequenceNode](../ast/JsonSequenceNode.md) | [createSequenceNode](#createsequencenode)()                                                                                                                                                                       |             |
| public [JsonMapNode](../ast/JsonMapNode.md)           | [createMapNode](#createmapnode)()                                                                                                                                                                                 |             |



## Method Details

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [JsonScalarNode](../ast/JsonScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) primitiveValue)</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [JsonScalarNode](../ast/JsonScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key, [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) quoteStyle)</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [JsonScalarNode](../ast/JsonScalarNode.md) __createScalarNode__([Primitive](../../../cascara.common/lang/type/Primitive.md) primitive)</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createScalarKeyNode

<span style="font-family: monospace; font-size: 80%;">public [JsonScalarNode](../ast/JsonScalarNode.md) __createScalarKeyNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createSequenceNode

<span style="font-family: monospace; font-size: 80%;">public [JsonSequenceNode](../ast/JsonSequenceNode.md) __createSequenceNode__()</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createMapNode

<span style="font-family: monospace; font-size: 80%;">public [JsonMapNode](../ast/JsonMapNode.md) __createMapNode__()</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

