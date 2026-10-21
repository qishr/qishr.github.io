Package [io.github.qishr.cascara.common.type.util](index.md)

# Class EnumSetSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[java.util.EnumSet](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/EnumSet.html)><br/>
                io.github.qishr.cascara.common.type.util.EnumSetSerializer<br/>
<br/>
All Implemented Interfaces:<br/>
    [TypeSerializer](../../../../../../../io/github/qishr/cascara/common/type/TypeSerializer.md)<[EnumSet](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/EnumSet.html)>


----

<span style="font-family: monospace; font-size: 80%;">public class __EnumSetSerializer__<br/>extends [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[EnumSet](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/EnumSet.html)>
</span>


## Constructor Summary

| Constructor         | Description |
|---------------------|-------------|
| EnumSetSerializer() |             |



## Method Summary

| Modifier and Type                                                                                                   | Method                                                                                                                                                                                                                                                                                                                                                 | Description |
|---------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [GenericAstSequence](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstSequence.md) | [serialize](#serialize)([EnumSet](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/EnumSet.html) jvmInstance, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx) |             |
| public [EnumSet](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/EnumSet.html)               | [deserialize](#deserialize)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)             |             |
| public boolean                                                                                                      | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)                                                                                                                      |             |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, populateSchema, getServiceProperties, getJvmType


## Method Details

### serialize

<span style="font-family: monospace; font-size: 80%;">public [GenericAstSequence](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstSequence.md) __serialize__([EnumSet](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/EnumSet.html) jvmInstance, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)</span>



**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">public [EnumSet](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/EnumSet.html) __deserialize__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType, [Context](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)</span>



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

