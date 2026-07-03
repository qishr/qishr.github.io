Package [io.github.qishr.cascara.common.lang.ast](index.md)

# Interface ScalarAstNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.ast.ScalarAstNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNode](AstNode.md)

All Known Implementing Classes:<br/>
    [ReferenceScalarNode](../reference/ReferenceScalarNode.md), [JsonScalarNode](../../../cascara.lang.json/json/ast/JsonScalarNode.md), [JsonCommentNode](../../../cascara.lang.json/json/ast/JsonCommentNode.md), [YamlScalarNode](../../../cascara.lang.yaml/yaml/ast/YamlScalarNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ScalarAstNode__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                            | Description                                                                                                |
|--------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| public abstract [QuoteStyle](../util/QuoteStyle.md)                                                          | [getQuoteStyle](#getquotestyle)()                                                                                                 | Returns the [QuoteStyle](../util/QuoteStyle.md) used by a node: PLAIN, SINGLE, DOUBLE, LITERAL, or FOLDED. |
| public abstract [ScalarAstNode](ScalarAstNode.md)<T>                                                         | [setQuoteStyle](#setquotestyle)([QuoteStyle](../util/QuoteStyle.md) style)                                                        | Sets the [QuoteStyle](../util/QuoteStyle.md) used by a node                                                |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getRaw](#getraw)()                                                                                                               | Returns the exact, unparsed text block directly from the file buffer.                                      |
| public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) | [getPrimitive](#getprimitive)()                                                                                                   | Returns the Java-native representation of the scalar (e.g., Integer, Boolean, String).                     |
| public abstract [ScalarAstNode](ScalarAstNode.md)<T>                                                         | [setPrimitive](#setprimitive)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value) | Updates the logical native primitive value of this node.                                                   |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [asString](#asstring)()                                                                                                           | Returns the string form or the primitive.                                                                  |
| public abstract int                                                                                          | [asInteger](#asinteger)()                                                                                                         |                                                                                                            |
| public abstract int                                                                                          | [asInteger](#asinteger)(int defaultValue)                                                                                         |                                                                                                            |
| public abstract double                                                                                       | [asDouble](#asdouble)()                                                                                                           |                                                                                                            |
| public abstract double                                                                                       | [asDouble](#asdouble)(double defaultValue)                                                                                        |                                                                                                            |
| public abstract boolean                                                                                      | [asBoolean](#asboolean)()                                                                                                         | Returns the boolean value of the scalar, if there is one.                                                  |
| public abstract boolean                                                                                      | [asBoolean](#asboolean)(boolean defaultValue)                                                                                     | Returns the boolean value of the scalar, if there is one, otherwise the specified default is returned.     |



## Method Details

### getQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public abstract [QuoteStyle](../util/QuoteStyle.md) __getQuoteStyle__()</span>

Returns the [QuoteStyle](../util/QuoteStyle.md) used by a node: PLAIN, SINGLE, DOUBLE, LITERAL, or FOLDED.


---

### setQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public abstract [ScalarAstNode](ScalarAstNode.md)<T> __setQuoteStyle__([QuoteStyle](../util/QuoteStyle.md) style)</span>

Sets the [QuoteStyle](../util/QuoteStyle.md) used by a node


---

### getRaw

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getRaw__()</span>

Returns the exact, unparsed text block directly from the file buffer.


---

### getPrimitive

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getPrimitive__()</span>

Returns the Java-native representation of the scalar (e.g., Integer, Boolean, String).


---

### setPrimitive

<span style="font-family: monospace; font-size: 80%;">public abstract [ScalarAstNode](ScalarAstNode.md)<T> __setPrimitive__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>

Updates the logical native primitive value of this node.This method invalidates any pre-existing raw string cache derived from
a file buffer, marking the node as dirty so the emitter can contextually
re-serialize the new value on the next text export pass.


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

