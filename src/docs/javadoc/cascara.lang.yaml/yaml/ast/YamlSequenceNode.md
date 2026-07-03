Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlSequenceNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlSequenceNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [SequenceAstNode](../../../cascara.common/lang/ast/SequenceAstNode.md)<[YamlNode](YamlNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlSequenceNode__<br/>extends [YamlNode](YamlNode.md)
</span>

Represents a YAML sequence (a list of items).


## Constructor Summary

| Constructor                            | Description |
|----------------------------------------|-------------|
| YamlSequenceNode()                     |             |
| YamlSequenceNode(int line, int column) |             |



## Method Summary

| Modifier and Type                                                                                                                | Method                                                             | Description                                                                                                          |
|----------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| public boolean                                                                                                                   | [isEmpty](#isempty)()                                              |                                                                                                                      |
| public [YamlSequenceNode](YamlSequenceNode.md)                                                                                   | [remove](#remove)(int index)                                       |                                                                                                                      |
| public [YamlSequenceNode](YamlSequenceNode.md)                                                                                   | [clear](#clear)()                                                  |                                                                                                                      |
| public [YamlSequenceNode](YamlSequenceNode.md)                                                                                   | [add](#add)([YamlNode](YamlNode.md) item)                          | Appends an item to the sequence.                                                                                     |
| public int                                                                                                                       | [size](#size)()                                                    |                                                                                                                      |
| public [YamlNode](YamlNode.md)                                                                                                   | [get](#get)(int index)                                             |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)>         | [getElements](#getelements)()                                      |                                                                                                                      |
| public [YamlSequenceNode](YamlSequenceNode.md)                                                                                   | [remove](#remove)([YamlNode](YamlNode.md) node)                    |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)>         | [getChildren](#getchildren)()                                      |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. |
| public [CollectionStyle](CollectionStyle.md)                                                                                     | [getStyle](#getstyle)()                                            |                                                                                                                      |
| public [YamlSequenceNode](YamlSequenceNode.md)                                                                                   | [setStyle](#setstyle)([CollectionStyle](CollectionStyle.md) style) |                                                                                                                      |
| public boolean                                                                                                                   | [isExpanded](#isexpanded)()                                        |                                                                                                                      |
| public void                                                                                                                      | [setExpanded](#setexpanded)(boolean expanded)                      |                                                                                                                      |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[YamlNode](YamlNode.md)> | [iterator](#iterator)()                                            | Returns Iterator instance                                                                                            |
| public void                                                                                                                      | [accept](#accept)([YamlVisitor](YamlVisitor.md) visitor)           |                                                                                                                      |


### Methods inherited from [YamlNode](YamlNode.md)

setAnchor, getStartColumn, addComments, getStartLine, setToken, hashCode, getEndColumn, getEndLine, getComments, getToken, getAnchor, equals, addComment


## Method Details

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>



**Specified By:**

[SequenceAstNode](../../../cascara.common/lang/ast/SequenceAstNode.md)


---

### remove

<span style="font-family: monospace; font-size: 80%;">public [YamlSequenceNode](YamlSequenceNode.md) __remove__(int index)</span>



**Specified By:**

[SequenceAstNode](../../../cascara.common/lang/ast/SequenceAstNode.md)


---

### clear

<span style="font-family: monospace; font-size: 80%;">public [YamlSequenceNode](YamlSequenceNode.md) __clear__()</span>



**Specified By:**

[SequenceAstNode](../../../cascara.common/lang/ast/SequenceAstNode.md)


---

### add

<span style="font-family: monospace; font-size: 80%;">public [YamlSequenceNode](YamlSequenceNode.md) __add__([YamlNode](YamlNode.md) item)</span>

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

### getElements

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> __getElements__()</span>



**Specified By:**

[SequenceAstNode](../../../cascara.common/lang/ast/SequenceAstNode.md)


---

### remove

<span style="font-family: monospace; font-size: 80%;">public [YamlSequenceNode](YamlSequenceNode.md) __remove__([YamlNode](YamlNode.md) node)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> __getChildren__()</span>



Implementation-specific nodes must return their constituent children.
For example, a Map node returns its entries.

**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#getchildren)


---

### getStyle

<span style="font-family: monospace; font-size: 80%;">public [CollectionStyle](CollectionStyle.md) __getStyle__()</span>




---

### setStyle

<span style="font-family: monospace; font-size: 80%;">public [YamlSequenceNode](YamlSequenceNode.md) __setStyle__([CollectionStyle](CollectionStyle.md) style)</span>




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

