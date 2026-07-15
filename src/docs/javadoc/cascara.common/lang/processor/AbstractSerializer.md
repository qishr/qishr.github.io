Package [io.github.qishr.cascara.common.lang.processor](index.md)

# Class AbstractSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.processor.AbstractSerializer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Serializer](Serializer.md)<N>

Direct Known Subtypes:<br/>
    [JsonSerializer](../../../cascara.lang.json/processor/JsonSerializer.md), [YamlSerializer](../../../cascara.lang.yaml/yaml/processor/YamlSerializer.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractSerializer__</span>


## Field Summary

| Modifier and Type  | Field                 | Description |
|--------------------|-----------------------|-------------|
| protected Reporter | [reporter](#reporter) |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                     | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| AbstractSerializer([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType, [AstNodeFactory](../ast/AstNodeFactory.md)<N, S, L, M, E, K> astFactory, [LanguageOptions](../util/LanguageOptions.md)<?> options) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                        | Method                                                                                                                                                                | Description                                                                              |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------|
| protected abstract T                                                                                                                                                                                     | [self](#self)()                                                                                                                                                       |                                                                                          |
| protected abstract K                                                                                                                                                                                     | [serializeKey](#serializekey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                       |                                                                                          |
| public T                                                                                                                                                                                                 | [setOptions](#setoptions)([LanguageOptions](../util/LanguageOptions.md)<?> options)                                                                                   |                                                                                          |
| public [Properties](../../util/Properties.md)                                                                                                                                                            | [getServiceProperties](#getserviceproperties)()                                                                                                                       |                                                                                          |
| public T                                                                                                                                                                                                 | [registerTypeDescriptor](#registertypedescriptor)([TypeDescriptor](../type/TypeDescriptor.md)<?> typeDescriptor)                                                      |                                                                                          |
| protected N                                                                                                                                                                                              | [serialize](#serialize)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                     | Creates the appropriate AstNode (Scalar, Sequence, or Map) based on the Java value type. |
| protected M                                                                                                                                                                                              | [serializeObject](#serializeobject)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                         |                                                                                          |
| protected L                                                                                                                                                                                              | [serializeList](#serializelist)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<?> list)                                     | Serializes a List into a YamlSequence.                                                   |
| protected M                                                                                                                                                                                              | [serializeMap](#serializemap)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<?, ?> map)                                       |                                                                                          |
| protected C                                                                                                                                                                                              | [deserialize](#deserialize)([AstNode](../ast/AstNode.md) yaml, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType) | Converts a Yaml AST structure back into a Java object of the specified type.             |
| protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html)>   | [getAllFields](#getallfields)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)                                  | Retrieves all declared fields for a class and all its superclasses (excluding Object).   |
| protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html)> | [getAllMethods](#getallmethods)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)                                |                                                                                          |
| protected [TypeDescriptor](../type/TypeDescriptor.md)<?>                                                                                                                                                 | [getTypeDescriptor](#gettypedescriptor)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)                        |                                                                                          |



## Field Details

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

<span style="font-family: monospace; font-size: 80%;">protected C __deserialize__([AstNode](../ast/AstNode.md) yaml, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>

Converts a Yaml AST structure back into a Java object of the specified type.

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

