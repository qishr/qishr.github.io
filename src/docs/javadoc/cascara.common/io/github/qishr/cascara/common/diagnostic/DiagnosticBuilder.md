Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Class DiagnosticBuilder
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.DiagnosticBuilder<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public class __DiagnosticBuilder__</span>


## Constructor Summary

| Constructor         | Description |
|---------------------|-------------|
| DiagnosticBuilder() |             |



## Method Summary

| Modifier and Type                                                                                     | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                  |
|-------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------|
| public static [Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) | [build](#build)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                                               | With format string.                          |
| public static [Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) | [build](#build)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] stackTrace, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                  | With diagnostic message, and cause           |
| public static [Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) | [build](#build)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, int startOffset, int endOffset, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] stackTrace, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | With diagnostic message, location, and cause |
| public static [Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) | [build](#build)([Token](../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] stackTrace, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                             | With diagnostic message, token, and cause    |



## Method Details

### build

<span style="font-family: monospace; font-size: 80%;">public static [Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) __build__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

With format string.This is used for debug and trace reports. They do not carry a stack trace or cause.


---

### build

<span style="font-family: monospace; font-size: 80%;">public static [Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) __build__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] stackTrace, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

With diagnostic message, and cause


---

### build

<span style="font-family: monospace; font-size: 80%;">public static [Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) __build__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, int startOffset, int endOffset, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] stackTrace, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

With diagnostic message, location, and cause


---

### build

<span style="font-family: monospace; font-size: 80%;">public static [Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) __build__([Token](../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] stackTrace, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

With diagnostic message, token, and cause


---

