Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class DateTimeTypeDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.type.AbstractTypeDescriptor](AbstractTypeDescriptor.md)<[java.time.ZonedDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZonedDateTime.html)><br/>
                [io.github.qishr.cascara.common.lang.type.AbstractScalarDescriptor](AbstractScalarDescriptor.md)<[java.time.ZonedDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZonedDateTime.html)><br/>
                        io.github.qishr.cascara.common.lang.type.DateTimeTypeDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __DateTimeTypeDescriptor__<br/>extends [AbstractScalarDescriptor](AbstractScalarDescriptor.md)<[ZonedDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZonedDateTime.html)>
</span>


## Constructor Summary

| Constructor              | Description |
|--------------------------|-------------|
| DateTimeTypeDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                                 | Method                                                                                                                                                                       | Description |
|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [ZonedDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZonedDateTime.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                   |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)               | [toPrimitive](#toprimitive)([ZonedDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZonedDateTime.html) jvmInstance)                          |             |
| public boolean                                                                                                    | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../diagnostic/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](AbstractScalarDescriptor.md)

getFormat, populateSchema, getContentEncoding, formatError


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [ZonedDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZonedDateTime.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __toPrimitive__([ZonedDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/ZonedDateTime.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../diagnostic/Reporter.md) collector)</span>




---

