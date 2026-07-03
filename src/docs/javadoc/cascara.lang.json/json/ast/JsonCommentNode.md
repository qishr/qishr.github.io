Package [io.github.qishr.cascara.lang.json.ast](index.md)

# Class JsonCommentNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.ast.JsonNode](JsonNode.md)<br/>
                io.github.qishr.cascara.lang.json.ast.JsonCommentNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)<[JsonNode](JsonNode.md)>, [CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonCommentNode__<br/>extends [JsonNode](JsonNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                               | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| JsonCommentNode(int line, int column, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) rawValue, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) stringValue, boolean multiLine) |             |



## Method Summary

| Modifier and Type                                                                                                                                                     | Method                                                                                                                            | Description                                                 |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                   | [getContent](#getcontent)()                                                                                                       |                                                             |
| public [JsonCommentNode](JsonCommentNode.md)                                                                                                                          | [setQuoteStyle](#setquotestyle)([QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) style)                              |                                                             |
| public [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md)                                                                                                  | [getQuoteStyle](#getquotestyle)()                                                                                                 |                                                             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](JsonNode.md)>                                              | [getChildren](#getchildren)()                                                                                                     |                                                             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md)> | [getComments](#getcomments)()                                                                                                     |                                                             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                   | [getRaw](#getraw)()                                                                                                               | Returns the original raw string as seen in the source file. |
| public int                                                                                                                                                            | [asInteger](#asinteger)()                                                                                                         |                                                             |
| public int                                                                                                                                                            | [asInteger](#asinteger)(int defaultValue)                                                                                         |                                                             |
| public double                                                                                                                                                         | [asDouble](#asdouble)()                                                                                                           |                                                             |
| public double                                                                                                                                                         | [asDouble](#asdouble)(double defaultValue)                                                                                        |                                                             |
| public boolean                                                                                                                                                        | [asBoolean](#asboolean)()                                                                                                         |                                                             |
| public boolean                                                                                                                                                        | [asBoolean](#asboolean)(boolean defaultValue)                                                                                     |                                                             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                   | [getPrimitive](#getprimitive)()                                                                                                   |                                                             |
| public [JsonCommentNode](JsonCommentNode.md)                                                                                                                          | [setPrimitive](#setprimitive)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value) |                                                             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                   | [asString](#asstring)()                                                                                                           |                                                             |
| public boolean                                                                                                                                                        | [isMultiLine](#ismultiline)()                                                                                                     |                                                             |


### Methods inherited from [JsonNode](JsonNode.md)

getEndColumn, getEndLine, getStartColumn, getToken, setToken, equals, addComment, getStartLine, hashCode


## Method Details

### getContent

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContent__()</span>




---

### setQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [JsonCommentNode](JsonCommentNode.md) __setQuoteStyle__([QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) style)</span>



**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### getQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) __getQuoteStyle__()</span>



**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](JsonNode.md)> __getChildren__()</span>



**Overrides:**

[JsonNode](../cascara.lang.json/json/ast/JsonNode.md#getchildren)


---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md)> __getComments__()</span>



**Overrides:**

[JsonNode](../cascara.lang.json/json/ast/JsonNode.md#getcomments)


---

### getRaw

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getRaw__()</span>

Returns the original raw string as seen in the source file.

**Specified By:**

[CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md)


---

### asInteger

<span style="font-family: monospace; font-size: 80%;">public int __asInteger__()</span>



**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### asInteger

<span style="font-family: monospace; font-size: 80%;">public int __asInteger__(int defaultValue)</span>



**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### asDouble

<span style="font-family: monospace; font-size: 80%;">public double __asDouble__()</span>



**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### asDouble

<span style="font-family: monospace; font-size: 80%;">public double __asDouble__(double defaultValue)</span>



**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### asBoolean

<span style="font-family: monospace; font-size: 80%;">public boolean __asBoolean__()</span>



**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### asBoolean

<span style="font-family: monospace; font-size: 80%;">public boolean __asBoolean__(boolean defaultValue)</span>



**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### getPrimitive

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getPrimitive__()</span>



**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### setPrimitive

<span style="font-family: monospace; font-size: 80%;">public [JsonCommentNode](JsonCommentNode.md) __setPrimitive__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>



**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>



**Specified By:**

[CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md)


---

### isMultiLine

<span style="font-family: monospace; font-size: 80%;">public boolean __isMultiLine__()</span>



**Specified By:**

[CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md)


---

