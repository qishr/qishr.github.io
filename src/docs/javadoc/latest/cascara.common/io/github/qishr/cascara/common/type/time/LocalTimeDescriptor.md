Package [io.github.qishr.cascara.common.type.time](index.md)

# Class LocalTimeDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[java.time.LocalTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalTime.html)><br/>
                [io.github.qishr.cascara.common.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[java.time.LocalTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalTime.html)><br/>
                        io.github.qishr.cascara.common.type.time.LocalTimeDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __LocalTimeDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[LocalTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalTime.html)>
</span>

java.time.LocalTime Descriptor


## Constructor Summary

| Constructor           | Description |
|-----------------------|-------------|
| LocalTimeDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                         | Method                                                                                                                                                                                                                            | Description |
|-----------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [LocalTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalTime.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)       | [toPrimitive](#toprimitive)([LocalTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalTime.html) jvmInstance)                                                                                       |             |
| public boolean                                                                                            | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding

### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [LocalTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalTime.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toPrimitive__([LocalTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalTime.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

