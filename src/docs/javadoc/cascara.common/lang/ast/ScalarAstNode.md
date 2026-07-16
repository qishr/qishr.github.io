Package [io.github.qishr.cascara.common.lang.ast](index.md)

# Interface ScalarAstNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.ast.ScalarAstNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNode](AstNode.md)

All Known Implementing Classes:<br/>
    [ReferenceScalarNode](../reference/ReferenceScalarNode.md), [JsonScalarNode](../../../cascara.lang.json/ast/JsonScalarNode.md), [JsonCommentNode](../../../cascara.lang.json/ast/JsonCommentNode.md), [YamlScalarNode](../../../cascara.lang.yaml/ast/YamlScalarNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ScalarAstNode__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                                                                     | Description                                                                                                |
|--------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| public abstract [QuoteStyle](../util/QuoteStyle.md)                                                          | [getQuoteStyle](#getquotestyle)()                                          | Returns the [QuoteStyle](../util/QuoteStyle.md) used by a node: PLAIN, SINGLE, DOUBLE, LITERAL, or FOLDED. |
| public abstract [ScalarAstNode](ScalarAstNode.md)<T>                                                         | [setQuoteStyle](#setquotestyle)([QuoteStyle](../util/QuoteStyle.md) style) | Sets the [QuoteStyle](../util/QuoteStyle.md) used by a node                                                |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getLexeme](#getlexeme)()                                                  | Returns the exact, unparsed text block directly from the file buffer.                                      |
| public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) | [getPrimitive](#getprimitive)()                                            | Returns the Java-native representation of the scalar (e.g., Integer, Boolean, String).                     |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContent](#getcontent)()                                                |                                                                                                            |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [asString](#asstring)()                                                    | Returns the string form or the primitive.                                                                  |
| public abstract int                                                                                          | [asInteger](#asinteger)()                                                  |                                                                                                            |
| public abstract int                                                                                          | [asInteger](#asinteger)(int defaultValue)                                  |                                                                                                            |
| public abstract double                                                                                       | [asDouble](#asdouble)()                                                    |                                                                                                            |
| public abstract double                                                                                       | [asDouble](#asdouble)(double defaultValue)                                 |                                                                                                            |
| public abstract boolean                                                                                      | [asBoolean](#asboolean)()                                                  | Returns the boolean value of the scalar, if there is one.                                                  |
| public abstract boolean                                                                                      | [asBoolean](#asboolean)(boolean defaultValue)                              | Returns the boolean value of the scalar, if there is one, otherwise the specified default is returned.     |



## Method Details

### getQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public abstract [QuoteStyle](../util/QuoteStyle.md) __getQuoteStyle__()</span>

Returns the [QuoteStyle](../util/QuoteStyle.md) used by a node: PLAIN, SINGLE, DOUBLE, LITERAL, or FOLDED.


---

### setQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public abstract [ScalarAstNode](ScalarAstNode.md)<T> __setQuoteStyle__([QuoteStyle](../util/QuoteStyle.md) style)</span>

Sets the [QuoteStyle](../util/QuoteStyle.md) used by a node


---

### getLexeme

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLexeme__()</span>

Returns the exact, unparsed text block directly from the file buffer.


---

### getPrimitive

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getPrimitive__()</span>

Returns the Java-native representation of the scalar (e.g., Integer, Boolean, String).


---

### getContent

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContent__()</span>




---

### asString

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>

Returns the string form or the primitive.If the primitive is `null`, an empty string is returned.

**Specified By:**

[AstNode](AstNode.md)


---

### asInteger

<span style="font-family: monospace; font-size: 80%;">public abstract int __asInteger__()</span>




---

### asInteger

<span style="font-family: monospace; font-size: 80%;">public abstract int __asInteger__(int defaultValue)</span>




---

### asDouble

<span style="font-family: monospace; font-size: 80%;">public abstract double __asDouble__()</span>




---

### asDouble

<span style="font-family: monospace; font-size: 80%;">public abstract double __asDouble__(double defaultValue)</span>




---

### asBoolean

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __asBoolean__()</span>

Returns the boolean value of the scalar, if there is one.


---

### asBoolean

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __asBoolean__(boolean defaultValue)</span>

Returns the boolean value of the scalar, if there is one, otherwise the specified default is returned.


---

