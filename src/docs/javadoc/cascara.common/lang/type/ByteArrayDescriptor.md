Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class ByteArrayDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.type.AbstractTypeDescriptor](AbstractTypeDescriptor.md)<byte[]><br/>
                [io.github.qishr.cascara.common.lang.type.AbstractScalarDescriptor](AbstractScalarDescriptor.md)<byte[]><br/>
                        io.github.qishr.cascara.common.lang.type.ByteArrayDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ByteArrayDescriptor__<br/>extends [AbstractScalarDescriptor](AbstractScalarDescriptor.md)<byte[]>
</span>


## Constructor Summary

| Constructor           | Description |
|-----------------------|-------------|
| ByteArrayDescriptor() |             |



## Method Summary

| Modifier and Type                | Method                                                                                                                     | Description |
|----------------------------------|----------------------------------------------------------------------------------------------------------------------------|-------------|
| public byte[]                    | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text) |             |
| public [Primitive](Primitive.md) | [toPrimitive](#toprimitive)(byte[] value)                                                                                  |             |


### Methods inherited from [AbstractTypeDescriptor](AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](AbstractScalarDescriptor.md)

getFormat, populateSchema, getContentEncoding


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public byte[] __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [Primitive](Primitive.md) __toPrimitive__(byte[] value)</span>




---

