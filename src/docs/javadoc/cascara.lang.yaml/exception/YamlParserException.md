Package [io.github.qishr.cascara.lang.yaml.exception](index.md)

# Class YamlParserException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.LocalizableRuntimeException](../../cascara.common/diagnostic/LocalizableRuntimeException.md)<br/>
                                        [io.github.qishr.cascara.common.diagnostic.LocatableException](../../cascara.common/diagnostic/LocatableException.md)<br/>
                                                [io.github.qishr.cascara.common.lang.exception.ParserException](../../cascara.common/lang/exception/ParserException.md)<br/>
                                                        io.github.qishr.cascara.lang.yaml.exception.YamlParserException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlParserException__<br/>extends [ParserException](../../cascara.common/lang/exception/ParserException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                          | Description                                            |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------|
| YamlParserException(int line, int column, [DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                     | Standard constructor for parser-detected logic errors. |
| YamlParserException([YamlToken](../token/YamlToken.md) token, [DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                 | Standard constructor for parser-detected logic errors. |
| YamlParserException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Constructor for I/O or Stream failures.                |


### Methods inherited from [LocatableException](../../cascara.common/diagnostic/LocatableException.md)

getRawMessage, getUri, getLine, getLocalizedMessage, getMessage, getColumn

### Methods inherited from [LocalizableRuntimeException](../../cascara.common/diagnostic/LocalizableRuntimeException.md)

getCode, getDetails

