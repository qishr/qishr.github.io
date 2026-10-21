Package [io.github.qishr.cascara.common.lang.processor](index.md)

# Interface Serializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.processor.Serializer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Processor](../../../../../../../io/github/qishr/cascara/common/lang/processor/Processor.md)

All Known Implementing Classes:<br/>
    [AbstractSerializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/AbstractSerializer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __Serializer__</span>

Handles the transformation between Java Objects (POJOs) and the AST or textual formats.This interface provides a high-level API for data binding, allowing users to
move seamlessly between raw objects, structured ASTs, and the final string output.


## Nested Class Summary

| Modifier and Type | Class                                                                                     | Description |
|-------------------|-------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.lang.processor.Serializer.Context](Serializer.Context.md) |             |



## Method Summary

| Modifier and Type                                                                                                     | Method                                                                                                                                                                                                                                    | Description                                                                                |
|-----------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)          | [toString](#tostring)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                           | Converts a Java Object directly into its textual representation, for example JSON or YAML. |
| public abstract void                                                                                                  | [toWriter](#towriter)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance, [Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)        |                                                                                            |
| public abstract N                                                                                                     | [toAst](#toast)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                 | Transforms a Java Object into an AST representation.                                       |
| public abstract C                                                                                                     | [fromString](#fromstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)       |                                                                                            |
| public abstract C                                                                                                     | [fromString](#fromstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [TypeReference](../../../../../../../io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)       |                                                                                            |
| public abstract C                                                                                                     | [fromReader](#fromreader)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)       |                                                                                            |
| public abstract C                                                                                                     | [fromReader](#fromreader)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [TypeReference](../../../../../../../io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)       |                                                                                            |
| public abstract C                                                                                                     | [fromStream](#fromstream)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType) |                                                                                            |
| public abstract C                                                                                                     | [fromStream](#fromstream)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [TypeReference](../../../../../../../io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef) |                                                                                            |
| public abstract C                                                                                                     | [fromAst](#fromast)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                    | Transforms an AST representation back into a specific Java type.                           |
| public abstract C                                                                                                     | [fromAst](#fromast)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [TypeReference](../../../../../../../io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)                    |                                                                                            |
| public abstract [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<N>     | [registerTypeDescriptor](#registertypedescriptor)([TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/TypeDescriptor.md)<?> typeDescriptor)                                                                         |                                                                                            |
| public abstract [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<N>     | [setParser](#setparser)([AstParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstParser.md)<N, ?, ?> parser)                                                                                                     |                                                                                            |
| public abstract [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<N>     | [setProviderFactoryEnabled](#setproviderfactoryenabled)(boolean b)                                                                                                                                                                        |                                                                                            |
| public abstract [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<N>     | [setHeuristicMatchEnabled](#setheuristicmatchenabled)(boolean b)                                                                                                                                                                          |                                                                                            |
| public abstract [AstParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstParser.md)<N, ?, ?> | [getParser](#getparser)()                                                                                                                                                                                                                 |                                                                                            |



## Method Details

### toString

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>

Converts a Java Object directly into its textual representation,
for example JSON or YAML.

**Parameters:**

`jvmInstance` - The object to serialize.

**Returns:**

Returns the formatted string (e.g., YAML or JSON). Returns null if the jvmInstance is null.

**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


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

Returns an AST representation of the provided object.


---

### fromString

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public abstract C __fromString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>



**Parameters:**

`text` - The source text to parse and deserialize.

`jvmType` - The target type.

**Returns:**

A populated instance of the requested class.

**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### fromString

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public abstract C __fromString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [TypeReference](../../../../../../../io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)</span>



**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### fromReader

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public abstract C __fromReader__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>



**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### fromReader

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public abstract C __fromReader__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [TypeReference](../../../../../../../io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)</span>



**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### fromStream

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public abstract C __fromStream__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>



**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### fromStream

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public abstract C __fromStream__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [TypeReference](../../../../../../../io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)</span>



**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### fromAst

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public abstract C __fromAst__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>

Transforms an AST representation back into a specific Java type.

**Parameters:**

`astNode` - The root AST node to interpret.

`jvmType` - The target type to instantiate and populate.

**Returns:**

A populated instance of the requested class.


---

### fromAst

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public abstract C __fromAst__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [TypeReference](../../../../../../../io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)</span>




---

### registerTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public abstract [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<N> __registerTypeDescriptor__([TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/TypeDescriptor.md)<?> typeDescriptor)</span>




---

### setParser

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public abstract [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<N> __setParser__([AstParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstParser.md)<N, ?, ?> parser)</span>




---

### setProviderFactoryEnabled

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public abstract [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<N> __setProviderFactoryEnabled__(boolean b)</span>




---

### setHeuristicMatchEnabled

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public abstract [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<N> __setHeuristicMatchEnabled__(boolean b)</span>




---

### getParser

<span style="font-family: monospace; font-size: 80%;">public abstract [AstParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstParser.md)<N, ?, ?> __getParser__()</span>




---

