Package [io.github.qishr.cascara.ui.data](index.md)

# Class UiDataException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.exception.LocalizableRuntimeException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocalizableRuntimeException.md)<br/>
                                        [io.github.qishr.cascara.ui.api.UiException](../../../../../../io/github/qishr/cascara/ui/api/UiException.md)<br/>
                                                io.github.qishr.cascara.ui.data.UiDataException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __UiDataException__<br/>extends [UiException](../../../../../../io/github/qishr/cascara/ui/api/UiException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                             | Description                                  |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------|
| UiDataException([DiagnosticMessage](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           | Constructor for errors without an exception. |
| UiDataException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Constructor for errors with an exception.    |


### Methods inherited from [LocalizableRuntimeException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocalizableRuntimeException.md)

getDiagnosticMessage, getLocalizedMessage, getDetails

