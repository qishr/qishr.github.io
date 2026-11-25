Package [io.github.qishr.cascara.common.diagnostic.report](index.md)

# Class ClassReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.diagnostic.report.AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)<[io.github.qishr.cascara.common.diagnostic.report.ClassReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md)><br/>
                io.github.qishr.cascara.common.diagnostic.report.ClassReporter<br/>
<br/>
Direct Known Subtypes:<br/>
    [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __ClassReporter__<br/>extends [AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)<[ClassReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md)>
</span>


## Method Summary

| Modifier and Type                                                                                                 | Method                                                                                                                   | Description                                                    |
|-------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------|
| protected [ClassReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md) | [self](#self)()                                                                                                          |                                                                |
| public [ClassReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md)    | [setLevel](#setlevel)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level) | Sets the level of output when logging directly to the console. |
| public void                                                                                                       | [report](#report)([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic) | Central reporting method.                                      |
| public boolean                                                                                                    | [collectsProblems](#collectsproblems)()                                                                                  |                                                                |


### Methods inherited from [AbstractReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md)

trace, reportsDebug, debug, reportsTrace, warnAt, error, warnAt, isProblem, addLogger, errorAt, errorAt, logLine, infoAt, reportAnyLevel, errorAt, warnAt, setLineConsumer, infoAt, error, errorAt, errorAt, warn, errorAt, assertApiOverrideEnabled, errorAt, errorAt, warnAt, infoAt, isConsoleOutputEnabled, getWriter, warn, getLevel, errorAt, log, isSilent, error, info, warnAt


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [ClassReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md) __self__()</span>



**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#self)


---

### setLevel

<span style="font-family: monospace; font-size: 80%;">public [ClassReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ClassReporter.md) __setLevel__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)</span>

Sets the level of output when logging directly to the console.

**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#setlevel)


---

### report

<span style="font-family: monospace; font-size: 80%;">public void __report__([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)</span>

Central reporting method.All other reporting methods call this.

**Overrides:**

[AbstractReporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/AbstractReporter.md#report)


---

### collectsProblems

<span style="font-family: monospace; font-size: 80%;">public boolean __collectsProblems__()</span>




---

