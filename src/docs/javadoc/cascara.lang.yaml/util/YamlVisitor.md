Package [io.github.qishr.cascara.lang.yaml.util](index.md)

# Interface YamlVisitor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.util.YamlVisitor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public interface __YamlVisitor__</span>

Defines a visitor pattern interface for traversing the Cascara YAML AST hierarchy.


## Method Summary

| Modifier and Type    | Method                                                         | Description |
|----------------------|----------------------------------------------------------------|-------------|
| public abstract void | [visit](#visit)([YamlStream](../ast/YamlStream.md) node)       |             |
| public abstract void | [visit](#visit)([YamlDocument](../ast/YamlDocument.md) node)   |             |
| public abstract void | [visit](#visit)([YamlDirective](../ast/YamlDirective.md) node) |             |
| public abstract void | [visit](#visit)([YamlMap](../ast/YamlMap.md) node)             |             |
| public abstract void | [visit](#visit)([YamlMapEntry](../ast/YamlMapEntry.md) node)   |             |
| public abstract void | [visit](#visit)([YamlSequence](../ast/YamlSequence.md) node)   |             |
| public abstract void | [visit](#visit)([YamlScalar](../ast/YamlScalar.md) node)       |             |
| public abstract void | [visit](#visit)([YamlAlias](../ast/YamlAlias.md) node)         |             |
| public abstract void | [visit](#visit)([YamlComment](../ast/YamlComment.md) node)     |             |
| public abstract void | [visit](#visit)([YamlAnchor](../ast/YamlAnchor.md) node)       |             |



## Method Details

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlStream](../ast/YamlStream.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlDocument](../ast/YamlDocument.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlDirective](../ast/YamlDirective.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlMap](../ast/YamlMap.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlMapEntry](../ast/YamlMapEntry.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlSequence](../ast/YamlSequence.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlScalar](../ast/YamlScalar.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlAlias](../ast/YamlAlias.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlComment](../ast/YamlComment.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlAnchor](../ast/YamlAnchor.md) node)</span>




---

