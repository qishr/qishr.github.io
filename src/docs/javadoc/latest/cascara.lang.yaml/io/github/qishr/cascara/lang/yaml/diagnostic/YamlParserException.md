Package [io.github.qishr.cascara.lang.yaml.diagnostic](index.md)

# Class YamlParserException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.i18n.exception.LocalizableRuntimeException](../../../../../../../../cascara.common/io/github/qishr/cascara/common/i18n/exception/LocalizableRuntimeException.md)<br/>
                                        [io.github.qishr.cascara.common.exception.LocatableException](../../../../../../../../cascara.common/io/github/qishr/cascara/common/exception/LocatableException.md)<br/>
                                                [io.github.qishr.cascara.common.lang.diagnostic.ParserException](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/diagnostic/ParserException.md)<br/>
                                                        io.github.qishr.cascara.lang.yaml.diagnostic.YamlParserException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlParserException__<br/>extends [ParserException](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/diagnostic/ParserException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                        | Description                                            |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------|
| YamlParserException(int line, int column, [LocalizableMessage](../../../../../../../../cascara.common/io/github/qishr/cascara/common/i18n/LocalizableMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                     | Standard constructor for parser-detected logic errors. |
| YamlParserException([YamlToken](../../../../../../../io/github/qishr/cascara/lang/yaml/token/YamlToken.md) token, [LocalizableMessage](../../../../../../../../cascara.common/io/github/qishr/cascara/common/i18n/LocalizableMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)             | Standard constructor for parser-detected logic errors. |
| YamlParserException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [LocalizableMessage](../../../../../../../../cascara.common/io/github/qishr/cascara/common/i18n/LocalizableMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Constructor for I/O or Stream failures.                |


### Methods inherited from [LocatableException](../../../../../../../../cascara.common/io/github/qishr/cascara/common/exception/LocatableException.md)

getRawMessage, getUri, getLine, setUri, getLocalizedMessage, getMessage, getColumn

### Methods inherited from [LocalizableRuntimeException](../../../../../../../../cascara.common/io/github/qishr/cascara/common/i18n/exception/LocalizableRuntimeException.md)

getLocalizableMessage, of, getDetails

