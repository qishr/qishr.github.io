Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class LocalDateTimeDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/AbstractTypeDescriptor.md)<[java.time.LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html)><br/>
                [io.github.qishr.cascara.common.lang.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/AbstractScalarDescriptor.md)<[java.time.LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html)><br/>
                        io.github.qishr.cascara.common.lang.type.LocalDateTimeDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __LocalDateTimeDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/AbstractScalarDescriptor.md)<[LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html)>
</span>


## Constructor Summary

| Constructor               | Description |
|---------------------------|-------------|
| LocalDateTimeDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                                 | Method                                                                                                                                                                                                                            | Description |
|-------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)               | [toPrimitive](#toprimitive)([LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html) jvmInstance)                                                                               |             |
| public boolean                                                                                                    | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __toPrimitive__([LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

