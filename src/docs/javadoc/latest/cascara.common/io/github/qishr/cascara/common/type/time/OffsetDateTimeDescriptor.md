Package [io.github.qishr.cascara.common.type.time](index.md)

# Class OffsetDateTimeDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[java.time.OffsetDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/OffsetDateTime.html)><br/>
                [io.github.qishr.cascara.common.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[java.time.OffsetDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/OffsetDateTime.html)><br/>
                        io.github.qishr.cascara.common.type.time.OffsetDateTimeDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __OffsetDateTimeDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[OffsetDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/OffsetDateTime.html)>
</span>

java.time.OffsetDateTime Descriptor


## Constructor Summary

| Constructor                | Description |
|----------------------------|-------------|
| OffsetDateTimeDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                                   | Method                                                                                                                                                                                                                            | Description |
|---------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [OffsetDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/OffsetDateTime.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                 | [toPrimitive](#toprimitive)([OffsetDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/OffsetDateTime.html) jvmInstance)                                                                             |             |
| public boolean                                                                                                      | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [OffsetDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/OffsetDateTime.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toPrimitive__([OffsetDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/OffsetDateTime.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

