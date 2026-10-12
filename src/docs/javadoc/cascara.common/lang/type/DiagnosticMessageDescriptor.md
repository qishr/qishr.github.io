Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class DiagnosticMessageDescriptor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.type.AbstractTypeDescriptor](AbstractTypeDescriptor.md)<[io.github.qishr.cascara.common.diagnostic.message.DiagnosticMessage](../../diagnostic/message/DiagnosticMessage.md)><br/>
                [io.github.qishr.cascara.common.lang.type.AbstractScalarDescriptor](AbstractScalarDescriptor.md)<[io.github.qishr.cascara.common.diagnostic.message.DiagnosticMessage](../../diagnostic/message/DiagnosticMessage.md)><br/>
                        io.github.qishr.cascara.common.lang.type.DiagnosticMessageDescriptor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __DiagnosticMessageDescriptor__<br/>extends [AbstractScalarDescriptor](AbstractScalarDescriptor.md)<[DiagnosticMessage](../../diagnostic/message/DiagnosticMessage.md)>
</span>


## Constructor Summary

| Constructor                   | Description |
|-------------------------------|-------------|
| DiagnosticMessageDescriptor() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                              | Description |
|-----------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [DiagnosticMessage](../../diagnostic/message/DiagnosticMessage.md)                           | [toJvmType](#tojvmtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                          |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) | [toPrimitive](#toprimitive)([DiagnosticMessage](../../diagnostic/message/DiagnosticMessage.md) jvmInstance)                                                                         |             |
| public boolean                                                                                      | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](AbstractTypeDescriptor.md)

getSchemaType, getServiceProperties, getJvmType

### Methods inherited from [AbstractScalarDescriptor](AbstractScalarDescriptor.md)

getFormat, formatError, populateSchema, getContentEncoding


## Method Details

### toJvmType

<span style="font-family: monospace; font-size: 80%;">public [DiagnosticMessage](../../diagnostic/message/DiagnosticMessage.md) __toJvmType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### toPrimitive

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __toPrimitive__([DiagnosticMessage](../../diagnostic/message/DiagnosticMessage.md) jvmInstance)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../diagnostic/report/Reporter.md) collector)</span>




---

