Package [io.github.qishr.cascara.common.type.lang](index.md)

# Class ThrowableSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)><br/>
                io.github.qishr.cascara.common.type.lang.ThrowableSerializer<br/>
<br/>
All Implemented Interfaces:<br/>
    [TypeSerializer](../../../../../../../io/github/qishr/cascara/common/type/TypeSerializer.md)<[Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)>


----

<span style="font-family: monospace; font-size: 80%;">public class __ThrowableSerializer__<br/>extends [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)>
</span>

Handles serialization and deserialization of Throwable instances across AST nodes,
preserving class names, cause chains, suppressed exceptions, and stack traces.


## Nested Class Summary

| Modifier and Type | Class                                                                                                                          | Description                                                                                                                                                  |
|-------------------|--------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static     | [io.github.qishr.cascara.common.type.lang.ThrowableSerializer.SerializedThrowable](ThrowableSerializer.SerializedThrowable.md) | Synthetic Throwable wrapper representing deserialized exceptions from dynamic module layers without triggering ClassNotFoundException on the host classpath. |



## Constructor Summary

| Constructor           | Description |
|-----------------------|-------------|
| ThrowableSerializer() |             |



## Method Summary

| Modifier and Type                                                                                         | Method                                                                                                                                                                                                                                                                                                                                                     | Description |
|-----------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md) | [serialize](#serialize)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) jvmInstance, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx) |             |
| public [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) | [deserialize](#deserialize)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)                 |             |
| public boolean                                                                                            | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)                                                                                                                          |             |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, populateSchema, getServiceProperties, getJvmType


## Method Details

### serialize

<span style="font-family: monospace; font-size: 80%;">public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md) __serialize__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) jvmInstance, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)</span>



**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">public [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) __deserialize__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)</span>



**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)

**Specified By:**

[TypeSerializer](../../../../../../../io/github/qishr/cascara/common/type/TypeSerializer.md)


---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>



**Specified By:**

[TypeSerializer](../../../../../../../io/github/qishr/cascara/common/type/TypeSerializer.md)


---

