Package [io.github.qishr.cascara.common.lang.processor](index.md)

# Class AbstractSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.processor.AbstractSerializer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<N>

Direct Known Subtypes:<br/>
    [JsonSerializer](../../../../../../../../cascara.lang.json/io/github/qishr/cascara/lang/json/processor/JsonSerializer.md), [YamlSerializer](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/processor/YamlSerializer.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractSerializer__</span>


## Field Summary

| Modifier and Type  | Field                     | Description |
|--------------------|---------------------------|-------------|
| protected int      | [depth](#depth)           |             |
| protected int      | [depthLimit](#depthlimit) |             |
| protected Reporter | [reporter](#reporter)     |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| AbstractSerializer([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType, [AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)<N, S, L, M, E, K> astFactory, [LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options)                                                                                                                     |             |
| AbstractSerializer([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType, [AstNodeFactory](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNodeFactory.md)<N, S, L, M, E, K> astFactory, [AstConverter](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstConverter.md)<?> astConverter, [LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                      | Method                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                  |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| public T                                                                                                                                                                                               | [setUseProviderFactory](#setuseproviderfactory)(boolean b)                                                                                                                                                                                                                                                                                                      |                                                                                              |
| protected abstract T                                                                                                                                                                                   | [self](#self)()                                                                                                                                                                                                                                                                                                                                                 |                                                                                              |
| protected abstract K                                                                                                                                                                                   | [serializeKey](#serializekey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                                                                                                                                                 |                                                                                              |
| protected N                                                                                                                                                                                            | [serialize](#serialize)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                                                                                                                               | Creates the appropriate AstNode (Scalar, Sequence, or Map) based on the Java value type.     |
| protected M                                                                                                                                                                                            | [serializeObject](#serializeobject)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                                                                                                                   |                                                                                              |
| protected L                                                                                                                                                                                            | [serializeArray](#serializearray)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                                                                                                                     |                                                                                              |
| protected L                                                                                                                                                                                            | [serializeList](#serializelist)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<?> list)                                                                                                                                                                                                                               | Serializes a List into a Sequence.                                                           |
| protected M                                                                                                                                                                                            | [serializeMap](#serializemap)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<?, ?> map)                                                                                                                                                                                                                                 |                                                                                              |
| protected C                                                                                                                                                                                            | [deserialize](#deserialize)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [TypeReference](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeReference.md)<C> typeRef)                                                                                                                                | Converts an AST structure back into a Java object of the generic type referenced by typeRef. |
| protected C                                                                                                                                                                                            | [deserialize](#deserialize)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType)                                                                                                                               | Converts an AST structure back into a Java object of the specified type.                     |
| protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html)> | [getAllSerializableFields](#getallserializablefields)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)                                                                                                                                                                                                    | Retrieves all declared fields for a class and all its superclasses (excluding Object).       |
| protected [TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)<?>                                                                                         | [getTypeDescriptor](#gettypedescriptor)([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType)                                                                                                                                                                                                               |                                                                                              |
| protected [TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)<?>                                                                                         | [getTypeDescriptor](#gettypedescriptor)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)                                                                                                                                                                                                                  |                                                                                              |
| protected void                                                                                                                                                                                         | [setupSerializer](#setupserializer)()                                                                                                                                                                                                                                                                                                                           |                                                                                              |
| public T                                                                                                                                                                                               | [setOptions](#setoptions)([LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options)                                                                                                                                                                                                                       |                                                                                              |
| public [Properties](../../../../../../../io/github/qishr/cascara/common/property/Properties.md)                                                                                                        | [getServiceProperties](#getserviceproperties)()                                                                                                                                                                                                                                                                                                                 |                                                                                              |
| public T                                                                                                                                                                                               | [registerTypeDescriptor](#registertypedescriptor)([TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)<?> typeDescriptor)                                                                                                                                                                                          |                                                                                              |
| protected [SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)                                                                            | [error](#error)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                   |                                                                                              |
| protected void                                                                                                                                                                                         | [warn](#warn)([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                    |                                                                                              |
| protected void                                                                                                                                                                                         | [warnInaccessible](#warninaccessible)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType, [Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html) method, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t) |                                                                                              |
| protected void                                                                                                                                                                                         | [warnInaccessible](#warninaccessible)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType, [Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)    |                                                                                              |
| protected void                                                                                                                                                                                         | [debug](#debug)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                   |                                                                                              |
| protected void                                                                                                                                                                                         | [trace](#trace)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                   |                                                                                              |
| protected void                                                                                                                                                                                         | [report](#report)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                              |                                                                                              |



## Field Details

### depth

<span style="font-family: monospace; font-size: 80%;">protected int __depth__</span>




---

### depthLimit

<span style="font-family: monospace; font-size: 80%;">protected int __depthLimit__</span>




---

### reporter

<span style="font-family: monospace; font-size: 80%;">protected Reporter __reporter__</span>




---


## Method Details

### setUseProviderFactory

<span style="font-family: monospace; font-size: 80%;">public T __setUseProviderFactory__(boolean b)</span>



**Specified By:**

[Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)


---

### self

<span style="font-family: monospace; font-size: 80%;">protected abstract T __self__()</span>




---

### serializeKey

<span style="font-family: monospace; font-size: 80%;">protected abstract K __serializeKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>




---

### serialize

<span style="font-family: monospace; font-size: 80%;">protected N __serialize__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>

Creates the appropriate AstNode (Scalar, Sequence, or Map) based on the Java value type.


---

### serializeObject

<span style="font-family: monospace; font-size: 80%;">protected M __serializeObject__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>




---

### serializeArray

<span style="font-family: monospace; font-size: 80%;">protected L __serializeArray__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>




---

### serializeList

<span style="font-family: monospace; font-size: 80%;">protected L __serializeList__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<?> list)</span>

Serializes a List into a Sequence.


---

### serializeMap

<span style="font-family: monospace; font-size: 80%;">protected M __serializeMap__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<?, ?> map)</span>




---

### deserialize

<span style="font-family: monospace; font-size: 80%;">protected C __deserialize__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [TypeReference](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeReference.md)<C> typeRef)</span>

Converts an AST structure back into a Java object of the generic type referenced by typeRef.

**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">protected C __deserialize__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType)</span>

Converts an AST structure back into a Java object of the specified type.

**Parameters:**

`node` - The AST node to convert.

`targetType` - The class type to convert to.

**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### getAllSerializableFields

<span style="font-family: monospace; font-size: 80%;">protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html)> __getAllSerializableFields__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)</span>

Retrieves all declared fields for a class and all its superclasses (excluding Object).


---

### getTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
protected [TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)<?> __getTypeDescriptor__([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType)</span>




---

### getTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
protected [TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)<?> __getTypeDescriptor__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)</span>




---

### setupSerializer

<span style="font-family: monospace; font-size: 80%;">protected void __setupSerializer__()</span>




---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public T __setOptions__([LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options)</span>




---

### getServiceProperties

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../../../../../../io/github/qishr/cascara/common/property/Properties.md) __getServiceProperties__()</span>




---

### registerTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">public T __registerTypeDescriptor__([TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)<?> typeDescriptor)</span>



**Specified By:**

[Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">protected [SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md) __error__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### warn

<span style="font-family: monospace; font-size: 80%;">protected void __warn__([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### warnInaccessible

<span style="font-family: monospace; font-size: 80%;">protected void __warnInaccessible__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType, [Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html) method, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)</span>




---

### warnInaccessible

<span style="font-family: monospace; font-size: 80%;">protected void __warnInaccessible__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType, [Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)</span>




---

### debug

<span style="font-family: monospace; font-size: 80%;">protected void __debug__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### trace

<span style="font-family: monospace; font-size: 80%;">protected void __trace__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### report

<span style="font-family: monospace; font-size: 80%;">protected void __report__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

