Package [io.github.qishr.cascara.common.type.lang](index.md)

# Class CharacterArrayDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<[java.lang.Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html)[]><br/>
                [io.github.qishr.cascara.common.type.AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[java.lang.Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html)[]><br/>
                        io.github.qishr.cascara.common.type.lang.CharacterArrayDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __CharacterArrayDescriptor__<br/>extends [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)<[Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html)[]>
</span>


## Constructor Summary

| Constructor                | Description |
|----------------------------|-------------|
| CharacterArrayDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                           | Method                                                                                                                                                                                                                            | Description |
|-------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html)[] | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)         | [toPrimitive](#toprimitive)([Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html)[] jvmInstance)                                                                                     |             |
| public boolean                                                                                              | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/type/AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html)[] __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toPrimitive__([Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html)[] jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>




---

