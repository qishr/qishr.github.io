Package [io.github.qishr.cascara.common.diagnostic.report](index.md)

# Class GlobalReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.diagnostic.report.AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)<[io.github.qishr.cascara.common.diagnostic.report.GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)><br/>
                io.github.qishr.cascara.common.diagnostic.report.GlobalReporter<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __GlobalReporter__<br/>extends [AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)<[GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)>
</span>


## Field Summary

| Modifier and Type                                                                                                | Field                                         | Description |
|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [SERIALIZATION_FORMAT](#serialization_format) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                               | Method                                                                                                                                                                                                                                                           | Description                                                    |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------|
| public static void                                                                                                                                                                                              | [configureSerializer](#configureserializer)()                                                                                                                                                                                                                    |                                                                |
| protected [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)                                                                                             | [self](#self)()                                                                                                                                                                                                                                                  |                                                                |
| public static [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)                                                                                         | [globalInstance](#globalinstance)()                                                                                                                                                                                                                              |                                                                |
| public static [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)                                                                                         | [forClass](#forclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                                       | Gets a `GlobalReporter` instance for the specifie class.       |
| public static [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)                                                                                         | [forSource](#forsource)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fqcn)                                                                                                                                       | Gets a `GlobalReporter` instance for the specifie class.       |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)                                                                                                | [setLevel](#setlevel)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)                                                                                                                                         | Sets the level of output when logging directly to the console. |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)                                                                                                | [setLevel](#setlevel)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fqcn, [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)                                      | Sets the reporting level for the specified class.              |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)                                                                                                | [setLevelInternal](#setlevelinternal)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fqcn, [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)                      |                                                                |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)                                                                                                | [setLevels](#setlevels)([Properties](../../../../../../../io/github/qishr/cascara/common/property/Properties.md) properties)                                                                                                                                     |                                                                |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)                                                                                                | [setDiagnosticConsumer](#setdiagnosticconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> collector) |                                                                |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)                                                                                                | [setProblemConsumer](#setproblemconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> collector)       |                                                                |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)                                                                                                | [setSystemOutputEnabled](#setsystemoutputenabled)(boolean b)                                                                                                                                                                                                     |                                                                |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)                                                                                                | [setImmediateFlushEnabled](#setimmediateflushenabled)(boolean b)                                                                                                                                                                                                 |                                                                |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> | [getDiagnosticConsumer](#getdiagnosticconsumer)()                                                                                                                                                                                                                |                                                                |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> | [getProblemConsumer](#getproblemconsumer)()                                                                                                                                                                                                                      |                                                                |
| protected boolean                                                                                                                                                                                               | [isSystemOutputEnabled](#issystemoutputenabled)()                                                                                                                                                                                                                |                                                                |
| protected boolean                                                                                                                                                                                               | [isImmediateFlushEnabled](#isimmediateflushenabled)()                                                                                                                                                                                                            |                                                                |
| public void                                                                                                                                                                                                     | [closeIpc](#closeipc)()                                                                                                                                                                                                                                          |                                                                |
| public void                                                                                                                                                                                                     | [report](#report)([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)                                                                                                                                         | Central reporting method.                                      |
| protected void                                                                                                                                                                                                  | [logLine](#logline)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine)                                     |                                                                |


### Methods inherited from [AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)

warn, trace, setStackTraceEnabled, warnAt, setPrefixEveryLine, setShowProblemCodes, reportsDebug, errorAt, debug, reportsTrace, collectsProblems, setSystemErrorEnabled, isProblem, error, addLogger, warnAt, reportAnyLevel, error, infoAt, setLineConsumer, infoAt, errorAt, setAnsiColoringEnabled, error, infoAt, warnAt, info, errorAt, warnAt, defaultFormatOptions, warnAt, errorAt, errorAt, getWriter, getLevel, errorAt, log, isSilent, errorAt, errorAt, errorAt


## Field Details

### SERIALIZATION_FORMAT

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SERIALIZATION_FORMAT__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---


## Method Details

### configureSerializer

<span style="font-family: monospace; font-size: 80%;">public static void __configureSerializer__()</span>




---

### self

<span style="font-family: monospace; font-size: 80%;">protected [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __self__()</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#self)


---

### globalInstance

<span style="font-family: monospace; font-size: 80%;">public static [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __globalInstance__()</span>




---

### forClass

<span style="font-family: monospace; font-size: 80%;">public static [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __forClass__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>

Gets a `GlobalReporter` instance for the specifie class.

**Parameters:**

`clazz` - the class to get a `GlobalReporter` instance for.


---

### forSource

<span style="font-family: monospace; font-size: 80%;">public static [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __forSource__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fqcn)</span>

Gets a `GlobalReporter` instance for the specifie class.

**Parameters:**

`fqcn` - the fully qualified name of the class to get a `GlobalReporter` instance for.


---

### setLevel

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __setLevel__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)</span>

Sets the level of output when logging directly to the console.

**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#setlevel)


---

### setLevel

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __setLevel__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fqcn, [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)</span>

Sets the reporting level for the specified class.

**Parameters:**

`fqcn` - the fully qualified class name of the class to set the level for.

`level` - the level to set for the class.


---

### setLevelInternal

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __setLevelInternal__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fqcn, [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)</span>




---

### setLevels

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __setLevels__([Properties](../../../../../../../io/github/qishr/cascara/common/property/Properties.md) properties)</span>




---

### setDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __setDiagnosticConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> collector)</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#setdiagnosticconsumer)


---

### setProblemConsumer

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __setProblemConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> collector)</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#setproblemconsumer)


---

### setSystemOutputEnabled

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __setSystemOutputEnabled__(boolean b)</span>




---

### setImmediateFlushEnabled

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __setImmediateFlushEnabled__(boolean b)</span>




---

### getDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> __getDiagnosticConsumer__()</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#getdiagnosticconsumer)


---

### getProblemConsumer

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> __getProblemConsumer__()</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#getproblemconsumer)


---

### isSystemOutputEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __isSystemOutputEnabled__()</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#issystemoutputenabled)


---

### isImmediateFlushEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __isImmediateFlushEnabled__()</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#isimmediateflushenabled)


---

### closeIpc

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public void __closeIpc__()</span>




---

### report

<span style="font-family: monospace; font-size: 80%;">public void __report__([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)</span>

Central reporting method.All other rporting methods call this.

**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#report)


---

### logLine

<span style="font-family: monospace; font-size: 80%;">protected void __logLine__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine)</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#logline)


---

