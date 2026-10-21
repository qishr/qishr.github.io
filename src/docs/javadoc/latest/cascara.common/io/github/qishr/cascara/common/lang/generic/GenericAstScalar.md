Package [io.github.qishr.cascara.common.lang.generic](index.md)

# Class GenericAstScalar
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.generic.GenericAstNode](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstNode.md)<br/>
                io.github.qishr.cascara.common.lang.generic.GenericAstScalar<br/>
<br/>
All Implemented Interfaces:<br/>
    [ScalarAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public final class __GenericAstScalar__<br/>extends [GenericAstNode](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| GenericAstScalar([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)                                                                                                       |             |
| GenericAstScalar([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [QuoteStyle](../../../../../../../io/github/qishr/cascara/common/lang/util/QuoteStyle.md) quoteStyle) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                 | Method                                                                                                                               | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [GenericAstScalar](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstScalar.md)                                                                                   | [setQuoteStyle](#setquotestyle)([QuoteStyle](../../../../../../../io/github/qishr/cascara/common/lang/util/QuoteStyle.md) style)     |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                               | [getLexeme](#getlexeme)()                                                                                                            |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                               | [getPrimitive](#getprimitive)()                                                                                                      |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)>     | [getChildren](#getchildren)()                                                                                                        |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/CommentAstNode.md)> | [getComments](#getcomments)()                                                                                                        |             |
| public [QuoteStyle](../../../../../../../io/github/qishr/cascara/common/lang/util/QuoteStyle.md)                                                                                                  | [getQuoteStyle](#getquotestyle)()                                                                                                    |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                               | [getContent](#getcontent)()                                                                                                          |             |
| public boolean                                                                                                                                                                                    | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                    |             |
| public int                                                                                                                                                                                        | [hashCode](#hashcode)()                                                                                                              |             |
| public [PrimitiveType](../../../../../../../io/github/qishr/cascara/common/type/PrimitiveType.md)                                                                                                 | [getPrimitiveType](#getprimitivetype)()                                                                                              |             |
| public [ScalarAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)>         | [setPrimitive](#setprimitive)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue) |             |


### Methods inherited from [GenericAstNode](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstNode.md)

getEndColumn, getEndLine, getStartColumn, getToken, getStartLine


## Method Details

### setQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [GenericAstScalar](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstScalar.md) __setQuoteStyle__([QuoteStyle](../../../../../../../io/github/qishr/cascara/common/lang/util/QuoteStyle.md) style)</span>



**Specified By:**

[ScalarAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### getLexeme

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLexeme__()</span>



**Specified By:**

[ScalarAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### getPrimitive

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getPrimitive__()</span>



**Specified By:**

[ScalarAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)> __getChildren__()</span>




---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/CommentAstNode.md)> __getComments__()</span>




---

### getQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [QuoteStyle](../../../../../../../io/github/qishr/cascara/common/lang/util/QuoteStyle.md) __getQuoteStyle__()</span>



**Specified By:**

[ScalarAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### getContent

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContent__()</span>



**Specified By:**

[ScalarAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


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

### getPrimitiveType

<span style="font-family: monospace; font-size: 80%;">public [PrimitiveType](../../../../../../../io/github/qishr/cascara/common/type/PrimitiveType.md) __getPrimitiveType__()</span>



**Specified By:**

[ScalarAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### setPrimitive

<span style="font-family: monospace; font-size: 80%;">public [ScalarAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)> __setPrimitive__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)</span>



**Specified By:**

[ScalarAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

