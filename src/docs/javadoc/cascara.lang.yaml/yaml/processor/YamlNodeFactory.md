Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlNodeFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.processor.YamlNodeFactory<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)<[YamlNode](../ast/YamlNode.md), [YamlScalarNode](../ast/YamlScalarNode.md), [YamlSequenceNode](../ast/YamlSequenceNode.md), [YamlMapNode](../ast/YamlMapNode.md), [YamlMapEntryNode](../ast/YamlMapEntryNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlNodeFactory__</span>


## Constructor Summary

| Constructor       | Description |
|-------------------|-------------|
| YamlNodeFactory() |             |



## Method Summary

| Modifier and Type                                     | Method                                                                                                                                                                                                            | Description |
|-------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [YamlScalarNode](../ast/YamlScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) primitiveValue)                                                                |             |
| public [YamlScalarNode](../ast/YamlScalarNode.md)     | [createScalarNode](#createscalarnode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key, [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) quoteStyle) |             |
| public [YamlScalarNode](../ast/YamlScalarNode.md)     | [createScalarNode](#createscalarnode)([Primitive](../../../cascara.common/lang/type/Primitive.md) primitive)                                                                                                      |             |
| public [YamlScalarNode](../ast/YamlScalarNode.md)     | [createScalarKeyNode](#createscalarkeynode)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                     |             |
| public [YamlSequenceNode](../ast/YamlSequenceNode.md) | [createSequenceNode](#createsequencenode)()                                                                                                                                                                       |             |
| public [YamlMapNode](../ast/YamlMapNode.md)           | [createMapNode](#createmapnode)()                                                                                                                                                                                 |             |



## Method Details

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalarNode](../ast/YamlScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) primitiveValue)</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalarNode](../ast/YamlScalarNode.md) __createScalarNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key, [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) quoteStyle)</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createScalarNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalarNode](../ast/YamlScalarNode.md) __createScalarNode__([Primitive](../../../cascara.common/lang/type/Primitive.md) primitive)</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createScalarKeyNode

<span style="font-family: monospace; font-size: 80%;">public [YamlScalarNode](../ast/YamlScalarNode.md) __createScalarKeyNode__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createSequenceNode

<span style="font-family: monospace; font-size: 80%;">public [YamlSequenceNode](../ast/YamlSequenceNode.md) __createSequenceNode__()</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

### createMapNode

<span style="font-family: monospace; font-size: 80%;">public [YamlMapNode](../ast/YamlMapNode.md) __createMapNode__()</span>



**Specified By:**

[AstNodeFactory](../../../cascara.common/lang/ast/AstNodeFactory.md)


---

