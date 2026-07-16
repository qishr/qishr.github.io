Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlAnchorNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlAnchorNode<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlAnchorNode__<br/>extends [YamlNode](YamlNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                           | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlAnchorNode(int line, int column, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [YamlNode](YamlNode.md) node) |             |



## Method Summary

| Modifier and Type                                                                                                        | Method                                                   | Description                                                                                                          |
|--------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [getAnchorName](#getanchorname)()                        |                                                                                                                      |
| public [YamlNode](YamlNode.md)                                                                                           | [getInnerNode](#getinnernode)()                          |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> | [getChildren](#getchildren)()                            |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [asString](#asstring)()                                  |                                                                                                                      |
| public void                                                                                                              | [accept](#accept)([YamlVisitor](YamlVisitor.md) visitor) |                                                                                                                      |


### Methods inherited from [YamlNode](YamlNode.md)

setAnchor, getStartColumn, addComments, getStartLine, setToken, hashCode, getEndColumn, getEndLine, getComments, getToken, getAnchor, equals, addComment


## Method Details

### getAnchorName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getAnchorName__()</span>




---

### getInnerNode

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](YamlNode.md) __getInnerNode__()</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> __getChildren__()</span>



Implementation-specific nodes must return their constituent children.
For example, a Map node returns its entries.

**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#getchildren)


---

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>




---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#accept)


---

