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


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| AbstractScalarDescriptor([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> jvmType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format)                                                                                                               |             |
| AbstractScalarDescriptor([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> jvmType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentEncoding) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                           | Description |
|-----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getFormat](#getformat)()                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContentEncoding](#getcontentencoding)()                                      |             |
| public void                                                                                         | [populateSchema](#populateschema)([MapAstNode](../ast/MapAstNode.md)<?, ?> node) |             |


### Methods inherited from [AbstractTypeDescriptor](AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType


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

