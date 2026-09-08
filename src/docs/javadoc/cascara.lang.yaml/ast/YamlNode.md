Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.ast.YamlNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNode](../../cascara.common/lang/ast/AstNode.md)

Direct Known Subtypes:<br/>
    [YamlNodeProperty](YamlNodeProperty.md), [YamlStream](YamlStream.md), [YamlMapEntry](YamlMapEntry.md), [YamlComment](YamlComment.md), [YamlMap](YamlMap.md), [YamlDocument](YamlDocument.md), [YamlAlias](YamlAlias.md), [YamlDirective](YamlDirective.md), [YamlScalar](YamlScalar.md), [YamlSequence](YamlSequence.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __YamlNode__</span>

Base implementation for all YAML AST nodes.This class provides the foundational structure for YAML nodes, including
source coordinates (line and column), the source URI, and support for
YAML anchors and comments.


## Field Summary

| Modifier and Type     | Field                   | Description |
|-----------------------|-------------------------|-------------|
| protected NodeStyle   | [nodeStyle](#nodestyle) |             |
| protected YamlOptions | [options](#options)     |             |
| protected YamlToken   | [token](#token)         |             |



## Constructor Summary

| Constructor                                                                                                             | Description                                                                                                     |
|-------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|
| YamlNode()                                                                                                              |                                                                                                                 |
| YamlNode([YamlOptions](../util/YamlOptions.md) options)                                                                 |                                                                                                                 |
| YamlNode([YamlToken](../token/YamlToken.md) token)                                                                      | Constructs a new YamlNode with specific source coordinates obtained from a YamLToken                            |
| YamlNode([YamlToken](../token/YamlToken.md) token, [YamlOptions](../util/YamlOptions.md) options)                       | Constructs a new YamlNode with specific source coordinates obtained from a YamLToken and a set of YAML options. |
| YamlNode([YamlToken](../token/YamlToken.md) token, int line, int column, [YamlOptions](../util/YamlOptions.md) options) | Constructs a new YamlNode with specific source coordinates and a set of YAML options.                           |



## Method Summary

| Modifier and Type                                                                                                                           | Method                                                                                                                                                                 | Description                                                                                                          |
|---------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| public abstract void                                                                                                                        | [accept](#accept)([YamlVisitor](../util/YamlVisitor.md) visitor)                                                                                                       |                                                                                                                      |
| public [YamlOptions](../util/YamlOptions.md)                                                                                                | [getOptions](#getoptions)()                                                                                                                                            |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNodeProperty](YamlNodeProperty.md)>    | [getProperties](#getproperties)()                                                                                                                                      |                                                                                                                      |
| public [NodeStyle](../util/NodeStyle.md)                                                                                                    | [getNodeStyle](#getnodestyle)()                                                                                                                                        |                                                                                                                      |
| public [YamlNode](YamlNode.md)                                                                                                              | [setNodeStyle](#setnodestyle)([NodeStyle](../util/NodeStyle.md) nodeStyle)                                                                                             |                                                                                                                      |
| public boolean                                                                                                                              | [fileEndsWithNewLine](#fileendswithnewline)()                                                                                                                          |                                                                                                                      |
| public void                                                                                                                                 | [setFileEndsWithNewLine](#setfileendswithnewline)(boolean b)                                                                                                           |                                                                                                                      |
| public boolean                                                                                                                              | [isPreceededByNewLine](#ispreceededbynewline)()                                                                                                                        |                                                                                                                      |
| public [YamlNode](YamlNode.md)                                                                                                              | [setPreceededByNewLine](#setpreceededbynewline)(boolean b)                                                                                                             |                                                                                                                      |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                         | [getTag](#gettag)()                                                                                                                                                    |                                                                                                                      |
| public void                                                                                                                                 | [setTag](#settag)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) tag)                                                    |                                                                                                                      |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                         | [getResolvedTag](#getresolvedtag)()                                                                                                                                    |                                                                                                                      |
| public void                                                                                                                                 | [setResolvedTag](#setresolvedtag)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) resolvedTag)                            |                                                                                                                      |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                         | [getAnchor](#getanchor)()                                                                                                                                              | Gets the YAML anchor associated with this node (e.g., &anchorName).                                                  |
| public void                                                                                                                                 | [setAnchor](#setanchor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) anchor)                                           | Sets the YAML anchor for this node.                                                                                  |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [YamlNode](YamlNode.md)> | [getChildren](#getchildren)()                                                                                                                                          |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. |
| public int                                                                                                                                  | [getStartLine](#getstartline)()                                                                                                                                        |                                                                                                                      |
| public int                                                                                                                                  | [getStartColumn](#getstartcolumn)()                                                                                                                                    |                                                                                                                      |
| public int                                                                                                                                  | [getEndLine](#getendline)()                                                                                                                                            |                                                                                                                      |
| public int                                                                                                                                  | [getEndColumn](#getendcolumn)()                                                                                                                                        |                                                                                                                      |
| public int                                                                                                                                  | [getSemanticColumn](#getsemanticcolumn)()                                                                                                                              | Set the *semantic column* number of this node.                                                                       |
| public [YamlNode](YamlNode.md)                                                                                                              | [setSemanticColumn](#setsemanticcolumn)(int n)                                                                                                                         | Retrieves the *semantic column* number of this node.                                                                 |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlComment](YamlComment.md)>              | [getComments](#getcomments)()                                                                                                                                          |                                                                                                                      |
| public void                                                                                                                                 | [addComment](#addcomment)([YamlComment](YamlComment.md) comment)                                                                                                       | Associates a comment node with this specific AST node.                                                               |
| public void                                                                                                                                 | [addComments](#addcomments)(int pos, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlComment](YamlComment.md)> comments) | Associates a comment node with this specific AST node.                                                               |
| public [YamlToken](../token/YamlToken.md)                                                                                                   | [getToken](#gettoken)()                                                                                                                                                |                                                                                                                      |
| public boolean                                                                                                                              | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                                                      | Compares this node with another for equality based on its content.                                                   |
| public int                                                                                                                                  | [hashCode](#hashcode)()                                                                                                                                                | Generates a hash code based on the node's logical content.                                                           |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                         | [toString](#tostring)()                                                                                                                                                |                                                                                                                      |



## Field Details

### nodeStyle

<span style="font-family: monospace; font-size: 80%;">protected NodeStyle __nodeStyle__</span>




---

### options

<span style="font-family: monospace; font-size: 80%;">protected YamlOptions __options__</span>




---

### token

<span style="font-family: monospace; font-size: 80%;">protected YamlToken __token__</span>




---


## Method Details

### accept

<span style="font-family: monospace; font-size: 80%;">public abstract void __accept__([YamlVisitor](../util/YamlVisitor.md) visitor)</span>




---

### getOptions

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](../util/YamlOptions.md) __getOptions__()</span>




---

### getProperties

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNodeProperty](YamlNodeProperty.md)> __getProperties__()</span>




---

### getNodeStyle

<span style="font-family: monospace; font-size: 80%;">public [NodeStyle](../util/NodeStyle.md) __getNodeStyle__()</span>




---

### setNodeStyle

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](YamlNode.md) __setNodeStyle__([NodeStyle](../util/NodeStyle.md) nodeStyle)</span>




---

### fileEndsWithNewLine

<span style="font-family: monospace; font-size: 80%;">public boolean __fileEndsWithNewLine__()</span>




---

### setFileEndsWithNewLine

<span style="font-family: monospace; font-size: 80%;">public void __setFileEndsWithNewLine__(boolean b)</span>




---

### isPreceededByNewLine

<span style="font-family: monospace; font-size: 80%;">public boolean __isPreceededByNewLine__()</span>




---

### setPreceededByNewLine

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](YamlNode.md) __setPreceededByNewLine__(boolean b)</span>




---

### getTag

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTag__()</span>




---

### setTag

<span style="font-family: monospace; font-size: 80%;">public void __setTag__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) tag)</span>




---

### getResolvedTag

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getResolvedTag__()</span>




---

### setResolvedTag

<span style="font-family: monospace; font-size: 80%;">public void __setResolvedTag__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) resolvedTag)</span>




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

### getSemanticColumn

<span style="font-family: monospace; font-size: 80%;">public int __getSemanticColumn__()</span>

Set the *semantic column* number of this node.This is the column number of the node itself, unless it has properties on the same line,
in which case it is the column number of the leftmost property.


---

### setSemanticColumn

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](YamlNode.md) __setSemanticColumn__(int n)</span>

Retrieves the *semantic column* number of this node.This is the column number of the node itself, unless a *semantic column* has been set,
in which case that *semantic column* value is returned.


---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlComment](YamlComment.md)> __getComments__()</span>



**Specified By:**

[AstNode](../../cascara.common/lang/ast/AstNode.md)


---

### addComment

<span style="font-family: monospace; font-size: 80%;">public void __addComment__([YamlComment](YamlComment.md) comment)</span>

Associates a comment node with this specific AST node.

**Parameters:**

`comment` - The comment node to add.


---

### addComments

<span style="font-family: monospace; font-size: 80%;">public void __addComments__(int pos, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlComment](YamlComment.md)> comments)</span>

Associates a comment node with this specific AST node.


---

### getToken

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [YamlToken](../token/YamlToken.md) __getToken__()</span>



**Specified By:**

[AstNode](../../cascara.common/lang/ast/AstNode.md)


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

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

