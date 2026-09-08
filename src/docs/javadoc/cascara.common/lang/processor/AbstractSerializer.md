Package [io.github.qishr.cascara.common.lang.processor](index.md)

# Class AbstractSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.processor.AbstractSerializer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Serializer](Serializer.md)<N>

Direct Known Subtypes:<br/>
    [JsonSerializer](../../../cascara.lang.json/processor/JsonSerializer.md), [YamlSerializer](../../../cascara.lang.yaml/processor/YamlSerializer.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractSerializer__</span>


## Field Summary

| Modifier and Type  | Field                     | Description |
|--------------------|---------------------------|-------------|
| protected int      | [depth](#depth)           |             |
| protected int      | [depthLimit](#depthlimit) |             |
| protected Reporter | [reporter](#reporter)     |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                      | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| AbstractSerializer([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType, [AstNodeFactory](../util/AstNodeFactory.md)<N, S, L, M, E, K> astFactory, [LanguageOptions](../util/LanguageOptions.md)<?> options) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                        | Method                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                  |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| protected abstract T                                                                                                                                                                                     | [self](#self)()                                                                                                                                                                                                                                                                                                                                                 |                                                                                              |
| protected abstract K                                                                                                                                                                                     | [serializeKey](#serializekey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                                                                                                                                                 |                                                                                              |
| protected N                                                                                                                                                                                              | [serialize](#serialize)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                                                                                                                               | Creates the appropriate AstNode (Scalar, Sequence, or Map) based on the Java value type.     |
| protected M                                                                                                                                                                                              | [serializeObject](#serializeobject)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                                                                                                                   |                                                                                              |
| protected L                                                                                                                                                                                              | [serializeList](#serializelist)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<?> list)                                                                                                                                                                                                                               | Serializes a List into a YamlSequence.                                                       |
| protected M                                                                                                                                                                                              | [serializeMap](#serializemap)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<?, ?> map)                                                                                                                                                                                                                                 |                                                                                              |
| protected C                                                                                                                                                                                              | [deserialize](#deserialize)([AstNode](../ast/AstNode.md) node, [TypeReference](../type/TypeReference.md)<C> typeRef)                                                                                                                                                                                                                                            | Converts an AST structure back into a Java object of the generic type referenced by typeRef. |
| protected C                                                                                                                                                                                              | [deserialize](#deserialize)([AstNode](../ast/AstNode.md) node, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                                                                                                                                                                                           | Converts an AST structure back into a Java object of the specified type.                     |
| protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html)>   | [getAllFields](#getallfields)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)                                                                                                                                                                                                                            | Retrieves all declared fields for a class and all its superclasses (excluding Object).       |
| protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html)> | [getAllMethods](#getallmethods)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)                                                                                                                                                                                                                          |                                                                                              |
| protected [TypeDescriptor](../type/TypeDescriptor.md)<?>                                                                                                                                                 | [getTypeDescriptor](#gettypedescriptor)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)                                                                                                                                                                                                                  |                                                                                              |
| protected void                                                                                                                                                                                           | [setupSerializer](#setupserializer)()                                                                                                                                                                                                                                                                                                                           |                                                                                              |
| public T                                                                                                                                                                                                 | [setOptions](#setoptions)([LanguageOptions](../util/LanguageOptions.md)<?> options)                                                                                                                                                                                                                                                                             |                                                                                              |
| public [Properties](../../util/Properties.md)                                                                                                                                                            | [getServiceProperties](#getserviceproperties)()                                                                                                                                                                                                                                                                                                                 |                                                                                              |
| public T                                                                                                                                                                                                 | [registerTypeDescriptor](#registertypedescriptor)([TypeDescriptor](../type/TypeDescriptor.md)<?> typeDescriptor)                                                                                                                                                                                                                                                |                                                                                              |
| protected [SerializerException](../exception/SerializerException.md)                                                                                                                                     | [error](#error)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                   |                                                                                              |
| protected void                                                                                                                                                                                           | [warn](#warn)([DiagnosticCode](../../diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                           |                                                                                              |
| protected void                                                                                                                                                                                           | [warnInaccessible](#warninaccessible)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType, [Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html) method, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t) |                                                                                              |
| protected void                                                                                                                                                                                           | [warnInaccessible](#warninaccessible)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType, [Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)    |                                                                                              |
| protected void                                                                                                                                                                                           | [debug](#debug)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                   |                                                                                              |
| protected void                                                                                                                                                                                           | [trace](#trace)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                   |                                                                                              |
| protected void                                                                                                                                                                                           | [report](#report)([Level](../../diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                            |                                                                                              |



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

### serializeList

<span style="font-family: monospace; font-size: 80%;">protected L __serializeList__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<?> list)</span>

Serializes a List into a YamlSequence.


---

### serializeMap

<span style="font-family: monospace; font-size: 80%;">protected M __serializeMap__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<?, ?> map)</span>




---

### deserialize

<span style="font-family: monospace; font-size: 80%;">protected C __deserialize__([AstNode](../ast/AstNode.md) node, [TypeReference](../type/TypeReference.md)<C> typeRef)</span>

Converts an AST structure back into a Java object of the generic type referenced by typeRef.

**Throws:**

[SerializerException](../exception/SerializerException.md)


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">protected C __deserialize__([AstNode](../ast/AstNode.md) node, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>

Converts an AST structure back into a Java object of the specified type.

**Throws:**

[SerializerException](../exception/SerializerException.md)


---

### getAllFields

<span style="font-family: monospace; font-size: 80%;">protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html)> __getAllFields__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)</span>

Retrieves all declared fields for a class and all its superclasses (excluding Object).


---

### getAllMethods

<span style="font-family: monospace; font-size: 80%;">protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html)> __getAllMethods__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)</span>




---

### getTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">protected [TypeDescriptor](../type/TypeDescriptor.md)<?> __getTypeDescriptor__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)</span>




---

### setupSerializer

<span style="font-family: monospace; font-size: 80%;">protected void __setupSerializer__()</span>




---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public T __setOptions__([LanguageOptions](../util/LanguageOptions.md)<?> options)</span>




---

### getServiceProperties

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../util/Properties.md) __getServiceProperties__()</span>




---

### registerTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">public T __registerTypeDescriptor__([TypeDescriptor](../type/TypeDescriptor.md)<?> typeDescriptor)</span>



**Specified By:**

[Serializer](Serializer.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">protected [SerializerException](../exception/SerializerException.md) __error__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### warn

<span style="font-family: monospace; font-size: 80%;">protected void __warn__([DiagnosticCode](../../diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




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

<span style="font-family: monospace; font-size: 80%;">protected void __report__([Level](../../diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

