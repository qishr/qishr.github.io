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

| Modifier and Type                                                 | Method                                                              | Description |
|-------------------------------------------------------------------|---------------------------------------------------------------------|-------------|
| public boolean                                                    | [hasErrors](#haserrors)()                                           |             |
| protected [SilentCollectingReporter](SilentCollectingReporter.md) | [self](#self)()                                                     |             |
| public boolean                                                    | [collectsProblems](#collectsproblems)()                             |             |
| protected void                                                    | [report](#report)([Diagnostic](Diagnostic.md) diagnostic)           |             |
| protected void                                                    | [writeString](#writestring)([Diagnostic](Diagnostic.md) diagnostic) |             |


### Methods inherited from [AbstractReporter](AbstractReporter.md)

errorAt, printStackTrace, getProblemCollector, trace, debug, getDiagnosticCollector, buildDiagnostic, warnAt, errorAt, infoAt, infoAt, isProblem, errorAt, infoAt, [writeString](#writestring), errorAt, warnAt, error, setDiagnosticCollector, warnAt, outputToConsole, warn, disableSystemOutput, setDisableSystemOutput, error, setDisableFlush, buildDiagnostic, buildDiagnostic, setProblemCollector, errorAt, errorAt, disableFlush, errorAt, setPrintStackTrace, info, error, error, buildDiagnostic, setLevel, getStringWriter


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

