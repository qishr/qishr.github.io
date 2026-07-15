Package [io.github.qishr.cascara.common.lang.ast](index.md)

# Interface AstVisitor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.ast.AstVisitor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public interface __AstVisitor__</span>

Defines a visitor pattern interface for traversing the Cascara AST hierarchy.


## Method Summary

| Modifier and Type    | Method                                                            | Description |
|----------------------|-------------------------------------------------------------------|-------------|
| public abstract void | [visit](#visit)([MapAstNode](MapAstNode.md)<?, ?, ?> node)        |             |
| public abstract void | [visit](#visit)([MapEntryAstNode](MapEntryAstNode.md)<?, ?> node) |             |
| public abstract void | [visit](#visit)([SequenceAstNode](SequenceAstNode.md)<?> node)    |             |
| public abstract void | [visit](#visit)([ScalarAstNode](ScalarAstNode.md)<?> node)        |             |
| public abstract void | [visit](#visit)([CommentAstNode](CommentAstNode.md) node)         |             |



## Method Details

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([MapAstNode](MapAstNode.md)<?, ?, ?> node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([MapEntryAstNode](MapEntryAstNode.md)<?, ?> node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([SequenceAstNode](SequenceAstNode.md)<?> node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([ScalarAstNode](ScalarAstNode.md)<?> node)</span>




---

### visit

<span style="font-family: monospace; font-size: 80%;">public abstract void __visit__([CommentAstNode](CommentAstNode.md) node)</span>




---

