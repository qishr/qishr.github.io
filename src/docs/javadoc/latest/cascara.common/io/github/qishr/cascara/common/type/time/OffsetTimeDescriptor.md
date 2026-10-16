Package [io.github.qishr.cascara.common.type.time](index.md)

# Class OffsetTimeDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[java.time.OffsetTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/OffsetTime.html)><br/>
                [io.github.qishr.cascara.common.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[java.time.OffsetTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/OffsetTime.html)><br/>
                        io.github.qishr.cascara.common.type.time.OffsetTimeDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __OffsetTimeDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[OffsetTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/OffsetTime.html)>
</span>

java.time.OffsetTime Descriptor


## Constructor Summary

| Constructor            | Description |
|------------------------|-------------|
| OffsetTimeDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                           | Method                                                                                                                                                                                                                            | Description |
|-------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [OffsetTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/OffsetTime.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)         | [toPrimitive](#toprimitive)([OffsetTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/OffsetTime.html) jvmInstance)                                                                                     |             |
| public boolean                                                                                              | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding

### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [OffsetTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/OffsetTime.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toPrimitive__([OffsetTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/OffsetTime.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

