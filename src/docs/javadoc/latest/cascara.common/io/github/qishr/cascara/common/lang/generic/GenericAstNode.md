Package [io.github.qishr.cascara.common.lang.generic](index.md)

# Class GenericAstNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.generic.GenericAstNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)

Direct Known Subtypes:<br/>
    [GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md), [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md), [GenericAstSequence](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstSequence.md), [GenericAstScalar](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstScalar.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __GenericAstNode__</span>


## Constructor Summary

| Constructor      | Description |
|------------------|-------------|
| GenericAstNode() |             |



## Method Summary

| Modifier and Type                                                                       | Method                              | Description |
|-----------------------------------------------------------------------------------------|-------------------------------------|-------------|
| public int                                                                              | [getStartLine](#getstartline)()     |             |
| public int                                                                              | [getStartColumn](#getstartcolumn)() |             |
| public int                                                                              | [getEndLine](#getendline)()         |             |
| public int                                                                              | [getEndColumn](#getendcolumn)()     |             |
| public [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) | [getToken](#gettoken)()             |             |



## Method Details

### getStartLine

<span style="font-family: monospace; font-size: 80%;">public int __getStartLine__()</span>



**Specified By:**

[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)


---

### getStartColumn

<span style="font-family: monospace; font-size: 80%;">public int __getStartColumn__()</span>



**Specified By:**

[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)


---

### getEndLine

<span style="font-family: monospace; font-size: 80%;">public int __getEndLine__()</span>



**Specified By:**

[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)


---

### getEndColumn

<span style="font-family: monospace; font-size: 80%;">public int __getEndColumn__()</span>



**Specified By:**

[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)


---

### getToken

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) __getToken__()</span>



**Specified By:**

[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)


---

