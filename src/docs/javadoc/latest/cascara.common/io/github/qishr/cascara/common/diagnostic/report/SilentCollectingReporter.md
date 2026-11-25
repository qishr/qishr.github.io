Package [io.github.qishr.cascara.common.diagnostic.report](index.md)

# Class SilentCollectingReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.diagnostic.report.AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)<[io.github.qishr.cascara.common.diagnostic.report.SilentCollectingReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/SilentCollectingReporter.md)><br/>
                io.github.qishr.cascara.common.diagnostic.report.SilentCollectingReporter<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/DiagnosticReporter.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __SilentCollectingReporter__<br/>extends [AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)<[SilentCollectingReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/SilentCollectingReporter.md)>
</span>


## Field Summary

| Modifier and Type                   | Field                                       | Description                                                                                                |
|-------------------------------------|---------------------------------------------|------------------------------------------------------------------------------------------------------------|
| protected Set<Consumer<Diagnostic>> | [diagnosticConsumers](#diagnosticconsumers) | Consumes diagnostics included in the current Level or more important, with ERROR being the most important. |
| protected Consumer<Diagnostic>      | [problemConsumer](#problemconsumer)         | Consumes ERROR, WARN, and INFO diagnostics.                                                                |



## Constructor Summary

| Constructor                | Description |
|----------------------------|-------------|
| SilentCollectingReporter() |             |



## Method Summary

| Modifier and Type                                                                                                                       | Method                                                                                                                                                                                                                                                                | Description                                                                 |
|-----------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------|
| public boolean                                                                                                                          | [hasErrors](#haserrors)()                                                                                                                                                                                                                                             |                                                                             |
| protected [SilentCollectingReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/SilentCollectingReporter.md) | [self](#self)()                                                                                                                                                                                                                                                       |                                                                             |
| public boolean                                                                                                                          | [collectsProblems](#collectsproblems)()                                                                                                                                                                                                                               |                                                                             |
| public boolean                                                                                                                          | [isSilent](#issilent)()                                                                                                                                                                                                                                               |                                                                             |
| protected [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)                                        | [getDiagnosticConsumers](#getdiagnosticconsumers)()                                                                                                                                                                                                                   |                                                                             |
| public [SilentCollectingReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/SilentCollectingReporter.md)    | [addDiagnosticConsumer](#adddiagnosticconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)       | Registers a consumer to receive all diagnostics processed by this reporter. |
| public [SilentCollectingReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/SilentCollectingReporter.md)    | [removeDiagnosticConsumer](#removediagnosticconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer) | Unregisters a consumer of diagnostic reports.                               |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)                     | [getProblemConsumer](#getproblemconsumer)()                                                                                                                                                                                                                           |                                                                             |
| public [SilentCollectingReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/SilentCollectingReporter.md)    | [setProblemConsumer](#setproblemconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)             | Registers a consumer to receive only problem-level diagnostics.             |
| protected void                                                                                                                          | [report](#report)([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)                                                                                                                                              |                                                                             |


### Methods inherited from [AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)

trace, reportsDebug, debug, reportsTrace, warnAt, error, warnAt, isProblem, addLogger, errorAt, errorAt, logLine, infoAt, reportAnyLevel, errorAt, warnAt, setLineConsumer, infoAt, error, errorAt, errorAt, warn, errorAt, assertApiOverrideEnabled, errorAt, errorAt, warnAt, infoAt, isConsoleOutputEnabled, getWriter, warn, getLevel, errorAt, log, error, info, setLevel, warnAt


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

### hasErrors

<span style="font-family: monospace; font-size: 80%;">public boolean __hasErrors__()</span>




---

### self

<span style="font-family: monospace; font-size: 80%;">protected [SilentCollectingReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/SilentCollectingReporter.md) __self__()</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#self)


---

### collectsProblems

<span style="font-family: monospace; font-size: 80%;">public boolean __collectsProblems__()</span>




---

### isSilent

<span style="font-family: monospace; font-size: 80%;">public boolean __isSilent__()</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#issilent)


---

### getDiagnosticConsumers

<span style="font-family: monospace; font-size: 80%;">protected [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html) __getDiagnosticConsumers__()</span>




---

### addDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">public [SilentCollectingReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/SilentCollectingReporter.md) __addDiagnosticConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Registers a consumer to receive all diagnostics processed by this reporter.

**Specified By:**

[DiagnosticReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/DiagnosticReporter.md)


---

### removeDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">public [SilentCollectingReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/SilentCollectingReporter.md) __removeDiagnosticConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Unregisters a consumer of diagnostic reports.

**Specified By:**

[DiagnosticReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/DiagnosticReporter.md)


---

### getProblemConsumer

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html) __getProblemConsumer__()</span>




---

### setProblemConsumer

<span style="font-family: monospace; font-size: 80%;">public [SilentCollectingReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/SilentCollectingReporter.md) __setProblemConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Registers a consumer to receive only problem-level diagnostics.

**Specified By:**

[DiagnosticReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/DiagnosticReporter.md)


---

### report

<span style="font-family: monospace; font-size: 80%;">protected void __report__([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#report)


---

