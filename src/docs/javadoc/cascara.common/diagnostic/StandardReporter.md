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
| public [StandardReporter](StandardReporter.md)    | [setAnsiColoringEnabled](#setansicoloringenabled)(boolean b)        |             |
| protected [StandardReporter](StandardReporter.md) | [self](#self)()                                                     |             |
| protected void                                    | [writeString](#writestring)([Diagnostic](Diagnostic.md) diagnostic) |             |


### Methods inherited from [AbstractReporter](AbstractReporter.md)

errorAt, isSystemOutputEnabled, getProblemCollector, trace, setStackTraceEnabled, debug, getDiagnosticCollector, buildDiagnostic, warnAt, errorAt, infoAt, collectsProblems, setSystemErrorEnabled, infoAt, isProblem, errorAt, infoAt, [writeString](#writestring), errorAt, warnAt, error, setDiagnosticCollector, warnAt, outputToConsole, setFlushEnabled, warn, error, setSystemOutputEnabled, buildDiagnostic, buildDiagnostic, setProblemCollector, errorAt, errorAt, isStackTraceEnabled, errorAt, report, info, isFlushEnabled, getLevel, isSilent, error, error, buildDiagnostic, setLevel, getStringWriter


## Method Details

### setAnsiColoringEnabled

<span style="font-family: monospace; font-size: 80%;">public [StandardReporter](StandardReporter.md) __setAnsiColoringEnabled__(boolean b)</span>




---

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

