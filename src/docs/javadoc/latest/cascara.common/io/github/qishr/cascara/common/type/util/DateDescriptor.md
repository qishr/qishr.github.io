Package [io.github.qishr.cascara.common.type.util](index.md)

# Class DateDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[java.util.Date](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Date.html)><br/>
                [io.github.qishr.cascara.common.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[java.util.Date](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Date.html)><br/>
                        io.github.qishr.cascara.common.type.util.DateDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __DateDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[Date](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Date.html)>
</span>

java.util.Date Descriptor (mapping to ISO-8601 string or epoch millis\u2014let's use ISO-8601 string format via Instant for consistency)


## Constructor Summary

| Constructor      | Description |
|------------------|-------------|
| DateDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                                            | Description |
|-----------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Date](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Date.html)     | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toPrimitive](#toprimitive)([Date](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Date.html) jvmInstance)                                                                                                 |             |
| public boolean                                                                                      | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [Date](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Date.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toPrimitive__([Date](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Date.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

