Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlMap
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlMap<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)<[YamlNode](YamlNode.md), [YamlNode](YamlNode.md), [YamlMapEntry](YamlMapEntry.md)>, [YamlCollection](YamlCollection.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlMap__<br/>extends [YamlNode](YamlNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                            | Description |
|------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlMap()                                                                                                              |             |
| YamlMap([YamlToken](../token/YamlToken.md) token, [YamlOptions](../util/YamlOptions.md) options)                       |             |
| YamlMap([YamlToken](../token/YamlToken.md) token, int line, int column, [YamlOptions](../util/YamlOptions.md) options) |             |



## Method Summary

| Modifier and Type                                                                                                                        | Method                                                                                                                                                                                                            | Description                                                                                                          |
|------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| public boolean                                                                                                                           | [isEmpty](#isempty)()                                                                                                                                                                                             |                                                                                                                      |
| public int                                                                                                                               | [size](#size)()                                                                                                                                                                                                   |                                                                                                                      |
| public boolean                                                                                                                           | [containsKey](#containskey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                     |                                                                                                                      |
| public [YamlNode](YamlNode.md)                                                                                                           | [get](#get)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                     |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlMapEntry](YamlMapEntry.md)>         | [getChildren](#getchildren)()                                                                                                                                                                                     |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. |
| public [YamlMapEntry](YamlMapEntry.md)                                                                                                   | [getEntry](#getentry)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                           |                                                                                                                      |
| public [YamlMapEntry](YamlMapEntry.md)                                                                                                   | [getEntry](#getentry)(int i)                                                                                                                                                                                      |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlMapEntry](YamlMapEntry.md)>         | [getEntries](#getentries)()                                                                                                                                                                                       |                                                                                                                      |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[YamlNode](YamlNode.md)>                   | [keySet](#keyset)()                                                                                                                                                                                               |                                                                                                                      |
| public [YamlMap](YamlMap.md)                                                                                                             | [put](#put)([YamlNode](YamlNode.md) key, [YamlNode](YamlNode.md) value)                                                                                                                                           |                                                                                                                      |
| public [YamlMap](YamlMap.md)                                                                                                             | [remove](#remove)([YamlNode](YamlNode.md) key)                                                                                                                                                                    |                                                                                                                      |
| public [YamlMap](YamlMap.md)                                                                                                             | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                               |                                                                                                                      |
| public [YamlMap](YamlMap.md)                                                                                                             | [getMap](#getmap)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                               |                                                                                                                      |
| public [YamlSequence](YamlSequence.md)                                                                                                   | [getSequence](#getsequence)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                     |                                                                                                                      |
| public [YamlScalar](YamlScalar.md)                                                                                                       | [getScalar](#getscalar)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                         |                                                                                                                      |
| public [YamlMap](YamlMap.md)                                                                                                             | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [YamlNode](YamlNode.md) value)                                                                      | Associates the specified value with the specified string key.                                                        |
| public [YamlMap](YamlMap.md)                                                                                                             | [put](#put)([YamlMapEntry](YamlMapEntry.md) entry)                                                                                                                                                                |                                                                                                                      |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[YamlMapEntry](YamlMapEntry.md)>           | [entrySet](#entryset)()                                                                                                                                                                                           |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)>                 | [values](#values)()                                                                                                                                                                                               |                                                                                                                      |
| public [YamlMap](YamlMap.md)                                                                                                             | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |                                                                                                                      |
| public void                                                                                                                              | [accept](#accept)([YamlVisitor](../util/YamlVisitor.md) visitor)                                                                                                                                                  |                                                                                                                      |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[YamlMapEntry](YamlMapEntry.md)> | [iterator](#iterator)()                                                                                                                                                                                           |                                                                                                                      |


### Methods inherited from [YamlNode](YamlNode.md)

isPreceededByNewLine, getOptions, setFileEndsWithNewLine, getTag, setAnchor, addComments, getStartLine, hashCode, fileEndsWithNewLine, getEndColumn, setTag, addComment, setPreceededByNewLine, getResolvedTag, getToken, getAnchor, getNodeStyle, toString, setNodeStyle, getStartColumn, getSemanticColumn, getEndLine, getComments, getProperties, equals, setResolvedTag, setSemanticColumn


## Method Details

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>



**Specified By:**

[YamlCollection](YamlCollection.md)


---

### size

<span style="font-family: monospace; font-size: 80%;">public int __size__()</span>



**Specified By:**

[YamlCollection](YamlCollection.md)


---

### containsKey

<span style="font-family: monospace; font-size: 80%;">public boolean __containsKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [YamlNode](YamlNode.md) __get__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlMapEntry](YamlMapEntry.md)> __getChildren__()</span>



Implementation-specific nodes must return their constituent children.
For example, a Map node returns its entries.

**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)

**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#getchildren)


---

### getEntry

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [YamlMapEntry](YamlMapEntry.md) __getEntry__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### getEntry

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [YamlMapEntry](YamlMapEntry.md) __getEntry__(int i)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlMapEntry](YamlMapEntry.md)> __getEntries__()</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### keySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[YamlNode](YamlNode.md)> __keySet__()</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


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

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### getMap

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [YamlMap](YamlMap.md) __getMap__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### getSequence

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [YamlSequence](YamlSequence.md) __getSequence__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### getScalar

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [YamlScalar](YamlScalar.md) __getScalar__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


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

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### values

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> __values__()</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [YamlMap](YamlMap.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](../util/YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#accept)


---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[YamlMapEntry](YamlMapEntry.md)> __iterator__()</span>




---

