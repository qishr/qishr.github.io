Package [io.github.qishr.cascara.common.lang.reference](index.md)

# Class ReferenceNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.reference.ReferenceNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNode](../ast/AstNode.md)

Direct Known Subtypes:<br/>
    [ReferenceMapNode](ReferenceMapNode.md), [ReferenceSequenceNode](ReferenceSequenceNode.md), [ReferenceScalarNode](ReferenceScalarNode.md), [ReferenceMapEntryNode](ReferenceMapEntryNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __ReferenceNode__</span>


## Constructor Summary

| Constructor     | Description |
|-----------------|-------------|
| ReferenceNode() |             |



## Method Summary

| Modifier and Type                 | Method                              | Description |
|-----------------------------------|-------------------------------------|-------------|
| public int                        | [getStartLine](#getstartline)()     |             |
| public int                        | [getStartColumn](#getstartcolumn)() |             |
| public int                        | [getEndLine](#getendline)()         |             |
| public int                        | [getEndColumn](#getendcolumn)()     |             |
| public [Token](../token/Token.md) | [getToken](#gettoken)()             |             |



## Method Details

### getStartLine

<span style="font-family: monospace; font-size: 80%;">public int __getStartLine__()</span>



**Specified By:**

[AstNode](../ast/AstNode.md)


---

### getStartColumn

<span style="font-family: monospace; font-size: 80%;">public int __getStartColumn__()</span>



**Specified By:**

[AstNode](../ast/AstNode.md)


---

### getEndLine

<span style="font-family: monospace; font-size: 80%;">public int __getEndLine__()</span>



**Specified By:**

[AstNode](../ast/AstNode.md)


---

### getEndColumn

<span style="font-family: monospace; font-size: 80%;">public int __getEndColumn__()</span>



**Specified By:**

[AstNode](../ast/AstNode.md)


---

### getToken

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [Token](../token/Token.md) __getToken__()</span>



**Specified By:**

[AstNode](../ast/AstNode.md)


---

