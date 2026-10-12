Package [io.github.qishr.cascara.schema.diagnostic](index.md)

# Class ValidationException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.exception.LocalizableRuntimeException](../cascara.common/exception/LocalizableRuntimeException.md)<br/>
                                        [io.github.qishr.cascara.common.diagnostic.exception.LocatableException](../cascara.common/exception/LocatableException.md)<br/>
                                                [io.github.qishr.cascara.schema.diagnostic.SchemaException](SchemaException.md)<br/>
                                                        io.github.qishr.cascara.schema.diagnostic.ValidationException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ValidationException__<br/>extends [SchemaException](SchemaException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ValidationException([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaPath, int line, int column, [DiagnosticMessage](../cascara.common/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                               |             |
| ValidationException([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaPath, [AstNode](../../cascara.common/lang/ast/AstNode.md) node, [DiagnosticMessage](../cascara.common/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |
| ValidationException([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaPath, [AstNode](../../cascara.common/lang/ast/AstNode.md) node, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../cascara.common/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |


### Methods inherited from [LocalizableRuntimeException](../cascara.common/exception/LocalizableRuntimeException.md)

getDiagnosticMessage, getDetails

### Methods inherited from [SchemaException](SchemaException.md)

getType, getSchemaPath

### Methods inherited from [LocatableException](../cascara.common/exception/LocatableException.md)

getRawMessage, getUri, getLine, setUri, getLocalizedMessage, getMessage, getColumn

