Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlScalar
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlScalar<br/>
<br/>
All Implemented Interfaces:<br/>
    [ScalarAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlScalar__<br/>extends [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)
</span>

Represents a leaf node in the YAML AST containing a single scalar value.


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------|
| YamlScalar([YamlToken](../../../../../../../io/github/qishr/cascara/lang/yaml/token/YamlToken.md) token, [PrimitiveType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/PrimitiveType.md) primitiveType, [YamlOptions](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlOptions.md) options)                                                                                                                                                                                                              | Constructor for use in parsers.            |
| YamlScalar([YamlToken](../../../../../../../io/github/qishr/cascara/lang/yaml/token/YamlToken.md) token, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content, [PrimitiveType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/PrimitiveType.md) primitiveType, [ScalarStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ScalarStyle.md) scalarStyle, [YamlOptions](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlOptions.md) options) | Constructor for use in parsers.            |
| YamlScalar([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [ScalarStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ScalarStyle.md) scalarStyle, [YamlOptions](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlOptions.md) options)                                                                                                                                                                                                                          | A programmatic and serializer constructor. |
| YamlScalar([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue, [ScalarStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ScalarStyle.md) scalarStyle)                                                                                                                                                                                                                                                                                                                             | A programmatic and serializer constructor. |
| YamlScalar([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)                                                                                                                                                                                                                                                                                                                                                                                                                                    | A programmatic and serializer constructor. |
| YamlScalar()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | The default constructor                    |



## Method Summary

| Modifier and Type                                                                                                                                                                   | Method                                                                                                                                                                                                                          | Description                                                                                                                                                       |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public [YamlOptions](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlOptions.md)                                                                                    | [getOptions](#getoptions)()                                                                                                                                                                                                     |                                                                                                                                                                   |
| public [PrimitiveType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/PrimitiveType.md)                                                                 | [getPrimitiveType](#getprimitivetype)()                                                                                                                                                                                         |                                                                                                                                                                   |
| public boolean                                                                                                                                                                      | [isQuoted](#isquoted)()                                                                                                                                                                                                         |                                                                                                                                                                   |
| public [ScalarStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ScalarStyle.md)                                                                                    | [getScalarStyle](#getscalarstyle)()                                                                                                                                                                                             |                                                                                                                                                                   |
| public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md)                                                                                       | [setScalarStyle](#setscalarstyle)([ScalarStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ScalarStyle.md) scalarStyle)                                                                                        |                                                                                                                                                                   |
| public [QuoteStyle](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/QuoteStyle.md)                                                                  | [getQuoteStyle](#getquotestyle)()                                                                                                                                                                                               | Gets the quoting style used for this scalar.                                                                                                                      |
| public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md)                                                                                       | [setQuoteStyle](#setquotestyle)([QuoteStyle](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/QuoteStyle.md) quoteStyle)                                                                         | Sets the quoting style.                                                                                                                                           |
| public [ChompingStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ChompingStyle.md)                                                                                | [getChompingStyle](#getchompingstyle)()                                                                                                                                                                                         |                                                                                                                                                                   |
| public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md)                                                                                       | [setChompingStyle](#setchompingstyle)([ChompingStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ChompingStyle.md) style)                                                                                      |                                                                                                                                                                   |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                 | [getLexeme](#getlexeme)()                                                                                                                                                                                                       | Returns the original raw (unescaped) string as seen in the source file.                                                                                           |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                 | [getContent](#getcontent)()                                                                                                                                                                                                     |                                                                                                                                                                   |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                 | [getPrimitive](#getprimitive)()                                                                                                                                                                                                 | Returns the dialect-aware JVM value (cached).                                                                                                                     |
| public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md)                                                                                       | [setPrimitive](#setprimitive)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)                                                                                            |                                                                                                                                                                   |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                 | [asString](#asstring)()                                                                                                                                                                                                         |                                                                                                                                                                   |
| public int                                                                                                                                                                          | [asInteger](#asinteger)()                                                                                                                                                                                                       |                                                                                                                                                                   |
| public int                                                                                                                                                                          | [asInteger](#asinteger)(int defaultValue)                                                                                                                                                                                       |                                                                                                                                                                   |
| public double                                                                                                                                                                       | [asDouble](#asdouble)()                                                                                                                                                                                                         |                                                                                                                                                                   |
| public double                                                                                                                                                                       | [asDouble](#asdouble)(double defaultValue)                                                                                                                                                                                      |                                                                                                                                                                   |
| public boolean                                                                                                                                                                      | [asBoolean](#asboolean)()                                                                                                                                                                                                       | Returns the boolean value of the scalar, if there is one, otherwise results false.                                                                                |
| public boolean                                                                                                                                                                      | [asBoolean](#asboolean)(boolean defaultValue)                                                                                                                                                                                   | Returns the boolean value of the scalar, if there is one, otherwise the specified default is returned.                                                            |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)> | [getChildren](#getchildren)()                                                                                                                                                                                                   |   Implementation-specific nodes must return their constituent children. For example, a Map node returns its entries. Scalars are leaf nodes and have no children. |
| public void                                                                                                                                                                         | [accept](#accept)([YamlVisitor](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlVisitor.md) visitor)                                                                                                            |                                                                                                                                                                   |
| public boolean                                                                                                                                                                      | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                                                                                                               | Compares this scalar with another for equality.                                                                                                                   |
| public int                                                                                                                                                                          | [hashCode](#hashcode)()                                                                                                                                                                                                         | Generates a hash code based on the node's logical content.                                                                                                        |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                 | [toString](#tostring)()                                                                                                                                                                                                         |                                                                                                                                                                   |
| public static [ScalarStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ScalarStyle.md)                                                                             | [inferQuoteStyle](#inferquotestyle)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)                                                                                         |                                                                                                                                                                   |
| public [PrimitiveType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/PrimitiveType.md)                                                                 | [inferType](#infertype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) raw, [ScalarStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ScalarStyle.md) quoteStyle) |                                                                                                                                                                   |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                 | [parse](#parse)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) raw, [ScalarStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ScalarStyle.md) quoteStyle)         |                                                                                                                                                                   |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                 | [unescape](#unescape)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [ScalarStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ScalarStyle.md) style)       |                                                                                                                                                                   |


### Methods inherited from [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)

isPreceededByNewLine, getNodeStyle, setFileEndsWithNewLine, setNodeStyle, getTag, setAnchor, getStartColumn, addComments, getStartLine, fileEndsWithNewLine, getEndColumn, getSemanticColumn, getEndLine, getComments, setTag, addComment, setPreceededByNewLine, getResolvedTag, getToken, getProperties, getAnchor, setResolvedTag, setSemanticColumn


## Method Details

### getOptions

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlOptions.md) __getOptions__()</span>




---

### getPrimitiveType

<span style="font-family: monospace; font-size: 80%;">public [PrimitiveType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/PrimitiveType.md) __getPrimitiveType__()</span>



**Specified By:**

[ScalarAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### isQuoted

<span style="font-family: monospace; font-size: 80%;">public boolean __isQuoted__()</span>




---

### getScalarStyle

<span style="font-family: monospace; font-size: 80%;">public [ScalarStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ScalarStyle.md) __getScalarStyle__()</span>




---

### setScalarStyle

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md) __setScalarStyle__([ScalarStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ScalarStyle.md) scalarStyle)</span>




---

### getQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [QuoteStyle](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/QuoteStyle.md) __getQuoteStyle__()</span>

Gets the quoting style used for this scalar.

**Specified By:**

[ScalarAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### setQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md) __setQuoteStyle__([QuoteStyle](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/QuoteStyle.md) quoteStyle)</span>

Sets the quoting style.

**Specified By:**

[ScalarAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### getChompingStyle

<span style="font-family: monospace; font-size: 80%;">public [ChompingStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ChompingStyle.md) __getChompingStyle__()</span>




---

### setChompingStyle

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md) __setChompingStyle__([ChompingStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ChompingStyle.md) style)</span>




---

### getLexeme

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLexeme__()</span>

Returns the original raw (unescaped) string as seen in the source file.

**Specified By:**

[ScalarAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### getContent

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContent__()</span>



**Specified By:**

[ScalarAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### getPrimitive

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getPrimitive__()</span>

Returns the dialect-aware JVM value (cached).

**Specified By:**

[ScalarAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### setPrimitive

<span style="font-family: monospace; font-size: 80%;">public [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md) __setPrimitive__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmValue)</span>



**Specified By:**

[ScalarAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>



**Specified By:**

[ScalarAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### asInteger

<span style="font-family: monospace; font-size: 80%;">public int __asInteger__()</span>



**Specified By:**

[ScalarAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### asInteger

<span style="font-family: monospace; font-size: 80%;">public int __asInteger__(int defaultValue)</span>



**Specified By:**

[ScalarAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### asDouble

<span style="font-family: monospace; font-size: 80%;">public double __asDouble__()</span>



**Specified By:**

[ScalarAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### asDouble

<span style="font-family: monospace; font-size: 80%;">public double __asDouble__(double defaultValue)</span>



**Specified By:**

[ScalarAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### asBoolean

<span style="font-family: monospace; font-size: 80%;">public boolean __asBoolean__()</span>

Returns the boolean value of the scalar, if there is one, otherwise results false.

**Specified By:**

[ScalarAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### asBoolean

<span style="font-family: monospace; font-size: 80%;">public boolean __asBoolean__(boolean defaultValue)</span>

Returns the boolean value of the scalar, if there is one, otherwise the specified default is returned.

**Specified By:**

[ScalarAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/ScalarAstNode.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)> __getChildren__()</span>



Implementation-specific nodes must return their constituent children.
For example, a Map node returns its entries.
Scalars are leaf nodes and have no children.

**Overrides:**

[YamlNode](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/ast/YamlNode.md#getchildren)


---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/ast/YamlNode.md#accept)


---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>

Compares this scalar with another for equality.https://yaml.org/spec/1.2.2/#3213-node-comparison

Two nodes must have the same tag and content to be equal. Since each tag applies to exactly one kind, this implies that the two nodes must have the same kind to be equal.

Two scalars are equal only when their tags and canonical forms are equal character-by-character. Equality of collections is defined recursively.
Note: Source coordinates (line and column) are intentionally excluded
from equality checks to allow programmatically created nodes to match
parsed nodes during map lookups.

**Overrides:**

[YamlNode](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/ast/YamlNode.md#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>

Generates a hash code based on the node's logical content.

**Overrides:**

[YamlNode](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/ast/YamlNode.md#hashcode)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[YamlNode](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/ast/YamlNode.md#tostring)


---

### inferQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public static [ScalarStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ScalarStyle.md) __inferQuoteStyle__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>




---

### inferType

<span style="font-family: monospace; font-size: 80%;">public [PrimitiveType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/PrimitiveType.md) __inferType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) raw, [ScalarStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ScalarStyle.md) quoteStyle)</span>




---

### parse

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __parse__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) raw, [ScalarStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ScalarStyle.md) quoteStyle)</span>




---

### unescape

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __unescape__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [ScalarStyle](../../../../../../../io/github/qishr/cascara/lang/yaml/util/ScalarStyle.md) style)</span>




---

