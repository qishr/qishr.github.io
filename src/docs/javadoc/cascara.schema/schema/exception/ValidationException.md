Package [io.github.qishr.cascara.schema.exception](index.md)

# Class ValidationException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.LocalizableRuntimeException](../../../cascara.common/diagnostic/LocalizableRuntimeException.md)<br/>
                                        [io.github.qishr.cascara.common.diagnostic.LocatableException](../../../cascara.common/diagnostic/LocatableException.md)<br/>
                                                [io.github.qishr.cascara.schema.exception.SchemaException](SchemaException.md)<br/>
                                                        io.github.qishr.cascara.schema.exception.ValidationException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ValidationException__<br/>extends [SchemaException](SchemaException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ValidationException([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaPath, int line, int column, [DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                  |             |
| ValidationException([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaPath, [AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |
| ValidationException([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaPath, [AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |


### Methods inherited from [LocalizableRuntimeException](../../../cascara.common/diagnostic/LocalizableRuntimeException.md)

getCode, setLocalizer, getDetails

### Methods inherited from [SchemaException](SchemaException.md)

getType, getSchemaPath

### Methods inherited from [LocatableException](../../../cascara.common/diagnostic/LocatableException.md)

getRawMessage, getUri, getLine, getLocalizedMessage, getMessage, getColumn

