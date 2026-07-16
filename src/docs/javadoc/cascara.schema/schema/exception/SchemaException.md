Package [io.github.qishr.cascara.schema.exception](index.md)

# Class SchemaException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.LocalizableRuntimeException](../../../cascara.common/diagnostic/LocalizableRuntimeException.md)<br/>
                                        [io.github.qishr.cascara.common.diagnostic.LocatableException](../../../cascara.common/diagnostic/LocatableException.md)<br/>
                                                io.github.qishr.cascara.schema.exception.SchemaException<br/>
<br/>
Direct Known Subtypes:<br/>
    [ValidationException](ValidationException.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __SchemaException__<br/>extends [LocatableException](../../../cascara.common/diagnostic/LocatableException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                         | Description                                                                    |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------|
| SchemaException([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                      | For errors in a schema for a class.                                            |
| SchemaException([DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                           | For errors not inside a schema file.                                           |
| SchemaException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                      | For errors in a schema caused by an exception.                                 |
| SchemaException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                | For errors in a schema.                                                        |
| SchemaException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                          | For errors in a schema where the line and column are known.                    |
| SchemaException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaPath, [DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                       | For errors relating to a path in a compiled schema.                            |
| SchemaException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaPath, int line, int column, [DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | For errors relating to a path in a schema where the line and column are known. |
| SchemaException([LocalizableException](../../../cascara.common/diagnostic/LocalizableException.md) cause)                                                                                                                                                                                                                                                                                                                           |                                                                                |



## Method Summary

| Modifier and Type                                                                                    | Method                            | Description |
|------------------------------------------------------------------------------------------------------|-----------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)  | [getSchemaPath](#getschemapath)() |             |
| public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> | [getType](#gettype)()             |             |


### Methods inherited from [LocatableException](../../../cascara.common/diagnostic/LocatableException.md)

getRawMessage, getUri, getLine, getLocalizedMessage, getMessage, getColumn

### Methods inherited from [LocalizableRuntimeException](../../../cascara.common/diagnostic/LocalizableRuntimeException.md)

getCode, getDetails


## Method Details

### getSchemaPath

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSchemaPath__()</span>




---

### getType

<span style="font-family: monospace; font-size: 80%;">public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> __getType__()</span>




---

