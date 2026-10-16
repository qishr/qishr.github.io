Package [io.github.qishr.cascara.schema.diagnostic](index.md)

# Class SchemaException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.exception.LocalizableRuntimeException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocalizableRuntimeException.md)<br/>
                                        [io.github.qishr.cascara.common.diagnostic.exception.LocatableException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocatableException.md)<br/>
                                                io.github.qishr.cascara.schema.diagnostic.SchemaException<br/>
<br/>
Direct Known Subtypes:<br/>
    [ValidationException](../../../../../../io/github/qishr/cascara/schema/diagnostic/ValidationException.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __SchemaException__<br/>extends [LocatableException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocatableException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Description                                                                    |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------|
| SchemaException([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [DiagnosticMessage](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                      | For errors in a schema for a class.                                            |
| SchemaException([DiagnosticMessage](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                           | For errors not inside a schema file.                                           |
| SchemaException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                      | For errors in a schema caused by an exception.                                 |
| SchemaException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                 | For errors in a schema caused by an exception.                                 |
| SchemaException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [DiagnosticMessage](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                | For errors in a schema.                                                        |
| SchemaException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticMessage](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                          | For errors in a schema where the line and column are known.                    |
| SchemaException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaPath, [DiagnosticMessage](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                       | For errors relating to a path in a compiled schema.                            |
| SchemaException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaPath, int line, int column, [DiagnosticMessage](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | For errors relating to a path in a schema where the line and column are known. |
| SchemaException([LocalizableException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocalizableException.md) cause)                                                                                                                                                                                                                                                                                                                          |                                                                                |



## Method Summary

| Modifier and Type                                                                                    | Method                            | Description |
|------------------------------------------------------------------------------------------------------|-----------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)  | [getSchemaPath](#getschemapath)() |             |
| public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> | [getType](#gettype)()             |             |


### Methods inherited from [LocalizableRuntimeException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocalizableRuntimeException.md)

getDiagnosticMessage, getDetails

### Methods inherited from [LocatableException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocatableException.md)

getRawMessage, getUri, getLine, setUri, getLocalizedMessage, getMessage, getColumn


## Method Details

### getSchemaPath

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSchemaPath__()</span>




---

### getType

<span style="font-family: monospace; font-size: 80%;">public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> __getType__()</span>




---

