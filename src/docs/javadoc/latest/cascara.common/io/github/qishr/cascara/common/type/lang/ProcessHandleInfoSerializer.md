Package [io.github.qishr.cascara.common.type.lang](index.md)

# Class ProcessHandleInfoSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<java.lang.ProcessHandle.Info><br/>
                io.github.qishr.cascara.common.type.lang.ProcessHandleInfoSerializer<br/>
<br/>
All Implemented Interfaces:<br/>
    [TypeSerializer](../../../../../../../io/github/qishr/cascara/common/type/TypeSerializer.md)<Info>


----

<span style="font-family: monospace; font-size: 80%;">public class __ProcessHandleInfoSerializer__<br/>extends [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<Info>
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                                                                          | Description |
|-------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.type.lang.ProcessHandleInfoSerializer.SerializedProcessHandleInfo](ProcessHandleInfoSerializer.SerializedProcessHandleInfo.md) |             |



## Constructor Summary

| Constructor                   | Description |
|-------------------------------|-------------|
| ProcessHandleInfoSerializer() |             |



## Method Summary

| Modifier and Type                                                                                     | Method                                                                                                                                                                                                                                                                                                                                        | Description |
|-------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) | [serialize](#serialize)(Info jvmInstance, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)                                                                                                                                                                                            |             |
| public Info                                                                                           | [deserialize](#deserialize)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx) |             |
| public boolean                                                                                        | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)                                                                                                             |             |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, populateSchema, getServiceProperties, getJvmType


## Method Details

### serialize

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) __serialize__(Info jvmInstance, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)</span>



**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">public Info __deserialize__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)</span>



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

