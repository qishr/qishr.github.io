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
| public [GlobalReporter](GlobalReporter.md)                                                                                                                                                                        | [setDisableSystemOutput](#setdisablesystemoutput)(boolean b)                                                                                                                                        |             |
| public [GlobalReporter](GlobalReporter.md)                                                                                                                                                                        | [setDisableFlush](#setdisableflush)(boolean b)                                                                                                                                                      |             |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)>                                                                  | [getDiagnosticCollector](#getdiagnosticcollector)()                                                                                                                                                 |             |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)>                                                                  | [getProblemCollector](#getproblemcollector)()                                                                                                                                                       |             |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getStringWriter](#getstringwriter)()                                                                                                                                                               |             |
| protected boolean                                                                                                                                                                                                 | [disableSystemOutput](#disablesystemoutput)()                                                                                                                                                       |             |
| protected boolean                                                                                                                                                                                                 | [disableFlush](#disableflush)()                                                                                                                                                                     |             |
| protected boolean                                                                                                                                                                                                 | [printStackTrace](#printstacktrace)()                                                                                                                                                               |             |
| protected void                                                                                                                                                                                                    | [writeString](#writestring)([Diagnostic](Diagnostic.md) diagnostic)                                                                                                                                 |             |


### Methods inherited from [AbstractReporter](AbstractReporter.md)

errorAt, trace, debug, buildDiagnostic, warnAt, errorAt, infoAt, collectsProblems, infoAt, errorAt, infoAt, [writeString](#writestring), warnAt, error, warnAt, outputToConsole, warn, error, buildDiagnostic, buildDiagnostic, errorAt, errorAt, errorAt, report, setPrintStackTrace, info, error, error, buildDiagnostic


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

### setDisableSystemOutput

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](GlobalReporter.md) __setDisableSystemOutput__(boolean b)</span>




---

### setDisableFlush

<span style="font-family: monospace; font-size: 80%;">public [GlobalReporter](GlobalReporter.md) __setDisableFlush__(boolean b)</span>




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

### disableSystemOutput

<span style="font-family: monospace; font-size: 80%;">protected boolean __disableSystemOutput__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#disablesystemoutput)


---

### disableFlush

<span style="font-family: monospace; font-size: 80%;">protected boolean __disableFlush__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#disableflush)


---

### printStackTrace

<span style="font-family: monospace; font-size: 80%;">protected boolean __printStackTrace__()</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#printstacktrace)


---

### writeString

<span style="font-family: monospace; font-size: 80%;">protected void __writeString__([Diagnostic](Diagnostic.md) diagnostic)</span>



**Overrides:**

[AbstractReporter](../cascara.common/diagnostic/AbstractReporter.md#writestring)


---

