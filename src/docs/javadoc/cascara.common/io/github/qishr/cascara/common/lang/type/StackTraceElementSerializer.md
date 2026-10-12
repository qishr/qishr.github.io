Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class StackTraceElementSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.type.AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/AbstractTypeDescriptor.md)<[java.lang.StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)><br/>
                io.github.qishr.cascara.common.lang.type.StackTraceElementSerializer<br/>
<br/>
All Implemented Interfaces:<br/>
    [TypeSerializer](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeSerializer.md)<[StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)>


----

<span style="font-family: monospace; font-size: 80%;">public class __StackTraceElementSerializer__<br/>extends [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/AbstractTypeDescriptor.md)<[StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)>
</span>


## Constructor Summary

| Constructor                   | Description |
|-------------------------------|-------------|
| StackTraceElementSerializer() |             |



## Method Summary

| Modifier and Type                                                                                                         | Method                                                                                                                                                                                                                            | Description |
|---------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md)                     | [serialize](#serialize)([StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html) jvmInstance)                                                                           |             |
| public [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html) | [deserialize](#deserialize)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode)                                                                                                           |             |
| public boolean                                                                                                            | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/AbstractTypeDescriptor.md)

getSchemaType, populateSchema, getServiceProperties, getJvmType


## Method Details

### serialize

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) __serialize__([StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html) jvmInstance)</span>



**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">public [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html) __deserialize__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode)</span>



**Throws:**

[SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)

**Specified By:**

[TypeSerializer](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeSerializer.md)


---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>



**Specified By:**

[TypeSerializer](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeSerializer.md)


---

