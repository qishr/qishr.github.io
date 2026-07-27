Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class UuidTypeDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.type.AbstractTypeDescriptor](AbstractTypeDescriptor.md)<[java.util.UUID](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/UUID.html)><br/>
                [io.github.qishr.cascara.common.lang.type.AbstractScalarDescriptor](AbstractScalarDescriptor.md)<[java.util.UUID](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/UUID.html)><br/>
                        io.github.qishr.cascara.common.lang.type.UuidTypeDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __UuidTypeDescriptor__<br/>extends [AbstractScalarDescriptor](AbstractScalarDescriptor.md)<[UUID](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/UUID.html)>
</span>


## Constructor Summary

| Constructor          | Description |
|----------------------|-------------|
| UuidTypeDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                       | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [UUID](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/UUID.html)     | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                   |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) | [toPrimitive](#toprimitive)([UUID](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/UUID.html) jvmInstance)                                            |             |
| public boolean                                                                                      | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../diagnostic/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](AbstractScalarDescriptor.md)

getFormat, populateSchema, getContentEncoding, formatError


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [UUID](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/UUID.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __toPrimitive__([UUID](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/UUID.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../diagnostic/Reporter.md) collector)</span>




---

