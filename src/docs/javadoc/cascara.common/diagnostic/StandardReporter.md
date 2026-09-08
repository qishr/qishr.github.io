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

| Modifier and Type                                                                                      | Method                                                                                                                                                                                                             | Description |
|--------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [StandardReporter](StandardReporter.md)                                                      | [self](#self)()                                                                                                                                                                                                    |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [formatMessage](#formatmessage)([Diagnostic](Diagnostic.md) diagnostic, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine, int msgLineNumber, boolean colorize) |             |


### Methods inherited from [AbstractReporter](AbstractReporter.md)

errorAt, setStackTraceEnabled, setPrefixEveryLine, reportsDebug, buildDiagnostic, reportsTrace, infoAt, isProblem, errorAt, error, errorAt, warnAt, warnAt, setFlushEnabled, warn, displayLine, logLine, buildDiagnostic, errorAt, warnAt, isStackTraceEnabled, errorAt, report, setDiagnosticConsumer, info, getLevel, isSilent, isSystemOutputEnabled, trace, setShowProblemCodes, debug, warnAt, errorAt, infoAt, collectsProblems, setSystemErrorEnabled, infoAt, errorAt, setProblemConsumer, error, getLineConsumer, setLineConsumer, setAnsiColoringEnabled, warnAt, getProblemConsumer, setSystemOutputEnabled, buildDiagnostic, errorAt, writeString, isFlushEnabled, getWriter, getDiagnosticConsumer, error, buildDiagnostic, errorAt, setLevel


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [StandardReporter](StandardReporter.md) __self__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#self)


---

### formatMessage

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatMessage__([Diagnostic](Diagnostic.md) diagnostic, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine, int msgLineNumber, boolean colorize)</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#formatmessage)


---

