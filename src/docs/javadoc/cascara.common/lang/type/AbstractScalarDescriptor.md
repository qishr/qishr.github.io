Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class AbstractScalarDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.type.AbstractTypeDescriptor](AbstractTypeDescriptor.md)<T><br/>
                io.github.qishr.cascara.common.lang.type.AbstractScalarDescriptor<br/>
<br/>
All Implemented Interfaces:<br/>
    [ScalarDescriptor](ScalarDescriptor.md)<T>

Direct Known Subtypes:<br/>
    [UuidTypeDescriptor](UuidTypeDescriptor.md), [UriTypeDescriptor](UriTypeDescriptor.md), [LocalDateTimeTypeDescriptor](LocalDateTimeTypeDescriptor.md), [PathTypeDescriptor](PathTypeDescriptor.md), [InstantTypeDescriptor](InstantTypeDescriptor.md), [ByteArrayDescriptor](ByteArrayDescriptor.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractScalarDescriptor__<br/>extends [AbstractTypeDescriptor](AbstractTypeDescriptor.md)<T>
</span>


## Field Summary

| Modifier and Type                                                                                                | Field                                                 | Description |
|------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [KEYWORD_CONTENT_ENCODING](#keyword_content_encoding) |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [KEYWORD_FORMAT](#keyword_format)                     |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| AbstractScalarDescriptor([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> jvmType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format)                                                                                                               |             |
| AbstractScalarDescriptor([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> jvmType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentEncoding) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                             | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getFormat](#getformat)()                                                                                                                                                          |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContentEncoding](#getcontentencoding)()                                                                                                                                        |             |
| public void                                                                                         | [populateSchema](#populateschema)([MapAstNode](../ast/MapAstNode.md)<?, ?> node)                                                                                                   |             |
| protected void                                                                                      | [formatError](#formaterror)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../diagnostic/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType


## Field Details

### KEYWORD_CONTENT_ENCODING

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __KEYWORD_CONTENT_ENCODING__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---

### KEYWORD_FORMAT

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __KEYWORD_FORMAT__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---


## Method Details

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>



**Specified By:**

[ScalarDescriptor](ScalarDescriptor.md)


---

### getContentEncoding

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContentEncoding__()</span>



**Specified By:**

[ScalarDescriptor](ScalarDescriptor.md)


---

### populateSchema

<span style="font-family: monospace; font-size: 80%;">public void __populateSchema__([MapAstNode](../ast/MapAstNode.md)<?, ?> node)</span>



**Specified By:**

[ScalarDescriptor](ScalarDescriptor.md)

**Overrides:**

[AbstractTypeDescriptor](../cascara.common/lang/type/AbstractTypeDescriptor.md#populateschema)


---

### formatError

<span style="font-family: monospace; font-size: 80%;">protected void __formatError__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../diagnostic/Reporter.md) collector)</span>




---

