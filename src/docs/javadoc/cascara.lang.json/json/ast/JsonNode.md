Package [io.github.qishr.cascara.lang.json.ast](index.md)

# Class JsonNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.json.ast.JsonNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNode](../../../cascara.common/lang/ast/AstNode.md)

Direct Known Subtypes:<br/>
    [JsonScalarNode](JsonScalarNode.md), [JsonCommentNode](JsonCommentNode.md), [JsonMapEntryNode](JsonMapEntryNode.md), [JsonMapNode](JsonMapNode.md), [JsonSequenceNode](JsonSequenceNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __JsonNode__</span>


## Field Summary

| Modifier and Type   | Field           | Description |
|---------------------|-----------------|-------------|
| protected JsonToken | [token](#token) |             |



## Constructor Summary

| Constructor                                        | Description |
|----------------------------------------------------|-------------|
| JsonNode()                                         |             |
| JsonNode(int line, int column)                     |             |
| JsonNode([JsonToken](../token/JsonToken.md) token) |             |



## Method Summary

| Modifier and Type                                                                                                                                                     | Method                                                                                                            | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [JsonNode](JsonNode.md)>                           | [getChildren](#getchildren)()                                                                                     |             |
| public int                                                                                                                                                            | [getStartLine](#getstartline)()                                                                                   |             |
| public int                                                                                                                                                            | [getStartColumn](#getstartcolumn)()                                                                               |             |
| public int                                                                                                                                                            | [getEndLine](#getendline)()                                                                                       |             |
| public int                                                                                                                                                            | [getEndColumn](#getendcolumn)()                                                                                   |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md)> | [getComments](#getcomments)()                                                                                     |             |
| public [JsonToken](../token/JsonToken.md)                                                                                                                             | [getToken](#gettoken)()                                                                                           |             |
| public void                                                                                                                                                           | [setToken](#settoken)([JsonLexemeBackedToken](../token/JsonLexemeBackedToken.md) token)                           |             |
| public void                                                                                                                                                           | [addComment](#addcomment)([CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md) comment)           |             |
| public boolean                                                                                                                                                        | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o) |             |
| public int                                                                                                                                                            | [hashCode](#hashcode)()                                                                                           |             |



## Field Details

### token

<span style="font-family: monospace; font-size: 80%;">protected JsonToken __token__</span>




---


## Method Details

### getChildren

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [JsonNode](JsonNode.md)> __getChildren__()</span>



**Specified By:**

[AstNode](../../../cascara.common/lang/ast/AstNode.md)


---

### getStartLine

<span style="font-family: monospace; font-size: 80%;">public int __getStartLine__()</span>



**Specified By:**

[AstNode](../../../cascara.common/lang/ast/AstNode.md)


---

### getStartColumn

<span style="font-family: monospace; font-size: 80%;">public int __getStartColumn__()</span>



**Specified By:**

[AstNode](../../../cascara.common/lang/ast/AstNode.md)


---

### getEndLine

<span style="font-family: monospace; font-size: 80%;">public int __getEndLine__()</span>



**Specified By:**

[AstNode](../../../cascara.common/lang/ast/AstNode.md)


---

### getEndColumn

<span style="font-family: monospace; font-size: 80%;">public int __getEndColumn__()</span>



**Specified By:**

[AstNode](../../../cascara.common/lang/ast/AstNode.md)


---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md)> __getComments__()</span>



**Specified By:**

[AstNode](../../../cascara.common/lang/ast/AstNode.md)


---

### getToken

<span style="font-family: monospace; font-size: 80%;">public [JsonToken](../token/JsonToken.md) __getToken__()</span>



**Specified By:**

[AstNode](../../../cascara.common/lang/ast/AstNode.md)


---

### setToken

<span style="font-family: monospace; font-size: 80%;">public void __setToken__([JsonLexemeBackedToken](../token/JsonLexemeBackedToken.md) token)</span>




---

### addComment

<span style="font-family: monospace; font-size: 80%;">public void __addComment__([CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md) comment)</span>




---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#hashcode)


---

