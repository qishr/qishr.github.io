Package [io.github.qishr.cascara.common.type.cascara](index.md)

# Class DetailedMessageSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[io.github.qishr.cascara.common.i18n.DetailedMessage](../../../../../../../io/github/qishr/cascara/common/i18n/DetailedMessage.md)><br/>
                io.github.qishr.cascara.common.type.cascara.DetailedMessageSerializer<br/>
<br/>
All Implemented Interfaces:<br/>
    [TypeSerializer](../../../../../../../io/github/qishr/cascara/common/type/TypeSerializer.md)<[DetailedMessage](../../../../../../../io/github/qishr/cascara/common/i18n/DetailedMessage.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __DetailedMessageSerializer__<br/>extends [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[DetailedMessage](../../../../../../../io/github/qishr/cascara/common/i18n/DetailedMessage.md)>
</span>


## Constructor Summary

| Constructor                 | Description |
|-----------------------------|-------------|
| DetailedMessageSerializer() |             |



## Method Summary

| Modifier and Type                                                                                         | Method                                                                                                                                                                                                                                                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md) | [serialize](#serialize)([DetailedMessage](../../../../../../../io/github/qishr/cascara/common/i18n/DetailedMessage.md) jvmInstance, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx) |             |
| public [DetailedMessage](../../../../../../../io/github/qishr/cascara/common/i18n/DetailedMessage.md)     | [deserialize](#deserialize)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)          |             |
| public boolean                                                                                            | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)                                                                                                                      |             |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, populateSchema, getServiceProperties, getJvmType


## Method Details

### serialize

<span style="font-family: monospace; font-size: 80%;">public [GenericAstMap](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMap.md) __serialize__([DetailedMessage](../../../../../../../io/github/qishr/cascara/common/i18n/DetailedMessage.md) jvmInstance, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)</span>



**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">public [DetailedMessage](../../../../../../../io/github/qishr/cascara/common/i18n/DetailedMessage.md) __deserialize__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)</span>



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

