Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlScalarNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlScalarNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)<[YamlNode](YamlNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlScalarNode__<br/>extends [YamlNode](YamlNode.md)
</span>

Represents a leaf node in the YAML AST containing a single scalar value.


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                     | Description                                |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------|
| YamlScalarNode(int line, int column, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) raw, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) unescapedContent, [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) quoteStyle) | Constructor for use in parsers.            |
| YamlScalarNode([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) primitiveValue, [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) quoteStyle)                                                                                                                           | A programmatic and serializer constructor. |
| YamlScalarNode([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) primitiveValue)                                                                                                                                                                                                     |                                            |
| YamlScalarNode([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) primitiveValue, boolean isKey)                                                                                                                                                                                      | A programmatic and serializer constructor. |
| YamlScalarNode()                                                                                                                                                                                                                                                                                                                | The default constructor                    |



## Method Summary

| Modifier and Type                                                                                                        | Method                                                                                                                                | Description                                                                                                                                                       |
|--------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static [YamlScalarNode](YamlScalarNode.md)                                                                        | [fromPrimitive](#fromprimitive)([Primitive](../../../cascara.common/lang/type/Primitive.md) primitive)                                |                                                                                                                                                                   |
| public boolean                                                                                                           | [isQuoted](#isquoted)()                                                                                                               |                                                                                                                                                                   |
| public [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md)                                                     | [getQuoteStyle](#getquotestyle)()                                                                                                     | Gets the quoting style used for this scalar.                                                                                                                      |
| public [YamlScalarNode](YamlScalarNode.md)                                                                               | [setQuoteStyle](#setquotestyle)([QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) quoteStyle)                             | Sets the quoting style and clears the raw cache.                                                                                                                  |
| public [ScalarStyle](ScalarStyle.md)                                                                                     | [getScalarStyle](#getscalarstyle)()                                                                                                   |                                                                                                                                                                   |
| public [YamlScalarNode](YamlScalarNode.md)                                                                               | [setScalarStyle](#setscalarstyle)([ScalarStyle](ScalarStyle.md) style)                                                                |                                                                                                                                                                   |
| public [ChompingStyle](ChompingStyle.md)                                                                                 | [getChompingStyle](#getchompingstyle)()                                                                                               |                                                                                                                                                                   |
| public [YamlScalarNode](YamlScalarNode.md)                                                                               | [setChompingStyle](#setchompingstyle)([ChompingStyle](ChompingStyle.md) style)                                                        |                                                                                                                                                                   |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> | [getChildren](#getchildren)()                                                                                                         |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. Scalars are leaf nodes and have no children. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [getRaw](#getraw)()                                                                                                                   | Returns the original raw (unescaped) string as seen in the source file.                                                                                           |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                      | [getPrimitive](#getprimitive)()                                                                                                       | Returns the Java-native representation of the scalar (e.g., Integer, Boolean, String). Performs basic type inference to return the most appropriate Java object.  |
| public [YamlScalarNode](YamlScalarNode.md)                                                                               | [setPrimitive](#setprimitive)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) primitive) |                                                                                                                                                                   |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [asString](#asstring)()                                                                                                               | Returns the string form or the primitive.                                                                                                                         |
| public int                                                                                                               | [asInteger](#asinteger)()                                                                                                             |                                                                                                                                                                   |
| public int                                                                                                               | [asInteger](#asinteger)(int defaultValue)                                                                                             |                                                                                                                                                                   |
| public double                                                                                                            | [asDouble](#asdouble)()                                                                                                               |                                                                                                                                                                   |
| public double                                                                                                            | [asDouble](#asdouble)(double defaultValue)                                                                                            |                                                                                                                                                                   |
| public boolean                                                                                                           | [asBoolean](#asboolean)()                                                                                                             | Returns the boolean value of the scalar, if there is one.                                                                                                         |
| public boolean                                                                                                           | [asBoolean](#asboolean)(boolean defaultValue)                                                                                         | Returns the boolean value of the scalar, if there is one, otherwise the specified default is returned.                                                            |
| public boolean                                                                                                           | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                     | Compares this scalar with another for equality.                                                                                                                   |
| public int                                                                                                               | [hashCode](#hashcode)()                                                                                                               | Generates a hash code based on the node's logical content.                                                                                                        |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [toString](#tostring)()                                                                                                               |                                                                                                                                                                   |
| public void                                                                                                              | [accept](#accept)([YamlVisitor](YamlVisitor.md) visitor)                                                                              |                                                                                                                                                                   |


### Methods inherited from [YamlNode](YamlNode.md)

getEndColumn, getEndLine, getComments, setAnchor, getStartColumn, getToken, addComments, getAnchor, getStartLine, addComment, setToken


## Method Details

### fromPrimitive

<span style="font-family: monospace; font-size: 80%;">public static [YamlScalarNode](YamlScalarNode.md) __fromPrimitive__([Primitive](../../../cascara.common/lang/type/Primitive.md) primitive)</span>




---

### isQuoted

<span style="font-family: monospace; font-size: 80%;">public boolean __isQuoted__()</span>




---

### getQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) __getQuoteStyle__()</span>

Gets the quoting style used for this scalar.

**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### setQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [YamlScalarNode](YamlScalarNode.md) __setQuoteStyle__([QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) quoteStyle)</span>

Sets the quoting style and clears the raw cache.

**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### getScalarStyle

<span style="font-family: monospace; font-size: 80%;">public [ScalarStyle](ScalarStyle.md) __getScalarStyle__()</span>




---

### setScalarStyle

<span style="font-family: monospace; font-size: 80%;">public [YamlScalarNode](YamlScalarNode.md) __setScalarStyle__([ScalarStyle](ScalarStyle.md) style)</span>




---

### getChompingStyle

<span style="font-family: monospace; font-size: 80%;">public [ChompingStyle](ChompingStyle.md) __getChompingStyle__()</span>




---

### setChompingStyle

<span style="font-family: monospace; font-size: 80%;">public [YamlScalarNode](YamlScalarNode.md) __setChompingStyle__([ChompingStyle](ChompingStyle.md) style)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> __getChildren__()</span>



Implementation-specific nodes must return their constituent children.
For example, a Map node returns its entries.
Scalars are leaf nodes and have no children.

**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#getchildren)


---

### getRaw

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getRaw__()</span>

Returns the original raw (unescaped) string as seen in the source file.

**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### getPrimitive

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getPrimitive__()</span>

Returns the Java-native representation of the scalar (e.g., Integer, Boolean, String).
Performs basic type inference to return the most appropriate Java object.

**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### setPrimitive

<span style="font-family: monospace; font-size: 80%;">public [YamlScalarNode](YamlScalarNode.md) __setPrimitive__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) primitive)</span>



**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>

Returns the string form or the primitive.

**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


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

Returns the boolean value of the scalar, if there is one.

**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### asBoolean

<span style="font-family: monospace; font-size: 80%;">public boolean __asBoolean__(boolean defaultValue)</span>

Returns the boolean value of the scalar, if there is one, otherwise the specified default is returned.

**Specified By:**

[ScalarAstNode](../../../cascara.common/lang/ast/ScalarAstNode.md)


---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>

Compares this scalar with another for equality.Two scalars are considered equal if they share the same anchor
and logical string value. Source coordinates and quoting styles
are ignored.

**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>

Generates a hash code based on the node's logical content.

**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#hashcode)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#accept)


---

