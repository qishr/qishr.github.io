Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Class StandardReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.diagnostic.AbstractReporter](AbstractReporter.md)<[io.github.qishr.cascara.common.diagnostic.StandardReporter](StandardReporter.md)><br/>
                io.github.qishr.cascara.common.diagnostic.StandardReporter<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __StandardReporter__<br/>extends [AbstractReporter](AbstractReporter.md)<[StandardReporter](StandardReporter.md)>
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                      | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| StandardReporter([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> writer) |             |
| StandardReporter()                                                                                                                                                                                                               |             |



## Method Summary

| Modifier and Type                                 | Method                                                              | Description |
|---------------------------------------------------|---------------------------------------------------------------------|-------------|
| protected [StandardReporter](StandardReporter.md) | [self](#self)()                                                     |             |
| protected void                                    | [writeString](#writestring)([Diagnostic](Diagnostic.md) diagnostic) |             |


### Methods inherited from [AbstractReporter](AbstractReporter.md)

errorAt, printStackTrace, getProblemCollector, trace, debug, getDiagnosticCollector, buildDiagnostic, warnAt, errorAt, infoAt, collectsProblems, infoAt, isProblem, errorAt, infoAt, [writeString](#writestring), errorAt, warnAt, error, setDiagnosticCollector, warnAt, outputToConsole, warn, disableSystemOutput, setDisableSystemOutput, error, setDisableFlush, buildDiagnostic, buildDiagnostic, setProblemCollector, errorAt, errorAt, disableFlush, errorAt, report, setPrintStackTrace, info, error, error, buildDiagnostic, setLevel, getStringWriter


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [StandardReporter](StandardReporter.md) __self__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#self)


---

### writeString

<span style="font-family: monospace; font-size: 80%;">protected void __writeString__([Diagnostic](Diagnostic.md) diagnostic)</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#writestring)


---

