Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Interface YamlVisitor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.ast.YamlVisitor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public interface __YamlVisitor__</span>

Defines a visitor pattern interface for traversing the Cascara YAML AST hierarchy.


## Method Summary

| Modifier and Type    | Method                                                          | Description |
|----------------------|-----------------------------------------------------------------|-------------|
| public abstract void | [visit](#visit)([YamlStreamNode](YamlStreamNode.md) node)       |             |
| public abstract void | [visit](#visit)([YamlDocumentNode](YamlDocumentNode.md) node)   |             |
| public abstract void | [visit](#visit)([YamlDirectiveNode](YamlDirectiveNode.md) node) |             |
| public abstract void | [visit](#visit)([YamlMapNode](YamlMapNode.md) node)             |             |
| public abstract void | [visit](#visit)([YamlMapEntryNode](YamlMapEntryNode.md) node)   |             |
| public abstract void | [visit](#visit)([YamlSequenceNode](YamlSequenceNode.md) node)   |             |
| public abstract void | [visit](#visit)([YamlScalarNode](YamlScalarNode.md) node)       |             |
| public abstract void | [visit](#visit)([YamlAliasNode](YamlAliasNode.md) node)         |             |
| public abstract void | [visit](#visit)([YamlCommentNode](YamlCommentNode.md) node)     |             |
| public abstract void | [visit](#visit)([YamlAnchorNode](YamlAnchorNode.md) node)       |             |



## Method Details

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlStreamNode](YamlStreamNode.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlDocumentNode](YamlDocumentNode.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlDirectiveNode](YamlDirectiveNode.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlMapNode](YamlMapNode.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlMapEntryNode](YamlMapEntryNode.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlSequenceNode](YamlSequenceNode.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlScalarNode](YamlScalarNode.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlAliasNode](YamlAliasNode.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlCommentNode](YamlCommentNode.md) node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([YamlAnchorNode](YamlAnchorNode.md) node)</span>




---

