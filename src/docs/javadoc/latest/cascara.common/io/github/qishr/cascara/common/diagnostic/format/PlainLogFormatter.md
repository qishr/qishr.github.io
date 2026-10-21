Package [io.github.qishr.cascara.common.diagnostic.format](index.md)

# Class PlainLogFormatter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.format.PlainLogFormatter<br/>
<br/>
All Implemented Interfaces:<br/>
    [LogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatter.md)

Direct Known Subtypes:<br/>
    [ColoredLogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/ColoredLogFormatter.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __PlainLogFormatter__</span>


## Field Summary

| Modifier and Type                        | Field                       | Description |
|------------------------------------------|-----------------------------|-------------|
| protected static final DateTimeFormatter | [TIME_FORMAT](#time_format) |             |
| protected static final ZoneId            | [UTC](#utc)                 |             |
| protected FormatOptions                  | [options](#options)         |             |
| protected long                           | [processId](#processid)     |             |



## Constructor Summary

| Constructor                                                                                                                        | Description |
|------------------------------------------------------------------------------------------------------------------------------------|-------------|
| PlainLogFormatter([FormatOptions](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/FormatOptions.md) options) |             |



## Method Summary

| Modifier and Type                                                                                                      | Method                                                                                                                                                                                                                                                                                                                                                                          | Description |
|------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [PlainLogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/PlainLogFormatter.md) | [withFields](#withfields)([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Field](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatter.Field.md)> fields)                                                                                                                                                  |             |
| public [LogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatter.md)           | [setOptions](#setoptions)([FormatOptions](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/FormatOptions.md) options)                                                                                                                                                                                                                                      |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                    | [format](#format)([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)                                                                                                                                                                                                                                                        |             |
| protected void                                                                                                         | [formatLine](#formatline)([StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) sb, [Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine, int msgLineNumber)        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                    | [formatStackTrace](#formatstacktrace)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] stackTrace, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t) |             |



## Field Details

### TIME_FORMAT

<span style="font-family: monospace; font-size: 80%;">protected static final DateTimeFormatter __TIME_FORMAT__</span>




---

### UTC

<span style="font-family: monospace; font-size: 80%;">protected static final ZoneId __UTC__</span>




---

### options

<span style="font-family: monospace; font-size: 80%;">protected FormatOptions __options__</span>




---

### processId

<span style="font-family: monospace; font-size: 80%;">protected long __processId__</span>




---


## Method Details

### withFields

<span style="font-family: monospace; font-size: 80%;">public [PlainLogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/PlainLogFormatter.md) __withFields__([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Field](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatter.Field.md)> fields)</span>



**Specified By:**

[LogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatter.md)


---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public [LogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatter.md) __setOptions__([FormatOptions](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/FormatOptions.md) options)</span>



**Specified By:**

[LogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatter.md)


---

### format

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)</span>



**Specified By:**

[LogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatter.md)


---

### formatLine

<span style="font-family: monospace; font-size: 80%;">protected void __formatLine__([StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) sb, [Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine, int msgLineNumber)</span>




---

### formatStackTrace

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatStackTrace__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] stackTrace, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)</span>



**Specified By:**

[LogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatter.md)


---

