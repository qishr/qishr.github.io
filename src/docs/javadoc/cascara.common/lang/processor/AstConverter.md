Package [io.github.qishr.cascara.common.lang.processor](index.md)

# Interface AstConverter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.processor.AstConverter<br/>
<br/>
All Implemented Interfaces:<br/>
    [Processor](Processor.md)

All Known Implementing Classes:<br/>
    [JsonConverter](../../../cascara.lang.json/json/processor/JsonConverter.md), [YamlConverter](../../../cascara.lang.yaml/yaml/processor/YamlConverter.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __AstConverter__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                                                | Description |
|--------------------------------------------------------------------------------------------------------------|-------------------------------------------------------|-------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toText](#totext)([AstNode](../ast/AstNode.md) ast)   |             |
| public abstract T                                                                                            | [fromAst](#fromast)([AstNode](../ast/AstNode.md) ast) |             |



## Method Details

### toText

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toText__([AstNode](../ast/AstNode.md) ast)</span>




---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public abstract T __fromAst__([AstNode](../ast/AstNode.md) ast)</span>




---

