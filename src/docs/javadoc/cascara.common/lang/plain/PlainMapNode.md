Package [io.github.qishr.cascara.common.lang.plain](index.md)

# Class PlainMapNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.plain.PlainNode](PlainNode.md)<br/>
                io.github.qishr.cascara.common.lang.plain.PlainMapNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapAstNode](../ast/MapAstNode.md)<[PlainNode](PlainNode.md), [PlainNode](PlainNode.md), [PlainMapEntryNode](PlainMapEntryNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public final class __PlainMapNode__<br/>extends [PlainNode](PlainNode.md)
</span>


## Constructor Summary

| Constructor    | Description |
|----------------|-------------|
| PlainMapNode() |             |



## Method Summary

| Modifier and Type                                                                                                                                  | Method                                                                                                                                                                                                            | Description               |
|----------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------|
| public boolean                                                                                                                                     | [isEmpty](#isempty)()                                                                                                                                                                                             |                           |
| public int                                                                                                                                         | [size](#size)()                                                                                                                                                                                                   |                           |
| public boolean                                                                                                                                     | [containsKey](#containskey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                     |                           |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[PlainNode](PlainNode.md)>                           | [keySet](#keyset)()                                                                                                                                                                                               |                           |
| public [PlainNode](PlainNode.md)                                                                                                                   | [get](#get)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                     |                           |
| public [PlainMapEntryNode](PlainMapEntryNode.md)                                                                                                   | [getEntry](#getentry)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                           |                           |
| public [PlainMapEntryNode](PlainMapEntryNode.md)                                                                                                   | [getEntry](#getentry)(int i)                                                                                                                                                                                      |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainMapEntryNode](PlainMapEntryNode.md)>         | [getEntries](#getentries)()                                                                                                                                                                                       |                           |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[PlainMapEntryNode](PlainMapEntryNode.md)>           | [entrySet](#entryset)()                                                                                                                                                                                           |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainNode](PlainNode.md)>                         | [values](#values)()                                                                                                                                                                                               |                           |
| public [PlainMapNode](PlainMapNode.md)                                                                                                             | [put](#put)([PlainNode](PlainNode.md) key, [PlainNode](PlainNode.md) value)                                                                                                                                       |                           |
| public [PlainMapNode](PlainMapNode.md)                                                                                                             | [remove](#remove)([PlainNode](PlainNode.md) key)                                                                                                                                                                  |                           |
| public [PlainMapNode](PlainMapNode.md)                                                                                                             | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |                           |
| public [PlainMapNode](PlainMapNode.md)                                                                                                             | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [PlainNode](PlainNode.md) value)                                                                    |                           |
| public [PlainMapNode](PlainMapNode.md)                                                                                                             | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                               |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainMapEntryNode](PlainMapEntryNode.md)>         | [getChildren](#getchildren)()                                                                                                                                                                                     |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../ast/CommentAstNode.md)>        | [getComments](#getcomments)()                                                                                                                                                                                     |                           |
| public [PlainMapNode](PlainMapNode.md)                                                                                                             | [getMap](#getmap)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                               |                           |
| public [PlainSequenceNode](PlainSequenceNode.md)                                                                                                   | [getSequence](#getsequence)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                     |                           |
| public [PlainScalarNode](PlainScalarNode.md)                                                                                                       | [getScalar](#getscalar)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                         |                           |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[PlainMapEntryNode](PlainMapEntryNode.md)> | [iterator](#iterator)()                                                                                                                                                                                           | Returns Iterator instance |


### Methods inherited from [PlainNode](PlainNode.md)

getEndColumn, getEndLine, getStartColumn, getToken, getStartLine


## Method Details

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### size

<span style="font-family: monospace; font-size: 80%;">public int __size__()</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### containsKey

<span style="font-family: monospace; font-size: 80%;">public boolean __containsKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### keySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[PlainNode](PlainNode.md)> __keySet__()</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">public [PlainNode](PlainNode.md) __get__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### getEntry

<span style="font-family: monospace; font-size: 80%;">public [PlainMapEntryNode](PlainMapEntryNode.md) __getEntry__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### getEntry

<span style="font-family: monospace; font-size: 80%;">public [PlainMapEntryNode](PlainMapEntryNode.md) __getEntry__(int i)</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainMapEntryNode](PlainMapEntryNode.md)> __getEntries__()</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### entrySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[PlainMapEntryNode](PlainMapEntryNode.md)> __entrySet__()</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### values

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainNode](PlainNode.md)> __values__()</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](PlainMapNode.md) __put__([PlainNode](PlainNode.md) key, [PlainNode](PlainNode.md) value)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](PlainMapNode.md) __remove__([PlainNode](PlainNode.md) key)</span>




---

### put

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](PlainMapNode.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](PlainMapNode.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [PlainNode](PlainNode.md) value)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](PlainMapNode.md) __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainMapEntryNode](PlainMapEntryNode.md)> __getChildren__()</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../ast/CommentAstNode.md)> __getComments__()</span>




---

### getMap

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](PlainMapNode.md) __getMap__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### getSequence

<span style="font-family: monospace; font-size: 80%;">public [PlainSequenceNode](PlainSequenceNode.md) __getSequence__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### getScalar

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [PlainScalarNode](PlainScalarNode.md) __getScalar__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[PlainMapEntryNode](PlainMapEntryNode.md)> __iterator__()</span>

Returns Iterator instance


---

