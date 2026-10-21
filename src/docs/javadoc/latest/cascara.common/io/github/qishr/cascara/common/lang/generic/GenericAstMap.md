Package [io.github.qishr.cascara.common.lang.generic](index.md)

# Class GenericAstMap
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.generic.GenericAstNode](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstNode.md)<br/>
                io.github.qishr.cascara.common.lang.generic.GenericAstMap<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md), [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md), [GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md)>


----

<span style="font-family: monospace; font-size: 80%;">public final class __GenericAstMap__<br/>extends [GenericAstNode](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstNode.md)
</span>


## Constructor Summary

| Constructor     | Description |
|-----------------|-------------|
| GenericAstMap() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                     | Method                                                                                                                                                                                                            | Description               |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------|
| public boolean                                                                                                                                                                                                        | [isEmpty](#isempty)()                                                                                                                                                                                             |                           |
| public int                                                                                                                                                                                                            | [size](#size)()                                                                                                                                                                                                   |                           |
| public boolean                                                                                                                                                                                                        | [containsKey](#containskey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                     |                           |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)>                                     | [keySet](#keyset)()                                                                                                                                                                                               |                           |
| public [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)                                                                                                                             | [get](#get)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                     |                           |
| public [GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md)                                                                                                   | [getEntry](#getentry)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                           |                           |
| public [GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md)                                                                                                   | [getEntry](#getentry)(int i)                                                                                                                                                                                      |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md)>         | [getEntries](#getentries)()                                                                                                                                                                                       |                           |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md)>           | [entrySet](#entryset)()                                                                                                                                                                                           |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)>                                   | [values](#values)()                                                                                                                                                                                               |                           |
| public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md)                                                                                                             | [put](#put)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) key, [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) value)                     |                           |
| public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md)                                                                                                             | [remove](#remove)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) key)                                                                                                         |                           |
| public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md)                                                                                                             | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |                           |
| public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md)                                                                                                             | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html) value) |                           |
| public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md)                                                                                                             | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) value)           |                           |
| public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md)                                                                                                             | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                               |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md)>         | [getChildren](#getchildren)()                                                                                                                                                                                     |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/CommentAstNode.md)>                     | [getComments](#getcomments)()                                                                                                                                                                                     |                           |
| public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md)                                                                                                             | [getMap](#getmap)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                               |                           |
| public [SequenceAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)>                         | [getSequence](#getsequence)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                     |                           |
| public [ScalarAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)>                             | [getScalar](#getscalar)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                         |                           |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md)> | [iterator](#iterator)()                                                                                                                                                                                           | Returns Iterator instance |


### Methods inherited from [GenericAstNode](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstNode.md)

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

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)> __keySet__()</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">public [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) __get__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getEntry

<span style="font-family: monospace; font-size: 80%;">public [GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md) __getEntry__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getEntry

<span style="font-family: monospace; font-size: 80%;">public [GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md) __getEntry__(int i)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md)> __getEntries__()</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### entrySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md)> __entrySet__()</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### values

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)> __values__()</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md) __put__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) key, [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) value)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md) __remove__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) key)</span>




---

### put

<span style="font-family: monospace; font-size: 80%;">public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html) value)</span>




---

### put

<span style="font-family: monospace; font-size: 80%;">public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) value)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md) __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md)> __getChildren__()</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/CommentAstNode.md)> __getComments__()</span>




---

### getMap

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md) __getMap__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getSequence

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [SequenceAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)> __getSequence__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getScalar

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [ScalarAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)> __getScalar__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md)> __iterator__()</span>

Returns Iterator instance


---

