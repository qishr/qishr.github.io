Package [io.github.qishr.cascara.common.type](index.md)

# Class AbstractScalarDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<T><br/>
                io.github.qishr.cascara.common.type.AbstractScalarDescriptor<br/>
<br/>
All Implemented Interfaces:<br/>
    [ScalarDescriptor](../../../../../../io/github/qishr/cascara/common/type/ScalarDescriptor.md)<T>

Direct Known Subtypes:<br/>
    [DiagnosticMessageDescriptor](../../../../../../io/github/qishr/cascara/common/type/cascara/DiagnosticMessageDescriptor.md), [CharacterArrayDescriptor](../../../../../../io/github/qishr/cascara/common/type/lang/CharacterArrayDescriptor.md), [ByteReferenceArrayDescriptor](../../../../../../io/github/qishr/cascara/common/type/lang/ByteReferenceArrayDescriptor.md), [CharArrayDescriptor](../../../../../../io/github/qishr/cascara/common/type/lang/CharArrayDescriptor.md), [RuntimeVersionDescriptor](../../../../../../io/github/qishr/cascara/common/type/lang/RuntimeVersionDescriptor.md), [ByteArrayDescriptor](../../../../../../io/github/qishr/cascara/common/type/lang/ByteArrayDescriptor.md), [HttpCookieDescriptor](../../../../../../io/github/qishr/cascara/common/type/net/HttpCookieDescriptor.md), [InetAddressDescriptor](../../../../../../io/github/qishr/cascara/common/type/net/InetAddressDescriptor.md), [UriDescriptor](../../../../../../io/github/qishr/cascara/common/type/net/UriDescriptor.md), [UrlDescriptor](../../../../../../io/github/qishr/cascara/common/type/net/UrlDescriptor.md), [PathDescriptor](../../../../../../io/github/qishr/cascara/common/type/nio/PathDescriptor.md), [ZoneIdDescriptor](../../../../../../io/github/qishr/cascara/common/type/time/ZoneIdDescriptor.md), [OffsetTimeDescriptor](../../../../../../io/github/qishr/cascara/common/type/time/OffsetTimeDescriptor.md), [ZonedDateTimeDescriptor](../../../../../../io/github/qishr/cascara/common/type/time/ZonedDateTimeDescriptor.md), [PeriodDescriptor](../../../../../../io/github/qishr/cascara/common/type/time/PeriodDescriptor.md), [InstantDescriptor](../../../../../../io/github/qishr/cascara/common/type/time/InstantDescriptor.md), [LocalDateTimeDescriptor](../../../../../../io/github/qishr/cascara/common/type/time/LocalDateTimeDescriptor.md), [OffsetDateTimeDescriptor](../../../../../../io/github/qishr/cascara/common/type/time/OffsetDateTimeDescriptor.md), [DurationDescriptor](../../../../../../io/github/qishr/cascara/common/type/time/DurationDescriptor.md), [ZoneOffsetDescriptor](../../../../../../io/github/qishr/cascara/common/type/time/ZoneOffsetDescriptor.md), [LocalTimeDescriptor](../../../../../../io/github/qishr/cascara/common/type/time/LocalTimeDescriptor.md), [DateDescriptor](../../../../../../io/github/qishr/cascara/common/type/util/DateDescriptor.md), [TimeZoneDescriptor](../../../../../../io/github/qishr/cascara/common/type/util/TimeZoneDescriptor.md), [SimpleTimeZoneDescriptor](../../../../../../io/github/qishr/cascara/common/type/util/SimpleTimeZoneDescriptor.md), [CurrencyDescriptor](../../../../../../io/github/qishr/cascara/common/type/util/CurrencyDescriptor.md), [UuidDescriptor](../../../../../../io/github/qishr/cascara/common/type/util/UuidDescriptor.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractScalarDescriptor__<br/>extends [AbstractTypeDescriptor](../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<T>
</span>


## Field Summary

| Modifier and Type                                                                                                | Field                                                 | Description |
|------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [KEYWORD_CONTENT_ENCODING](#keyword_content_encoding) |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [KEYWORD_FORMAT](#keyword_format)                     |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                            | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| AbstractScalarDescriptor([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> jvmType, [PrimitiveType](../../../../../../io/github/qishr/cascara/common/type/PrimitiveType.md) schemaType)                                                                                                                                                                                                                    |             |
| AbstractScalarDescriptor([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> jvmType, [PrimitiveType](../../../../../../io/github/qishr/cascara/common/type/PrimitiveType.md) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format)                                                                                                               |             |
| AbstractScalarDescriptor([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> jvmType, [PrimitiveType](../../../../../../io/github/qishr/cascara/common/type/PrimitiveType.md) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentEncoding) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                                               | Description |
|-----------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getFormat](#getformat)()                                                                                                                                                                                                            |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContentEncoding](#getcontentencoding)()                                                                                                                                                                                          |             |
| public void                                                                                         | [populateSchema](#populateschema)([MapAstNode](../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)<?, ?, ?> schema)                                                                                             |             |
| protected void                                                                                      | [formatError](#formaterror)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType


## Field Details

### KEYWORD_CONTENT_ENCODING

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __KEYWORD_CONTENT_ENCODING__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### KEYWORD_FORMAT

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __KEYWORD_FORMAT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>



**Specified By:**

[ScalarDescriptor](../../../../../../io/github/qishr/cascara/common/type/ScalarDescriptor.md)


---

### getContentEncoding

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContentEncoding__()</span>



**Specified By:**

[ScalarDescriptor](../../../../../../io/github/qishr/cascara/common/type/ScalarDescriptor.md)


---

### populateSchema

<span style="font-family: monospace; font-size: 80%;">public void __populateSchema__([MapAstNode](../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)<?, ?, ?> schema)</span>



**Specified By:**

[ScalarDescriptor](../../../../../../io/github/qishr/cascara/common/type/ScalarDescriptor.md)

**Overrides:**

[AbstractTypeDescriptor](../../../../../../../cascara.common/io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md#populateschema)


---

### formatError

<span style="font-family: monospace; font-size: 80%;">protected void __formatError__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

