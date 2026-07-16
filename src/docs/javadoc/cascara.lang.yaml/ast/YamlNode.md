Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.ast.YamlNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNode](../../cascara.common/lang/ast/AstNode.md)

Direct Known Subtypes:<br/>
    [YamlAliasNode](YamlAliasNode.md), [YamlAnchorNode](YamlAnchorNode.md), [YamlDocumentNode](YamlDocumentNode.md), [YamlCommentNode](YamlCommentNode.md), [YamlSequenceNode](YamlSequenceNode.md), [YamlMapNode](YamlMapNode.md), [YamlScalarNode](YamlScalarNode.md), [YamlStreamNode](YamlStreamNode.md), [YamlMapEntryNode](YamlMapEntryNode.md), [YamlDirectiveNode](YamlDirectiveNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __YamlNode__</span>

Base implementation for all YAML AST nodes.This class provides the foundational structure for YAML nodes, including
source coordinates (line and column), the source URI, and support for
YAML anchors and comments.


## Constructor Summary

| Constructor                    | Description                                                 |
|--------------------------------|-------------------------------------------------------------|
| YamlNode()                     |                                                             |
| YamlNode(int line, int column) | Constructs a new YamlNode with specific source coordinates. |



## Method Summary

| Modifier and Type                                                                                                                           | Method                                                                                                                                                                         | Description                                                                                                          |
|---------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| public abstract void                                                                                                                        | [accept](#accept)([YamlVisitor](YamlVisitor.md) visitor)                                                                                                                       |                                                                                                                      |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                         | [getAnchor](#getanchor)()                                                                                                                                                      | Gets the YAML anchor associated with this node (e.g., &anchorName).                                                  |
| public void                                                                                                                                 | [setAnchor](#setanchor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) anchor)                                                   | Sets the YAML anchor for this node.                                                                                  |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [YamlNode](YamlNode.md)> | [getChildren](#getchildren)()                                                                                                                                                  |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. |
| public int                                                                                                                                  | [getStartLine](#getstartline)()                                                                                                                                                |                                                                                                                      |
| public int                                                                                                                                  | [getStartColumn](#getstartcolumn)()                                                                                                                                            |                                                                                                                      |
| public int                                                                                                                                  | [getEndLine](#getendline)()                                                                                                                                                    |                                                                                                                      |
| public int                                                                                                                                  | [getEndColumn](#getendcolumn)()                                                                                                                                                |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlCommentNode](YamlCommentNode.md)>      | [getComments](#getcomments)()                                                                                                                                                  |                                                                                                                      |
| public void                                                                                                                                 | [addComment](#addcomment)([YamlCommentNode](YamlCommentNode.md) comment)                                                                                                       | Associates a comment node with this specific AST node.                                                               |
| public void                                                                                                                                 | [addComments](#addcomments)(int pos, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlCommentNode](YamlCommentNode.md)> comments) | Associates a comment node with this specific AST node.                                                               |
| public [YamlToken](../token/YamlToken.md)                                                                                                   | [getToken](#gettoken)()                                                                                                                                                        |                                                                                                                      |
| public void                                                                                                                                 | [setToken](#settoken)([YamlToken](../token/YamlToken.md) token)                                                                                                                |                                                                                                                      |
| public boolean                                                                                                                              | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                                                              | Compares this node with another for equality based on its content.                                                   |
| public int                                                                                                                                  | [hashCode](#hashcode)()                                                                                                                                                        | Generates a hash code based on the node's logical content.                                                           |



## Method Details

### accept

<span style="font-family: monospace; font-size: 80%;">public abstract void __accept__([YamlVisitor](YamlVisitor.md) visitor)</span>




---

### getAnchor

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getAnchor__()</span>

Gets the YAML anchor associated with this node (e.g., &anchorName).

**Returns:**

The anchor string, or `null` if no anchor is defined.


---

### setAnchor

<span style="font-family: monospace; font-size: 80%;">public void __setAnchor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) anchor)</span>

Sets the YAML anchor for this node.

**Parameters:**

`anchor` - The anchor string to associate with this node.


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [YamlNode](YamlNode.md)> __getChildren__()</span>



Implementation-specific nodes must return their constituent children.
For example, a Map node returns its entries.

**Specified By:**

[AstNode](../../cascara.common/lang/ast/AstNode.md)


---

### getStartLine

<span style="font-family: monospace; font-size: 80%;">public int __getStartLine__()</span>



**Specified By:**

[AstNode](../../cascara.common/lang/ast/AstNode.md)


---

### getStartColumn

<span style="font-family: monospace; font-size: 80%;">public int __getStartColumn__()</span>



**Specified By:**

[AstNode](../../cascara.common/lang/ast/AstNode.md)


---

### getEndLine

<span style="font-family: monospace; font-size: 80%;">public int __getEndLine__()</span>



**Specified By:**

[AstNode](../../cascara.common/lang/ast/AstNode.md)


---

### getEndColumn

<span style="font-family: monospace; font-size: 80%;">public int __getEndColumn__()</span>



**Specified By:**

[AstNode](../../cascara.common/lang/ast/AstNode.md)


---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlCommentNode](YamlCommentNode.md)> __getComments__()</span>



**Specified By:**

[AstNode](../../cascara.common/lang/ast/AstNode.md)


---

### addComment

<span style="font-family: monospace; font-size: 80%;">public void __addComment__([YamlCommentNode](YamlCommentNode.md) comment)</span>

Associates a comment node with this specific AST node.

**Parameters:**

`comment` - The comment node to add.


---

### addComments

<span style="font-family: monospace; font-size: 80%;">public void __addComments__(int pos, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlCommentNode](YamlCommentNode.md)> comments)</span>

Associates a comment node with this specific AST node.


---

### getToken

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [YamlToken](../token/YamlToken.md) __getToken__()</span>



**Specified By:**

[AstNode](../../cascara.common/lang/ast/AstNode.md)


---

### setToken

<span style="font-family: monospace; font-size: 80%;">public void __setToken__([YamlToken](../token/YamlToken.md) token)</span>




---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>

Compares this node with another for equality based on its content.Note: Source coordinates (line and column) are intentionally excluded
from equality checks to allow programmatically created nodes to match
parsed nodes during map lookups.

**Parameters:**

`o` - The object to compare with.

**Returns:**

`true` if the nodes represent logically equivalent data.

**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>

Generates a hash code based on the node's logical content.

**Returns:**

The hash code.

**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#hashcode)


---

