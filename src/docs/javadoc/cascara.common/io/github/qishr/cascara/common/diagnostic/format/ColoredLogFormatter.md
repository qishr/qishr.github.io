Package [io.github.qishr.cascara.common.diagnostic.format](index.md)

# Class ColoredLogFormatter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.diagnostic.format.PlainLogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/PlainLogFormatter.md)<br/>
                io.github.qishr.cascara.common.diagnostic.format.ColoredLogFormatter<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ColoredLogFormatter__<br/>extends [PlainLogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/PlainLogFormatter.md)
</span>


## Field Summary

| Modifier and Type               | Field                                           | Description |
|---------------------------------|-------------------------------------------------|-------------|
| protected static final boolean  | [CAN_USE_ANSI_COLORING](#can_use_ansi_coloring) |             |
| protected boolean               | [ansiColoringEnabled](#ansicoloringenabled)     |             |
| protected static final String[] | [levelColors](#levelcolors)                     |             |



## Constructor Summary

| Constructor           | Description |
|-----------------------|-------------|
| ColoredLogFormatter() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                                                                                                                                                                                          | Description |
|-----------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected void                                                                                      | [formatLine](#formatline)([StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) sb, [Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine, int msgLineNumber)        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [formatStackTrace](#formatstacktrace)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] stackTrace, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t) |             |


### Methods inherited from [PlainLogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/PlainLogFormatter.md)

format, setPrefixEveryLine, withFields


## Field Details

### CAN_USE_ANSI_COLORING

<span style="font-family: monospace; font-size: 80%;">protected static final boolean __CAN_USE_ANSI_COLORING__</span>




---

### ansiColoringEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __ansiColoringEnabled__</span>




---

### levelColors

<span style="font-family: monospace; font-size: 80%;">protected static final String[] __levelColors__</span>




---


## Method Details

### formatLine

<span style="font-family: monospace; font-size: 80%;">protected void __formatLine__([StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) sb, [Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine, int msgLineNumber)</span>



**Overrides:**

[PlainLogFormatter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/format/PlainLogFormatter.md#formatline)


---

### formatStackTrace

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatStackTrace__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] stackTrace, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)</span>



**Overrides:**

[PlainLogFormatter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/format/PlainLogFormatter.md#formatstacktrace)


---

