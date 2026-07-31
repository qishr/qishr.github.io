Package [io.github.qishr.cascara.lang.json.ast](index.md)

# Class JsonNodeFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.json.ast.JsonNodeFactory<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNodeFactory](../../cascara.common/lang/ast/AstNodeFactory.md)<[JsonNode](JsonNode.md), [JsonScalar](JsonScalar.md), [JsonArray](JsonArray.md), [JsonObject](JsonObject.md), [JsonProperty](JsonProperty.md), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonNodeFactory__</span>


## Constructor Summary

| Constructor       | Description |
|-------------------|-------------|
| JsonNodeFactory() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                                                                                                               | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [JsonScalar](JsonScalar.md)                                                                  | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)                                                                                                                                                         |             |
| public [JsonScalar](JsonScalar.md)                                                                  | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) quoteStyle)                                                                                  |             |
| public [JsonScalar](JsonScalar.md)                                                                  | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) quoteStyle, [LanguageOptions](../../cascara.common/lang/util/LanguageOptions.md)<?> options) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [createKey](#createkey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                                                                                            |             |
| public [JsonArray](JsonArray.md)                                                                    | [createSequenceNode](#createsequencenode)()                                                                                                                                                                                                                                                          |             |
| public [JsonObject](JsonObject.md)                                                                  | [createMapNode](#createmapnode)()                                                                                                                                                                                                                                                                    |             |



## Method Details

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [JsonScalar](JsonScalar.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [JsonScalar](JsonScalar.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) quoteStyle)</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [JsonScalar](JsonScalar.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) quoteStyle, [LanguageOptions](../../cascara.common/lang/util/LanguageOptions.md)<?> options)</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createKey

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __createKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createSequenceNode

<span style="font-family: monospace; font-size: 80%;">public [JsonArray](JsonArray.md) __createSequenceNode__()</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createMapNode

<span style="font-family: monospace; font-size: 80%;">public [JsonObject](JsonObject.md) __createMapNode__()</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/ast/AstNodeFactory.md)


---

