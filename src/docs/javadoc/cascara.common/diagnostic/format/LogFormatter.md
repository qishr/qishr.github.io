Package [io.github.qishr.cascara.common.diagnostic.format](index.md)

# Interface LogFormatter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.format.LogFormatter<br/>
<br/>
All Known Implementing Classes:<br/>
    [LocalLogFormatter](LocalLogFormatter.md), [PlainLogFormatter](PlainLogFormatter.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __LogFormatter__</span>

Formats diagnostic instances into string representations.


## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                                                                                                                                                                                                              | Description                                      |
|--------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [format](#format)([Diagnostic](../Diagnostic.md) diagnostic)                                                                                                                                                                                                                                                        | Formats the given diagnostic into a output line. |
| public abstract [LogFormatter](LogFormatter.md)                                                              | [withFields](#withfields)([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Field](LogFormatter.Field.md)> fields)                                                                                                                                                            | Configures active fields shown in output.        |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [formatStackTrace](#formatstacktrace)([Level](../Diagnostic.Level.md) level, [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] stackTrace, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t) |                                                  |



## Method Details

### format

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([Diagnostic](../Diagnostic.md) diagnostic)</span>

Formats the given diagnostic into a output line.

**Parameters:**

`diagnostic` - the diagnostic to format

**Returns:**

formatted string line

**Since:**

cascara.common-1.0.0


---

### withFields

<span style="font-family: monospace; font-size: 80%;">public abstract [LogFormatter](LogFormatter.md) __withFields__([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Field](LogFormatter.Field.md)> fields)</span>

Configures active fields shown in output.

**Parameters:**

`fields` - active fields to include

**Returns:**

this formatter instance

**Since:**

cascara.common-1.0.0


---

### formatStackTrace

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatStackTrace__([Level](../Diagnostic.Level.md) level, [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] stackTrace, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)</span>




---

