Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlMap
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlMap<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)<[YamlNode](YamlNode.md), [YamlNode](YamlNode.md), [YamlMapEntry](YamlMapEntry.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlMap__<br/>extends [YamlNode](YamlNode.md)
</span>


## Constructor Summary

| Constructor                                                                                      | Description |
|--------------------------------------------------------------------------------------------------|-------------|
| YamlMap()                                                                                        |             |
| YamlMap([YamlToken](../token/YamlToken.md) token, [YamlOptions](../util/YamlOptions.md) options) |             |



## Method Summary

| Modifier and Type                                                                                                                        | Method                                                                                                                                                                                                            | Description                                                                                                          |
|------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| public boolean                                                                                                                           | [isEmpty](#isempty)()                                                                                                                                                                                             |                                                                                                                      |
| public int                                                                                                                               | [size](#size)()                                                                                                                                                                                                   |                                                                                                                      |
| public boolean                                                                                                                           | [containsKey](#containskey)([YamlNode](YamlNode.md) key)                                                                                                                                                          |                                                                                                                      |
| public [YamlNode](YamlNode.md)                                                                                                           | [get](#get)([YamlNode](YamlNode.md) key)                                                                                                                                                                          |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlMapEntry](YamlMapEntry.md)>         | [getChildren](#getchildren)()                                                                                                                                                                                     |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. |
| public [YamlMapEntry](YamlMapEntry.md)                                                                                                   | [getEntry](#getentry)([YamlNode](YamlNode.md) key)                                                                                                                                                                |                                                                                                                      |
| public [YamlMapEntry](YamlMapEntry.md)                                                                                                   | [getEntry](#getentry)(int i)                                                                                                                                                                                      |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlMapEntry](YamlMapEntry.md)>         | [getEntries](#getentries)()                                                                                                                                                                                       |                                                                                                                      |
| public [NodeStyle](NodeStyle.md)                                                                                                         | [getStyle](#getstyle)()                                                                                                                                                                                           |                                                                                                                      |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[YamlNode](YamlNode.md)>                   | [keySet](#keyset)()                                                                                                                                                                                               |                                                                                                                      |
| public [YamlMap](YamlMap.md)                                                                                                             | [put](#put)([YamlNode](YamlNode.md) key, [YamlNode](YamlNode.md) value)                                                                                                                                           |                                                                                                                      |
| public [YamlMap](YamlMap.md)                                                                                                             | [remove](#remove)([YamlNode](YamlNode.md) key)                                                                                                                                                                    |                                                                                                                      |
| public [YamlMap](YamlMap.md)                                                                                                             | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                               |                                                                                                                      |
| public [YamlMap](YamlMap.md)                                                                                                             | [setStyle](#setstyle)([NodeStyle](NodeStyle.md) style)                                                                                                                                                            |                                                                                                                      |
| public boolean                                                                                                                           | [containsKey](#containskey)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                     |                                                                                                                      |
| public [YamlNode](YamlNode.md)                                                                                                           | [get](#get)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                     |                                                                                                                      |
| public [YamlMap](YamlMap.md)                                                                                                             | [getMap](#getmap)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                               |                                                                                                                      |
| public [YamlSequence](YamlSequence.md)                                                                                                   | [getSequence](#getsequence)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                     |                                                                                                                      |
| public [YamlScalar](YamlScalar.md)                                                                                                       | [getScalar](#getscalar)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                         |                                                                                                                      |
| public [YamlMap](YamlMap.md)                                                                                                             | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [YamlNode](YamlNode.md) value)                                                                      | Associates the specified value with the specified string key.                                                        |
| public [YamlMap](YamlMap.md)                                                                                                             | [put](#put)([YamlMapEntry](YamlMapEntry.md) entry)                                                                                                                                                                |                                                                                                                      |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[YamlMapEntry](YamlMapEntry.md)>           | [entrySet](#entryset)()                                                                                                                                                                                           |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)>                 | [values](#values)()                                                                                                                                                                                               |                                                                                                                      |
| public [YamlMap](YamlMap.md)                                                                                                             | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |                                                                                                                      |
| public void                                                                                                                              | [accept](#accept)([YamlVisitor](YamlVisitor.md) visitor)                                                                                                                                                          |                                                                                                                      |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[YamlMapEntry](YamlMapEntry.md)> | [iterator](#iterator)()                                                                                                                                                                                           |                                                                                                                      |


### Methods inherited from [YamlNode](YamlNode.md)

getNodeStyle, getOptions, getTag, setAnchor, getStartColumn, addComments, getStartLine, hashCode, getEndColumn, getEndLine, getComments, setTag, setNodeStyle, addComment, getToken, getAnchor, equals


## Method Details

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>



**Specified By:**

[MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)


---

### size

<span style="font-family: monospace; font-size: 80%;">public int __size__()</span>



**Specified By:**

[MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)


---

### containsKey

<span style="font-family: monospace; font-size: 80%;">public boolean __containsKey__([YamlNode](YamlNode.md) key)</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [YamlNode](YamlNode.md) __get__([YamlNode](YamlNode.md) key)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlMapEntry](YamlMapEntry.md)> __getChildren__()</span>



Implementation-specific nodes must return their constituent children.
For example, a Map node returns its entries.

**Specified By:**

[MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)

**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#getchildren)


---

### getEntry

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [YamlMapEntry](YamlMapEntry.md) __getEntry__([YamlNode](YamlNode.md) key)</span>




---

### getEntry

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [YamlMapEntry](YamlMapEntry.md) __getEntry__(int i)</span>



**Specified By:**

[MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)


---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlMapEntry](YamlMapEntry.md)> __getEntries__()</span>



**Specified By:**

[MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)


---

### getStyle

<span style="font-family: monospace; font-size: 80%;">public [NodeStyle](NodeStyle.md) __getStyle__()</span>




---

### keySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[YamlNode](YamlNode.md)> __keySet__()</span>



**Specified By:**

[MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [YamlMap](YamlMap.md) __put__([YamlNode](YamlNode.md) key, [YamlNode](YamlNode.md) value)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public [YamlMap](YamlMap.md) __remove__([YamlNode](YamlNode.md) key)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public [YamlMap](YamlMap.md) __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)


---

### setStyle

<span style="font-family: monospace; font-size: 80%;">public [YamlMap](YamlMap.md) __setStyle__([NodeStyle](NodeStyle.md) style)</span>




---

### containsKey

<span style="font-family: monospace; font-size: 80%;">public boolean __containsKey__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [YamlNode](YamlNode.md) __get__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)


---

### getMap

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [YamlMap](YamlMap.md) __getMap__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)


---

### getSequence

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [YamlSequence](YamlSequence.md) __getSequence__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)


---

### getScalar

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [YamlScalar](YamlScalar.md) __getScalar__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [YamlMap](YamlMap.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [YamlNode](YamlNode.md) value)</span>

Associates the specified value with the specified string key.If the map previously contained a mapping for the key, the old value
is replaced. This method automatically wraps the string in a PLAIN
scalar node.

**Parameters:**

`key` - The string key to be associated with the value.

`value` - The value node to be associated with the key.


---

### put

<span style="font-family: monospace; font-size: 80%;">public [YamlMap](YamlMap.md) __put__([YamlMapEntry](YamlMapEntry.md) entry)</span>




---

### entrySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[YamlMapEntry](YamlMapEntry.md)> __entrySet__()</span>



**Specified By:**

[MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)


---

### values

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> __values__()</span>



**Specified By:**

[MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [YamlMap](YamlMap.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>



**Specified By:**

[MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)


---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#accept)


---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[YamlMapEntry](YamlMapEntry.md)> __iterator__()</span>




---

