Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class ThrowableSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.type.AbstractTypeDescriptor](AbstractTypeDescriptor.md)<[java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)><br/>
                io.github.qishr.cascara.common.lang.type.ThrowableSerializer<br/>
<br/>
All Implemented Interfaces:<br/>
    [TypeSerializer](TypeSerializer.md)<[Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)>


----

<span style="font-family: monospace; font-size: 80%;">public class __ThrowableSerializer__<br/>extends [AbstractTypeDescriptor](AbstractTypeDescriptor.md)<[Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)>
</span>

Handles serialization and deserialization of Throwable instances across AST nodes,
preserving class names, cause chains, suppressed exceptions, and stack traces.


## Nested Class Summary

| Modifier and Type | Class                                                                                                                          | Description                                                                                                                                                  |
|-------------------|--------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static     | [io.github.qishr.cascara.common.lang.type.ThrowableSerializer.SerializedThrowable](ThrowableSerializer.SerializedThrowable.md) | Synthetic Throwable wrapper representing deserialized exceptions from dynamic module layers without triggering ClassNotFoundException on the host classpath. |



## Constructor Summary

| Constructor           | Description |
|-----------------------|-------------|
| ThrowableSerializer() |             |



## Method Summary

| Modifier and Type                                                                                         | Method                                                                                                                                                                              | Description |
|-----------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [PlainMapNode](../plain/PlainMapNode.md)                                                           | [serialize](#serialize)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) jvmInstance)                                             |             |
| public [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) | [deserialize](#deserialize)([AstNode](../ast/AstNode.md) astNode)                                                                                                                   |             |
| public boolean                                                                                            | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../diagnostic/report/Reporter.md) collector) |             |


### Methods inherited from [AbstractTypeDescriptor](AbstractTypeDescriptor.md)

getSchemaType, populateSchema, getServiceProperties, getJvmType


## Method Details

### serialize

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](../plain/PlainMapNode.md) __serialize__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) jvmInstance)</span>



**Throws:**

[SerializerException](../diagnostic/SerializerException.md)


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">public [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) __deserialize__([AstNode](../ast/AstNode.md) astNode)</span>



**Throws:**

[SerializerException](../diagnostic/SerializerException.md)

**Specified By:**

[TypeSerializer](TypeSerializer.md)


---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../diagnostic/report/Reporter.md) collector)</span>



**Specified By:**

[TypeSerializer](TypeSerializer.md)


---

