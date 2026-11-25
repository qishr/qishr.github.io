Package [io.github.qishr.cascara.common.diagnostic.report](index.md)

# Class LocalReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.diagnostic.report.AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)<[io.github.qishr.cascara.common.diagnostic.report.LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md)><br/>
                io.github.qishr.cascara.common.diagnostic.report.LocalReporter<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/DiagnosticReporter.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __LocalReporter__<br/>extends [AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)<[LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md)>
</span>


## Field Summary

| Modifier and Type                   | Field                                       | Description                                                                                                |
|-------------------------------------|---------------------------------------------|------------------------------------------------------------------------------------------------------------|
| protected Set<Consumer<Diagnostic>> | [diagnosticConsumers](#diagnosticconsumers) | Consumes diagnostics included in the current Level or more important, with ERROR being the most important. |
| protected Consumer<Diagnostic>      | [problemConsumer](#problemconsumer)         | Consumes ERROR, WARN, and INFO diagnostics.                                                                |



## Constructor Summary

| Constructor     | Description |
|-----------------|-------------|
| LocalReporter() |             |



## Method Summary

| Modifier and Type                                                                                                   | Method                                                                                                                                                                                                                                                                | Description                                                                 |
|---------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------|
| protected [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md)   | [self](#self)()                                                                                                                                                                                                                                                       |                                                                             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                 | [getSource](#getsource)()                                                                                                                                                                                                                                             |                                                                             |
| public [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md)      | [setSource](#setsource)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source)                                                                                                                                          |                                                                             |
| public [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md)      | [setFormatConfig](#setformatconfig)([LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md) config)                                                                                                               |                                                                             |
| protected boolean                                                                                                   | [isConsoleOutputEnabled](#isconsoleoutputenabled)()                                                                                                                                                                                                                   |                                                                             |
| public [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md)      | [setConsoleOutputEnabled](#setconsoleoutputenabled)(boolean b)                                                                                                                                                                                                        | Controls whether diagnostic logging to console is enabled.                  |
| public @io.github.qishr.cascara.common.annotation.Experimental boolean                                              | [collectsProblems](#collectsproblems)()                                                                                                                                                                                                                               |                                                                             |
| protected [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)                    | [getDiagnosticConsumers](#getdiagnosticconsumers)()                                                                                                                                                                                                                   |                                                                             |
| public [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md)      | [addDiagnosticConsumer](#adddiagnosticconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)       | Registers a consumer to receive all diagnostics processed by this reporter. |
| public [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md)      | [removeDiagnosticConsumer](#removediagnosticconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer) | Unregisters a consumer of diagnostic reports.                               |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html) | [getProblemConsumer](#getproblemconsumer)()                                                                                                                                                                                                                           |                                                                             |
| public [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md)      | [setProblemConsumer](#setproblemconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)             | Registers a consumer to receive only problem-level diagnostics.             |
| public void                                                                                                         | [report](#report)([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)                                                                                                                                              | Central reporting method.                                                   |


### Methods inherited from [AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)

trace, reportsDebug, debug, reportsTrace, warnAt, error, warnAt, isProblem, addLogger, errorAt, errorAt, logLine, infoAt, reportAnyLevel, errorAt, warnAt, setLineConsumer, infoAt, error, errorAt, errorAt, warn, errorAt, assertApiOverrideEnabled, errorAt, errorAt, warnAt, infoAt, getWriter, warn, getLevel, errorAt, log, isSilent, error, info, setLevel, warnAt


## Field Details

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

### self

<span style="font-family: monospace; font-size: 80%;">protected [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md) __self__()</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#self)


---

### getSource

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSource__()</span>




---

### setSource

<span style="font-family: monospace; font-size: 80%;">public [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md) __setSource__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source)</span>




---

### setFormatConfig

<span style="font-family: monospace; font-size: 80%;">public [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md) __setFormatConfig__([LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md) config)</span>




---

### isConsoleOutputEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __isConsoleOutputEnabled__()</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#isconsoleoutputenabled)


---

### setConsoleOutputEnabled

<span style="font-family: monospace; font-size: 80%;">public [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md) __setConsoleOutputEnabled__(boolean b)</span>

Controls whether diagnostic logging to console is enabled.


---

### collectsProblems

<span style="font-family: monospace; font-size: 80%;">public @io.github.qishr.cascara.common.annotation.Experimental boolean __collectsProblems__()</span>




---

### getDiagnosticConsumers

<span style="font-family: monospace; font-size: 80%;">protected [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html) __getDiagnosticConsumers__()</span>




---

### addDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">public [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md) __addDiagnosticConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Registers a consumer to receive all diagnostics processed by this reporter.

**Specified By:**

[DiagnosticReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/DiagnosticReporter.md)


---

### removeDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">public [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md) __removeDiagnosticConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Unregisters a consumer of diagnostic reports.

**Specified By:**

[DiagnosticReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/DiagnosticReporter.md)


---

### getProblemConsumer

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html) __getProblemConsumer__()</span>




---

### setProblemConsumer

<span style="font-family: monospace; font-size: 80%;">public [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md) __setProblemConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Registers a consumer to receive only problem-level diagnostics.

**Specified By:**

[DiagnosticReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/DiagnosticReporter.md)


---

### report

<span style="font-family: monospace; font-size: 80%;">public void __report__([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)</span>

Central reporting method.All other reporting methods call this.

**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#report)


---

