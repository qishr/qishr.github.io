Package [io.github.qishr.cascara.common.diagnostic.report](index.md)

# Class GlobalReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.diagnostic.report.AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)<[io.github.qishr.cascara.common.diagnostic.report.ClassReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md)><br/>
                [io.github.qishr.cascara.common.diagnostic.report.ClassReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md)<br/>
                        io.github.qishr.cascara.common.diagnostic.report.GlobalReporter<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/DiagnosticReporter.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __GlobalReporter__<br/>extends [ClassReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md)
</span>


## Field Summary

| Modifier and Type                                                                                                | Field                                         | Description                                                                                                |
|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------|------------------------------------------------------------------------------------------------------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [SERIALIZATION_FORMAT](#serialization_format) |                                                                                                            |
| protected Set<Consumer<Diagnostic>>                                                                              | [diagnosticConsumers](#diagnosticconsumers)   | Consumes diagnostics included in the current Level or more important, with ERROR being the most important. |
| protected Consumer<Diagnostic>                                                                                   | [problemConsumer](#problemconsumer)           | Consumes ERROR, WARN, and INFO diagnostics.                                                                |



## Method Summary

| Modifier and Type                                                                                                       | Method                                                                                                                                                                                                                                                                | Description                                                                 |
|-------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------|
| public static [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) | [get](#get)()                                                                                                                                                                                                                                                         |                                                                             |
| public static [ClassReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md)   | [forClass](#forclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                                            | Gets a `GlobalReporter` instance for the specifie class.                    |
| public static [ClassReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md)   | [forSource](#forsource)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fqcn)                                                                                                                                            | Gets a `GlobalReporter` instance for the specifie class.                    |
| protected boolean                                                                                                       | [isConsoleOutputEnabled](#isconsoleoutputenabled)()                                                                                                                                                                                                                   |                                                                             |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)        | [setConsoleOutputEnabled](#setconsoleoutputenabled)(boolean b)                                                                                                                                                                                                        | Controls whether diagnostic logging to console is enabled.                  |
| protected [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)                        | [getDiagnosticConsumers](#getdiagnosticconsumers)()                                                                                                                                                                                                                   |                                                                             |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)        | [addDiagnosticConsumer](#adddiagnosticconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)       | Registers a consumer to receive all diagnostics processed by this reporter. |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)        | [removeDiagnosticConsumer](#removediagnosticconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer) | Unregisters a consumer of diagnostic reports.                               |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)     | [getProblemConsumer](#getproblemconsumer)()                                                                                                                                                                                                                           |                                                                             |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)        | [setProblemConsumer](#setproblemconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)             | Registers a consumer to receive only problem-level diagnostics.             |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)        | [setLevel](#setlevel)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)                                                                                                                                              | Sets the level of output when logging directly to the console.              |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)        | [setLevel](#setlevel)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)                                           | Sets the reporting level for the specified class.                           |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)        | [setLevel](#setlevel)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fqcn, [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)                                           | Sets the reporting level for the specified class.                           |
| public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)        | [setLevelInternal](#setlevelinternal)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fqcn, [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)                           |                                                                             |
| public void                                                                                                             | [closeIpc](#closeipc)()                                                                                                                                                                                                                                               |                                                                             |
| public void                                                                                                             | [report](#report)([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)                                                                                                                                              | Central reporting method.                                                   |
| protected void                                                                                                          | [logLine](#logline)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine)                                          |                                                                             |
| public static void                                                                                                      | [configureSerializer](#configureserializer)()                                                                                                                                                                                                                         |                                                                             |


### Methods inherited from [ClassReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md)

collectsProblems, self

### Methods inherited from [AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)

trace, reportsDebug, debug, reportsTrace, warnAt, error, warnAt, isProblem, addLogger, errorAt, errorAt, infoAt, reportAnyLevel, errorAt, warnAt, setLineConsumer, infoAt, error, errorAt, errorAt, warn, errorAt, assertApiOverrideEnabled, errorAt, errorAt, warnAt, infoAt, getWriter, warn, getLevel, errorAt, log, isSilent, error, info, warnAt


## Field Details

### SERIALIZATION_FORMAT

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SERIALIZATION_FORMAT__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---

### diagnosticConsumers

<span style="font-family: monospace; font-size: 80%;">protected Set<Consumer<Diagnostic>> __diagnosticConsumers__</span>

Consumes diagnostics included in the current Level or more
important, with ERROR being the most important.


---

### problemConsumer

<span style="font-family: monospace; font-size: 80%;">protected Consumer<Diagnostic> __problemConsumer__</span>

Consumes ERROR, WARN, and INFO diagnostics.


---


## Method Details

### get

<span style="font-family: monospace; font-size: 80%;">public static [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __get__()</span>




---

### forClass

<span style="font-family: monospace; font-size: 80%;">public static [ClassReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md) __forClass__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>

Gets a `GlobalReporter` instance for the specifie class.

**Parameters:**

`clazz` - the class to get a `GlobalReporter` instance for.

**Specified By:**

[DiagnosticReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/DiagnosticReporter.md)


---

### forSource

<span style="font-family: monospace; font-size: 80%;">public static [ClassReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md) __forSource__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fqcn)</span>

Gets a `GlobalReporter` instance for the specifie class.

**Parameters:**

`fqcn` - the fully qualified name of the class to get a `GlobalReporter` instance for.


---

### isConsoleOutputEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __isConsoleOutputEnabled__()</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#isconsoleoutputenabled)


---

### setConsoleOutputEnabled

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __setConsoleOutputEnabled__(boolean b)</span>

Controls whether diagnostic logging to console is enabled.


---

### getDiagnosticConsumers

<span style="font-family: monospace; font-size: 80%;">protected [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html) __getDiagnosticConsumers__()</span>




---

### addDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __addDiagnosticConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Registers a consumer to receive all diagnostics processed by this reporter.

**Specified By:**

[DiagnosticReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/DiagnosticReporter.md)


---

### removeDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __removeDiagnosticConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Unregisters a consumer of diagnostic reports.

**Specified By:**

[DiagnosticReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/DiagnosticReporter.md)


---

### getProblemConsumer

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html) __getProblemConsumer__()</span>




---

### setProblemConsumer

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __setProblemConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Registers a consumer to receive only problem-level diagnostics.

**Specified By:**

[DiagnosticReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/DiagnosticReporter.md)


---

### setLevel

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __setLevel__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)</span>

Sets the level of output when logging directly to the console.

**Specified By:**

[DiagnosticReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/DiagnosticReporter.md)

**Overrides:**

[ClassReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md#setlevel)


---

### setLevel

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md) __setLevel__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)</span>

Sets the reporting level for the specified class.

**Parameters:**

`cls` - the class to set the level for.

`level` - the level to set for the class.


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

### closeIpc

<span style="font-family: monospace; font-size: 80%;">public void __closeIpc__()</span>




---

### report

<span style="font-family: monospace; font-size: 80%;">public void __report__([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)</span>

Central reporting method.All other reporting methods call this.

**Overrides:**

[ClassReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md#report)


---

### logLine

<span style="font-family: monospace; font-size: 80%;">protected void __logLine__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine)</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#logline)


---

### configureSerializer

<span style="font-family: monospace; font-size: 80%;">public static void __configureSerializer__()</span>




---

