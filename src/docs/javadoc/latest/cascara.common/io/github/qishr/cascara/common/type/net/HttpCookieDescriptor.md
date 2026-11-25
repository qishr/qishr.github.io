Package [io.github.qishr.cascara.common.type.net](index.md)

# Class HttpCookieDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[java.net.HttpCookie](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/HttpCookie.html)><br/>
                [io.github.qishr.cascara.common.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[java.net.HttpCookie](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/HttpCookie.html)><br/>
                        io.github.qishr.cascara.common.type.net.HttpCookieDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __HttpCookieDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[HttpCookie](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/HttpCookie.html)>
</span>

java.net.HttpCookie Descriptor (using standard Set-Cookie string header format)


## Constructor Summary

| Constructor            | Description |
|------------------------|-------------|
| HttpCookieDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                          | Method                                                                                                                                                                                                                            | Description |
|------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [HttpCookie](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/HttpCookie.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)        | [toPrimitive](#toprimitive)([HttpCookie](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/HttpCookie.html) jvmInstance)                                                                                      |             |
| public boolean                                                                                             | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding

### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [HttpCookie](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/HttpCookie.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toPrimitive__([HttpCookie](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/HttpCookie.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

