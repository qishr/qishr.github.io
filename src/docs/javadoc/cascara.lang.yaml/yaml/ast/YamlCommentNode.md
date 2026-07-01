Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlCommentNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlCommentNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlCommentNode__<br/>extends [YamlNode](YamlNode.md)
</span>

Represents a comment within the YAML source.


## Constructor Summary

| Constructor                                                                                                                                                 | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlCommentNode(int line, int column, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, boolean multiLine) |             |



## Method Summary

| Modifier and Type                                                                                                        | Method                                                   | Description                                                                                                          |
|--------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [asString](#asstring)()                                  | The actual comment text without the '#'                                                                              |
| public boolean                                                                                                           | [isMultiLine](#ismultiline)()                            | Useful for CSS or Java modules                                                                                       |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> | [getChildren](#getchildren)()                            |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [getRaw](#getraw)()                                      |                                                                                                                      |
| public void                                                                                                              | [accept](#accept)([YamlVisitor](YamlVisitor.md) visitor) |                                                                                                                      |


### Methods inherited from [YamlNode](YamlNode.md)

setAnchor, getStartColumn, addComments, getStartLine, setToken, hashCode, getEndColumn, getEndLine, getComments, getToken, getAnchor, equals, addComment


## Method Details

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>

The actual comment text without the '#'

**Specified By:**

[CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md)


---

### isMultiLine

<span style="font-family: monospace; font-size: 80%;">public boolean __isMultiLine__()</span>

Useful for CSS or Java modules

**Specified By:**

[CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> __getChildren__()</span>



Implementation-specific nodes must return their constituent children.
For example, a Map node returns its entries.

**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#getchildren)


---

### getRaw

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getRaw__()</span>



**Specified By:**

[CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md)


---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#accept)


---

