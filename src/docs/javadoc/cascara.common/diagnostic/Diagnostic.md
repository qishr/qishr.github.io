Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Class Diagnostic
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.Diagnostic<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __Diagnostic__</span>

Represents a discrete event, log entry, or syntax/semantic problem identified
during system runtime or source compilation.Each diagnostic encapsulates precise positioning boundaries, metadata strings,
structural tracking indicators like thread name and execution timestamps, and
an optional underlying exception cause.


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Description                                                                                                                               |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|
| Diagnostic([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, int startOffset, int endOffset, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](Diagnostic.Level.md) level, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Constructs a fully qualified [Diagnostic](Diagnostic.md) entry with absolute location indicators.                                         |
| Diagnostic([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../lang/token/Token.md) token, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](Diagnostic.Level.md) level, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                | Constructs a [Diagnostic](Diagnostic.md) entry by resolving positioning metadata directly from a parsing [Token](../lang/token/Token.md). |



## Method Summary

| Modifier and Type                                                                                                 | Method                                                                                                       | Description                                                                                   |
|-------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------|
| public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)                      | [getUri](#geturi)()                                                                                          | Returns the URI of the source resource associated with this diagnostic.                       |
| public int                                                                                                        | [getLine](#getline)()                                                                                        | Returns the 1-based line number of this diagnostic.                                           |
| public int                                                                                                        | [getColumn](#getcolumn)()                                                                                    | Returns the 1-based column number of this diagnostic.                                         |
| public int                                                                                                        | [getStartOffset](#getstartoffset)()                                                                          | Returns the 0-based absolute starting character offset of this diagnostic.                    |
| public int                                                                                                        | [getEndOffset](#getendoffset)()                                                                              | Returns the 0-based absolute ending character offset (exclusive) of this diagnostic.          |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)               | [getSource](#getsource)()                                                                                    | Returns the identifier string of the subsystem that produced this diagnostic.                 |
| public [Level](Diagnostic.Level.md)                                                                               | [getLevel](#getlevel)()                                                                                      | Returns the severity [Level](Diagnostic.Level.md) classification of this diagnostic.          |
| public [DiagnosticCode](code/DiagnosticCode.md)                                                                   | [getCode](#getcode)()                                                                                        | Returns the stable classification code, suitable for localization and system filtering.       |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)               | [getMessage](#getmessage)()                                                                                  | Returns the formatted descriptive text message of this diagnostic.                            |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]             | [getDetails](#getdetails)()                                                                                  | Returns the arguments for the message format placeholders.                                    |
| public [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)         | [getCause](#getcause)()                                                                                      | Returns the underlying exception that caused this diagnostic, or `null` if none was provided. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)               | [getThread](#getthread)()                                                                                    | Returns the name of the execution thread that instantiated this diagnostic instance.          |
| public [LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html) | [getTimestamp](#gettimestamp)()                                                                              | Returns the exact timestamp indicating when this diagnostic was instantiated.                 |
| public void                                                                                                       | [setUri](#seturi)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri) | Sets the URI of the source resource associated with this diagnostic.                          |



## Method Details

### getUri

<span style="font-family: monospace; font-size: 80%;">public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __getUri__()</span>

Returns the URI of the source resource associated with this diagnostic.


---

### getLine

<span style="font-family: monospace; font-size: 80%;">public int __getLine__()</span>

Returns the 1-based line number of this diagnostic.


---

### getColumn

<span style="font-family: monospace; font-size: 80%;">public int __getColumn__()</span>

Returns the 1-based column number of this diagnostic.


---

### getStartOffset

<span style="font-family: monospace; font-size: 80%;">public int __getStartOffset__()</span>

Returns the 0-based absolute starting character offset of this diagnostic.


---

### getEndOffset

<span style="font-family: monospace; font-size: 80%;">public int __getEndOffset__()</span>

Returns the 0-based absolute ending character offset (exclusive) of this diagnostic.


---

### getSource

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSource__()</span>

Returns the identifier string of the subsystem that produced this diagnostic.


---

### getLevel

<span style="font-family: monospace; font-size: 80%;">public [Level](Diagnostic.Level.md) __getLevel__()</span>

Returns the severity [Level](Diagnostic.Level.md) classification of this diagnostic.


---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [DiagnosticCode](code/DiagnosticCode.md) __getCode__()</span>

Returns the stable classification code, suitable for localization and system filtering.


---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>

Returns the formatted descriptive text message of this diagnostic.


---

### getDetails

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getDetails__()</span>

Returns the arguments for the message format placeholders.


---

### getCause

<span style="font-family: monospace; font-size: 80%;">public [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) __getCause__()</span>

Returns the underlying exception that caused this diagnostic, or `null` if none was provided.


---

### getThread

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getThread__()</span>

Returns the name of the execution thread that instantiated this diagnostic instance.


---

### getTimestamp

<span style="font-family: monospace; font-size: 80%;">public [LocalDateTime](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html) __getTimestamp__()</span>

Returns the exact timestamp indicating when this diagnostic was instantiated.


---

### setUri

<span style="font-family: monospace; font-size: 80%;">public void __setUri__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)</span>

Sets the URI of the source resource associated with this diagnostic.


---

