Package [io.github.qishr.cascara.common.type.util](index.md)

# Class TimeZoneDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[java.util.TimeZone](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/TimeZone.html)><br/>
                [io.github.qishr.cascara.common.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[java.util.TimeZone](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/TimeZone.html)><br/>
                        io.github.qishr.cascara.common.type.util.TimeZoneDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __TimeZoneDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[TimeZone](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/TimeZone.html)>
</span>

java.util.TimeZone Descriptor (mapping via ZoneId string ID)


## Constructor Summary

| Constructor          | Description |
|----------------------|-------------|
| TimeZoneDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                       | Method                                                                                                                                                                                                                            | Description |
|---------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [TimeZone](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/TimeZone.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)     | [toPrimitive](#toprimitive)([TimeZone](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/TimeZone.html) jvmInstance)                                                                                         |             |
| public boolean                                                                                          | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding

### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [TimeZone](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/TimeZone.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toPrimitive__([TimeZone](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/TimeZone.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

