Package [io.github.qishr.cascara.common.lang.plain](index.md)

# Class PlainNodeFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.plain.PlainNodeFactory<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)<[PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md), [PlainScalarNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainScalarNode.md), [PlainSequenceNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainSequenceNode.md), [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md), [PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md), [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __PlainNodeFactory__</span>


## Constructor Summary

| Constructor        | Description |
|--------------------|-------------|
| PlainNodeFactory() |             |



## Method Summary

| Modifier and Type                                                                                               | Method                                                                                                                                                                                                                                                                                                                                                             | Description |
|-----------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [PlainScalarNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)                                                                                                                                                                                                                       |             |
| public [PlainScalarNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../../../../../../io/github/qishr/cascara/common/lang/util/QuoteStyle.md) quoteStyle)                                                                                                                 |             |
| public [PlainScalarNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../../../../../../io/github/qishr/cascara/common/lang/util/QuoteStyle.md) quoteStyle, [LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options) |             |
| public [PlainScalarNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainScalarNode.md)     | [createKey](#createkey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                                                                                                                                                          |             |
| public [PlainSequenceNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainSequenceNode.md) | [createSequenceNode](#createsequencenode)()                                                                                                                                                                                                                                                                                                                        |             |
| public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md)           | [createMapNode](#createmapnode)()                                                                                                                                                                                                                                                                                                                                  |             |



## Method Details

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [PlainScalarNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)</span>



**Specified By:**

[AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [PlainScalarNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../../../../../../io/github/qishr/cascara/common/lang/util/QuoteStyle.md) quoteStyle)</span>



**Specified By:**

[AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [PlainScalarNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../../../../../../io/github/qishr/cascara/common/lang/util/QuoteStyle.md) quoteStyle, [LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options)</span>



**Specified By:**

[AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

### createKey

<span style="font-family: monospace; font-size: 80%;">public [PlainScalarNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainScalarNode.md) __createKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

### createSequenceNode

<span style="font-family: monospace; font-size: 80%;">public [PlainSequenceNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainSequenceNode.md) __createSequenceNode__()</span>



**Specified By:**

[AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

### createMapNode

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) __createMapNode__()</span>



**Specified By:**

[AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

