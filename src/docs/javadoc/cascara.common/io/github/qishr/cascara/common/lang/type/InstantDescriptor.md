Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class InstantDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/AbstractTypeDescriptor.md)<[java.time.Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html)><br/>
                [io.github.qishr.cascara.common.lang.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/AbstractScalarDescriptor.md)<[java.time.Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html)><br/>
                        io.github.qishr.cascara.common.lang.type.InstantDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __InstantDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/AbstractScalarDescriptor.md)<[Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html)>
</span>


## Field Summary

| Modifier and Type             | Field       | Description |
|-------------------------------|-------------|-------------|
| protected static final ZoneId | [UTC](#utc) |             |



## Constructor Summary

| Constructor         | Description |
|---------------------|-------------|
| InstantDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                     | Method                                                                                                                                                                                                                            | Description |
|-------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)   | [toPrimitive](#toprimitive)([Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html) jvmInstance)                                                                                           |             |
| public boolean                                                                                        | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding

### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType


## Field Details

### UTC

<span style="font-family: monospace; font-size: 80%;">protected static final ZoneId __UTC__</span>




---


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __toPrimitive__([Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

