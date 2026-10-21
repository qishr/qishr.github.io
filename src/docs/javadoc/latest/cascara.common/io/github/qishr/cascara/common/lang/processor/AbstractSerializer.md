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

| Modifier and Type                                                                                                           | Method                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                  |
|-----------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| protected abstract T                                                                                                        | [self](#self)()                                                                                                                                                                                                                                                                                                                                                 |                                                                                              |
| protected abstract K                                                                                                        | [serializeKey](#serializekey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                                                                                                                                                 |                                                                                              |
| public T                                                                                                                    | [setProviderFactoryEnabled](#setproviderfactoryenabled)(boolean b)                                                                                                                                                                                                                                                                                              |                                                                                              |
| public T                                                                                                                    | [setHeuristicMatchEnabled](#setheuristicmatchenabled)(boolean b)                                                                                                                                                                                                                                                                                                |                                                                                              |
| protected N                                                                                                                 | [serialize](#serialize)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                                                                                                                               | Creates the appropriate AstNode (Scalar, Sequence, or Map) based on the Java value type.     |
| protected C                                                                                                                 | [deserialize](#deserialize)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [TypeReference](../../../../../../../io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)                                                                                                                                     | Converts an AST structure back into a Java object of the generic type referenced by typeRef. |
| protected C                                                                                                                 | [deserialize](#deserialize)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType)                                                                                                                               | Converts an AST structure back into a Java object of the specified type.                     |
| protected void                                                                                                              | [setupSerializer](#setupserializer)()                                                                                                                                                                                                                                                                                                                           |                                                                                              |
| public T                                                                                                                    | [setOptions](#setoptions)([LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options)                                                                                                                                                                                                                       |                                                                                              |
| public [Properties](../../../../../../../io/github/qishr/cascara/common/property/Properties.md)                             | [getServiceProperties](#getserviceproperties)()                                                                                                                                                                                                                                                                                                                 |                                                                                              |
| public T                                                                                                                    | [registerTypeDescriptor](#registertypedescriptor)([TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/TypeDescriptor.md)<?> typeDescriptor)                                                                                                                                                                                               |                                                                                              |
| protected [SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md) | [error](#error)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                   |                                                                                              |
| protected void                                                                                                              | [warn](#warn)([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                 |                                                                                              |
| protected void                                                                                                              | [warnInaccessible](#warninaccessible)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType, [Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html) method, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t) |                                                                                              |
| protected void                                                                                                              | [warnInaccessible](#warninaccessible)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType, [Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)    |                                                                                              |
| protected void                                                                                                              | [debug](#debug)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                   |                                                                                              |
| protected void                                                                                                              | [trace](#trace)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                   |                                                                                              |
| protected void                                                                                                              | [report](#report)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                              |                                                                                              |



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

### setProviderFactoryEnabled

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public T __setProviderFactoryEnabled__(boolean b)</span>



**Specified By:**

[Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)


---

### setHeuristicMatchEnabled

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public T __setHeuristicMatchEnabled__(boolean b)</span>



**Specified By:**

[Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)


---

### serialize

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
protected N __serialize__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>

Creates the appropriate AstNode (Scalar, Sequence, or Map) based on the Java value type.


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
protected C __deserialize__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [TypeReference](../../../../../../../io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)</span>

Converts an AST structure back into a Java object of the generic type referenced by typeRef.


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
protected C __deserialize__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType)</span>

Converts an AST structure back into a Java object of the specified type.

**Parameters:**

`node` - The AST node to convert.

`targetType` - The class type to convert to.


---

### setupSerializer

<span style="font-family: monospace; font-size: 80%;">protected void __setupSerializer__()</span>




---

### setOptions

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public T __setOptions__([LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options)</span>




---

### getServiceProperties

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public [Properties](../../../../../../../io/github/qishr/cascara/common/property/Properties.md) __getServiceProperties__()</span>




---

### registerTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public T __registerTypeDescriptor__([TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/TypeDescriptor.md)<?> typeDescriptor)</span>



**Specified By:**

[Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">protected [SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md) __error__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### warn

<span style="font-family: monospace; font-size: 80%;">protected void __warn__([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




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

