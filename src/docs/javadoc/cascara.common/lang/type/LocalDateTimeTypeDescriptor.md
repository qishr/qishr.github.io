Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class LocalDateTimeTypeDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.type.AbstractTypeDescriptor](AbstractTypeDescriptor.md)<[java.time.LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html)><br/>
                [io.github.qishr.cascara.common.lang.type.AbstractScalarDescriptor](AbstractScalarDescriptor.md)<[java.time.LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html)><br/>
                        io.github.qishr.cascara.common.lang.type.LocalDateTimeTypeDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __LocalDateTimeTypeDescriptor__<br/>extends [AbstractScalarDescriptor](AbstractScalarDescriptor.md)<[LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html)>
</span>


## Constructor Summary

| Constructor                   | Description |
|-------------------------------|-------------|
| LocalDateTimeTypeDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                                 | Method                                                                                                                                                                       | Description |
|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                   |             |
| public [Primitive](Primitive.md)                                                                                  | [toPrimitive](#toprimitive)([LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html) value)                                |             |
| public boolean                                                                                                    | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../diagnostic/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](AbstractScalarDescriptor.md)

getFormat, populateSchema, getContentEncoding, formatError


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [Primitive](Primitive.md) __toPrimitive__([LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html) value)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../diagnostic/Reporter.md) collector)</span>




---

