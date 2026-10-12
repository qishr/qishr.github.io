Package [io.github.qishr.cascara.common.diagnostic.format](index.md)

# Class LocalLogFormatter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.format.LocalLogFormatter<br/>
<br/>
All Implemented Interfaces:<br/>
    [LogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatter.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __LocalLogFormatter__</span>


## Field Summary

| Modifier and Type               | Field                                           | Description |
|---------------------------------|-------------------------------------------------|-------------|
| protected static final boolean  | [CAN_USE_ANSI_COLORING](#can_use_ansi_coloring) |             |
| protected static final ZoneId   | [UTC](#utc)                                     |             |
| protected boolean               | [ansiColoringEnabled](#ansicoloringenabled)     |             |
| protected static final String[] | [levelColors](#levelcolors)                     |             |
| protected boolean               | [prefixEveryLine](#prefixeveryline)             |             |
| protected boolean               | [showProblemCodes](#showproblemcodes)           |             |



## Constructor Summary

| Constructor         | Description |
|---------------------|-------------|
| LocalLogFormatter() |             |



## Method Summary

| Modifier and Type                                                                                                                 | Method                                                                                                                                                                                                                                                                                                                                                                                     | Description |
|-----------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [LocalLogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LocalLogFormatter.md)            | [withFields](#withfields)([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Field](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatter.Field.md)> fields)                                                                                                                                                             |             |
| public io.github.qishr.cascara.common.diagnostic.format.@io.github.qishr.cascara.common.annotation.Experimental LocalLogFormatter | [setPrefixEveryLine](#setprefixeveryline)(boolean b)                                                                                                                                                                                                                                                                                                                                       |             |
| public [LocalLogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LocalLogFormatter.md)            | [setAnsiColoringEnabled](#setansicoloringenabled)(boolean b)                                                                                                                                                                                                                                                                                                                               |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                               | [format](#format)([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)                                                                                                                                                                                                                                                                   |             |
| protected void                                                                                                                    | [formatLine](#formatline)([StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) sb, [Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine, int msgLineNumber, boolean colorize) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                               | [formatStackTrace](#formatstacktrace)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] stackTrace, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)            |             |



## Field Details

### CAN_USE_ANSI_COLORING

<span style="font-family: monospace; font-size: 80%;">protected static final boolean __CAN_USE_ANSI_COLORING__</span>




---

### UTC

<span style="font-family: monospace; font-size: 80%;">protected static final ZoneId __UTC__</span>




---

### ansiColoringEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __ansiColoringEnabled__</span>




---

### levelColors

<span style="font-family: monospace; font-size: 80%;">protected static final String[] __levelColors__</span>




---

### prefixEveryLine

<span style="font-family: monospace; font-size: 80%;">protected boolean __prefixEveryLine__</span>




---

### showProblemCodes

<span style="font-family: monospace; font-size: 80%;">protected boolean __showProblemCodes__</span>




---


## Method Details

### withFields

<span style="font-family: monospace; font-size: 80%;">public [LocalLogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LocalLogFormatter.md) __withFields__([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Field](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatter.Field.md)> fields)</span>



**Specified By:**

[LogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatter.md)


---

### setPrefixEveryLine

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public io.github.qishr.cascara.common.diagnostic.format.@io.github.qishr.cascara.common.annotation.Experimental LocalLogFormatter __setPrefixEveryLine__(boolean b)</span>




---

### setAnsiColoringEnabled

<span style="font-family: monospace; font-size: 80%;">public [LocalLogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LocalLogFormatter.md) __setAnsiColoringEnabled__(boolean b)</span>




---

### format

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)</span>



**Specified By:**

[LogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatter.md)


---

### formatLine

<span style="font-family: monospace; font-size: 80%;">protected void __formatLine__([StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) sb, [Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine, int msgLineNumber, boolean colorize)</span>




---

### formatStackTrace

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatStackTrace__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] stackTrace, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)</span>



**Specified By:**

[LogFormatter](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatter.md)


---

