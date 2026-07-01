Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class UriTypeDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.type.AbstractTypeDescriptor](AbstractTypeDescriptor.md)<[java.net.URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)><br/>
                [io.github.qishr.cascara.common.lang.type.AbstractScalarDescriptor](AbstractScalarDescriptor.md)<[java.net.URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)><br/>
                        io.github.qishr.cascara.common.lang.type.UriTypeDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __UriTypeDescriptor__<br/>extends [AbstractScalarDescriptor](AbstractScalarDescriptor.md)<[URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)>
</span>


## Constructor Summary

| Constructor         | Description |
|---------------------|-------------|
| UriTypeDescriptor() |             |



## Method Summary

| Modifier and Type                                                                            | Method                                                                                                                     | Description |
|----------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|-------------|
| public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text) |             |
| public [Primitive](Primitive.md)                                                             | [toPrimitive](#toprimitive)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) value)   |             |


### Methods inherited from [AbstractScalarDescriptor](AbstractScalarDescriptor.md)

getFormat, populateSchema, getContentEncoding

### Methods inherited from [AbstractTypeDescriptor](AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [Primitive](Primitive.md) __toPrimitive__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) value)</span>




---

