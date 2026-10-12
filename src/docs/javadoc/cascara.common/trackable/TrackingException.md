Package [io.github.qishr.cascara.common.trackable](index.md)

# Class TrackingException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.exception.LocalizableRuntimeException](../diagnostic/exception/LocalizableRuntimeException.md)<br/>
                                        io.github.qishr.cascara.common.trackable.TrackingException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __TrackingException__<br/>extends [LocalizableRuntimeException](../diagnostic/exception/LocalizableRuntimeException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                               | Description                                  |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------|
| TrackingException([DiagnosticMessage](../diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           | Constructor for errors without an exception. |
| TrackingException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Constructor for errors with an exception.    |


### Methods inherited from [LocalizableRuntimeException](../diagnostic/exception/LocalizableRuntimeException.md)

getDiagnosticMessage, getLocalizedMessage, getDetails

