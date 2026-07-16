Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlConverter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.processor.AbstractYamlProcessor](AbstractYamlProcessor.md)<[io.github.qishr.cascara.lang.yaml.processor.YamlConverter](YamlConverter.md)><br/>
                io.github.qishr.cascara.lang.yaml.processor.YamlConverter<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstConverter](../../cascara.common/lang/processor/AstConverter.md)<[YamlNode](../ast/YamlNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlConverter__<br/>extends [AbstractYamlProcessor](AbstractYamlProcessor.md)<[YamlConverter](YamlConverter.md)>
</span>


## Constructor Summary

| Constructor     | Description |
|-----------------|-------------|
| YamlConverter() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                       | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------|-------------|
| protected [YamlConverter](YamlConverter.md)                                                         | [self](#self)()                                                              |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toText](#totext)([AstNode](../../cascara.common/lang/ast/AstNode.md) ast)   |             |
| public [YamlNode](../ast/YamlNode.md)                                                               | [fromAst](#fromast)([AstNode](../../cascara.common/lang/ast/AstNode.md) ast) |             |


### Methods inherited from [AbstractYamlProcessor](AbstractYamlProcessor.md)

setReporter, getOptions, getContentType, getServiceProperties, getReporter, setOptions


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [YamlConverter](YamlConverter.md) __self__()</span>



**Overrides:**

[AbstractYamlProcessor](../cascara.lang.yaml/processor/AbstractYamlProcessor.md#self)


---

### toText

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toText__([AstNode](../../cascara.common/lang/ast/AstNode.md) ast)</span>



**Specified By:**

[AstConverter](../../cascara.common/lang/processor/AstConverter.md)


---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../ast/YamlNode.md) __fromAst__([AstNode](../../cascara.common/lang/ast/AstNode.md) ast)</span>



**Specified By:**

[AstConverter](../../cascara.common/lang/processor/AstConverter.md)


---

