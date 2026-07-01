Package [io.github.qishr.cascara.common.lang.ast](index.md)

# Interface AstNodeFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.ast.AstNodeFactory<br/>
<br/>
All Known Implementing Classes:<br/>
    [JsonNodeFactory](../../../cascara.lang.json/json/processor/JsonNodeFactory.md), [YamlNodeFactory](../../../cascara.lang.yaml/yaml/processor/YamlNodeFactory.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __AstNodeFactory__</span>


## Method Summary

| Modifier and Type | Method                                                                                                                                                                                             | Description |
|-------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract S | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) primitiveValue)                                                 |             |
| public abstract S | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) primitiveValue, [QuoteStyle](../util/QuoteStyle.md) quoteStyle) |             |
| public abstract S | [createScalarNode](#createscalarnode)([Primitive](../type/Primitive.md) primitive)                                                                                                                 |             |
| public abstract N | [createScalarKeyNode](#createscalarkeynode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                      |             |
| public abstract L | [createSequenceNode](#createsequencenode)()                                                                                                                                                        |             |
| public abstract M | [createMapNode](#createmapnode)()                                                                                                                                                                  |             |



## Method Details

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public abstract S __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) primitiveValue)</span>




---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public abstract S __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) primitiveValue, [QuoteStyle](../util/QuoteStyle.md) quoteStyle)</span>




---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public abstract S __createScalarNode__([Primitive](../type/Primitive.md) primitive)</span>




---

### createScalarKeyNode

<span style="font-family: monospace; font-size: 80%;">public abstract N __createScalarKeyNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>




---

### createSequenceNode

<span style="font-family: monospace; font-size: 80%;">public abstract L __createSequenceNode__()</span>




---

### createMapNode

<span style="font-family: monospace; font-size: 80%;">public abstract M __createMapNode__()</span>




---

