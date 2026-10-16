Package [io.github.qishr.cascara.common.type](index.md)

# Interface TypeDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.type.TypeDescriptor<br/>
<br/>
All Implemented Interfaces:<br/>
    [ServiceProvider](../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md)

All Known Implementing Classes:<br/>
    [ScalarDescriptor](../../../../../../io/github/qishr/cascara/common/type/ScalarDescriptor.md), [AbstractTypeDescriptor](../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md), [TypeSerializer](../../../../../../io/github/qishr/cascara/common/type/TypeSerializer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __TypeDescriptor__</span>


## Method Summary

| Modifier and Type                                                                                             | Method                                                                                                                                                                                                                         | Description                                                                                                                |
|---------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|
| public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> | [getJvmType](#getjvmtype)()                                                                                                                                                                                                    | Returns the JVM type handled by this TypeDescriptor.                                                                       |
| public abstract [PrimitiveType](../../../../../../io/github/qishr/cascara/common/type/PrimitiveType.md)       | [getSchemaType](#getschematype)()                                                                                                                                                                                              | Returns the JSON Schema primitive type handled by this TypeDescriptor.                                                     |
| public abstract void                                                                                          | [populateSchema](#populateschema)([MapAstNode](../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)<?, ?, ?> schema)                                                                                       | Adds JSON Schema keywords and values to a map representing a JSON schema for the JSON type handled by this TypeDescriptor. |
| public abstract boolean                                                                                       | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |                                                                                                                            |



## Method Details

### getJvmType

<span style="font-family: monospace; font-size: 80%;">public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> __getJvmType__()</span>

Returns the JVM type handled by this TypeDescriptor.


---

### getSchemaType

<span style="font-family: monospace; font-size: 80%;">public abstract [PrimitiveType](../../../../../../io/github/qishr/cascara/common/type/PrimitiveType.md) __getSchemaType__()</span>

Returns the JSON Schema primitive type handled by this TypeDescriptor.


---

### populateSchema

<span style="font-family: monospace; font-size: 80%;">public abstract void __populateSchema__([MapAstNode](../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)<?, ?, ?> schema)</span>

Adds JSON Schema keywords and values to a map representing a
JSON schema for the JSON type handled by this TypeDescriptor.


---

### validate

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

