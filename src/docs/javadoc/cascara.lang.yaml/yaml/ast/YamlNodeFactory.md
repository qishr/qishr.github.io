Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlNodeFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.ast.YamlNodeFactory<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)<[YamlNode](YamlNode.md), [YamlScalar](YamlScalar.md), [YamlSequence](YamlSequence.md), [YamlMap](YamlMap.md), [YamlMapEntry](YamlMapEntry.md), [YamlNode](YamlNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlNodeFactory__</span>


## Constructor Summary

| Constructor       | Description |
|-------------------|-------------|
| YamlNodeFactory() |             |



## Method Summary

| Modifier and Type                      | Method                                                                                                                                                                                                                                                                                                     | Description |
|----------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [YamlScalar](YamlScalar.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)                                                                                                                                                               |             |
| public [YamlScalar](YamlScalar.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key, [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) quoteStyle)                                                                                          |             |
| public [YamlScalar](YamlScalar.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) quoteStyle, [LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)<?> options) |             |
| public [YamlScalar](YamlScalar.md)     | [createKey](#createkey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                                                                                                  |             |
| public [YamlSequence](YamlSequence.md) | [createSequenceNode](#createsequencenode)()                                                                                                                                                                                                                                                                |             |
| public [YamlMap](YamlMap.md)           | [createMapNode](#createmapnode)()                                                                                                                                                                                                                                                                          |             |



## Method Details

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](YamlScalar.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](YamlScalar.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key, [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) quoteStyle)</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](YamlScalar.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) quoteStyle, [LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)<?> options)</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createKey

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](YamlScalar.md) __createKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createSequenceNode

<span style="font-family: monospace; font-size: 80%;">public [YamlSequence](YamlSequence.md) __createSequenceNode__()</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createMapNode

<span style="font-family: monospace; font-size: 80%;">public [YamlMap](YamlMap.md) __createMapNode__()</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

