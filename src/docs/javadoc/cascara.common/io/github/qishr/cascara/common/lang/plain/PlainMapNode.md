Package [io.github.qishr.cascara.common.lang.plain](index.md)

# Class PlainMapNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.plain.PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)<br/>
                io.github.qishr.cascara.common.lang.plain.PlainMapNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)<[PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md), [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md), [PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public final class __PlainMapNode__<br/>extends [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)
</span>


## Constructor Summary

| Constructor    | Description |
|----------------|-------------|
| PlainMapNode() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                 | Method                                                                                                                                                                                                            | Description               |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------|
| public boolean                                                                                                                                                                                                    | [isEmpty](#isempty)()                                                                                                                                                                                             |                           |
| public int                                                                                                                                                                                                        | [size](#size)()                                                                                                                                                                                                   |                           |
| public boolean                                                                                                                                                                                                    | [containsKey](#containskey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                     |                           |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)>                           | [keySet](#keyset)()                                                                                                                                                                                               |                           |
| public [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)                                                                                                                   | [get](#get)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                     |                           |
| public [PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md)                                                                                                   | [getEntry](#getentry)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                           |                           |
| public [PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md)                                                                                                   | [getEntry](#getentry)(int i)                                                                                                                                                                                      |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md)>         | [getEntries](#getentries)()                                                                                                                                                                                       |                           |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md)>           | [entrySet](#entryset)()                                                                                                                                                                                           |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)>                         | [values](#values)()                                                                                                                                                                                               |                           |
| public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md)                                                                                                             | [put](#put)([PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) key, [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) value)         |                           |
| public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md)                                                                                                             | [remove](#remove)([PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) key)                                                                                                   |                           |
| public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md)                                                                                                             | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |                           |
| public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md)                                                                                                             | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html) value) |                           |
| public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md)                                                                                                             | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) value)     |                           |
| public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md)                                                                                                             | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                               |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md)>         | [getChildren](#getchildren)()                                                                                                                                                                                     |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/CommentAstNode.md)>                 | [getComments](#getcomments)()                                                                                                                                                                                     |                           |
| public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md)                                                                                                             | [getMap](#getmap)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                               |                           |
| public [PlainSequenceNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainSequenceNode.md)                                                                                                   | [getSequence](#getsequence)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                     |                           |
| public [PlainScalarNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainScalarNode.md)                                                                                                       | [getScalar](#getscalar)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                         |                           |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md)> | [iterator](#iterator)()                                                                                                                                                                                           | Returns Iterator instance |


### Methods inherited from [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)

getEndColumn, getEndLine, getStartColumn, getToken, getStartLine


## Method Details

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### size

<span style="font-family: monospace; font-size: 80%;">public int __size__()</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### containsKey

<span style="font-family: monospace; font-size: 80%;">public boolean __containsKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### keySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)> __keySet__()</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">public [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) __get__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getEntry

<span style="font-family: monospace; font-size: 80%;">public [PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md) __getEntry__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getEntry

<span style="font-family: monospace; font-size: 80%;">public [PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md) __getEntry__(int i)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md)> __getEntries__()</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### entrySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md)> __entrySet__()</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### values

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)> __values__()</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) __put__([PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) key, [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) value)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) __remove__([PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) key)</span>




---

### put

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html) value)</span>




---

### put

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) value)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md)> __getChildren__()</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/CommentAstNode.md)> __getComments__()</span>




---

### getMap

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) __getMap__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getSequence

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [PlainSequenceNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainSequenceNode.md) __getSequence__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getScalar

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [PlainScalarNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainScalarNode.md) __getScalar__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md)> __iterator__()</span>

Returns Iterator instance


---

