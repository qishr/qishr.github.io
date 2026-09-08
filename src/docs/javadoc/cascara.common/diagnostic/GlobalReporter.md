Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Class GlobalReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.diagnostic.AbstractReporter](AbstractReporter.md)<[io.github.qishr.cascara.common.diagnostic.GlobalReporter](GlobalReporter.md)><br/>
                io.github.qishr.cascara.common.diagnostic.GlobalReporter<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __GlobalReporter__<br/>extends [AbstractReporter](AbstractReporter.md)<[GlobalReporter](GlobalReporter.md)>
</span>


## Method Summary

| Modifier and Type                                                                                                                                                                                                 | Method                                                                                                                                                                                                              | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [GlobalReporter](GlobalReporter.md)                                                                                                                                                                     | [self](#self)()                                                                                                                                                                                                     |             |
| public static [GlobalReporter](GlobalReporter.md)                                                                                                                                                                 | [globalInstance](#globalinstance)()                                                                                                                                                                                 |             |
| public static [GlobalReporter](GlobalReporter.md)                                                                                                                                                                 | [forClass](#forclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                          |             |
| public static [GlobalReporter](GlobalReporter.md)                                                                                                                                                                 | [forSource](#forsource)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source)                                                                                        |             |
| public [GlobalReporter](GlobalReporter.md)                                                                                                                                                                        | [setLevel](#setlevel)([Level](Diagnostic.Level.md) level)                                                                                                                                                           |             |
| public [GlobalReporter](GlobalReporter.md)                                                                                                                                                                        | [setDiagnosticConsumer](#setdiagnosticconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)                   |             |
| public [GlobalReporter](GlobalReporter.md)                                                                                                                                                                        | [setProblemConsumer](#setproblemconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)                         |             |
| public [GlobalReporter](GlobalReporter.md)                                                                                                                                                                        | [setSystemOutputEnabled](#setsystemoutputenabled)(boolean b)                                                                                                                                                        |             |
| public [GlobalReporter](GlobalReporter.md)                                                                                                                                                                        | [setFlushEnabled](#setflushenabled)(boolean b)                                                                                                                                                                      |             |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)>                                                                  | [getDiagnosticConsumer](#getdiagnosticconsumer)()                                                                                                                                                                   |             |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)>                                                                  | [getProblemConsumer](#getproblemconsumer)()                                                                                                                                                                         |             |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getLineConsumer](#getlineconsumer)()                                                                                                                                                                               |             |
| protected boolean                                                                                                                                                                                                 | [isSystemOutputEnabled](#issystemoutputenabled)()                                                                                                                                                                   |             |
| protected boolean                                                                                                                                                                                                 | [isFlushEnabled](#isflushenabled)()                                                                                                                                                                                 |             |
| protected boolean                                                                                                                                                                                                 | [isStackTraceEnabled](#isstacktraceenabled)()                                                                                                                                                                       |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                            | [formatMessage](#formatmessage)([Diagnostic](Diagnostic.md) diagnostic, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, int messageLine, boolean useColoring) |             |


### Methods inherited from [AbstractReporter](AbstractReporter.md)

errorAt, trace, setStackTraceEnabled, setPrefixEveryLine, setShowProblemCodes, reportsDebug, debug, buildDiagnostic, warnAt, errorAt, reportsTrace, infoAt, collectsProblems, setSystemErrorEnabled, infoAt, isProblem, errorAt, error, infoAt, errorAt, warnAt, errorAt, error, warnAt, setLineConsumer, warn, displayLine, setAnsiColoringEnabled, logLine, warnAt, buildDiagnostic, buildDiagnostic, errorAt, errorAt, warnAt, errorAt, writeString, report, info, getWriter, getLevel, isSilent, error, buildDiagnostic, errorAt


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [GlobalReporter](GlobalReporter.md) __self__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#self)


---

### globalInstance

<span style="font-family: monospace; font-size: 80%;">public static [GlobalReporter](GlobalReporter.md) __globalInstance__()</span>




---

### forClass

<span style="font-family: monospace; font-size: 80%;">public static [GlobalReporter](GlobalReporter.md) __forClass__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### forSource

<span style="font-family: monospace; font-size: 80%;">public static [GlobalReporter](GlobalReporter.md) __forSource__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source)</span>




---

### setLevel

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](GlobalReporter.md) __setLevel__([Level](Diagnostic.Level.md) level)</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#setlevel)


---

### setDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](GlobalReporter.md) __setDiagnosticConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#setdiagnosticconsumer)


---

### setProblemConsumer

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](GlobalReporter.md) __setProblemConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#setproblemconsumer)


---

### setSystemOutputEnabled

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](GlobalReporter.md) __setSystemOutputEnabled__(boolean b)</span>




---

### setFlushEnabled

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](GlobalReporter.md) __setFlushEnabled__(boolean b)</span>




---

### getDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> __getDiagnosticConsumer__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#getdiagnosticconsumer)


---

### getProblemConsumer

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> __getProblemConsumer__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#getproblemconsumer)


---

### getLineConsumer

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getLineConsumer__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#getlineconsumer)


---

### isSystemOutputEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __isSystemOutputEnabled__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#issystemoutputenabled)


---

### isFlushEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __isFlushEnabled__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#isflushenabled)


---

### isStackTraceEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __isStackTraceEnabled__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#isstacktraceenabled)


---

### formatMessage

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatMessage__([Diagnostic](Diagnostic.md) diagnostic, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, int messageLine, boolean useColoring)</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#formatmessage)


---

