Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class PathTypeDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.type.AbstractTypeDescriptor](AbstractTypeDescriptor.md)<[java.nio.file.Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)><br/>
                [io.github.qishr.cascara.common.lang.type.AbstractScalarDescriptor](AbstractScalarDescriptor.md)<[java.nio.file.Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)><br/>
                        io.github.qishr.cascara.common.lang.type.PathTypeDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __PathTypeDescriptor__<br/>extends [AbstractScalarDescriptor](AbstractScalarDescriptor.md)<[Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)>
</span>


## Constructor Summary

| Constructor          | Description |
|----------------------|-------------|
| PathTypeDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                          | Description |
|-----------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)      |             |
| public [Primitive](Primitive.md)                                                                    | [toPrimitive](#toprimitive)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) value) |             |


### Methods inherited from [AbstractTypeDescriptor](AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](AbstractScalarDescriptor.md)

getFormat, populateSchema, getContentEncoding


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [Primitive](Primitive.md) __toPrimitive__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) value)</span>




---

