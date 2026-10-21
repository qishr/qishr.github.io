Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlSequence
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlSequence<br/>
<br/>
All Implemented Interfaces:<br/>
    [SequenceAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)>, [YamlCollection](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlCollection.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlSequence__<br/>extends [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)
</span>

Represents a YAML sequence (a list of items).


## Constructor Summary

| Constructor                                                                                                | Description |
|------------------------------------------------------------------------------------------------------------|-------------|
| YamlSequence()                                                                                             |             |
| YamlSequence([YamlToken](../../../../../../../io/github/qishr/cascara/lang/yaml/token/YamlToken.md) token) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                           | Method                                                                                                               | Description                                                                                                          |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| public boolean                                                                                                                                                                              | [isEmpty](#isempty)()                                                                                                |                                                                                                                      |
| public [YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md)                                                                                           | [remove](#remove)(int index)                                                                                         |                                                                                                                      |
| public [YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md)                                                                                           | [clear](#clear)()                                                                                                    |                                                                                                                      |
| public [YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md)                                                                                           | [add](#add)([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) item)                 | Appends an item to the sequence.                                                                                     |
| public int                                                                                                                                                                                  | [size](#size)()                                                                                                      |                                                                                                                      |
| public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)                                                                                                   | [get](#get)(int index)                                                                                               |                                                                                                                      |
| public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)                                                                                                   | [getFirst](#getfirst)()                                                                                              |                                                                                                                      |
| public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)                                                                                                   | [getLast](#getlast)()                                                                                                |                                                                                                                      |
| public [YamlMap](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMap.md)                                                                                                     | [getMap](#getmap)(int i)                                                                                             |                                                                                                                      |
| public [YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md)                                                                                           | [getSequence](#getsequence)(int i)                                                                                   |                                                                                                                      |
| public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md)                                                                                               | [getScalar](#getscalar)(int i)                                                                                       |                                                                                                                      |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                         | [getString](#getstring)(int i)                                                                                       |                                                                                                                      |
| public int                                                                                                                                                                                  | [getInteger](#getinteger)(int i)                                                                                     |                                                                                                                      |
| public [Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html)                                                                                         | [getDouble](#getdouble)(int i)                                                                                       |                                                                                                                      |
| public boolean                                                                                                                                                                              | [getBoolean](#getboolean)(int i)                                                                                     |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)>         | [getElements](#getelements)()                                                                                        |                                                                                                                      |
| public [YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md)                                                                                           | [remove](#remove)([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) node)           |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)>         | [getChildren](#getchildren)()                                                                                        |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. |
| public boolean                                                                                                                                                                              | [isExpanded](#isexpanded)()                                                                                          |                                                                                                                      |
| public void                                                                                                                                                                                 | [setExpanded](#setexpanded)(boolean expanded)                                                                        |                                                                                                                      |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)> | [iterator](#iterator)()                                                                                              | Returns Iterator instance                                                                                            |
| public void                                                                                                                                                                                 | [accept](#accept)([YamlVisitor](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlVisitor.md) visitor) |                                                                                                                      |


### Methods inherited from [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)

isPreceededByNewLine, getOptions, setFileEndsWithNewLine, getTag, setAnchor, addComments, getStartLine, hashCode, fileEndsWithNewLine, getEndColumn, setTag, addComment, setPreceededByNewLine, getResolvedTag, getToken, getAnchor, getNodeStyle, toString, setNodeStyle, getStartColumn, getSemanticColumn, getEndLine, getComments, getProperties, equals, setResolvedTag, setSemanticColumn


## Method Details

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>



**Specified By:**

[YamlCollection](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlCollection.md)


---

### remove

<span style="font-family: monospace; font-size: 80%;">public [YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md) __remove__(int index)</span>



**Specified By:**

[SequenceAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)


---

### clear

<span style="font-family: monospace; font-size: 80%;">public [YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md) __clear__()</span>



**Specified By:**

[SequenceAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)


---

### add

<span style="font-family: monospace; font-size: 80%;">public [YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md) __add__([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) item)</span>

Appends an item to the sequence.


---

### size

<span style="font-family: monospace; font-size: 80%;">public int __size__()</span>



**Specified By:**

[YamlCollection](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlCollection.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) __get__(int index)</span>



**Specified By:**

[SequenceAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)


---

### getFirst

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) __getFirst__()</span>



**Specified By:**

[SequenceAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)


---

### getLast

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) __getLast__()</span>



**Specified By:**

[SequenceAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)


---

### getMap

<span style="font-family: monospace; font-size: 80%;">public [YamlMap](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMap.md) __getMap__(int i)</span>



**Specified By:**

[SequenceAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)


---

### getSequence

<span style="font-family: monospace; font-size: 80%;">public [YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md) __getSequence__(int i)</span>



**Specified By:**

[SequenceAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)


---

### getScalar

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md) __getScalar__(int i)</span>



**Specified By:**

[SequenceAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)


---

### getString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__(int i)</span>



**Specified By:**

[SequenceAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)


---

### getInteger

<span style="font-family: monospace; font-size: 80%;">public int __getInteger__(int i)</span>



**Specified By:**

[SequenceAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)


---

### getDouble

<span style="font-family: monospace; font-size: 80%;">public [Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html) __getDouble__(int i)</span>



**Specified By:**

[SequenceAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)


---

### getBoolean

<span style="font-family: monospace; font-size: 80%;">public boolean __getBoolean__(int i)</span>



**Specified By:**

[SequenceAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)


---

### getElements

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)> __getElements__()</span>



**Specified By:**

[SequenceAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)


---

### remove

<span style="font-family: monospace; font-size: 80%;">public [YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md) __remove__([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) node)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)> __getChildren__()</span>



Implementation-specific nodes must return their constituent children.
For example, a Map node returns its entries.

**Overrides:**

[YamlNode](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/ast/YamlNode.md#getchildren)


---

### isExpanded

<span style="font-family: monospace; font-size: 80%;">public boolean __isExpanded__()</span>




---

### setExpanded

<span style="font-family: monospace; font-size: 80%;">public void __setExpanded__(boolean expanded)</span>




---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)> __iterator__()</span>

Returns Iterator instance

**Specified By:**

[SequenceAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)


---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/ast/YamlNode.md#accept)


---

