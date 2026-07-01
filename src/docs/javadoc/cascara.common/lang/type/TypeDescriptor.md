Package [io.github.qishr.cascara.common.lang.type](index.md)

# Interface TypeDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.type.TypeDescriptor<br/>
<br/>
All Implemented Interfaces:<br/>
    [ServiceProvider](../../service/ServiceProvider.md)

All Known Implementing Classes:<br/>
    [ScalarDescriptor](ScalarDescriptor.md), [AbstractTypeDescriptor](AbstractTypeDescriptor.md), [TypeSerializer](TypeSerializer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __TypeDescriptor__</span>


## Method Summary

| Modifier and Type                                                                                             | Method                                                                           | Description                                                                                                                |
|---------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|
| public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> | [getJvmType](#getjvmtype)()                                                      | Returns the JVM type handled by this TypeDescriptor.                                                                       |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)  | [getSchemaType](#getschematype)()                                                | Returns the JSON Schema type handled by this TypeDescriptor.                                                               |
| public abstract void                                                                                          | [populateSchema](#populateschema)([MapAstNode](../ast/MapAstNode.md)<?, ?> node) | Adds JSON Schema keywords and values to a map representing a JSON schema for the JSON type handled by this TypeDescriptor. |



## Method Details

### getJvmType

<span style="font-family: monospace; font-size: 80%;">public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> __getJvmType__()</span>

Returns the JVM type handled by this TypeDescriptor.


---

### getSchemaType

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSchemaType__()</span>

Returns the JSON Schema type handled by this TypeDescriptor.


---

### populateSchema

<span style="font-family: monospace; font-size: 80%;">public abstract void __populateSchema__([MapAstNode](../ast/MapAstNode.md)<?, ?> node)</span>

Adds JSON Schema keywords and values to a map representing a
JSON schema for the JSON type handled by this TypeDescriptor.


---

