Package [io.github.qishr.cascara.lang.yaml.util](index.md)

# Interface YamlVisitor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.util.YamlVisitor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public interface __YamlVisitor__</span>

Defines a visitor pattern interface for traversing the Cascara YAML AST hierarchy.


## Method Summary

| Modifier and Type    | Method                                                                                                             | Description |
|----------------------|--------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract void | [visit](#visit)([YamlStream](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlStream.md) node)       |             |
| public abstract void | [visit](#visit)([YamlDocument](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlDocument.md) node)   |             |
| public abstract void | [visit](#visit)([YamlDirective](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlDirective.md) node) |             |
| public abstract void | [visit](#visit)([YamlMap](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMap.md) node)             |             |
| public abstract void | [visit](#visit)([YamlMapEntry](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMapEntry.md) node)   |             |
| public abstract void | [visit](#visit)([YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md) node)   |             |
| public abstract void | [visit](#visit)([YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md) node)       |             |
| public abstract void | [visit](#visit)([YamlAlias](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlAlias.md) node)         |             |
| public abstract void | [visit](#visit)([YamlComment](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlComment.md) node)     |             |
| public abstract void | [visit](#visit)([YamlAnchor](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlAnchor.md) node)       |             |



## Method Details

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlStream](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlStream.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlDocument](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlDocument.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlDirective](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlDirective.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlMap](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMap.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlMapEntry](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMapEntry.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlAlias](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlAlias.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlComment](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlComment.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlAnchor](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlAnchor.md) node)</span>




---

