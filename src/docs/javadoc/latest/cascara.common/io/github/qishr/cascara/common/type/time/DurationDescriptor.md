Package [io.github.qishr.cascara.common.type.time](index.md)

# Class DurationDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[java.time.Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html)><br/>
                [io.github.qishr.cascara.common.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[java.time.Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html)><br/>
                        io.github.qishr.cascara.common.type.time.DurationDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __DurationDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html)>
</span>


## Constructor Summary

| Constructor          | Description |
|----------------------|-------------|
| DurationDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                       | Method                                                                                                                                                                                                                            | Description |
|---------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)     | [toPrimitive](#toprimitive)([Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html) jvmInstance)                                                                                         |             |
| public boolean                                                                                          | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding

### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toPrimitive__([Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

