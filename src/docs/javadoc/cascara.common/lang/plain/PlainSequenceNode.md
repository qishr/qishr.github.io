Package [io.github.qishr.cascara.common.lang.plain](index.md)

# Class PlainSequenceNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.plain.PlainNode](PlainNode.md)<br/>
                io.github.qishr.cascara.common.lang.plain.PlainSequenceNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [SequenceAstNode](../ast/SequenceAstNode.md)<[PlainNode](PlainNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public final class __PlainSequenceNode__<br/>extends [PlainNode](PlainNode.md)
</span>


## Constructor Summary

| Constructor         | Description |
|---------------------|-------------|
| PlainSequenceNode() |             |



## Method Summary

| Modifier and Type                                                                                                                           | Method                                            | Description               |
|---------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------|---------------------------|
| public int                                                                                                                                  | [size](#size)()                                   |                           |
| public boolean                                                                                                                              | [isEmpty](#isempty)()                             |                           |
| public [PlainSequenceNode](PlainSequenceNode.md)                                                                                            | [clear](#clear)()                                 |                           |
| public [PlainSequenceNode](PlainSequenceNode.md)                                                                                            | [add](#add)([PlainNode](PlainNode.md) node)       |                           |
| public [PlainSequenceNode](PlainSequenceNode.md)                                                                                            | [remove](#remove)([PlainNode](PlainNode.md) node) |                           |
| public [PlainSequenceNode](PlainSequenceNode.md)                                                                                            | [remove](#remove)(int index)                      |                           |
| public [PlainNode](PlainNode.md)                                                                                                            | [get](#get)(int index)                            |                           |
| public [PlainNode](PlainNode.md)                                                                                                            | [getFirst](#getfirst)()                           |                           |
| public [PlainNode](PlainNode.md)                                                                                                            | [getLast](#getlast)()                             |                           |
| public [PlainMapNode](PlainMapNode.md)                                                                                                      | [getMap](#getmap)(int i)                          |                           |
| public [PlainSequenceNode](PlainSequenceNode.md)                                                                                            | [getSequence](#getsequence)(int i)                |                           |
| public [PlainScalarNode](PlainScalarNode.md)                                                                                                | [getScalar](#getscalar)(int i)                    |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainNode](PlainNode.md)>                  | [getElements](#getelements)()                     |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [AstNode](../ast/AstNode.md)>     | [getChildren](#getchildren)()                     |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../ast/CommentAstNode.md)> | [getComments](#getcomments)()                     |                           |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[PlainNode](PlainNode.md)>          | [iterator](#iterator)()                           | Returns Iterator instance |


### Methods inherited from [PlainNode](PlainNode.md)

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

<span style="font-family: monospace; font-size: 80%;">public [PlainSequenceNode](PlainSequenceNode.md) __clear__()</span>



**Specified By:**

[SequenceAstNode](../ast/SequenceAstNode.md)


---

### add

<span style="font-family: monospace; font-size: 80%;">public [PlainSequenceNode](PlainSequenceNode.md) __add__([PlainNode](PlainNode.md) node)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public [PlainSequenceNode](PlainSequenceNode.md) __remove__([PlainNode](PlainNode.md) node)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public [PlainSequenceNode](PlainSequenceNode.md) __remove__(int index)</span>



**Specified By:**

[SequenceAstNode](../ast/SequenceAstNode.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">public [PlainNode](PlainNode.md) __get__(int index)</span>



**Specified By:**

[SequenceAstNode](../ast/SequenceAstNode.md)


---

### getFirst

<span style="font-family: monospace; font-size: 80%;">public [PlainNode](PlainNode.md) __getFirst__()</span>



**Specified By:**

[SequenceAstNode](../ast/SequenceAstNode.md)


---

### getLast

<span style="font-family: monospace; font-size: 80%;">public [PlainNode](PlainNode.md) __getLast__()</span>



**Specified By:**

[SequenceAstNode](../ast/SequenceAstNode.md)


---

### getMap

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](PlainMapNode.md) __getMap__(int i)</span>




---

### getSequence

<span style="font-family: monospace; font-size: 80%;">public [PlainSequenceNode](PlainSequenceNode.md) __getSequence__(int i)</span>




---

### getScalar

<span style="font-family: monospace; font-size: 80%;">public [PlainScalarNode](PlainScalarNode.md) __getScalar__(int i)</span>




---

### getElements

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainNode](PlainNode.md)> __getElements__()</span>



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

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[PlainNode](PlainNode.md)> __iterator__()</span>

Returns Iterator instance

**Specified By:**

[SequenceAstNode](../ast/SequenceAstNode.md)


---

