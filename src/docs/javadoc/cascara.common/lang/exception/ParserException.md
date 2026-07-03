Package [io.github.qishr.cascara.common.lang.exception](index.md)

# Class ParserException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.LocalizableRuntimeException](../../diagnostic/LocalizableRuntimeException.md)<br/>
                                        [io.github.qishr.cascara.common.diagnostic.LocatableException](../../diagnostic/LocatableException.md)<br/>
                                                io.github.qishr.cascara.common.lang.exception.ParserException<br/>
<br/>
Direct Known Subtypes:<br/>
    [YamlParserException](../../../cascara.lang.yaml/yaml/exception/YamlParserException.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __ParserException__<br/>extends [LocatableException](../../diagnostic/LocatableException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                       | Description                                            |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------|
| ParserException(int line, int column, [DiagnosticCode](../../diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                     | Standard constructor for parser-detected logic errors. |
| ParserException([Token](../token/Token.md) token, [DiagnosticCode](../../diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                         | Standard constructor for parser-detected logic errors. |
| ParserException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](../../diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Constructor for I/O or Stream failures.                |


### Methods inherited from [LocatableException](../../diagnostic/LocatableException.md)

getRawMessage, getUri, getLine, getLocalizedMessage, getMessage, getColumn

### Methods inherited from [LocalizableRuntimeException](../../diagnostic/LocalizableRuntimeException.md)

getCode, setLocalizer, getDetails

