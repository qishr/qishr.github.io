Package [io.github.qishr.cascara.common.type.time](index.md)

# Class ZonedDateTimeDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[java.time.ZonedDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZonedDateTime.html)><br/>
                [io.github.qishr.cascara.common.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[java.time.ZonedDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZonedDateTime.html)><br/>
                        io.github.qishr.cascara.common.type.time.ZonedDateTimeDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ZonedDateTimeDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[ZonedDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZonedDateTime.html)>
</span>


## Constructor Summary

| Constructor               | Description |
|---------------------------|-------------|
| ZonedDateTimeDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                                 | Method                                                                                                                                                                                                                            | Description |
|-------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [ZonedDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZonedDateTime.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)               | [toPrimitive](#toprimitive)([ZonedDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZonedDateTime.html) jvmInstance)                                                                               |             |
| public boolean                                                                                                    | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [ZonedDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZonedDateTime.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toPrimitive__([ZonedDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZonedDateTime.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

