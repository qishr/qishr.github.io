Package [io.github.qishr.cascara.common.lang.reference](index.md)

# Class ReferenceSequenceNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.reference.ReferenceNode](ReferenceNode.md)<br/>
                io.github.qishr.cascara.common.lang.reference.ReferenceSequenceNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [SequenceAstNode](../ast/SequenceAstNode.md)<[ReferenceNode](ReferenceNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public final class __ReferenceSequenceNode__<br/>extends [ReferenceNode](ReferenceNode.md)
</span>


## Constructor Summary

| Constructor             | Description |
|-------------------------|-------------|
| ReferenceSequenceNode() |             |



## Method Summary

| Modifier and Type                                                                                                                           | Method                                                    | Description               |
|---------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------|---------------------------|
| public int                                                                                                                                  | [size](#size)()                                           |                           |
| public boolean                                                                                                                              | [isEmpty](#isempty)()                                     |                           |
| public [ReferenceSequenceNode](ReferenceSequenceNode.md)                                                                                    | [clear](#clear)()                                         |                           |
| public [ReferenceSequenceNode](ReferenceSequenceNode.md)                                                                                    | [add](#add)([ReferenceNode](ReferenceNode.md) node)       |                           |
| public [ReferenceSequenceNode](ReferenceSequenceNode.md)                                                                                    | [remove](#remove)([ReferenceNode](ReferenceNode.md) node) |                           |
| public [ReferenceSequenceNode](ReferenceSequenceNode.md)                                                                                    | [remove](#remove)(int index)                              |                           |
| public [ReferenceNode](ReferenceNode.md)                                                                                                    | [get](#get)(int index)                                    |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ReferenceNode](ReferenceNode.md)>          | [getElements](#getelements)()                             |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [AstNode](../ast/AstNode.md)>     | [getChildren](#getchildren)()                             |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../ast/CommentAstNode.md)> | [getComments](#getcomments)()                             |                           |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[ReferenceNode](ReferenceNode.md)>  | [iterator](#iterator)()                                   | Returns Iterator instance |


### Methods inherited from [ReferenceNode](ReferenceNode.md)

getEndColumn, getEndLine, getStartColumn, getToken, getStartLine


## Method Details

### size

<span style="font-family: monospace; font-size: 80%;">public int __size__()</span>



**Specified By:**

[SequenceAstNode](../ast/SequenceAstNode.md)


---

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>



**Specified By:**

[SequenceAstNode](../ast/SequenceAstNode.md)


---

### clear

<span style="font-family: monospace; font-size: 80%;">public [ReferenceSequenceNode](ReferenceSequenceNode.md) __clear__()</span>



**Specified By:**

[SequenceAstNode](../ast/SequenceAstNode.md)


---

### add

<span style="font-family: monospace; font-size: 80%;">public [ReferenceSequenceNode](ReferenceSequenceNode.md) __add__([ReferenceNode](ReferenceNode.md) node)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public [ReferenceSequenceNode](ReferenceSequenceNode.md) __remove__([ReferenceNode](ReferenceNode.md) node)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public [ReferenceSequenceNode](ReferenceSequenceNode.md) __remove__(int index)</span>



**Specified By:**

[SequenceAstNode](../ast/SequenceAstNode.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">public [ReferenceNode](ReferenceNode.md) __get__(int index)</span>



**Specified By:**

[SequenceAstNode](../ast/SequenceAstNode.md)


---

### getElements

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ReferenceNode](ReferenceNode.md)> __getElements__()</span>



**Specified By:**

[SequenceAstNode](../ast/SequenceAstNode.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [AstNode](../ast/AstNode.md)> __getChildren__()</span>




---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../ast/CommentAstNode.md)> __getComments__()</span>




---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[ReferenceNode](ReferenceNode.md)> __iterator__()</span>

Returns Iterator instance

**Specified By:**

[SequenceAstNode](../ast/SequenceAstNode.md)


---

