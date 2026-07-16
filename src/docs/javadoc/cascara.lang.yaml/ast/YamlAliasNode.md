Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlAliasNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlAliasNode<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlAliasNode__<br/>extends [YamlNode](YamlNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                             | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlAliasNode(int line, int column, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) alias) |             |



## Method Summary

| Modifier and Type                                                                                                        | Method                                                            | Description                                                                                                          |
|--------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [getAlias](#getalias)()                                           |                                                                                                                      |
| public void                                                                                                              | [setResolvedNode](#setresolvednode)([YamlNode](YamlNode.md) node) | Put this back to fix the Parser                                                                                      |
| public [YamlNode](YamlNode.md)                                                                                           | [getResolvedNode](#getresolvednode)()                             |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> | [getChildren](#getchildren)()                                     |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [getAnchor](#getanchor)()                                         | Gets the YAML anchor associated with this node (e.g., &anchorName).                                                  |
| public void                                                                                                              | [accept](#accept)([YamlVisitor](YamlVisitor.md) visitor)          |                                                                                                                      |


### Methods inherited from [YamlNode](YamlNode.md)

getEndColumn, getEndLine, getComments, setAnchor, getStartColumn, getToken, addComments, equals, getStartLine, addComment, setToken, hashCode


## Method Details

### getAlias

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getAlias__()</span>




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

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#accept)


---

