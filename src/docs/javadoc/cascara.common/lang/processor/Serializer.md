Package [io.github.qishr.cascara.common.lang.processor](index.md)

# Interface Serializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.processor.Serializer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Processor](Processor.md)

All Known Implementing Classes:<br/>
    [AbstractSerializer](AbstractSerializer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __Serializer__</span>

Handles the transformation between Java Objects (POJOs) and the AST or textual formats.This interface provides a high-level API for data binding, allowing users to
move seamlessly between raw objects, structured ASTs, and the final string output.


## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                                                                                                                                    | Description                                                      |
|--------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toText](#totext)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                               |                                                                  |
| public abstract void                                                                                         | [toWriter](#towriter)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance, [Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)        |                                                                  |
| public abstract N                                                                                            | [toAst](#toast)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                 | Transforms a Java Object into an AST representation.             |
| public abstract C                                                                                            | [fromText](#fromtext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)           |                                                                  |
| public abstract C                                                                                            | [fromText](#fromtext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [TypeReference](../type/TypeReference.md)<C> typeRef)                                                            |                                                                  |
| public abstract C                                                                                            | [fromReader](#fromreader)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)       |                                                                  |
| public abstract C                                                                                            | [fromReader](#fromreader)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [TypeReference](../type/TypeReference.md)<C> typeRef)                                                        |                                                                  |
| public abstract C                                                                                            | [fromStream](#fromstream)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType) |                                                                  |
| public abstract C                                                                                            | [fromStream](#fromstream)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [TypeReference](../type/TypeReference.md)<C> typeRef)                                                  |                                                                  |
| public abstract C                                                                                            | [fromAst](#fromast)(N astNode, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                                                                                                     | Transforms an AST representation back into a specific Java type. |
| public abstract C                                                                                            | [fromAst](#fromast)(N astNode, [TypeReference](../type/TypeReference.md)<C> typeRef)                                                                                                                                                      |                                                                  |
| public abstract [Serializer](Serializer.md)<N>                                                               | [registerTypeDescriptor](#registertypedescriptor)([TypeDescriptor](../type/TypeDescriptor.md)<?> typeDescriptor)                                                                                                                          |                                                                  |
| public abstract [Serializer](Serializer.md)<N>                                                               | [setParser](#setparser)([AstParser](AstParser.md)<N, ?> parser)                                                                                                                                                                           |                                                                  |



## Method Details

### toText

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toText__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>



**Parameters:**

`jvmInstance` - The object to serialize.

**Returns:**

The formatted string (e.g., YAML or JSON).

**Throws:**

[SerializerException](../exception/SerializerException.md)


---

### toWriter

<span style="font-family: monospace; font-size: 80%;">public abstract void __toWriter__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance, [Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### toAst

<span style="font-family: monospace; font-size: 80%;">public abstract N __toAst__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>

Transforms a Java Object into an AST representation.

**Parameters:**

`jvmInstance` - The POJO or collection to transform.

**Returns:**

An AST representation of the provided object.


---

### fromText

<span style="font-family: monospace; font-size: 80%;">public abstract C __fromText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>



**Parameters:**

`text` - The source text to parse and deserialize.

`jvmType` - The target type.

**Returns:**

A populated instance of the requested class.

**Throws:**

[SerializerException](../exception/SerializerException.md)


---

### fromText

<span style="font-family: monospace; font-size: 80%;">public abstract C __fromText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [TypeReference](../type/TypeReference.md)<C> typeRef)</span>



**Throws:**

[SerializerException](../exception/SerializerException.md)


---

### fromReader

<span style="font-family: monospace; font-size: 80%;">public abstract C __fromReader__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>



**Throws:**

[SerializerException](../exception/SerializerException.md)


---

### fromReader

<span style="font-family: monospace; font-size: 80%;">public abstract C __fromReader__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [TypeReference](../type/TypeReference.md)<C> typeRef)</span>



**Throws:**

[SerializerException](../exception/SerializerException.md)


---

### fromStream

<span style="font-family: monospace; font-size: 80%;">public abstract C __fromStream__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>



**Throws:**

[SerializerException](../exception/SerializerException.md)


---

### fromStream

<span style="font-family: monospace; font-size: 80%;">public abstract C __fromStream__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [TypeReference](../type/TypeReference.md)<C> typeRef)</span>



**Throws:**

[SerializerException](../exception/SerializerException.md)


---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public abstract C __fromAst__(N astNode, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>

Transforms an AST representation back into a specific Java type.

**Parameters:**

`astNode` - The root AST node to interpret.

`jvmType` - The target type to instantiate and populate.

**Returns:**

A populated instance of the requested class.


---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public abstract C __fromAst__(N astNode, [TypeReference](../type/TypeReference.md)<C> typeRef)</span>




---

### registerTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">public abstract [Serializer](Serializer.md)<N> __registerTypeDescriptor__([TypeDescriptor](../type/TypeDescriptor.md)<?> typeDescriptor)</span>




---

### setParser

<span style="font-family: monospace; font-size: 80%;">public abstract [Serializer](Serializer.md)<N> __setParser__([AstParser](AstParser.md)<N, ?> parser)</span>




---

