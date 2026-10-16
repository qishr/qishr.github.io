Package [io.github.qishr.cascara.common.type.time](index.md)

# Class ZoneIdDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[java.time.ZoneId](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZoneId.html)><br/>
                [io.github.qishr.cascara.common.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[java.time.ZoneId](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZoneId.html)><br/>
                        io.github.qishr.cascara.common.type.time.ZoneIdDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ZoneIdDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[ZoneId](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZoneId.html)>
</span>

java.time.ZoneId Descriptor


## Constructor Summary

| Constructor        | Description |
|--------------------|-------------|
| ZoneIdDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                                            | Description |
|-----------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [ZoneId](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZoneId.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toPrimitive](#toprimitive)([ZoneId](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZoneId.html) jvmInstance)                                                                                             |             |
| public boolean                                                                                      | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [ZoneId](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZoneId.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toPrimitive__([ZoneId](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZoneId.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

