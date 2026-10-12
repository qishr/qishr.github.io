Package [io.github.qishr.cascara.lang.yaml.util](index.md)

# Class YamlNodeFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.util.YamlNodeFactory<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNodeFactory](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md), [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md), [YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md), [YamlMap](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMap.md), [YamlMapEntry](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMapEntry.md), [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlNodeFactory__</span>


## Constructor Summary

| Constructor       | Description |
|-------------------|-------------|
| YamlNodeFactory() |             |



## Method Summary

| Modifier and Type                                                                                 | Method                                                                                                                                                                                                                                                                                                                                                                                                 | Description |
|---------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)                                                                                                                                                                                                                                                           |             |
| public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/QuoteStyle.md) quoteStyle)                                                                                                                                   |             |
| public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/QuoteStyle.md) quoteStyle, [LanguageOptions](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options) |             |
| public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md)     | [createKey](#createkey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                                                                                                                                                                                              |             |
| public [YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md) | [createSequenceNode](#createsequencenode)()                                                                                                                                                                                                                                                                                                                                                            |             |
| public [YamlMap](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMap.md)           | [createMapNode](#createmapnode)()                                                                                                                                                                                                                                                                                                                                                                      |             |



## Method Details

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)</span>



**Specified By:**

[AstNodeFactory](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/QuoteStyle.md) quoteStyle)</span>



**Specified By:**

[AstNodeFactory](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/QuoteStyle.md) quoteStyle, [LanguageOptions](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options)</span>



**Specified By:**

[AstNodeFactory](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

### createKey

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md) __createKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[AstNodeFactory](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

### createSequenceNode

<span style="font-family: monospace; font-size: 80%;">public [YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md) __createSequenceNode__()</span>



**Specified By:**

[AstNodeFactory](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

### createMapNode

<span style="font-family: monospace; font-size: 80%;">public [YamlMap](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMap.md) __createMapNode__()</span>



**Specified By:**

[AstNodeFactory](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)


---

