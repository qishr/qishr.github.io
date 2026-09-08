Package [io.github.qishr.cascara.common.lang.plain](index.md)

# Class PlainNodeFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.plain.PlainNodeFactory<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNodeFactory](../util/AstNodeFactory.md)<[PlainNode](PlainNode.md), [PlainScalarNode](PlainScalarNode.md), [PlainSequenceNode](PlainSequenceNode.md), [PlainMapNode](PlainMapNode.md), [PlainMapEntryNode](PlainMapEntryNode.md), [PlainNode](PlainNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __PlainNodeFactory__</span>


## Constructor Summary

| Constructor        | Description |
|--------------------|-------------|
| PlainNodeFactory() |             |



## Method Summary

| Modifier and Type                                | Method                                                                                                                                                                                                                                                 | Description |
|--------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [PlainScalarNode](PlainScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)                                                                                                           |             |
| public [PlainScalarNode](PlainScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../util/QuoteStyle.md) quoteStyle)                                                           |             |
| public [PlainScalarNode](PlainScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../util/QuoteStyle.md) quoteStyle, [LanguageOptions](../util/LanguageOptions.md)<?> options) |             |
| public [PlainScalarNode](PlainScalarNode.md)     | [createKey](#createkey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                                              |             |
| public [PlainSequenceNode](PlainSequenceNode.md) | [createSequenceNode](#createsequencenode)()                                                                                                                                                                                                            |             |
| public [PlainMapNode](PlainMapNode.md)           | [createMapNode](#createmapnode)()                                                                                                                                                                                                                      |             |



## Method Details

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [PlainScalarNode](PlainScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)</span>



**Specified By:**

[AstNodeFactory](../util/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [PlainScalarNode](PlainScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../util/QuoteStyle.md) quoteStyle)</span>



**Specified By:**

[AstNodeFactory](../util/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [PlainScalarNode](PlainScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../util/QuoteStyle.md) quoteStyle, [LanguageOptions](../util/LanguageOptions.md)<?> options)</span>



**Specified By:**

[AstNodeFactory](../util/AstNodeFactory.md)


---

### createKey

<span style="font-family: monospace; font-size: 80%;">public [PlainScalarNode](PlainScalarNode.md) __createKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[AstNodeFactory](../util/AstNodeFactory.md)


---

### createSequenceNode

<span style="font-family: monospace; font-size: 80%;">public [PlainSequenceNode](PlainSequenceNode.md) __createSequenceNode__()</span>



**Specified By:**

[AstNodeFactory](../util/AstNodeFactory.md)


---

### createMapNode

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](PlainMapNode.md) __createMapNode__()</span>



**Specified By:**

[AstNodeFactory](../util/AstNodeFactory.md)


---

