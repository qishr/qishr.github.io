Package [io.github.qishr.cascara.common.type.net](index.md)

# Class InetAddressDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[java.net.InetAddress](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/InetAddress.html)><br/>
                [io.github.qishr.cascara.common.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[java.net.InetAddress](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/InetAddress.html)><br/>
                        io.github.qishr.cascara.common.type.net.InetAddressDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __InetAddressDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[InetAddress](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/InetAddress.html)>
</span>

java.net.InetAddress Descriptor (handles Inet4Address and Inet6Address via host address/name)


## Constructor Summary

| Constructor             | Description |
|-------------------------|-------------|
| InetAddressDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                                                                                                                            | Description |
|--------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [InetAddress](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/InetAddress.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)          | [toPrimitive](#toprimitive)([InetAddress](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/InetAddress.html) jvmInstance)                                                                                    |             |
| public boolean                                                                                               | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [InetAddress](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/InetAddress.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toPrimitive__([InetAddress](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/InetAddress.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

