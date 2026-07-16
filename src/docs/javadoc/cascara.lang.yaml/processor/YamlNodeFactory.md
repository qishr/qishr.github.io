Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlNodeFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.processor.YamlNodeFactory<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNodeFactory](../../cascara.common/lang/ast/AstNodeFactory.md)<[YamlNode](../ast/YamlNode.md), [YamlScalarNode](../ast/YamlScalarNode.md), [YamlSequenceNode](../ast/YamlSequenceNode.md), [YamlMapNode](../ast/YamlMapNode.md), [YamlMapEntryNode](../ast/YamlMapEntryNode.md), [YamlNode](../ast/YamlNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlNodeFactory__</span>


## Constructor Summary

| Constructor       | Description |
|-------------------|-------------|
| YamlNodeFactory() |             |



## Method Summary

| Modifier and Type                                     | Method                                                                                                                                                                                                                                                                                               | Description |
|-------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [YamlScalarNode](../ast/YamlScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)                                                                                                                                                         |             |
| public [YamlScalarNode](../ast/YamlScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) quoteStyle)                                                                                       |             |
| public [YamlScalarNode](../ast/YamlScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) quoteStyle, [LanguageOptions](../../cascara.common/lang/util/LanguageOptions.md)<?> options) |             |
| public [YamlScalarNode](../ast/YamlScalarNode.md)     | [createKey](#createkey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                                                                                            |             |
| public [YamlSequenceNode](../ast/YamlSequenceNode.md) | [createSequenceNode](#createsequencenode)()                                                                                                                                                                                                                                                          |             |
| public [YamlMapNode](../ast/YamlMapNode.md)           | [createMapNode](#createmapnode)()                                                                                                                                                                                                                                                                    |             |



## Method Details

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalarNode](../ast/YamlScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalarNode](../ast/YamlScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) quoteStyle)</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalarNode](../ast/YamlScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) quoteStyle, [LanguageOptions](../../cascara.common/lang/util/LanguageOptions.md)<?> options)</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createKey

<span style="font-family: monospace; font-size: 80%;">public [YamlScalarNode](../ast/YamlScalarNode.md) __createKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createSequenceNode

<span style="font-family: monospace; font-size: 80%;">public [YamlSequenceNode](../ast/YamlSequenceNode.md) __createSequenceNode__()</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createMapNode

<span style="font-family: monospace; font-size: 80%;">public [YamlMapNode](../ast/YamlMapNode.md) __createMapNode__()</span>



**Specified By:**

[AstNodeFactory](../../cascara.common/lang/ast/AstNodeFactory.md)


---

