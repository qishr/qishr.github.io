Package [io.github.qishr.cascara.common.lang.type](index.md)

# Interface ScalarDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.type.ScalarDescriptor<br/>
<br/>
All Implemented Interfaces:<br/>
    [TypeDescriptor](TypeDescriptor.md)<T>

All Known Implementing Classes:<br/>
    [AbstractScalarDescriptor](AbstractScalarDescriptor.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ScalarDescriptor__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                     | Description                                                              |
|--------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| public abstract T                                                                                            | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text) | Converts the `text` into the JVM type specified by this TypeDescriptor.  |
| public abstract [Primitive](Primitive.md)                                                                    | [toPrimitive](#toprimitive)(T jvmInstance)                                                                                 | Converts the JVM type specified by this TypeDescriptor into a Primitive. |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getFormat](#getformat)()                                                                                                  | Retuns the JSON Schema `format` used by this TypeDescriptor.             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContentEncoding](#getcontentencoding)()                                                                                | Returns the JSON Schema `contentEncoding` use by this TypeDescriptor.    |
| public default void                                                                                          | [populateSchema](#populateschema)([MapAstNode](../ast/MapAstNode.md)<?, ?> node)                                           |                                                                          |



## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public abstract T __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>

Converts the `text` into the JVM type specified by this TypeDescriptor.


---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public abstract [Primitive](Primitive.md) __toPrimitive__(T jvmInstance)</span>

Converts the JVM type specified by this TypeDescriptor into a Primitive.


---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>

Retuns the JSON Schema `format` used by this TypeDescriptor.


---

### getContentEncoding

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContentEncoding__()</span>

Returns the JSON Schema `contentEncoding` use by this TypeDescriptor.


---

### populateSchema

<span style="font-family: monospace; font-size: 80%;">public default void __populateSchema__([MapAstNode](../ast/MapAstNode.md)<?, ?> node)</span>



**Specified By:**

[TypeDescriptor](TypeDescriptor.md)


---

