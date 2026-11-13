Package [io.github.qishr.cascara.common.type.cascara](index.md)

# Class LocalizableMessageDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[io.github.qishr.cascara.common.diagnostic.message.LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md)><br/>
                [io.github.qishr.cascara.common.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[io.github.qishr.cascara.common.diagnostic.message.LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md)><br/>
                        io.github.qishr.cascara.common.type.cascara.LocalizableMessageDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __LocalizableMessageDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md)>
</span>


## Constructor Summary

| Constructor                    | Description |
|--------------------------------|-------------|
| LocalizableMessageDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                                         | Method                                                                                                                                                                                                                            | Description |
|---------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                       | [toPrimitive](#toprimitive)([LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md) jvmInstance)                                                                       |             |
| public boolean                                                                                                            | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __toPrimitive__([LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

