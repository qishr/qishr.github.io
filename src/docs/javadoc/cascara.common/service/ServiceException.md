Package [io.github.qishr.cascara.common.service](index.md)

# Class ServiceException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.LocalizableRuntimeException](../diagnostic/LocalizableRuntimeException.md)<br/>
                                        io.github.qishr.cascara.common.service.ServiceException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ServiceException__<br/>extends [LocalizableRuntimeException](../diagnostic/LocalizableRuntimeException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                     | Description                                 |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------|
| ServiceException([DiagnosticCode](../diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           | Constructor for errors without an exception |
| ServiceException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](../diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Constructor for errors with an exception    |
| ServiceException([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message)                                                                                                                                                                          |                                             |
| ServiceException([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) e)                                                                    |                                             |


### Methods inherited from [LocalizableRuntimeException](../diagnostic/LocalizableRuntimeException.md)

getCode, getLocalizedMessage, getDetails

