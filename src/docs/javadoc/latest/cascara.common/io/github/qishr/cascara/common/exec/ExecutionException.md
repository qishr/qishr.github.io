Package [io.github.qishr.cascara.common.exec](index.md)

# Class ExecutionException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.i18n.exception.LocalizableRuntimeException](../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableRuntimeException.md)<br/>
                                        io.github.qishr.cascara.common.exec.ExecutionException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ExecutionException__<br/>extends [LocalizableRuntimeException](../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableRuntimeException.md)
</span>


## Method Summary

| Modifier and Type                                                                                               | Method                                                                                                                                                                                                                                                                                                                          | Description |
|-----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) | [noSocketFile](#nosocketfile)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) socketPath)                                                                                                                                                                                          |             |
| public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) | [connectionFailed](#connectionfailed)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message)                                                                           |             |
| public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) | [receiveFailed](#receivefailed)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message)                                                                                 |             |
| public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) | [diagnosticServerFailed](#diagnosticserverfailed)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) taskName)                                                              |             |
| public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) | [noSerializer](#noserializer)()                                                                                                                                                                                                                                                                                                 |             |
| public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) | [mainClassError](#mainclasserror)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) typeName)                                                                              |             |
| public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) | [unresolvedInputClass](#unresolvedinputclass)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) typeName)                                                                                                                                                                            |             |
| public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) | [unknownClass](#unknownclass)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) typeName)                                                                                  |             |
| public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) | [processNotStarted](#processnotstarted)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mainClass)                                                                       |             |
| public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) | [processNotExited](#processnotexited)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mainClass)                                                                         |             |
| public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) | [processInterrupted](#processinterrupted)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mainClass)                                                                     |             |
| public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) | [processInputFailed](#processinputfailed)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mainClass)                                                                     |             |
| public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) | [taskFailed](#taskfailed)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) taskName, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> diagnostics) |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)                 | [getDiagnostics](#getdiagnostics)()                                                                                                                                                                                                                                                                                             |             |


### Methods inherited from [LocalizableRuntimeException](../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableRuntimeException.md)

getLocalizableMessage, of, getLocalizedMessage, getMessage, getDetails


## Method Details

### noSocketFile

<span style="font-family: monospace; font-size: 80%;">public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) __noSocketFile__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) socketPath)</span>




---

### connectionFailed

<span style="font-family: monospace; font-size: 80%;">public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) __connectionFailed__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message)</span>




---

### receiveFailed

<span style="font-family: monospace; font-size: 80%;">public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) __receiveFailed__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message)</span>




---

### diagnosticServerFailed

<span style="font-family: monospace; font-size: 80%;">public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) __diagnosticServerFailed__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) taskName)</span>




---

### noSerializer

<span style="font-family: monospace; font-size: 80%;">public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) __noSerializer__()</span>




---

### mainClassError

<span style="font-family: monospace; font-size: 80%;">public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) __mainClassError__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) typeName)</span>




---

### unresolvedInputClass

<span style="font-family: monospace; font-size: 80%;">public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) __unresolvedInputClass__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) typeName)</span>




---

### unknownClass

<span style="font-family: monospace; font-size: 80%;">public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) __unknownClass__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) typeName)</span>




---

### processNotStarted

<span style="font-family: monospace; font-size: 80%;">public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) __processNotStarted__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mainClass)</span>




---

### processNotExited

<span style="font-family: monospace; font-size: 80%;">public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) __processNotExited__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mainClass)</span>




---

### processInterrupted

<span style="font-family: monospace; font-size: 80%;">public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) __processInterrupted__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mainClass)</span>




---

### processInputFailed

<span style="font-family: monospace; font-size: 80%;">public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) __processInputFailed__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mainClass)</span>




---

### taskFailed

<span style="font-family: monospace; font-size: 80%;">public static [ExecutionException](../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md) __taskFailed__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) taskName, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> diagnostics)</span>




---

### getDiagnostics

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getDiagnostics__()</span>




---

