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

| Modifier and Type                                                                                                                                                                                                 | Method                                                                                                                                                                                              | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [GlobalReporter](GlobalReporter.md)                                                                                                                                                                     | [self](#self)()                                                                                                                                                                                     |             |
| public static [GlobalReporter](GlobalReporter.md)                                                                                                                                                                 | [globalInstance](#globalinstance)()                                                                                                                                                                 |             |
| public static [GlobalReporter](GlobalReporter.md)                                                                                                                                                                 | [forClass](#forclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                          |             |
| public static [GlobalReporter](GlobalReporter.md)                                                                                                                                                                 | [forSource](#forsource)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source)                                                                        |             |
| public [GlobalReporter](GlobalReporter.md)                                                                                                                                                                        | [setLevel](#setlevel)([Level](Diagnostic.Level.md) level)                                                                                                                                           |             |
| public [GlobalReporter](GlobalReporter.md)                                                                                                                                                                        | [setDiagnosticCollector](#setdiagnosticcollector)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector) |             |
| public [GlobalReporter](GlobalReporter.md)                                                                                                                                                                        | [setProblemCollector](#setproblemcollector)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)       |             |
| public [GlobalReporter](GlobalReporter.md)                                                                                                                                                                        | [setSystemOutputEnabled](#setsystemoutputenabled)(boolean b)                                                                                                                                        |             |
| public [GlobalReporter](GlobalReporter.md)                                                                                                                                                                        | [setFlushEnabled](#setflushenabled)(boolean b)                                                                                                                                                      |             |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)>                                                                  | [getDiagnosticCollector](#getdiagnosticcollector)()                                                                                                                                                 |             |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)>                                                                  | [getProblemCollector](#getproblemcollector)()                                                                                                                                                       |             |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getStringWriter](#getstringwriter)()                                                                                                                                                               |             |
| protected boolean                                                                                                                                                                                                 | [isSystemOutputEnabled](#issystemoutputenabled)()                                                                                                                                                   |             |
| protected boolean                                                                                                                                                                                                 | [isFlushEnabled](#isflushenabled)()                                                                                                                                                                 |             |
| protected boolean                                                                                                                                                                                                 | [isStackTraceEnabled](#isstacktraceenabled)()                                                                                                                                                       |             |
| protected void                                                                                                                                                                                                    | [writeString](#writestring)([Diagnostic](Diagnostic.md) diagnostic)                                                                                                                                 |             |


### Methods inherited from [AbstractReporter](AbstractReporter.md)

errorAt, trace, setStackTraceEnabled, debug, buildDiagnostic, warnAt, errorAt, infoAt, collectsProblems, setSystemErrorEnabled, infoAt, isProblem, errorAt, infoAt, [writeString](#writestring), errorAt, warnAt, error, warnAt, outputToConsole, warn, error, buildDiagnostic, buildDiagnostic, errorAt, errorAt, errorAt, report, info, getLevel, isSilent, error, error, buildDiagnostic


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

### setDiagnosticCollector

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](GlobalReporter.md) __setDiagnosticCollector__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#setdiagnosticcollector)


---

### setProblemCollector

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](GlobalReporter.md) __setProblemCollector__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#setproblemcollector)


---

### setSystemOutputEnabled

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](GlobalReporter.md) __setSystemOutputEnabled__(boolean b)</span>




---

### setFlushEnabled

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](GlobalReporter.md) __setFlushEnabled__(boolean b)</span>




---

### getDiagnosticCollector

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> __getDiagnosticCollector__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#getdiagnosticcollector)


---

### getProblemCollector

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> __getProblemCollector__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#getproblemcollector)


---

### getStringWriter

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getStringWriter__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#getstringwriter)


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

### writeString

<span style="font-family: monospace; font-size: 80%;">protected void __writeString__([Diagnostic](Diagnostic.md) diagnostic)</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#writestring)


---

