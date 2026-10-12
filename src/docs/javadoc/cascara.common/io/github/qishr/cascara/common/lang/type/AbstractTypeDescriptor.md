Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class AbstractTypeDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.type.AbstractTypeDescriptor<br/>
<br/>
All Implemented Interfaces:<br/>
    [TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)<T>

Direct Known Subtypes:<br/>
    [StackTraceElementSerializer](../../../../../../../io/github/qishr/cascara/common/lang/type/StackTraceElementSerializer.md), [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/AbstractScalarDescriptor.md), [ThrowableSerializer](../../../../../../../io/github/qishr/cascara/common/lang/type/ThrowableSerializer.md), [AbstractYamlTypeSerializer](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/processor/AbstractYamlTypeSerializer.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractTypeDescriptor__</span>


## Field Summary

| Modifier and Type                                                                                                | Field                         | Description |
|------------------------------------------------------------------------------------------------------------------|-------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [KEYWORD_TYPE](#keyword_type) |             |
| protected Properties                                                                                             | [properties](#properties)     |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                               | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| AbstractTypeDescriptor([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> jvmType, [PrimitiveType](../../../../../../../io/github/qishr/cascara/common/lang/type/PrimitiveType.md) schemaType) |             |



## Method Summary

| Modifier and Type                                                                                      | Method                                                                                                                                    | Description |
|--------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Properties](../../../../../../../io/github/qishr/cascara/common/property/Properties.md)        | [getServiceProperties](#getserviceproperties)()                                                                                           |             |
| public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T>   | [getJvmType](#getjvmtype)()                                                                                                               |             |
| public [PrimitiveType](../../../../../../../io/github/qishr/cascara/common/lang/type/PrimitiveType.md) | [getSchemaType](#getschematype)()                                                                                                         |             |
| public void                                                                                            | [populateSchema](#populateschema)([MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)<?, ?, ?> node) |             |



## Field Details

### KEYWORD_TYPE

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __KEYWORD_TYPE__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---

### properties

<span style="font-family: monospace; font-size: 80%;">protected Properties __properties__</span>




---


## Method Details

### getServiceProperties

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../../../../../../io/github/qishr/cascara/common/property/Properties.md) __getServiceProperties__()</span>




---

### getJvmType

<span style="font-family: monospace; font-size: 80%;">public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> __getJvmType__()</span>



**Specified By:**

[TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)


---

### getSchemaType

<span style="font-family: monospace; font-size: 80%;">public [PrimitiveType](../../../../../../../io/github/qishr/cascara/common/lang/type/PrimitiveType.md) __getSchemaType__()</span>



**Specified By:**

[TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)


---

### populateSchema

<span style="font-family: monospace; font-size: 80%;">public void __populateSchema__([MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)<?, ?, ?> node)</span>



**Specified By:**

[TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)


---

