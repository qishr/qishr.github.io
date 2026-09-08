Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Class SilentCollectingReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.diagnostic.AbstractReporter](AbstractReporter.md)<[io.github.qishr.cascara.common.diagnostic.SilentCollectingReporter](SilentCollectingReporter.md)><br/>
                io.github.qishr.cascara.common.diagnostic.SilentCollectingReporter<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __SilentCollectingReporter__<br/>extends [AbstractReporter](AbstractReporter.md)<[SilentCollectingReporter](SilentCollectingReporter.md)>
</span>


## Constructor Summary

| Constructor                | Description |
|----------------------------|-------------|
| SilentCollectingReporter() |             |



## Method Summary

| Modifier and Type                                                                                      | Method                                                                                                                                                                                                          | Description |
|--------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public boolean                                                                                         | [hasErrors](#haserrors)()                                                                                                                                                                                       |             |
| protected [SilentCollectingReporter](SilentCollectingReporter.md)                                      | [self](#self)()                                                                                                                                                                                                 |             |
| public boolean                                                                                         | [collectsProblems](#collectsproblems)()                                                                                                                                                                         |             |
| public boolean                                                                                         | [isSilent](#issilent)()                                                                                                                                                                                         |             |
| protected void                                                                                         | [report](#report)([Diagnostic](Diagnostic.md) diagnostic)                                                                                                                                                       |             |
| protected void                                                                                         | [writeString](#writestring)([Diagnostic](Diagnostic.md) diagnostic)                                                                                                                                             |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [formatMessage](#formatmessage)([Diagnostic](Diagnostic.md) diagnostic, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) line, int lineNumber, boolean useColoring) |             |


### Methods inherited from [AbstractReporter](AbstractReporter.md)

errorAt, setStackTraceEnabled, setPrefixEveryLine, reportsDebug, buildDiagnostic, reportsTrace, infoAt, isProblem, errorAt, error, errorAt, warnAt, warnAt, setFlushEnabled, warn, displayLine, logLine, buildDiagnostic, errorAt, warnAt, isStackTraceEnabled, errorAt, setDiagnosticConsumer, info, getLevel, isSystemOutputEnabled, trace, setShowProblemCodes, debug, warnAt, errorAt, infoAt, setSystemErrorEnabled, infoAt, errorAt, setProblemConsumer, error, getLineConsumer, setLineConsumer, setAnsiColoringEnabled, warnAt, getProblemConsumer, setSystemOutputEnabled, buildDiagnostic, errorAt, isFlushEnabled, getWriter, getDiagnosticConsumer, error, buildDiagnostic, errorAt, setLevel


## Method Details

### hasErrors

<span style="font-family: monospace; font-size: 80%;">public boolean __hasErrors__()</span>




---

### self

<span style="font-family: monospace; font-size: 80%;">protected [SilentCollectingReporter](SilentCollectingReporter.md) __self__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#self)


---

### collectsProblems

<span style="font-family: monospace; font-size: 80%;">public boolean __collectsProblems__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#collectsproblems)


---

### isSilent

<span style="font-family: monospace; font-size: 80%;">public boolean __isSilent__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#issilent)


---

### report

<span style="font-family: monospace; font-size: 80%;">protected void __report__([Diagnostic](Diagnostic.md) diagnostic)</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#report)


---

### writeString

<span style="font-family: monospace; font-size: 80%;">protected void __writeString__([Diagnostic](Diagnostic.md) diagnostic)</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#writestring)


---

### formatMessage

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatMessage__([Diagnostic](Diagnostic.md) diagnostic, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) line, int lineNumber, boolean useColoring)</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#formatmessage)


---

