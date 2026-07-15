Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Interface Reporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.Reporter<br/>
<br/>
All Known Implementing Classes:<br/>
    [NoOpReporter](NoOpReporter.md), [AbstractReporter](AbstractReporter.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __Reporter__</span>


## Method Summary

| Modifier and Type                       | Method                                                                                                                                                                                                                                                                                                                         | Description                                                                                  |
|-----------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| public abstract [Reporter](Reporter.md) | [setLevel](#setlevel)([Level](Diagnostic.Level.md) level)                                                                                                                                                                                                                                                                      | Sets the level of output when logging directly to the console.                               |
| public abstract [Reporter](Reporter.md) | [setDiagnosticCollector](#setdiagnosticcollector)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)                                                                                                                            | Registers a collector to receive all diagnostics processed by this reporter.                 |
| public abstract [Reporter](Reporter.md) | [setProblemCollector](#setproblemcollector)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)                                                                                                                                  | Registers a specialized collector to receive only problem-level diagnostics.                 |
| public abstract boolean                 | [collectsProblems](#collectsproblems)()                                                                                                                                                                                                                                                                                        | Checks whether any active listener or collector is tracking problems.                        |
| public abstract boolean                 | [isSilent](#issilent)()                                                                                                                                                                                                                                                                                                        |                                                                                              |
| public abstract void                    | [trace](#trace)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                   | Reports a trace message through the reporter.                                                |
| public abstract void                    | [debug](#debug)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                   | Reports a debug message through the reporter.                                                |
| public abstract void                    | [info](#info)([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                           | Reports an informational message through the reporter.                                       |
| public abstract void                    | [warn](#warn)([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                           | Reports a warning message including location information.                                    |
| public abstract void                    | [error](#error)([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                         | Reports an error message including location information.                                     |
| public abstract void                    | [error](#error)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                               | Reports an error message including location information.                                     |
| public abstract void                    | [infoAt](#infoat)(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                 | Reports an informational message anchored to a resource location by line and column.         |
| public abstract void                    | [warnAt](#warnat)(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                 | Reports a warning anchored to a resource location by line and column.                        |
| public abstract void                    | [errorAt](#errorat)(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                               | Reports an error anchored to a resource location by line and column.                         |
| public abstract void                    | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                    |                                                                                              |
| public abstract void                    | [errorAt](#errorat)(int line, int column, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                     | Reports an error anchored to a resource location by line and column.                         |
| public abstract void                    | [infoAt](#infoat)(int line, int column, int start, int end, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                             | Reports an informational message anchored to a precise character span within a resource.     |
| public abstract void                    | [warnAt](#warnat)(int line, int column, int start, int end, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                             | Reports a warning anchored to a precise character span within a resource.                    |
| public abstract void                    | [errorAt](#errorat)(int line, int column, int start, int end, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           | Reports an error anchored to a precise character span within a resource.                     |
| public abstract void                    | [errorAt](#errorat)(int line, int column, int start, int end, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Reports an error anchored to a precise character span within a resource.                     |
| public abstract void                    | [infoAt](#infoat)([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                | Reports an informational message derived from the location attributes of a structural token. |
| public abstract void                    | [warnAt](#warnat)([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                | Reports a warning derived from the location attributes of a structural token.                |
| public abstract void                    | [errorAt](#errorat)([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                              | Reports an error derived from the location attributes of a structural token.                 |
| public abstract void                    | [errorAt](#errorat)([Token](../lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)    | Reports an error derived from the location attributes of a structural token.                 |
| public abstract void                    | [error](#error)([LocalizableException](LocalizableException.md) exception)                                                                                                                                                                                                                                                     | Reports a [LocalizableException](LocalizableException.md)                                    |
| public abstract void                    | [error](#error)([LocalizableRuntimeException](LocalizableRuntimeException.md) exception)                                                                                                                                                                                                                                       | Reports a [LocalizableRuntimeException](LocalizableRuntimeException.md)                      |



## Method Details

### setLevel

<span style="font-family: monospace; font-size: 80%;">public abstract [Reporter](Reporter.md) __setLevel__([Level](Diagnostic.Level.md) level)</span>

Sets the level of output when logging directly to the console.


---

### setDiagnosticCollector

<span style="font-family: monospace; font-size: 80%;">public abstract [Reporter](Reporter.md) __setDiagnosticCollector__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)</span>

Registers a collector to receive all diagnostics processed by this reporter.This includes debugging info, trace states, warnings, and error diagnostics.

**Parameters:**

`collector` - The consumer that processes each produced [Diagnostic](Diagnostic.md).


---

### setProblemCollector

<span style="font-family: monospace; font-size: 80%;">public abstract [Reporter](Reporter.md) __setProblemCollector__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)</span>

Registers a specialized collector to receive only problem-level diagnostics.This collector is filtered to intercept only `Level.WARN` and `Level.ERROR` items.

**Parameters:**

`collector` - The consumer that processes problem [Diagnostic](Diagnostic.md) objects.


---

### collectsProblems

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __collectsProblems__()</span>

Checks whether any active listener or collector is tracking problems.This can be used as an optimization flag by sub-parsers or AST-walkers
to skip expensive location token captures or contextual allocations if nobody
is actively listening for error diagnostics.

**Returns:**

`true` if warnings or errors are being collected, otherwise `false`.


---

### isSilent

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isSilent__()</span>




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

<span style="font-family: monospace; font-size: 80%;">public abstract void __info__([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message through the reporter.

**Parameters:**

`code` - The code of this warning.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### warn

<span style="font-family: monospace; font-size: 80%;">public abstract void __warn__([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning message including location information.

**Parameters:**

`code` - The code of this warning.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### error

<span style="font-family: monospace; font-size: 80%;">public abstract void __error__([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error message including location information.

**Parameters:**

`code` - The code of this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### error

<span style="font-family: monospace; font-size: 80%;">public abstract void __error__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error message including location information.

**Parameters:**

`cause` - The cause of this report.

`code` - The code of this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __infoAt__(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message anchored to a resource location by line and column.Useful when text stream indices are unavailable.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`code` - The semantic classification code for this warning.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __warnAt__(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning anchored to a resource location by line and column.Useful when text stream indices are unavailable.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`code` - The semantic classification code for this warning.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __errorAt__(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a resource location by line and column.Useful when text stream indices are unavailable.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`code` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Experimental<br/>
public abstract void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __errorAt__(int line, int column, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a resource location by line and column.Useful when text stream indices are unavailable.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`cause` - The cause of this report.

`code` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __infoAt__(int line, int column, int start, int end, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message anchored to a precise character span within a resource.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`start` - The 0-based absolute character index indicating the start of the span.

`end` - The 0-based absolute character index indicating the end of the span (exclusive).

`code` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __warnAt__(int line, int column, int start, int end, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning anchored to a precise character span within a resource.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`start` - The 0-based absolute character index indicating the start of the span.

`end` - The 0-based absolute character index indicating the end of the span (exclusive).

`code` - The semantic classification code for this warning.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __errorAt__(int line, int column, int start, int end, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a precise character span within a resource.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`start` - The 0-based absolute character index indicating the start of the span.

`end` - The 0-based absolute character index indicating the end of the span (exclusive).

`code` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __errorAt__(int line, int column, int start, int end, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a precise character span within a resource.

**Parameters:**

`line` - The 1-based line number of the diagnostic.

`column` - The 1-based column number of the diagnostic.

`start` - The 0-based absolute character index indicating the start of the span.

`end` - The 0-based absolute character index indicating the end of the span (exclusive).

`cause` - The cause of this report.

`code` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __infoAt__([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message derived from the location attributes of a structural token.

**Parameters:**

`token` - The syntactic [Token](../lang/token/Token.md) supplying the positional bounds.

`code` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __warnAt__([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning derived from the location attributes of a structural token.

**Parameters:**

`token` - The syntactic [Token](../lang/token/Token.md) supplying the positional bounds.

`code` - The semantic classification code for this warning.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __errorAt__([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error derived from the location attributes of a structural token.

**Parameters:**

`token` - The syntactic [Token](../lang/token/Token.md) supplying the positional bounds.

`code` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public abstract void __errorAt__([Token](../lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error derived from the location attributes of a structural token.

**Parameters:**

`token` - The syntactic [Token](../lang/token/Token.md) supplying the positional bounds.

`cause` - The cause of this report.

`code` - The semantic classification code for this error.

`details` - Arguments referenced by the format specifiers in the [DiagnosticCode](code/DiagnosticCode.md)'s localized format string.


---

### error

<span style="font-family: monospace; font-size: 80%;">public abstract void __error__([LocalizableException](LocalizableException.md) exception)</span>

Reports a [LocalizableException](LocalizableException.md)

**Parameters:**

`exception` - The exception to report.


---

### error

<span style="font-family: monospace; font-size: 80%;">public abstract void __error__([LocalizableRuntimeException](LocalizableRuntimeException.md) exception)</span>

Reports a [LocalizableRuntimeException](LocalizableRuntimeException.md)

**Parameters:**

`exception` - The exception to report.


---

