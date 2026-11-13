Package [io.github.qishr.cascara.common.diagnostic.report](index.md)

# Class SilentCollectingReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.diagnostic.report.AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)<[io.github.qishr.cascara.common.diagnostic.report.SilentCollectingReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/SilentCollectingReporter.md)><br/>
                io.github.qishr.cascara.common.diagnostic.report.SilentCollectingReporter<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __SilentCollectingReporter__<br/>extends [AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)<[SilentCollectingReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/SilentCollectingReporter.md)>
</span>


## Constructor Summary

| Constructor                | Description |
|----------------------------|-------------|
| SilentCollectingReporter() |             |



## Method Summary

| Modifier and Type                                                                                                                       | Method                                                                                                                   | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------|-------------|
| public boolean                                                                                                                          | [hasErrors](#haserrors)()                                                                                                |             |
| protected [SilentCollectingReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/SilentCollectingReporter.md) | [self](#self)()                                                                                                          |             |
| public boolean                                                                                                                          | [collectsProblems](#collectsproblems)()                                                                                  |             |
| public boolean                                                                                                                          | [isSilent](#issilent)()                                                                                                  |             |
| protected void                                                                                                                          | [report](#report)([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic) |             |


### Methods inherited from [AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)

setStackTraceEnabled, setPrefixEveryLine, reportsDebug, reportsTrace, error, infoAt, warnAt, isProblem, addLogger, isImmediateFlushEnabled, defaultFormatConfig, errorAt, logLine, reportAnyLevel, warn, warnAt, getDiagnosticConsumers, getLevel, infoAt, isSystemOutputEnabled, errorAt, trace, setShowProblemCodes, removeDiagnosticConsumer, debug, setSystemErrorEnabled, warnAt, info, errorAt, errorAt, setProblemConsumer, infoAt, errorAt, warnAt, setLineConsumer, error, setImmediateFlushEnabled, errorAt, setAnsiColoringEnabled, errorAt, getProblemConsumer, setSystemOutputEnabled, warnAt, warn, errorAt, addDiagnosticConsumer, getWriter, errorAt, log, setLevel, error


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



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#collectsproblems)


---

### isSilent

<span style="font-family: monospace; font-size: 80%;">public boolean __isSilent__()</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#issilent)


---

### report

<span style="font-family: monospace; font-size: 80%;">protected void __report__([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#report)


---

