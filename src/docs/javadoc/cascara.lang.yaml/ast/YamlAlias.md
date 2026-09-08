Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlAlias
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlAlias<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlAlias__<br/>extends [YamlNode](YamlNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                             | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlAlias([YamlToken](../token/YamlToken.md) token, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) alias) |             |



## Method Summary

| Modifier and Type                                                                                                        | Method                                                                                                            | Description                                                                                                          |
|--------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [getName](#getname)()                                                                                             |                                                                                                                      |
| public void                                                                                                              | [setResolvedNode](#setresolvednode)([YamlNode](YamlNode.md) node)                                                 | Put this back to fix the Parser                                                                                      |
| public [YamlNode](YamlNode.md)                                                                                           | [getResolvedNode](#getresolvednode)()                                                                             |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> | [getChildren](#getchildren)()                                                                                     |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [getAnchor](#getanchor)()                                                                                         | Gets the YAML anchor associated with this node (e.g., &anchorName).                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [asString](#asstring)()                                                                                           |                                                                                                                      |
| public void                                                                                                              | [accept](#accept)([YamlVisitor](../util/YamlVisitor.md) visitor)                                                  |                                                                                                                      |
| public boolean                                                                                                           | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o) |                                                                                                                      |
| public int                                                                                                               | [hashCode](#hashcode)()                                                                                           | Generates a hash code based on the node's logical content.                                                           |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [toString](#tostring)()                                                                                           |                                                                                                                      |


### Methods inherited from [YamlNode](YamlNode.md)

isPreceededByNewLine, getNodeStyle, getOptions, setFileEndsWithNewLine, setNodeStyle, getTag, setAnchor, getStartColumn, addComments, getStartLine, fileEndsWithNewLine, getEndColumn, getSemanticColumn, getEndLine, getComments, setTag, addComment, setPreceededByNewLine, getResolvedTag, getToken, getProperties, setResolvedTag, setSemanticColumn


## Method Details

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### setResolvedNode

<span style="font-family: monospace; font-size: 80%;">public void __setResolvedNode__([YamlNode](YamlNode.md) node)</span>

Put this back to fix the Parser


---

### getResolvedNode

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](YamlNode.md) __getResolvedNode__()</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> __getChildren__()</span>



Implementation-specific nodes must return their constituent children.
For example, a Map node returns its entries.

**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#getchildren)


---

### getAnchor

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getAnchor__()</span>

Gets the YAML anchor associated with this node (e.g., &anchorName).

**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#getanchor)


---

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>




---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](../util/YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#accept)


---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>

Generates a hash code based on the node's logical content.

**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#hashcode)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#tostring)


---

