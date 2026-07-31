Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Interface YamlVisitor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.ast.YamlVisitor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public interface __YamlVisitor__</span>

Defines a visitor pattern interface for traversing the Cascara YAML AST hierarchy.


## Method Summary

| Modifier and Type    | Method                                                  | Description |
|----------------------|---------------------------------------------------------|-------------|
| public abstract void | [visit](#visit)([YamlStream](YamlStream.md) node)       |             |
| public abstract void | [visit](#visit)([YamlDocument](YamlDocument.md) node)   |             |
| public abstract void | [visit](#visit)([YamlDirective](YamlDirective.md) node) |             |
| public abstract void | [visit](#visit)([YamlMap](YamlMap.md) node)             |             |
| public abstract void | [visit](#visit)([YamlMapEntry](YamlMapEntry.md) node)   |             |
| public abstract void | [visit](#visit)([YamlSequence](YamlSequence.md) node)   |             |
| public abstract void | [visit](#visit)([YamlScalar](YamlScalar.md) node)       |             |
| public abstract void | [visit](#visit)([YamlAlias](YamlAlias.md) node)         |             |
| public abstract void | [visit](#visit)([YamlComment](YamlComment.md) node)     |             |
| public abstract void | [visit](#visit)([YamlAnchor](YamlAnchor.md) node)       |             |



## Method Details

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlStream](YamlStream.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlDocument](YamlDocument.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlDirective](YamlDirective.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlMap](YamlMap.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlMapEntry](YamlMapEntry.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlSequence](YamlSequence.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlScalar](YamlScalar.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlAlias](YamlAlias.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlComment](YamlComment.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlAnchor](YamlAnchor.md) node)</span>




---

