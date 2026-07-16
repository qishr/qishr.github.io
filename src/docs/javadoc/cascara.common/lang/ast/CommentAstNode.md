Package [io.github.qishr.cascara.common.lang.ast](index.md)

# Interface CommentAstNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.ast.CommentAstNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNode](AstNode.md)

All Known Implementing Classes:<br/>
    [JsonCommentNode](../../../cascara.lang.json/ast/JsonCommentNode.md), [YamlCommentNode](../../../cascara.lang.yaml/ast/YamlCommentNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __CommentAstNode__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                        | Description                             |
|--------------------------------------------------------------------------------------------------------------|-------------------------------|-----------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [asString](#asstring)()       | The actual comment text without the '#' |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getLexeme](#getlexeme)()     | The lexeme, including the '#'           |
| public abstract boolean                                                                                      | [isMultiLine](#ismultiline)() | Useful for CSS or Java modules          |



## Method Details

### asString

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>

The actual comment text without the '#'

**Specified By:**

[AstNode](AstNode.md)


---

### getLexeme

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLexeme__()</span>

The lexeme, including the '#'


---

### isMultiLine

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isMultiLine__()</span>

Useful for CSS or Java modules


---

