Package [io.github.qishr.cascara.lang.json.ast](index.md)

# Class JsonScalarNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.ast.JsonNode](JsonNode.md)<br/>
                io.github.qishr.cascara.lang.json.ast.JsonScalarNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [ScalarAstNode](../../cascara.common/lang/ast/ScalarAstNode.md)<[JsonNode](JsonNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonScalarNode__<br/>extends [JsonNode](JsonNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                | Description                                |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------|
| JsonScalarNode([JsonToken](../token/JsonToken.md) token, [PrimitiveType](../../cascara.common/lang/type/PrimitiveType.md) schemaType, boolean isKey, [JsonOptions](../util/JsonOptions.md) options)                                                        | Constructor for use in parsers.            |
| JsonScalarNode([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content, [JsonOptions](../util/JsonOptions.md) options)                                                                                        |                                            |
| JsonScalarNode([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) quoteStyle, boolean isKey, [JsonOptions](../util/JsonOptions.md) options) |                                            |
| JsonScalarNode([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) quoteStyle)                                                               | A programmatic and serializer constructor. |
| JsonScalarNode([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)                                                                                                                                      | A programmatic and serializer constructor. |
| JsonScalarNode([JsonToken](../token/JsonToken.md) tok, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)                                                                                              |                                            |
| JsonScalarNode([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, boolean isKey)                                                                                                                       | A programmatic and serializer constructor. |
| JsonScalarNode()                                                                                                                                                                                                                                           | The default constructor                    |



## Method Summary

| Modifier and Type                                                                                                        | Method                                                                                                            | Description                                                                            |
|--------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------|
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](JsonNode.md)> | [getChildren](#getchildren)()                                                                                     |                                                                                        |
| public [PrimitiveType](../../cascara.common/lang/type/PrimitiveType.md)                                                  | [getPrimitiveType](#getprimitivetype)()                                                                           |                                                                                        |
| public [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md)                                                        | [getQuoteStyle](#getquotestyle)()                                                                                 |                                                                                        |
| public [JsonScalarNode](JsonScalarNode.md)                                                                               | [setQuoteStyle](#setquotestyle)([QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) style)                 |                                                                                        |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [getLexeme](#getlexeme)()                                                                                         |                                                                                        |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [getContent](#getcontent)()                                                                                       |                                                                                        |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                      | [getPrimitive](#getprimitive)()                                                                                   | Returns the dialect-aware JVM value (cached).                                          |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [asString](#asstring)()                                                                                           | Returns the logical clean text value, stripped of outer formatting and escape markers. |
| public int                                                                                                               | [asInteger](#asinteger)()                                                                                         |                                                                                        |
| public int                                                                                                               | [asInteger](#asinteger)(int defaultValue)                                                                         |                                                                                        |
| public double                                                                                                            | [asDouble](#asdouble)()                                                                                           |                                                                                        |
| public double                                                                                                            | [asDouble](#asdouble)(double defaultValue)                                                                        |                                                                                        |
| public boolean                                                                                                           | [asBoolean](#asboolean)()                                                                                         |                                                                                        |
| public boolean                                                                                                           | [asBoolean](#asboolean)(boolean defaultValue)                                                                     |                                                                                        |
| public boolean                                                                                                           | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o) |                                                                                        |
| public int                                                                                                               | [hashCode](#hashcode)()                                                                                           |                                                                                        |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [toString](#tostring)()                                                                                           |                                                                                        |
| public [JsonOptions](../util/JsonOptions.md)                                                                             | [getOptions](#getoptions)()                                                                                       |                                                                                        |


### Methods inherited from [JsonNode](JsonNode.md)

getEndColumn, getEndLine, getComments, getStartColumn, getToken, setToken, addComment, getStartLine


## Method Details

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](JsonNode.md)> __getChildren__()</span>



**Overrides:**

[JsonNode](../cascara.lang.json/ast/JsonNode.md#getchildren)


---

### getPrimitiveType

<span style="font-family: monospace; font-size: 80%;">public [PrimitiveType](../../cascara.common/lang/type/PrimitiveType.md) __getPrimitiveType__()</span>




---

### getQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) __getQuoteStyle__()</span>



**Specified By:**

[ScalarAstNode](../../cascara.common/lang/ast/ScalarAstNode.md)


---

### setQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [JsonScalarNode](JsonScalarNode.md) __setQuoteStyle__([QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) style)</span>



**Specified By:**

[ScalarAstNode](../../cascara.common/lang/ast/ScalarAstNode.md)


---

### getLexeme

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLexeme__()</span>



**Specified By:**

[ScalarAstNode](../../cascara.common/lang/ast/ScalarAstNode.md)


---

### getContent

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContent__()</span>



**Specified By:**

[ScalarAstNode](../../cascara.common/lang/ast/ScalarAstNode.md)


---

### getPrimitive

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getPrimitive__()</span>

Returns the dialect-aware JVM value (cached).

**Specified By:**

[ScalarAstNode](../../cascara.common/lang/ast/ScalarAstNode.md)


---

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>

Returns the logical clean text value, stripped of outer formatting and escape markers.

**Specified By:**

[ScalarAstNode](../../cascara.common/lang/ast/ScalarAstNode.md)


---

### asInteger

<span style="font-family: monospace; font-size: 80%;">public int __asInteger__()</span>



**Specified By:**

[ScalarAstNode](../../cascara.common/lang/ast/ScalarAstNode.md)


---

### asInteger

<span style="font-family: monospace; font-size: 80%;">public int __asInteger__(int defaultValue)</span>



**Specified By:**

[ScalarAstNode](../../cascara.common/lang/ast/ScalarAstNode.md)


---

### asDouble

<span style="font-family: monospace; font-size: 80%;">public double __asDouble__()</span>



**Specified By:**

[ScalarAstNode](../../cascara.common/lang/ast/ScalarAstNode.md)


---

### asDouble

<span style="font-family: monospace; font-size: 80%;">public double __asDouble__(double defaultValue)</span>



**Specified By:**

[ScalarAstNode](../../cascara.common/lang/ast/ScalarAstNode.md)


---

### asBoolean

<span style="font-family: monospace; font-size: 80%;">public boolean __asBoolean__()</span>



**Specified By:**

[ScalarAstNode](../../cascara.common/lang/ast/ScalarAstNode.md)


---

### asBoolean

<span style="font-family: monospace; font-size: 80%;">public boolean __asBoolean__(boolean defaultValue)</span>



**Specified By:**

[ScalarAstNode](../../cascara.common/lang/ast/ScalarAstNode.md)


---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>



**Overrides:**

[JsonNode](../cascara.lang.json/ast/JsonNode.md#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>



**Overrides:**

[JsonNode](../cascara.lang.json/ast/JsonNode.md#hashcode)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

### getOptions

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](../util/JsonOptions.md) __getOptions__()</span>




---

