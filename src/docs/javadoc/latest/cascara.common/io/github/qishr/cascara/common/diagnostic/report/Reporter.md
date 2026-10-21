Package [io.github.qishr.cascara.common.diagnostic.report](index.md)

# Interface Reporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.report.Reporter<br/>
<br/>
All Known Implementing Classes:<br/>
    [NoOpReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/NoOpReporter.md), [AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __Reporter__</span>


## Method Summary

| Modifier and Type                                                                                                                 | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Description                                                                                  |
|-----------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| public abstract [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)                     | [setLevel](#setlevel)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)                                                                                                                                                                                                                                                                                                                                                                                                                       | Sets the level of output when logging directly to the console.                               |
| public abstract io.github.qishr.cascara.common.diagnostic.report.@io.github.qishr.cascara.common.annotation.Experimental Reporter | [setLineConsumer](#setlineconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> logger)                                                                                                                                                                                                                                                                                            |                                                                                              |
| public abstract io.github.qishr.cascara.common.diagnostic.report.@io.github.qishr.cascara.common.annotation.Experimental Reporter | [setDiagnosticConsumer](#setdiagnosticconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)                                                                                                                                                                                                                                                                                | Registers a consumer to receive all diagnostics processed by this reporter.                  |
| public abstract io.github.qishr.cascara.common.diagnostic.report.@io.github.qishr.cascara.common.annotation.Experimental Reporter | [setProblemConsumer](#setproblemconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)                                                                                                                                                                                                                                                                                      | Registers a consumer to receive only problem-level diagnostics.                              |
| public abstract boolean                                                                                                           | [collectsProblems](#collectsproblems)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Checks whether any active consumer is collecting problems.                                   |
| public abstract boolean                                                                                                           | [isSilent](#issilent)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |                                                                                              |
| public abstract boolean                                                                                                           | [reportsDebug](#reportsdebug)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                                              |
| public abstract boolean                                                                                                           | [reportsTrace](#reportstrace)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                                              |
| public abstract [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md)                       | [getLevel](#getlevel)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |                                                                                              |
| public abstract [ReportWriter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ReportWriter.md)             | [getWriter](#getwriter)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)                                                                                                                                                                                                                                                                                                                                                                                                                     |                                                                                              |
| public abstract void                                                                                                              | [error](#error)([Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html) exception)                                                                                                                                                                                                                                                                                                                                                                                                                  | Reports an Exception                                                                         |
| public abstract void                                                                                                              | [trace](#trace)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                   | Reports a trace message through the reporter.                                                |
| public abstract void                                                                                                              | [debug](#debug)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                   | Reports a debug message through the reporter.                                                |
| public abstract void                                                                                                              | [info](#info)([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                | Reports an informational message through the reporter.                                       |
| public abstract void                                                                                                              | [warn](#warn)([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                | Reports a warning message including location information.                                    |
| public abstract void                                                                                                              | [error](#error)([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                              | Reports an error message including location information.                                     |
| public abstract void                                                                                                              | [error](#error)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                    | Reports an error message including location information.                                     |
| public abstract void                                                                                                              | [infoAt](#infoat)(int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                      | Reports an informational message anchored to a resource location by line and column.         |
| public abstract void                                                                                                              | [warnAt](#warnat)(int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                      | Reports a warning anchored to a resource location by line and column.                        |
| public abstract void                                                                                                              | [errorAt](#errorat)(int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                    | Reports an error anchored to a resource location by line and column.                         |
| public abstract void                                                                                                              | [errorAt](#errorat)(int line, int column, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                          | Reports an error anchored to a resource location by line and column.                         |
| public abstract void                                                                                                              | [infoAt](#infoat)(int line, int column, int start, int end, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                  | Reports an informational message anchored to a precise character span within a resource.     |
| public abstract void                                                                                                              | [warnAt](#warnat)(int line, int column, int start, int end, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                  | Reports a warning anchored to a precise character span within a resource.                    |
| public abstract void                                                                                                              | [errorAt](#errorat)(int line, int column, int start, int end, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                | Reports an error anchored to a precise character span within a resource.                     |
| public abstract void                                                                                                              | [errorAt](#errorat)(int line, int column, int start, int end, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                      | Reports an error anchored to a precise character span within a resource.                     |
| public abstract void                                                                                                              | [infoAt](#infoat)([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                    | Reports an informational message derived from the location attributes of a structural token. |
| public abstract void                                                                                                              | [warnAt](#warnat)([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                    | Reports a warning derived from the location attributes of a structural token.                |
| public abstract void                                                                                                              | [errorAt](#errorat)([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                  | Reports an error derived from the location attributes of a structural token.                 |
| public abstract void                                                                                                              | [errorAt](#errorat)([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                        | Reports an error derived from the location attributes of a structural token.                 |
| public abstract void                                                                                                              | [warnAt](#warnat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                           |                                                                                              |
| public abstract void                                                                                                              | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                         |                                                                                              |
| public abstract void                                                                                                              | [warnAt](#warnat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                         |                                                                                              |
| public abstract void                                                                                                              | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                       |                                                                                              |
| public abstract void                                                                                                              | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |                                                                                              |



## Method Details

### setLevel

<span style="font-family: monospace; font-size: 80%;">public abstract [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) __setLevel__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)</span>

Sets the level of output when logging directly to the console.


---

### setLineConsumer

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public abstract io.github.qishr.cascara.common.diagnostic.report.@io.github.qishr.cascara.common.annotation.Experimental Reporter __setLineConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> logger)</span>




---

### setDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public abstract io.github.qishr.cascara.common.diagnostic.report.@io.github.qishr.cascara.common.annotation.Experimental Reporter __setDiagnosticConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Registers a consumer to receive all diagnostics processed by this reporter.This includes debugging info, trace states, warnings, and error diagnostics.


---

### setProblemConsumer

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public abstract io.github.qishr.cascara.common.diagnostic.report.@io.github.qishr.cascara.common.annotation.Experimental Reporter __setProblemConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Registers a consumer to receive only problem-level diagnostics.This collector is filtered to intercept only `Level.WARN` and `Level.ERROR` items.

**Parameters:**

`consumer` - The consumer that processes problem [Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) objects.


---

### collectsProblems

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __collectsProblems__()</span>

Checks whether any active consumer is collecting problems.This can be used as an optimization flag by sub-parsers or AST-walkers
to skip expensive location token captures or contextual allocations if nobody
is actively listening for error diagnostics.

**Returns:**

`true` if warnings or errors are being collected, otherwise `false`.


---

### isSilent

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isSilent__()</span>




---

### reportsDebug

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __reportsDebug__()</span>




---

### reportsTrace

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __reportsTrace__()</span>




---

### getLevel

<span style="font-family: monospace; font-size: 80%;">public abstract [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) __getLevel__()</span>




---

### getWriter

<span style="font-family: monospace; font-size: 80%;">public abstract [ReportWriter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ReportWriter.md) __getWriter__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)</span>




---

### error

<span style="font-family: monospace; font-size: 80%;">public abstract void __error__([Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html) exception)</span>

Reports an Exception

**Parameters:**

`exception` - The exception to report.


---

### trace

<span style="font-family: monospace; font-size: 80%;">public abstract void __trace__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a trace message through the reporter.

**Parameters:**

`format` - The format of the message to report.

`details` - Arguments referenced by the format specifiers in the format string.


---

### debug

<span style="font-family: monospace; font-size: 80%;">public abstract void __debug__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a debug message through the reporter.

**Parameters:**

`format` - The format of the message to report.

`details` - Arguments referenced by the format specifiers in the format string.


---

### info

<span style="font-family: monospace; font-size: 80%;">public abstract void __info__([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message through the reporter.

**Parameters:**

`message` - The code of this warning.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### warn

<span style="font-family: monospace; font-size: 80%;">public abstract void __warn__([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning message including location information.

**Parameters:**

`message` - The code of this warning.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### error

<span style="font-family: monospace; font-size: 80%;">public abstract void __error__([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error message including location information.

**Parameters:**

`message` - The code of this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### error

<span style="font-family: monospace; font-size: 80%;">public abstract void __error__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error message including location information.

**Parameters:**

`cause` - The cause of this report.

`message` - The code of this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __infoAt__(int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message anchored to a resource location by line and column.Useful when text stream indices are unavailable.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`message` - The semantic classification code for this warning.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __warnAt__(int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning anchored to a resource location by line and column.Useful when text stream indices are unavailable.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`message` - The semantic classification code for this warning.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __errorAt__(int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a resource location by line and column.Useful when text stream indices are unavailable.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`message` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __errorAt__(int line, int column, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a resource location by line and column.Useful when text stream indices are unavailable.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`cause` - The cause of this report.

`message` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __infoAt__(int line, int column, int start, int end, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message anchored to a precise character span within a resource.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`start` - The 0-based absolute character index indicating the start of the span.

`end` - The 0-based absolute character index indicating the end of the span (exclusive).

`message` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __warnAt__(int line, int column, int start, int end, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning anchored to a precise character span within a resource.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`start` - The 0-based absolute character index indicating the start of the span.

`end` - The 0-based absolute character index indicating the end of the span (exclusive).

`message` - The semantic classification code for this warning.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __errorAt__(int line, int column, int start, int end, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a precise character span within a resource.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`start` - The 0-based absolute character index indicating the start of the span.

`end` - The 0-based absolute character index indicating the end of the span (exclusive).

`message` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __errorAt__(int line, int column, int start, int end, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a precise character span within a resource.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`start` - The 0-based absolute character index indicating the start of the span.

`end` - The 0-based absolute character index indicating the end of the span (exclusive).

`cause` - The cause of this report.

`message` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __infoAt__([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message derived from the location attributes of a structural token.

**Parameters:**

`token` - The syntactic [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) supplying the positional bounds.

`message` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __warnAt__([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning derived from the location attributes of a structural token.

**Parameters:**

`token` - The syntactic [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) supplying the positional bounds.

`message` - The semantic classification code for this warning.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __errorAt__([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error derived from the location attributes of a structural token.

**Parameters:**

`token` - The syntactic [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) supplying the positional bounds.

`message` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __errorAt__([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error derived from the location attributes of a structural token.

**Parameters:**

`token` - The syntactic [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) supplying the positional bounds.

`cause` - The cause of this report.

`message` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)'s localized format string.


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public abstract void __warnAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### errorAt

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public abstract void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### warnAt

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public abstract void __warnAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### errorAt

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public abstract void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### errorAt

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public abstract void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

