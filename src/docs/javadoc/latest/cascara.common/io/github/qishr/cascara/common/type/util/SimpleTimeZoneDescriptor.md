Package [io.github.qishr.cascara.common.type.util](index.md)

# Class SimpleTimeZoneDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[java.util.SimpleTimeZone](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SimpleTimeZone.html)><br/>
                [io.github.qishr.cascara.common.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[java.util.SimpleTimeZone](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SimpleTimeZone.html)><br/>
                        io.github.qishr.cascara.common.type.util.SimpleTimeZoneDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __SimpleTimeZoneDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[SimpleTimeZone](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SimpleTimeZone.html)>
</span>

SimpleTimeZone Scalar Descriptor preserving raw offset and time zone ID.


## Constructor Summary

| Constructor                | Description |
|----------------------------|-------------|
| SimpleTimeZoneDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                                   | Method                                                                                                                                                                                                                            | Description |
|---------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [SimpleTimeZone](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SimpleTimeZone.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                 | [toPrimitive](#toprimitive)([SimpleTimeZone](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SimpleTimeZone.html) jvmInstance)                                                                             |             |
| public boolean                                                                                                      | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [SimpleTimeZone](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SimpleTimeZone.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toPrimitive__([SimpleTimeZone](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SimpleTimeZone.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

