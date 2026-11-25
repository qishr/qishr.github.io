Package [io.github.qishr.cascara.common.diagnostic.report](index.md)

# Interface DiagnosticReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.report.DiagnosticReporter<br/>
<br/>
All Implemented Interfaces:<br/>
    [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)

All Known Implementing Classes:<br/>
    [SilentCollectingReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/SilentCollectingReporter.md), [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md), [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __DiagnosticReporter__</span>


## Method Summary

| Modifier and Type                                                                                             | Method                                                                                                                                                                                                                                                                | Description                                                                 |
|---------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------|
| public static [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)   | [forClass](#forclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                                            | Gets a `GlobalReporter` instance for the specifie class.                    |
| public abstract [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) | [setLevel](#setlevel)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)                                                                                                                                              | Sets the level of output when logging directly to the console.              |
| public abstract [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) | [setLineConsumer](#setlineconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> logger)                   |                                                                             |
| public abstract [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) | [addDiagnosticConsumer](#adddiagnosticconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)       | Registers a consumer to receive all diagnostics processed by this reporter. |
| public abstract [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) | [removeDiagnosticConsumer](#removediagnosticconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer) | Unregisters a consumer of diagnostic reports.                               |
| public abstract [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) | [setProblemConsumer](#setproblemconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)             | Registers a consumer to receive only problem-level diagnostics.             |



## Method Details

### forClass

<span style="font-family: monospace; font-size: 80%;">public static [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) __forClass__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>

Gets a `GlobalReporter` instance for the specifie class.

**Parameters:**

`clazz` - the class to get a `GlobalReporter` instance for.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### setLevel

<span style="font-family: monospace; font-size: 80%;">public abstract [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) __setLevel__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)</span>

Sets the level of output when logging directly to the console.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### setLineConsumer

<span style="font-family: monospace; font-size: 80%;">public abstract [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) __setLineConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> logger)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### addDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">public abstract [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) __addDiagnosticConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Registers a consumer to receive all diagnostics processed by this reporter.This includes debugging info, trace states, warnings, and error diagnostics.

**Parameters:**

`consumer` - The consumer that processes each produced [Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md).


---

### removeDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">public abstract [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) __removeDiagnosticConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Unregisters a consumer of diagnostic reports.

**Parameters:**

`consumer` - The consumer that processes each produced [Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md).


---

### setProblemConsumer

<span style="font-family: monospace; font-size: 80%;">public abstract [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) __setProblemConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Registers a consumer to receive only problem-level diagnostics.This collector is filtered to intercept only `Level.WARN` and `Level.ERROR` items.

**Parameters:**

`consumer` - The consumer that processes problem [Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) objects.


---

