Package [io.github.qishr.cascara.common.type.util](index.md)

# Class CurrencyDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[java.util.Currency](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Currency.html)><br/>
                [io.github.qishr.cascara.common.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[java.util.Currency](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Currency.html)><br/>
                        io.github.qishr.cascara.common.type.util.CurrencyDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __CurrencyDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[Currency](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Currency.html)>
</span>

Scalar descriptor for java.util.Currency mapping to/from its ISO 4217 currency code string.


## Constructor Summary

| Constructor          | Description |
|----------------------|-------------|
| CurrencyDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                       | Method                                                                                                                                                                                                                            | Description |
|---------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Currency](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Currency.html) | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)     | [toPrimitive](#toprimitive)([Currency](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Currency.html) jvmInstance)                                                                                         |             |
| public boolean                                                                                          | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding

### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [Currency](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Currency.html) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toPrimitive__([Currency](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Currency.html) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

