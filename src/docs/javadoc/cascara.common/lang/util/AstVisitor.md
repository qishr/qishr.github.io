Package [io.github.qishr.cascara.common.lang.util](index.md)

# Interface AstVisitor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.util.AstVisitor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public interface __AstVisitor__</span>

Defines a visitor pattern interface for traversing the Cascara AST hierarchy.


## Method Summary

| Modifier and Type    | Method                                                                   | Description |
|----------------------|--------------------------------------------------------------------------|-------------|
| public abstract void | [visit](#visit)([MapAstNode](../ast/MapAstNode.md)<?, ?, ?> node)        |             |
| public abstract void | [visit](#visit)([MapEntryAstNode](../ast/MapEntryAstNode.md)<?, ?> node) |             |
| public abstract void | [visit](#visit)([SequenceAstNode](../ast/SequenceAstNode.md)<?> node)    |             |
| public abstract void | [visit](#visit)([ScalarAstNode](../ast/ScalarAstNode.md)<?> node)        |             |
| public abstract void | [visit](#visit)([CommentAstNode](../ast/CommentAstNode.md) node)         |             |



## Method Details

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([MapAstNode](../ast/MapAstNode.md)<?, ?, ?> node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([MapEntryAstNode](../ast/MapEntryAstNode.md)<?, ?> node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([SequenceAstNode](../ast/SequenceAstNode.md)<?> node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([ScalarAstNode](../ast/ScalarAstNode.md)<?> node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([CommentAstNode](../ast/CommentAstNode.md) node)</span>




---

