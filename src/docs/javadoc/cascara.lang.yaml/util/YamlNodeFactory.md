Package [io.github.qishr.cascara.lang.yaml.util](index.md)

# Class YamlNodeFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.util.YamlNodeFactory<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNodeFactory](../../cascara.common/lang/util/AstNodeFactory.md)<[YamlNode](../ast/YamlNode.md), [YamlScalar](../ast/YamlScalar.md), [YamlSequence](../ast/YamlSequence.md), [YamlMap](../ast/YamlMap.md), [YamlMapEntry](../ast/YamlMapEntry.md), [YamlNode](../ast/YamlNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlNodeFactory__</span>


## Constructor Summary

| Constructor       | Description |
|-------------------|-------------|
| YamlNodeFactory() |             |



## Method Summary

| Modifier and Type                             | Method                                                                                                                                                                                                                                                                                               | Description |
|-----------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [YamlScalar](../ast/YamlScalar.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)                                                                                                                                                         |             |
| public [YamlScalar](../ast/YamlScalar.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) quoteStyle)                                                                                  |             |
| public [YamlScalar](../ast/YamlScalar.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) quoteStyle, [LanguageOptions](../../cascara.common/lang/util/LanguageOptions.md)<?> options) |             |
| public [YamlScalar](../ast/YamlScalar.md)     | [createKey](#createkey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                                                                                            |             |
| public [YamlSequence](../ast/YamlSequence.md) | [createSequenceNode](#createsequencenode)()                                                                                                                                                                                                                                                          |             |
| public [YamlMap](../ast/YamlMap.md)           | [createMapNode](#createmapnode)()                                                                                                                                                                                                                                                                    |             |



## Method Details

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](../ast/YamlScalar.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/util/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](../ast/YamlScalar.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) quoteStyle)</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/util/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](../ast/YamlScalar.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) quoteStyle, [LanguageOptions](../../cascara.common/lang/util/LanguageOptions.md)<?> options)</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/util/AstNodeFactory.md)


---

### createKey

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](../ast/YamlScalar.md) __createKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/util/AstNodeFactory.md)


---

### createSequenceNode

<span style="font-family: monospace; font-size: 80%;">public [YamlSequence](../ast/YamlSequence.md) __createSequenceNode__()</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/util/AstNodeFactory.md)


---

### createMapNode

<span style="font-family: monospace; font-size: 80%;">public [YamlMap](../ast/YamlMap.md) __createMapNode__()</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/util/AstNodeFactory.md)


---

