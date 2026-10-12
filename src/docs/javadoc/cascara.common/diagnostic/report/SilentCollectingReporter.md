Package [io.github.qishr.cascara.common.diagnostic.report](index.md)

# Class SilentCollectingReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.diagnostic.report.AbstractReporter](AbstractReporter.md)<[io.github.qishr.cascara.common.diagnostic.report.SilentCollectingReporter](SilentCollectingReporter.md)><br/>
                io.github.qishr.cascara.common.diagnostic.report.SilentCollectingReporter<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __SilentCollectingReporter__<br/>extends [AbstractReporter](AbstractReporter.md)<[SilentCollectingReporter](SilentCollectingReporter.md)>
</span>


## Constructor Summary

| Constructor                | Description |
|----------------------------|-------------|
| SilentCollectingReporter() |             |



## Method Summary

| Modifier and Type                                                 | Method                                                       | Description |
|-------------------------------------------------------------------|--------------------------------------------------------------|-------------|
| public boolean                                                    | [hasErrors](#haserrors)()                                    |             |
| protected [SilentCollectingReporter](SilentCollectingReporter.md) | [self](#self)()                                              |             |
| public boolean                                                    | [collectsProblems](#collectsproblems)()                      |             |
| public boolean                                                    | [isSilent](#issilent)()                                      |             |
| protected void                                                    | [report](#report)([Diagnostic](../Diagnostic.md) diagnostic) |             |


### Methods inherited from [AbstractReporter](AbstractReporter.md)

warn, setStackTraceEnabled, setPrefixEveryLine, reportsDebug, reportsTrace, isProblem, error, addLogger, logLine, warnAt, reportAnyLevel, setFlushEnabled, error, infoAt, error, infoAt, warnAt, info, errorAt, warnAt, warnAt, isStackTraceEnabled, setDiagnosticConsumer, errorAt, getLevel, errorAt, errorAt, errorAt, isSystemOutputEnabled, trace, warnAt, setShowProblemCodes, errorAt, debug, setSystemErrorEnabled, setProblemConsumer, infoAt, setLineConsumer, errorAt, setAnsiColoringEnabled, getProblemConsumer, setSystemOutputEnabled, errorAt, isFlushEnabled, getWriter, getDiagnosticConsumer, errorAt, log, setLevel


## Method Details

### hasErrors

<span style="font-family: monospace; font-size: 80%;">public boolean __hasErrors__()</span>




---

### self

<span style="font-family: monospace; font-size: 80%;">protected [SilentCollectingReporter](SilentCollectingReporter.md) __self__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/report/AbstractReporter.md#self)


---

### collectsProblems

<span style="font-family: monospace; font-size: 80%;">public boolean __collectsProblems__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/report/AbstractReporter.md#collectsproblems)


---

### isSilent

<span style="font-family: monospace; font-size: 80%;">public boolean __isSilent__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/report/AbstractReporter.md#issilent)


---

### report

<span style="font-family: monospace; font-size: 80%;">protected void __report__([Diagnostic](../Diagnostic.md) diagnostic)</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/report/AbstractReporter.md#report)


---

