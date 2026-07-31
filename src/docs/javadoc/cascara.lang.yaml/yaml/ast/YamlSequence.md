Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlSequence
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlSequence<br/>
<br/>
All Implemented Interfaces:<br/>
    [SequenceAstNode](../../../cascara.common/lang/ast/SequenceAstNode.md)<[YamlNode](YamlNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlSequence__<br/>extends [YamlNode](YamlNode.md)
</span>

Represents a YAML sequence (a list of items).


## Constructor Summary

| Constructor                                            | Description |
|--------------------------------------------------------|-------------|
| YamlSequence()                                         |             |
| YamlSequence([YamlToken](../token/YamlToken.md) token) |             |



## Method Summary

| Modifier and Type                                                                                                                | Method                                                   | Description                                                                                                          |
|----------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| public boolean                                                                                                                   | [isEmpty](#isempty)()                                    |                                                                                                                      |
| public [YamlSequence](YamlSequence.md)                                                                                           | [remove](#remove)(int index)                             |                                                                                                                      |
| public [YamlSequence](YamlSequence.md)                                                                                           | [clear](#clear)()                                        |                                                                                                                      |
| public [YamlSequence](YamlSequence.md)                                                                                           | [add](#add)([YamlNode](YamlNode.md) item)                | Appends an item to the sequence.                                                                                     |
| public int                                                                                                                       | [size](#size)()                                          |                                                                                                                      |
| public [YamlNode](YamlNode.md)                                                                                                   | [get](#get)(int index)                                   |                                                                                                                      |
| public [YamlNode](YamlNode.md)                                                                                                   | [getFirst](#getfirst)()                                  |                                                                                                                      |
| public [YamlNode](YamlNode.md)                                                                                                   | [getLast](#getlast)()                                    |                                                                                                                      |
| public [YamlMap](YamlMap.md)                                                                                                     | [getMap](#getmap)(int i)                                 |                                                                                                                      |
| public [YamlSequence](YamlSequence.md)                                                                                           | [getSequence](#getsequence)(int i)                       |                                                                                                                      |
| public [YamlScalar](YamlScalar.md)                                                                                               | [getScalar](#getscalar)(int i)                           |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)>         | [getElements](#getelements)()                            |                                                                                                                      |
| public [YamlSequence](YamlSequence.md)                                                                                           | [remove](#remove)([YamlNode](YamlNode.md) node)          |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)>         | [getChildren](#getchildren)()                            |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. |
| public [NodeStyle](NodeStyle.md)                                                                                                 | [getStyle](#getstyle)()                                  |                                                                                                                      |
| public [YamlSequence](YamlSequence.md)                                                                                           | [setStyle](#setstyle)([NodeStyle](NodeStyle.md) style)   |                                                                                                                      |
| public boolean                                                                                                                   | [isExpanded](#isexpanded)()                              |                                                                                                                      |
| public void                                                                                                                      | [setExpanded](#setexpanded)(boolean expanded)            |                                                                                                                      |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[YamlNode](YamlNode.md)> | [iterator](#iterator)()                                  | Returns Iterator instance                                                                                            |
| public void                                                                                                                      | [accept](#accept)([YamlVisitor](YamlVisitor.md) visitor) |                                                                                                                      |


### Methods inherited from [YamlNode](YamlNode.md)

getNodeStyle, getOptions, getTag, setAnchor, getStartColumn, addComments, getStartLine, hashCode, getEndColumn, getEndLine, getComments, setTag, setNodeStyle, addComment, getToken, getAnchor, equals


## Method Details

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>



**Specified By:**

[SequenceAstNode](../../../cascara.common/lang/ast/SequenceAstNode.md)


---

### remove

<span style="font-family: monospace; font-size: 80%;">public [YamlSequence](YamlSequence.md) __remove__(int index)</span>



**Specified By:**

[SequenceAstNode](../../../cascara.common/lang/ast/SequenceAstNode.md)


---

### clear

<span style="font-family: monospace; font-size: 80%;">public [YamlSequence](YamlSequence.md) __clear__()</span>



**Specified By:**

[SequenceAstNode](../../../cascara.common/lang/ast/SequenceAstNode.md)


---

### add

<span style="font-family: monospace; font-size: 80%;">public [YamlSequence](YamlSequence.md) __add__([YamlNode](YamlNode.md) item)</span>

Appends an item to the sequence.


---

### size

<span style="font-family: monospace; font-size: 80%;">public int __size__()</span>



**Specified By:**

[SequenceAstNode](../../../cascara.common/lang/ast/SequenceAstNode.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](YamlNode.md) __get__(int index)</span>



**Specified By:**

[SequenceAstNode](../../../cascara.common/lang/ast/SequenceAstNode.md)


---

### getFirst

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](YamlNode.md) __getFirst__()</span>



**Specified By:**

[SequenceAstNode](../../../cascara.common/lang/ast/SequenceAstNode.md)


---

### getLast

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](YamlNode.md) __getLast__()</span>



**Specified By:**

[SequenceAstNode](../../../cascara.common/lang/ast/SequenceAstNode.md)


---

### getMap

<span style="font-family: monospace; font-size: 80%;">public [YamlMap](YamlMap.md) __getMap__(int i)</span>




---

### getSequence

<span style="font-family: monospace; font-size: 80%;">public [YamlSequence](YamlSequence.md) __getSequence__(int i)</span>




---

### getScalar

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](YamlScalar.md) __getScalar__(int i)</span>




---

### getElements

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> __getElements__()</span>



**Specified By:**

[SequenceAstNode](../../../cascara.common/lang/ast/SequenceAstNode.md)


---

### remove

<span style="font-family: monospace; font-size: 80%;">public [YamlSequence](YamlSequence.md) __remove__([YamlNode](YamlNode.md) node)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> __getChildren__()</span>



Implementation-specific nodes must return their constituent children.
For example, a Map node returns its entries.

**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#getchildren)


---

### getStyle

<span style="font-family: monospace; font-size: 80%;">public [NodeStyle](NodeStyle.md) __getStyle__()</span>




---

### setStyle

<span style="font-family: monospace; font-size: 80%;">public [YamlSequence](YamlSequence.md) __setStyle__([NodeStyle](NodeStyle.md) style)</span>




---

### isExpanded

<span style="font-family: monospace; font-size: 80%;">public boolean __isExpanded__()</span>




---

### setExpanded

<span style="font-family: monospace; font-size: 80%;">public void __setExpanded__(boolean expanded)</span>




---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[YamlNode](YamlNode.md)> __iterator__()</span>

Returns Iterator instance

**Specified By:**

[SequenceAstNode](../../../cascara.common/lang/ast/SequenceAstNode.md)


---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#accept)


---

