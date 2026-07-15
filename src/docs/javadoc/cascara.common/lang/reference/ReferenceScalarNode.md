Package [io.github.qishr.cascara.common.lang.reference](index.md)

# Class ReferenceScalarNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.reference.ReferenceNode](ReferenceNode.md)<br/>
                io.github.qishr.cascara.common.lang.reference.ReferenceScalarNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [ScalarAstNode](../ast/ScalarAstNode.md)<[ReferenceNode](ReferenceNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public final class __ReferenceScalarNode__<br/>extends [ReferenceNode](ReferenceNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                             | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ReferenceScalarNode([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)                                                 |             |
| ReferenceScalarNode([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [QuoteStyle](../util/QuoteStyle.md) quoteStyle) |             |



## Method Summary

| Modifier and Type                                                                                                                           | Method                                                                                                            | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|-------------|
| public [ReferenceScalarNode](ReferenceScalarNode.md)                                                                                        | [setQuoteStyle](#setquotestyle)([QuoteStyle](../util/QuoteStyle.md) style)                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                         | [getLexeme](#getlexeme)()                                                                                         |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                         | [asString](#asstring)()                                                                                           |             |
| public int                                                                                                                                  | [asInteger](#asinteger)()                                                                                         |             |
| public int                                                                                                                                  | [asInteger](#asinteger)(int defaultValue)                                                                         |             |
| public double                                                                                                                               | [asDouble](#asdouble)()                                                                                           |             |
| public double                                                                                                                               | [asDouble](#asdouble)(double defaultValue)                                                                        |             |
| public boolean                                                                                                                              | [asBoolean](#asboolean)()                                                                                         |             |
| public boolean                                                                                                                              | [asBoolean](#asboolean)(boolean defaultValue)                                                                     |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                         | [getPrimitive](#getprimitive)()                                                                                   |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [AstNode](../ast/AstNode.md)>     | [getChildren](#getchildren)()                                                                                     |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../ast/CommentAstNode.md)> | [getComments](#getcomments)()                                                                                     |             |
| public [QuoteStyle](../util/QuoteStyle.md)                                                                                                  | [getQuoteStyle](#getquotestyle)()                                                                                 |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                         | [getContent](#getcontent)()                                                                                       |             |
| public boolean                                                                                                                              | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o) |             |
| public int                                                                                                                                  | [hashCode](#hashcode)()                                                                                           |             |


### Methods inherited from [ReferenceNode](ReferenceNode.md)

getEndColumn, getEndLine, getStartColumn, getToken, getStartLine


## Method Details

### setQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [ReferenceScalarNode](ReferenceScalarNode.md) __setQuoteStyle__([QuoteStyle](../util/QuoteStyle.md) style)</span>



**Specified By:**

[ScalarAstNode](../ast/ScalarAstNode.md)


---

### getLexeme

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLexeme__()</span>



**Specified By:**

[ScalarAstNode](../ast/ScalarAstNode.md)


---

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>



**Specified By:**

[ScalarAstNode](../ast/ScalarAstNode.md)


---

### asInteger

<span style="font-family: monospace; font-size: 80%;">public int __asInteger__()</span>



**Specified By:**

[ScalarAstNode](../ast/ScalarAstNode.md)


---

### asInteger

<span style="font-family: monospace; font-size: 80%;">public int __asInteger__(int defaultValue)</span>



**Specified By:**

[ScalarAstNode](../ast/ScalarAstNode.md)


---

### asDouble

<span style="font-family: monospace; font-size: 80%;">public double __asDouble__()</span>



**Specified By:**

[ScalarAstNode](../ast/ScalarAstNode.md)


---

### asDouble

<span style="font-family: monospace; font-size: 80%;">public double __asDouble__(double defaultValue)</span>



**Specified By:**

[ScalarAstNode](../ast/ScalarAstNode.md)


---

### asBoolean

<span style="font-family: monospace; font-size: 80%;">public boolean __asBoolean__()</span>



**Specified By:**

[ScalarAstNode](../ast/ScalarAstNode.md)


---

### asBoolean

<span style="font-family: monospace; font-size: 80%;">public boolean __asBoolean__(boolean defaultValue)</span>



**Specified By:**

[ScalarAstNode](../ast/ScalarAstNode.md)


---

### getPrimitive

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getPrimitive__()</span>



**Specified By:**

[ScalarAstNode](../ast/ScalarAstNode.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [AstNode](../ast/AstNode.md)> __getChildren__()</span>




---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../ast/CommentAstNode.md)> __getComments__()</span>




---

### getQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [QuoteStyle](../util/QuoteStyle.md) __getQuoteStyle__()</span>



**Specified By:**

[ScalarAstNode](../ast/ScalarAstNode.md)


---

### getContent

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContent__()</span>



**Specified By:**

[ScalarAstNode](../ast/ScalarAstNode.md)


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

