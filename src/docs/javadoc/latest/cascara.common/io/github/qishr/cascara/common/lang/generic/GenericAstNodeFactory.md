Package [io.github.qishr.cascara.common.lang.generic](index.md)

# Class GenericAstNodeFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.generic.GenericAstNodeFactory<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md), [GenericAstScalar](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstScalar.md), [GenericAstSequence](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstSequence.md), [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md), [GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md), [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __GenericAstNodeFactory__</span>


## Constructor Summary

| Constructor             | Description |
|-------------------------|-------------|
| GenericAstNodeFactory() |             |



## Method Summary

| Modifier and Type                                                                                                   | Method                                                                                                                                                                                                                                                                                                                                                             | Description |
|---------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [GenericAstScalar](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstScalar.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)                                                                                                                                                                                                                       |             |
| public [GenericAstScalar](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstScalar.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../../../../../../io/github/qishr/cascara/common/lang/util/QuoteStyle.md) quoteStyle)                                                                                                                 |             |
| public [GenericAstScalar](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstScalar.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../../../../../../io/github/qishr/cascara/common/lang/util/QuoteStyle.md) quoteStyle, [LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options) |             |
| public [GenericAstScalar](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstScalar.md)     | [createKey](#createkey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                                                                                                                                                          |             |
| public [GenericAstSequence](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstSequence.md) | [createSequenceNode](#createsequencenode)()                                                                                                                                                                                                                                                                                                                        |             |
| public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md)           | [createMapNode](#createmapnode)()                                                                                                                                                                                                                                                                                                                                  |             |



## Method Details

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [GenericAstScalar](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstScalar.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)</span>



**Specified By:**

[AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [GenericAstScalar](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstScalar.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../../../../../../io/github/qishr/cascara/common/lang/util/QuoteStyle.md) quoteStyle)</span>



**Specified By:**

[AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [GenericAstScalar](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstScalar.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../../../../../../io/github/qishr/cascara/common/lang/util/QuoteStyle.md) quoteStyle, [LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options)</span>



**Specified By:**

[AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

### createKey

<span style="font-family: monospace; font-size: 80%;">public [GenericAstScalar](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstScalar.md) __createKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

### createSequenceNode

<span style="font-family: monospace; font-size: 80%;">public [GenericAstSequence](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstSequence.md) __createSequenceNode__()</span>



**Specified By:**

[AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

### createMapNode

<span style="font-family: monospace; font-size: 80%;">public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md) __createMapNode__()</span>



**Specified By:**

[AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

