Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlConverter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.internal.AbstractYamlProcessor](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/internal/AbstractYamlProcessor.html)<[io.github.qishr.cascara.lang.yaml.processor.YamlConverter](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlConverter.md)><br/>
                io.github.qishr.cascara.lang.yaml.processor.YamlConverter<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstConverter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstConverter.md)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlConverter__<br/>extends [AbstractYamlProcessor](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/internal/AbstractYamlProcessor.html)<[YamlConverter](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlConverter.md)>
</span>


## Constructor Summary

| Constructor     | Description |
|-----------------|-------------|
| YamlConverter() |             |



## Method Summary

| Modifier and Type                                                                                                 | Method                                                                                                                          | Description |
|-------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [YamlConverter](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlConverter.md)      | [self](#self)()                                                                                                                 |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)               | [toString](#tostring)([AstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) ast) |             |
| public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)                         | [fromAst](#fromast)([AstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) ast)   |             |
| public [PlainNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/plain/PlainNode.md) | [toPlainAst](#toplainast)([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) yaml)              |             |



## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [YamlConverter](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlConverter.md) __self__()</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__([AstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) ast)</span>



**Specified By:**

[AstConverter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstConverter.md)


---

### fromAst

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) __fromAst__([AstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) ast)</span>



**Specified By:**

[AstConverter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstConverter.md)


---

### toPlainAst

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [PlainNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/plain/PlainNode.md) __toPlainAst__([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) yaml)</span>




---

