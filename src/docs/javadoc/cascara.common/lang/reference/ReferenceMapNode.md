Package [io.github.qishr.cascara.common.lang.reference](index.md)

# Class ReferenceMapNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.reference.ReferenceNode](ReferenceNode.md)<br/>
                io.github.qishr.cascara.common.lang.reference.ReferenceMapNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapAstNode](../ast/MapAstNode.md)<[ReferenceNode](ReferenceNode.md), [ReferenceMapEntryNode](ReferenceMapEntryNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public final class __ReferenceMapNode__<br/>extends [ReferenceNode](ReferenceNode.md)
</span>


## Constructor Summary

| Constructor        | Description |
|--------------------|-------------|
| ReferenceMapNode() |             |



## Method Summary

| Modifier and Type                                                                                                                                  | Method                                                                                                                                                                                                            | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public boolean                                                                                                                                     | [isEmpty](#isempty)()                                                                                                                                                                                             |             |
| public int                                                                                                                                         | [size](#size)()                                                                                                                                                                                                   |             |
| public boolean                                                                                                                                     | [containsKey](#containskey)([ReferenceNode](ReferenceNode.md) key)                                                                                                                                                |             |
| public [ReferenceNode](ReferenceNode.md)                                                                                                           | [get](#get)([ReferenceNode](ReferenceNode.md) key)                                                                                                                                                                |             |
| public [ReferenceMapEntryNode](ReferenceMapEntryNode.md)                                                                                           | [getEntry](#getentry)([ReferenceNode](ReferenceNode.md) key)                                                                                                                                                      |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ReferenceMapEntryNode](ReferenceMapEntryNode.md)> | [getEntries](#getentries)()                                                                                                                                                                                       |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ReferenceNode](ReferenceNode.md)>                   | [keySet](#keyset)()                                                                                                                                                                                               |             |
| public [ReferenceMapNode](ReferenceMapNode.md)                                                                                                     | [put](#put)([ReferenceNode](ReferenceNode.md) key, [ReferenceNode](ReferenceNode.md) value)                                                                                                                       |             |
| public [ReferenceMapNode](ReferenceMapNode.md)                                                                                                     | [remove](#remove)([ReferenceNode](ReferenceNode.md) key)                                                                                                                                                          |             |
| public boolean                                                                                                                                     | [containsKey](#containskey)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                     |             |
| public [ReferenceMapNode](ReferenceMapNode.md)                                                                                                     | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |             |
| public [ReferenceMapNode](ReferenceMapNode.md)                                                                                                     | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [ReferenceNode](ReferenceNode.md) value)                                                            |             |
| public [ReferenceMapNode](ReferenceMapNode.md)                                                                                                     | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                               |             |
| public [ReferenceNode](ReferenceNode.md)                                                                                                           | [get](#get)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                     |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ReferenceMapEntryNode](ReferenceMapEntryNode.md)> | [getChildren](#getchildren)()                                                                                                                                                                                     |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../ast/CommentAstNode.md)>        | [getComments](#getcomments)()                                                                                                                                                                                     |             |
| public [ReferenceMapNode](ReferenceMapNode.md)                                                                                                     | [getMap](#getmap)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                               |             |
| public [ReferenceSequenceNode](ReferenceSequenceNode.md)                                                                                           | [getSequence](#getsequence)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                     |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ReferenceMapEntryNode](ReferenceMapEntryNode.md)>   | [entrySet](#entryset)()                                                                                                                                                                                           |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ReferenceNode](ReferenceNode.md)>                 | [values](#values)()                                                                                                                                                                                               |             |


### Methods inherited from [ReferenceNode](ReferenceNode.md)

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

<span style="font-family: monospace; font-size: 80%;">public boolean __containsKey__([ReferenceNode](ReferenceNode.md) key)</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public [ReferenceNode](ReferenceNode.md) __get__([ReferenceNode](ReferenceNode.md) key)</span>




---

### getEntry

<span style="font-family: monospace; font-size: 80%;">public [ReferenceMapEntryNode](ReferenceMapEntryNode.md) __getEntry__([ReferenceNode](ReferenceNode.md) key)</span>




---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ReferenceMapEntryNode](ReferenceMapEntryNode.md)> __getEntries__()</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### keySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ReferenceNode](ReferenceNode.md)> __keySet__()</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [ReferenceMapNode](ReferenceMapNode.md) __put__([ReferenceNode](ReferenceNode.md) key, [ReferenceNode](ReferenceNode.md) value)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public [ReferenceMapNode](ReferenceMapNode.md) __remove__([ReferenceNode](ReferenceNode.md) key)</span>




---

### containsKey

<span style="font-family: monospace; font-size: 80%;">public boolean __containsKey__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [ReferenceMapNode](ReferenceMapNode.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [ReferenceMapNode](ReferenceMapNode.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [ReferenceNode](ReferenceNode.md) value)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public [ReferenceMapNode](ReferenceMapNode.md) __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">public [ReferenceNode](ReferenceNode.md) __get__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ReferenceMapEntryNode](ReferenceMapEntryNode.md)> __getChildren__()</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../ast/CommentAstNode.md)> __getComments__()</span>




---

### getMap

<span style="font-family: monospace; font-size: 80%;">public [ReferenceMapNode](ReferenceMapNode.md) __getMap__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### getSequence

<span style="font-family: monospace; font-size: 80%;">public [ReferenceSequenceNode](ReferenceSequenceNode.md) __getSequence__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### entrySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ReferenceMapEntryNode](ReferenceMapEntryNode.md)> __entrySet__()</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

### values

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ReferenceNode](ReferenceNode.md)> __values__()</span>



**Specified By:**

[MapAstNode](../ast/MapAstNode.md)


---

