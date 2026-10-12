Package [io.github.qishr.cascara.common.lang.diagnostic](index.md)

# Class SerializerException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.exception.LocalizableRuntimeException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableRuntimeException.md)<br/>
                                        [io.github.qishr.cascara.common.diagnostic.exception.LocatableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocatableException.md)<br/>
                                                io.github.qishr.cascara.common.lang.diagnostic.SerializerException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __SerializerException__<br/>extends [LocatableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocatableException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                           | Description                                                  |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------|
| SerializerException([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                    | Standard constructor for serializer-detected mapping errors. |
| SerializerException([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Constructor                                                  |
| SerializerException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                          | Constructor for I/O or Stream failures.                      |
| SerializerException([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |                                                              |


### Methods inherited from [LocalizableRuntimeException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableRuntimeException.md)

getDiagnosticMessage, getDetails

### Methods inherited from [LocatableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocatableException.md)

getRawMessage, getUri, getLine, setUri, getLocalizedMessage, getMessage, getColumn

