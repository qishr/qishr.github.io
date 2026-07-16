Package [io.github.qishr.cascara.common.lang.reference](index.md)

# Class ReferenceNodeFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.reference.ReferenceNodeFactory<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNodeFactory](../ast/AstNodeFactory.md)<[ReferenceNode](ReferenceNode.md), [ReferenceScalarNode](ReferenceScalarNode.md), [ReferenceSequenceNode](ReferenceSequenceNode.md), [ReferenceMapNode](ReferenceMapNode.md), [ReferenceMapEntryNode](ReferenceMapEntryNode.md), [ReferenceNode](ReferenceNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __ReferenceNodeFactory__</span>


## Constructor Summary

| Constructor            | Description |
|------------------------|-------------|
| ReferenceNodeFactory() |             |



## Method Summary

| Modifier and Type                                        | Method                                                                                                                                                                                                                                                 | Description |
|----------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [ReferenceScalarNode](ReferenceScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)                                                                                                           |             |
| public [ReferenceScalarNode](ReferenceScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../util/QuoteStyle.md) quoteStyle)                                                           |             |
| public [ReferenceScalarNode](ReferenceScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../util/QuoteStyle.md) quoteStyle, [LanguageOptions](../util/LanguageOptions.md)<?> options) |             |
| public [ReferenceScalarNode](ReferenceScalarNode.md)     | [createKey](#createkey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                                              |             |
| public [ReferenceSequenceNode](ReferenceSequenceNode.md) | [createSequenceNode](#createsequencenode)()                                                                                                                                                                                                            |             |
| public [ReferenceMapNode](ReferenceMapNode.md)           | [createMapNode](#createmapnode)()                                                                                                                                                                                                                      |             |



## Method Details

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [ReferenceScalarNode](ReferenceScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)</span>



**Specified By:**

[AstNodeFactory](../ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [ReferenceScalarNode](ReferenceScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../util/QuoteStyle.md) quoteStyle)</span>



**Specified By:**

[AstNodeFactory](../ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [ReferenceScalarNode](ReferenceScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../util/QuoteStyle.md) quoteStyle, [LanguageOptions](../util/LanguageOptions.md)<?> options)</span>



**Specified By:**

[AstNodeFactory](../ast/AstNodeFactory.md)


---

### createKey

<span style="font-family: monospace; font-size: 80%;">public [ReferenceScalarNode](ReferenceScalarNode.md) __createKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[AstNodeFactory](../ast/AstNodeFactory.md)


---

### createSequenceNode

<span style="font-family: monospace; font-size: 80%;">public [ReferenceSequenceNode](ReferenceSequenceNode.md) __createSequenceNode__()</span>



**Specified By:**

[AstNodeFactory](../ast/AstNodeFactory.md)


---

### createMapNode

<span style="font-family: monospace; font-size: 80%;">public [ReferenceMapNode](ReferenceMapNode.md) __createMapNode__()</span>



**Specified By:**

[AstNodeFactory](../ast/AstNodeFactory.md)


---

