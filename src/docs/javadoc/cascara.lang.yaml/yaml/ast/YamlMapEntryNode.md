Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlMapEntryNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlMapEntryNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapEntryAstNode](../../../cascara.common/lang/ast/MapEntryAstNode.md)<[YamlNode](YamlNode.md), [YamlNode](YamlNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlMapEntryNode__<br/>extends [YamlNode](YamlNode.md)
</span>

Represents the structural pairing of a key and a value.


## Constructor Summary

| Constructor                                                                                        | Description |
|----------------------------------------------------------------------------------------------------|-------------|
| YamlMapEntryNode(int line, int column, [YamlNode](YamlNode.md) key, [YamlNode](YamlNode.md) value) |             |
| YamlMapEntryNode([YamlNode](YamlNode.md) key, [YamlNode](YamlNode.md) value)                       |             |



## Method Summary

| Modifier and Type                                                                                                        | Method                                                   | Description                                                                                                          |
|--------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| public [YamlNode](YamlNode.md)                                                                                           | [getKey](#getkey)()                                      | Returns the key corresponding to this entry.                                                                         |
| public [YamlNode](YamlNode.md)                                                                                           | [getValue](#getvalue)()                                  | Returns the value corresponding to this entry.                                                                       |
| public [YamlMapEntryNode](YamlMapEntryNode.md)                                                                           | [setRaw](#setraw)([YamlNode](YamlNode.md) value)         |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> | [getChildren](#getchildren)()                            |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. |
| public void                                                                                                              | [accept](#accept)([YamlVisitor](YamlVisitor.md) visitor) |                                                                                                                      |
| public [YamlNode](YamlNode.md)                                                                                           | [setValue](#setvalue)([YamlNode](YamlNode.md) value)     |                                                                                                                      |


### Methods inherited from [YamlNode](YamlNode.md)

setAnchor, getStartColumn, addComments, getStartLine, setToken, hashCode, getEndColumn, getEndLine, getComments, getToken, getAnchor, equals, addComment


## Method Details

### getKey

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](YamlNode.md) __getKey__()</span>

Returns the key corresponding to this entry.

**Specified By:**

[MapEntryAstNode](../../../cascara.common/lang/ast/MapEntryAstNode.md)


---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](YamlNode.md) __getValue__()</span>

Returns the value corresponding to this entry.

**Specified By:**

[MapEntryAstNode](../../../cascara.common/lang/ast/MapEntryAstNode.md)


---

### setRaw

<span style="font-family: monospace; font-size: 80%;">public [YamlMapEntryNode](YamlMapEntryNode.md) __setRaw__([YamlNode](YamlNode.md) value)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> __getChildren__()</span>



Implementation-specific nodes must return their constituent children.
For example, a Map node returns its entries.

**Specified By:**

[MapEntryAstNode](../../../cascara.common/lang/ast/MapEntryAstNode.md)

**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#getchildren)


---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#accept)


---

### setValue

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](YamlNode.md) __setValue__([YamlNode](YamlNode.md) value)</span>




---

