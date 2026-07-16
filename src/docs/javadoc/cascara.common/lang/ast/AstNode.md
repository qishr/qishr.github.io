Package [io.github.qishr.cascara.common.lang.ast](index.md)

# Interface AstNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.ast.AstNode<br/>
<br/>
All Known Implementing Classes:<br/>
    [ReferenceAstNode](ReferenceAstNode.md), [ScalarAstNode](ScalarAstNode.md), [SequenceAstNode](SequenceAstNode.md), [CommentAstNode](CommentAstNode.md), [MapAstNode](MapAstNode.md), [PathExpression](PathExpression.md), [ReferenceNode](../reference/ReferenceNode.md), [SchemaNode](../../../cascara.schema/schema/structure/SchemaNode.md), [JsonNode](../../../cascara.lang.json/ast/JsonNode.md), [XmlNode](../../../cascara.lang.xml/ast/XmlNode.md), [YamlNode](../../../cascara.lang.yaml/ast/YamlNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __AstNode__</span>


## Method Summary

| Modifier and Type                                                                                                                                       | Method                              | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------|-------------|
| public abstract int                                                                                                                                     | [getStartLine](#getstartline)()     |             |
| public abstract int                                                                                                                                     | [getStartColumn](#getstartcolumn)() |             |
| public abstract int                                                                                                                                     | [getEndLine](#getendline)()         |             |
| public abstract int                                                                                                                                     | [getEndColumn](#getendcolumn)()     |             |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [AstNode](AstNode.md)>               | [getChildren](#getchildren)()       |             |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [CommentAstNode](CommentAstNode.md)> | [getComments](#getcomments)()       |             |
| public default [Token](../token/Token.md)                                                                                                               | [getToken](#gettoken)()             |             |
| public default [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                             | [asString](#asstring)()             |             |



## Method Details

### getStartLine

<span style="font-family: monospace; font-size: 80%;">public abstract int __getStartLine__()</span>




---

### getStartColumn

<span style="font-family: monospace; font-size: 80%;">public abstract int __getStartColumn__()</span>




---

### getEndLine

<span style="font-family: monospace; font-size: 80%;">public abstract int __getEndLine__()</span>




---

### getEndColumn

<span style="font-family: monospace; font-size: 80%;">public abstract int __getEndColumn__()</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [AstNode](AstNode.md)> __getChildren__()</span>




---

### getComments

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [CommentAstNode](CommentAstNode.md)> __getComments__()</span>




---

### getToken

<span style="font-family: monospace; font-size: 80%;">public default [Token](../token/Token.md) __getToken__()</span>




---

### asString

<span style="font-family: monospace; font-size: 80%;">public default [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>




---

