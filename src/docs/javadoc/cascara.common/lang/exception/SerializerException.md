Package [io.github.qishr.cascara.common.lang.exception](index.md)

# Class SerializerException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.LocalizableRuntimeException](../../diagnostic/LocalizableRuntimeException.md)<br/>
                                        [io.github.qishr.cascara.common.diagnostic.LocatableException](../../diagnostic/LocatableException.md)<br/>
                                                io.github.qishr.cascara.common.lang.exception.SerializerException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __SerializerException__<br/>extends [LocatableException](../../diagnostic/LocatableException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                              | Description                                                  |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------|
| SerializerException([DiagnosticCode](../../diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                              | Standard constructor for serializer-detected mapping errors. |
| SerializerException([AstNode](../ast/AstNode.md) node, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](../../diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Constructor                                                  |
| SerializerException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](../../diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                    | Constructor for I/O or Stream failures.                      |
| SerializerException([AstNode](../ast/AstNode.md) node, [DiagnosticCode](../../diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |                                                              |


### Methods inherited from [LocalizableRuntimeException](../../diagnostic/LocalizableRuntimeException.md)

getCode, getDetails

### Methods inherited from [LocatableException](../../diagnostic/LocatableException.md)

getRawMessage, getUri, getLine, getLocalizedMessage, getMessage, getColumn

