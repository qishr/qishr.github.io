Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class InstantTypeDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.type.AbstractTypeDescriptor](AbstractTypeDescriptor.md)<[java.time.Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html)><br/>
                [io.github.qishr.cascara.common.lang.type.AbstractScalarDescriptor](AbstractScalarDescriptor.md)<[java.time.Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html)><br/>
                        io.github.qishr.cascara.common.lang.type.InstantTypeDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __InstantTypeDescriptor__<br/>extends [AbstractScalarDescriptor](AbstractScalarDescriptor.md)<[Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html)>
</span>


## Constructor Summary

| Constructor             | Description |
|-------------------------|-------------|
| InstantTypeDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                     | Method                                                                                                                            | Description |
|-------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)        |             |
| public [Primitive](Primitive.md)                                                                      | [toPrimitive](#toprimitive)([Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html) value) |             |


### Methods inherited from [AbstractTypeDescriptor](AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](AbstractScalarDescriptor.md)

getFormat, populateSchema, getContentEncoding


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [Primitive](Primitive.md) __toPrimitive__([Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html) value)</span>




---

