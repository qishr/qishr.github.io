Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlMapEntry
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlMapEntry<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapEntryAstNode](../../cascara.common/lang/ast/MapEntryAstNode.md)<[YamlNode](YamlNode.md), [YamlNode](YamlNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlMapEntry__<br/>extends [YamlNode](YamlNode.md)
</span>

Represents the structural pairing of a key and a value.


## Constructor Summary

| Constructor                                                                                      | Description |
|--------------------------------------------------------------------------------------------------|-------------|
| YamlMapEntry([YamlNode](YamlNode.md) key, [YamlNode](YamlNode.md) value)                         |             |
| YamlMapEntry([YamlNode](YamlNode.md) key, [YamlNode](YamlNode.md) value, boolean hasExplicitKey) |             |



## Method Summary

| Modifier and Type                                                                                                        | Method                                                           | Description                                                                                                          |
|--------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| public [YamlNode](YamlNode.md)                                                                                           | [getKey](#getkey)()                                              | Returns the key corresponding to this entry.                                                                         |
| public [YamlNode](YamlNode.md)                                                                                           | [getValue](#getvalue)()                                          | Returns the value corresponding to this entry.                                                                       |
| public boolean                                                                                                           | [hasExplicitKey](#hasexplicitkey)()                              |                                                                                                                      |
| public [YamlMapEntry](YamlMapEntry.md)                                                                                   | [setHasExplicityKey](#sethasexplicitykey)(boolean b)             |                                                                                                                      |
| public [YamlMapEntry](YamlMapEntry.md)                                                                                   | [setRaw](#setraw)([YamlNode](YamlNode.md) value)                 |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> | [getChildren](#getchildren)()                                    |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. |
| public void                                                                                                              | [accept](#accept)([YamlVisitor](../util/YamlVisitor.md) visitor) |                                                                                                                      |
| public [YamlNode](YamlNode.md)                                                                                           | [setValue](#setvalue)([YamlNode](YamlNode.md) value)             |                                                                                                                      |


### Methods inherited from [YamlNode](YamlNode.md)

isPreceededByNewLine, getOptions, setFileEndsWithNewLine, getTag, setAnchor, addComments, getStartLine, hashCode, fileEndsWithNewLine, getEndColumn, setTag, addComment, setPreceededByNewLine, getResolvedTag, getToken, getAnchor, getNodeStyle, toString, setNodeStyle, getStartColumn, getSemanticColumn, getEndLine, getComments, getProperties, equals, setResolvedTag, setSemanticColumn


## Method Details

### getKey

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](YamlNode.md) __getKey__()</span>

Returns the key corresponding to this entry.

**Specified By:**

[MapEntryAstNode](../../cascara.common/lang/ast/MapEntryAstNode.md)


---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](YamlNode.md) __getValue__()</span>

Returns the value corresponding to this entry.

**Specified By:**

[MapEntryAstNode](../../cascara.common/lang/ast/MapEntryAstNode.md)


---

### hasExplicitKey

<span style="font-family: monospace; font-size: 80%;">public boolean __hasExplicitKey__()</span>




---

### setHasExplicityKey

<span style="font-family: monospace; font-size: 80%;">public [YamlMapEntry](YamlMapEntry.md) __setHasExplicityKey__(boolean b)</span>




---

### setRaw

<span style="font-family: monospace; font-size: 80%;">public [YamlMapEntry](YamlMapEntry.md) __setRaw__([YamlNode](YamlNode.md) value)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> __getChildren__()</span>



Implementation-specific nodes must return their constituent children.
For example, a Map node returns its entries.

**Specified By:**

[MapEntryAstNode](../../cascara.common/lang/ast/MapEntryAstNode.md)

**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#getchildren)


---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](../util/YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#accept)


---

### setValue

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](YamlNode.md) __setValue__([YamlNode](YamlNode.md) value)</span>




---

