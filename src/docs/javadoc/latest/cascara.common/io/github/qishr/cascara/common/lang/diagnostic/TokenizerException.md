Package [io.github.qishr.cascara.common.lang.diagnostic](index.md)

# Class TokenizerException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.exception.LocalizableRuntimeException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableRuntimeException.md)<br/>
                                        [io.github.qishr.cascara.common.diagnostic.exception.LocatableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocatableException.md)<br/>
                                                io.github.qishr.cascara.common.lang.diagnostic.TokenizerException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __TokenizerException__<br/>extends [LocatableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocatableException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                 | Description                                               |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------|
| TokenizerException(int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                     | Standard constructor for tokenizer-detected logic errors. |
| TokenizerException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Constructor for I/O or Stream failures.                   |


### Methods inherited from [LocalizableRuntimeException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableRuntimeException.md)

getDiagnosticMessage, getDetails

### Methods inherited from [LocatableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocatableException.md)

getRawMessage, getUri, getLine, setUri, getLocalizedMessage, getMessage, getColumn

