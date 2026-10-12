Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlComment
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlComment<br/>
<br/>
All Implemented Interfaces:<br/>
    [CommentAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/CommentAstNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlComment__<br/>extends [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)
</span>

Represents a comment within the YAML source.


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                            | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlComment([YamlToken](../../../../../../../io/github/qishr/cascara/lang/yaml/token/YamlToken.md) token, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [CommentStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/CommentStyle.md) commentStyle) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                   | Method                                                                                                                                        | Description                                                                                                          |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                 | [asString](#asstring)()                                                                                                                       | The actual comment text without the '#'                                                                              |
| public boolean                                                                                                                                                                      | [isMultiLine](#ismultiline)()                                                                                                                 | Useful for CSS or Java modules                                                                                       |
| public [CommentStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/CommentStyle.md)                                                                                  | [getCommentStyle](#getcommentstyle)()                                                                                                         |                                                                                                                      |
| public [YamlComment](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlComment.md)                                                                                     | [setCommentStyle](#setcommentstyle)([CommentStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/CommentStyle.md) commentStyle) |                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)> | [getChildren](#getchildren)()                                                                                                                 |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                 | [getLexeme](#getlexeme)()                                                                                                                     |                                                                                                                      |
| public void                                                                                                                                                                         | [accept](#accept)([YamlVisitor](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlVisitor.md) visitor)                          |                                                                                                                      |


### Methods inherited from [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)

isPreceededByNewLine, getOptions, setFileEndsWithNewLine, getTag, setAnchor, addComments, getStartLine, hashCode, fileEndsWithNewLine, getEndColumn, setTag, addComment, setPreceededByNewLine, getResolvedTag, getToken, getAnchor, getNodeStyle, toString, setNodeStyle, getStartColumn, getSemanticColumn, getEndLine, getComments, getProperties, equals, setResolvedTag, setSemanticColumn


## Method Details

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>

The actual comment text without the '#'

**Specified By:**

[CommentAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/CommentAstNode.md)


---

### isMultiLine

<span style="font-family: monospace; font-size: 80%;">public boolean __isMultiLine__()</span>

Useful for CSS or Java modules

**Specified By:**

[CommentAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/CommentAstNode.md)


---

### getCommentStyle

<span style="font-family: monospace; font-size: 80%;">public [CommentStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/CommentStyle.md) __getCommentStyle__()</span>




---

### setCommentStyle

<span style="font-family: monospace; font-size: 80%;">public [YamlComment](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlComment.md) __setCommentStyle__([CommentStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/CommentStyle.md) commentStyle)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)> __getChildren__()</span>



Implementation-specific nodes must return their constituent children.
For example, a Map node returns its entries.

**Overrides:**

[YamlNode](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/ast/YamlNode.md#getchildren)


---

### getLexeme

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLexeme__()</span>



**Specified By:**

[CommentAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/CommentAstNode.md)


---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/ast/YamlNode.md#accept)


---

