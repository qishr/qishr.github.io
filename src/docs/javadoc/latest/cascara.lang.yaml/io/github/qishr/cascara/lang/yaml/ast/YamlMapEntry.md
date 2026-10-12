Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlMapEntry
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlMapEntry<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapEntryAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md), [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlMapEntry__<br/>extends [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)
</span>

Represents the structural pairing of a key and a value.


## Constructor Summary

| Constructor                                                                                                                                                                                                            | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlMapEntry([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) key, [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) value)                         |             |
| YamlMapEntry([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) key, [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) value, boolean hasExplicitKey) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                   | Method                                                                                                               | Description                                                                                                          |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)                                                                                           | [getKey](#getkey)()                                                                                                  | Returns the key corresponding to this entry.                                                                         |
| public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)                                                                                           | [getValue](#getvalue)()                                                                                              | Returns the value corresponding to this entry.                                                                       |
| public boolean                                                                                                                                                                      | [hasExplicitKey](#hasexplicitkey)()                                                                                  |                                                                                                                      |
| public [YamlMapEntry](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMapEntry.md)                                                                                   | [setHasExplicityKey](#sethasexplicitykey)(boolean b)                                                                 |                                                                                                                      |
| public [YamlMapEntry](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMapEntry.md)                                                                                   | [setRaw](#setraw)([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) value)          |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)> | [getChildren](#getchildren)()                                                                                        |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. |
| public void                                                                                                                                                                         | [accept](#accept)([YamlVisitor](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlVisitor.md) visitor) |                                                                                                                      |
| public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)                                                                                           | [setValue](#setvalue)([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) value)      |                                                                                                                      |


### Methods inherited from [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)

isPreceededByNewLine, getOptions, setFileEndsWithNewLine, getTag, setAnchor, addComments, getStartLine, hashCode, fileEndsWithNewLine, getEndColumn, setTag, addComment, setPreceededByNewLine, getResolvedTag, getToken, getAnchor, getNodeStyle, toString, setNodeStyle, getStartColumn, getSemanticColumn, getEndLine, getComments, getProperties, equals, setResolvedTag, setSemanticColumn


## Method Details

### getKey

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) __getKey__()</span>

Returns the key corresponding to this entry.

**Specified By:**

[MapEntryAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)


---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) __getValue__()</span>

Returns the value corresponding to this entry.

**Specified By:**

[MapEntryAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)


---

### hasExplicitKey

<span style="font-family: monospace; font-size: 80%;">public boolean __hasExplicitKey__()</span>




---

### setHasExplicityKey

<span style="font-family: monospace; font-size: 80%;">public [YamlMapEntry](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMapEntry.md) __setHasExplicityKey__(boolean b)</span>




---

### setRaw

<span style="font-family: monospace; font-size: 80%;">public [YamlMapEntry](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMapEntry.md) __setRaw__([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) value)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)> __getChildren__()</span>



Implementation-specific nodes must return their constituent children.
For example, a Map node returns its entries.

**Specified By:**

[MapEntryAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)

**Overrides:**

[YamlNode](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/ast/YamlNode.md#getchildren)


---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/ast/YamlNode.md#accept)


---

### setValue

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) __setValue__([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) value)</span>




---

