Package [io.github.qishr.cascara.common.diagnostic.report](index.md)

# Class LocalReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.diagnostic.report.AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)<[io.github.qishr.cascara.common.diagnostic.report.LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md)><br/>
                io.github.qishr.cascara.common.diagnostic.report.LocalReporter<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __LocalReporter__<br/>extends [AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)<[LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md)>
</span>


## Constructor Summary

| Constructor     | Description |
|-----------------|-------------|
| LocalReporter() |             |



## Method Summary

| Modifier and Type                                                                                                 | Method                                        | Description |
|-------------------------------------------------------------------------------------------------------------------|-----------------------------------------------|-------------|
| protected [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md) | [self](#self)()                               |             |
| protected [FormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/FormatConfig.md)   | [defaultFormatConfig](#defaultformatconfig)() |             |


### Methods inherited from [AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)

setStackTraceEnabled, setPrefixEveryLine, reportsDebug, reportsTrace, error, infoAt, warnAt, isProblem, addLogger, isImmediateFlushEnabled, errorAt, logLine, reportAnyLevel, warn, warnAt, getDiagnosticConsumers, report, getLevel, infoAt, isSilent, isSystemOutputEnabled, errorAt, trace, setShowProblemCodes, removeDiagnosticConsumer, debug, collectsProblems, setSystemErrorEnabled, warnAt, info, errorAt, errorAt, setProblemConsumer, infoAt, errorAt, warnAt, setLineConsumer, error, setImmediateFlushEnabled, errorAt, setAnsiColoringEnabled, errorAt, getProblemConsumer, setSystemOutputEnabled, warnAt, warn, errorAt, addDiagnosticConsumer, getWriter, errorAt, log, setLevel, error


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md) __self__()</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#self)


---

### defaultFormatConfig

<span style="font-family: monospace; font-size: 80%;">protected [FormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/FormatConfig.md) __defaultFormatConfig__()</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#defaultformatconfig)


---

