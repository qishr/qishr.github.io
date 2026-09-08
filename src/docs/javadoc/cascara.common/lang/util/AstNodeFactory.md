Package [io.github.qishr.cascara.common.lang.util](index.md)

# Interface AstNodeFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.util.AstNodeFactory<br/>
<br/>
All Known Implementing Classes:<br/>
    [PlainNodeFactory](../plain/PlainNodeFactory.md), [JsonNodeFactory](../../../cascara.lang.json/ast/JsonNodeFactory.md), [YamlNodeFactory](../../../cascara.lang.yaml/util/YamlNodeFactory.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __AstNodeFactory__</span>


## Method Summary

| Modifier and Type | Method                                                                                                                                                                                                                                 | Description |
|-------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract S | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)                                                                                           |             |
| public abstract S | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](QuoteStyle.md) quoteStyle)                                                   |             |
| public abstract S | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](QuoteStyle.md) quoteStyle, [LanguageOptions](LanguageOptions.md)<?> options) |             |
| public abstract K | [createKey](#createkey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                              |             |
| public abstract L | [createSequenceNode](#createsequencenode)()                                                                                                                                                                                            |             |
| public abstract M | [createMapNode](#createmapnode)()                                                                                                                                                                                                      |             |



## Method Details

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public abstract S __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)</span>




---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public abstract S __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](QuoteStyle.md) quoteStyle)</span>




---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public abstract S __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](QuoteStyle.md) quoteStyle, [LanguageOptions](LanguageOptions.md)<?> options)</span>




---

### createKey

<span style="font-family: monospace; font-size: 80%;">public abstract K __createKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>




---

### createSequenceNode

<span style="font-family: monospace; font-size: 80%;">public abstract L __createSequenceNode__()</span>




---

### createMapNode

<span style="font-family: monospace; font-size: 80%;">public abstract M __createMapNode__()</span>




---

