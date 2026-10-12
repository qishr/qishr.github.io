Package [io.github.qishr.cascara.common.exec](index.md)

# Class ExecutionException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.exception.LocalizableRuntimeException](../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableRuntimeException.md)<br/>
                                        io.github.qishr.cascara.common.exec.ExecutionException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ExecutionException__<br/>extends [LocalizableRuntimeException](../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableRuntimeException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ExecutionException([DiagnosticMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                          |             |
| ExecutionException([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> diagnostics, [DiagnosticMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |
| ExecutionException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                |             |
| ExecutionException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> diagnostics, [DiagnosticMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                        | Method                              | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------|-------------|
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> | [getDiagnostics](#getdiagnostics)() |             |


### Methods inherited from [LocalizableRuntimeException](../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableRuntimeException.md)

getDiagnosticMessage, getLocalizedMessage, getDetails


## Method Details

### getDiagnostics

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> __getDiagnostics__()</span>




---

