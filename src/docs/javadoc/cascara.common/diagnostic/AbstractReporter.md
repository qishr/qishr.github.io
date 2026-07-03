Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Class AbstractReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.AbstractReporter<br/>
<br/>
All Implemented Interfaces:<br/>
    [Reporter](Reporter.md)

Direct Known Subtypes:<br/>
    [SilentCollectingReporter](SilentCollectingReporter.md), [GlobalReporter](GlobalReporter.md), [StandardReporter](StandardReporter.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractReporter__</span>


## Field Summary

| Modifier and Type              | Field                                       | Description                                                                                                |
|--------------------------------|---------------------------------------------|------------------------------------------------------------------------------------------------------------|
| protected Consumer<Diagnostic> | [diagnosticCollector](#diagnosticcollector) | Consumes diagnostics included in the current Level or more important, with ERROR being the most important. |
| protected boolean              | [disableFlush](#disableflush)               |                                                                                                            |
| protected boolean              | [disableSystemOutput](#disablesystemoutput) |                                                                                                            |
| protected Level                | [level](#level)                             |                                                                                                            |
| protected boolean              | [printStackTrace](#printstacktrace)         |                                                                                                            |
| protected Consumer<Diagnostic> | [problemCollector](#problemcollector)       | Consumes ERROR, WARN, and INFO diagnostics.                                                                |
| protected String               | [source](#source)                           | The simple name of the class that made the report                                                          |
| protected Consumer<String>     | [stringWriter](#stringwriter)               |                                                                                                            |



## Constructor Summary

| Constructor                                                                                                                                                                                                                      | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| AbstractReporter([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> writer) |             |
| AbstractReporter()                                                                                                                                                                                                               |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                 | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Description                                                                                  |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| protected abstract T                                                                                                                                                                                              | [self](#self)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                                              |
| public boolean                                                                                                                                                                                                    | [collectsProblems](#collectsproblems)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Checks whether any active listener or collector is tracking problems.                        |
| public T                                                                                                                                                                                                          | [setLevel](#setlevel)([Level](Diagnostic.Level.md) level)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | Sets the level of output when logging directly to the console.                               |
| public T                                                                                                                                                                                                          | [setDiagnosticCollector](#setdiagnosticcollector)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)                                                                                                                                                                                                                                                                                                                                                                                            | Registers a collector to receive all diagnostics processed by this reporter.                 |
| public T                                                                                                                                                                                                          | [setProblemCollector](#setproblemcollector)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)                                                                                                                                                                                                                                                                                                                                                                                                  | Registers a specialized collector to receive only problem-level diagnostics.                 |
| public T                                                                                                                                                                                                          | [setDisableSystemOutput](#setdisablesystemoutput)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |                                                                                              |
| public T                                                                                                                                                                                                          | [setDisableFlush](#setdisableflush)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |                                                                                              |
| public T                                                                                                                                                                                                          | [setPrintStackTrace](#setprintstacktrace)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |                                                                                              |
| public void                                                                                                                                                                                                       | [error](#error)([LocalizableException](LocalizableException.md) e)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Reports a [LocalizableException](LocalizableException.md)                                    |
| public void                                                                                                                                                                                                       | [error](#error)([LocalizableRuntimeException](LocalizableRuntimeException.md) e)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Reports a [LocalizableRuntimeException](LocalizableRuntimeException.md)                      |
| public void                                                                                                                                                                                                       | [trace](#trace)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                  | Reports a trace message through the reporter.                                                |
| public void                                                                                                                                                                                                       | [debug](#debug)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                  | Reports a debug message through the reporter.                                                |
| public void                                                                                                                                                                                                       | [info](#info)([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                                                           | Reports an informational message through the reporter.                                       |
| public void                                                                                                                                                                                                       | [warn](#warn)([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                                                           | Reports a warning message including location information.                                    |
| public void                                                                                                                                                                                                       | [error](#error)([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                                                         | Reports an error message including location information.                                     |
| public void                                                                                                                                                                                                       | [error](#error)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                               | Reports an error message including location information.                                     |
| public void                                                                                                                                                                                                       | [infoAt](#infoat)(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                                 | Reports an informational message anchored to a resource location by line and column.         |
| public void                                                                                                                                                                                                       | [warnAt](#warnat)(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                                 | Reports a warning anchored to a resource location by line and column.                        |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                               | Reports an error anchored to a resource location by line and column.                         |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                    |                                                                                              |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)(int line, int column, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                     | Reports an error anchored to a resource location by line and column.                         |
| public void                                                                                                                                                                                                       | [infoAt](#infoat)(int line, int column, int startOffset, int endOffset, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                 | Reports an informational message anchored to a precise character span within a resource.     |
| public void                                                                                                                                                                                                       | [warnAt](#warnat)(int line, int column, int startOffset, int endOffset, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                 | Reports a warning anchored to a precise character span within a resource.                    |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)(int line, int column, int startOffset, int endOffset, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                               | Reports an error anchored to a precise character span within a resource.                     |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)(int line, int column, int startOffset, int endOffset, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                     | Reports an error anchored to a precise character span within a resource.                     |
| public void                                                                                                                                                                                                       | [infoAt](#infoat)([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                | Reports an informational message derived from the location attributes of a structural token. |
| public void                                                                                                                                                                                                       | [warnAt](#warnat)([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                | Reports a warning derived from the location attributes of a structural token.                |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                              | Reports an error derived from the location attributes of a structural token.                 |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)([Token](../lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                    | Reports an error derived from the location attributes of a structural token.                 |
| protected abstract void                                                                                                                                                                                           | [writeString](#writestring)([Diagnostic](Diagnostic.md) diagnostic)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |                                                                                              |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)>                                                                  | [getDiagnosticCollector](#getdiagnosticcollector)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |                                                                                              |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)>                                                                  | [getProblemCollector](#getproblemcollector)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |                                                                                              |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getStringWriter](#getstringwriter)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |                                                                                              |
| protected boolean                                                                                                                                                                                                 | [disableSystemOutput](#disablesystemoutput)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |                                                                                              |
| protected boolean                                                                                                                                                                                                 | [disableFlush](#disableflush)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                                              |
| protected boolean                                                                                                                                                                                                 | [printStackTrace](#printstacktrace)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |                                                                                              |
| protected void                                                                                                                                                                                                    | [report](#report)([Diagnostic](Diagnostic.md) diagnostic)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |                                                                                              |
| protected void                                                                                                                                                                                                    | [writeString](#writestring)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [Level](Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message)                                                                                                                                                                                                                                                                                                                |                                                                                              |
| protected void                                                                                                                                                                                                    | [outputToConsole](#outputtoconsole)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [Level](Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message)                                                                                                                                                                                                                                                                                                        |                                                                                              |
| protected [Diagnostic](Diagnostic.md)                                                                                                                                                                             | [buildDiagnostic](#builddiagnostic)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                     | With message string                                                                          |
| protected [Diagnostic](Diagnostic.md)                                                                                                                                                                             | [buildDiagnostic](#builddiagnostic)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](Diagnostic.Level.md) level, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                  | With diagnostic code, and cause                                                              |
| protected [Diagnostic](Diagnostic.md)                                                                                                                                                                             | [buildDiagnostic](#builddiagnostic)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, int startOffset, int endOffset, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](Diagnostic.Level.md) level, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | With diagnostic code, location, and cause                                                    |
| protected [Diagnostic](Diagnostic.md)                                                                                                                                                                             | [buildDiagnostic](#builddiagnostic)([Token](../lang/token/Token.md) token, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](Diagnostic.Level.md) level, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           | With diagnostic code, token, and cause                                                       |
| protected boolean                                                                                                                                                                                                 | [isProblem](#isproblem)([Level](Diagnostic.Level.md) level)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |                                                                                              |



## Field Details

### diagnosticCollector

<span style="font-family: monospace; font-size: 80%;">protected Consumer<Diagnostic> __diagnosticCollector__</span>

Consumes diagnostics included in the current Level or more
important, with ERROR being the most important.


---

### disableFlush

<span style="font-family: monospace; font-size: 80%;">protected boolean __disableFlush__</span>




---

### disableSystemOutput

<span style="font-family: monospace; font-size: 80%;">protected boolean __disableSystemOutput__</span>




---

### level

<span style="font-family: monospace; font-size: 80%;">protected Level __level__</span>




---

### printStackTrace

<span style="font-family: monospace; font-size: 80%;">protected boolean __printStackTrace__</span>




---

### problemCollector

<span style="font-family: monospace; font-size: 80%;">protected Consumer<Diagnostic> __problemCollector__</span>

Consumes ERROR, WARN, and INFO diagnostics.


---

### source

<span style="font-family: monospace; font-size: 80%;">protected String __source__</span>

The simple name of the class that made the report


---

### stringWriter

<span style="font-family: monospace; font-size: 80%;">protected Consumer<String> __stringWriter__</span>




---


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected abstract T __self__()</span>




---

### collectsProblems

<span style="font-family: monospace; font-size: 80%;">public boolean __collectsProblems__()</span>

Checks whether any active listener or collector is tracking problems.

**Specified By:**

[Reporter](Reporter.md)


---

### setLevel

<span style="font-family: monospace; font-size: 80%;">public T __setLevel__([Level](Diagnostic.Level.md) level)</span>

Sets the level of output when logging directly to the console.

**Specified By:**

[Reporter](Reporter.md)


---

### setDiagnosticCollector

<span style="font-family: monospace; font-size: 80%;">public T __setDiagnosticCollector__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)</span>

Registers a collector to receive all diagnostics processed by this reporter.

**Specified By:**

[Reporter](Reporter.md)


---

### setProblemCollector

<span style="font-family: monospace; font-size: 80%;">public T __setProblemCollector__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)</span>

Registers a specialized collector to receive only problem-level diagnostics.

**Specified By:**

[Reporter](Reporter.md)


---

### setDisableSystemOutput

<span style="font-family: monospace; font-size: 80%;">public T __setDisableSystemOutput__(boolean b)</span>




---

### setDisableFlush

<span style="font-family: monospace; font-size: 80%;">public T __setDisableFlush__(boolean b)</span>




---

### setPrintStackTrace

<span style="font-family: monospace; font-size: 80%;">public T __setPrintStackTrace__(boolean b)</span>




---

### error

<span style="font-family: monospace; font-size: 80%;">public void __error__([LocalizableException](LocalizableException.md) e)</span>

Reports a [LocalizableException](LocalizableException.md)

**Specified By:**

[Reporter](Reporter.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">public void __error__([LocalizableRuntimeException](LocalizableRuntimeException.md) e)</span>

Reports a [LocalizableRuntimeException](LocalizableRuntimeException.md)

**Specified By:**

[Reporter](Reporter.md)


---

### trace

<span style="font-family: monospace; font-size: 80%;">public void __trace__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a trace message through the reporter.

**Specified By:**

[Reporter](Reporter.md)


---

### debug

<span style="font-family: monospace; font-size: 80%;">public void __debug__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a debug message through the reporter.

**Specified By:**

[Reporter](Reporter.md)


---

### info

<span style="font-family: monospace; font-size: 80%;">public void __info__([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message through the reporter.

**Specified By:**

[Reporter](Reporter.md)


---

### warn

<span style="font-family: monospace; font-size: 80%;">public void __warn__([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning message including location information.

**Specified By:**

[Reporter](Reporter.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">public void __error__([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error message including location information.

**Specified By:**

[Reporter](Reporter.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">public void __error__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error message including location information.

**Specified By:**

[Reporter](Reporter.md)


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public void __infoAt__(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message anchored to a resource location by line and column.

**Specified By:**

[Reporter](Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning anchored to a resource location by line and column.

**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a resource location by line and column.

**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a resource location by line and column.

**Specified By:**

[Reporter](Reporter.md)


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public void __infoAt__(int line, int column, int startOffset, int endOffset, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message anchored to a precise character span within a resource.

**Specified By:**

[Reporter](Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__(int line, int column, int startOffset, int endOffset, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning anchored to a precise character span within a resource.

**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, int startOffset, int endOffset, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a precise character span within a resource.

**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, int startOffset, int endOffset, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a precise character span within a resource.

**Specified By:**

[Reporter](Reporter.md)


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public void __infoAt__([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message derived from the location attributes of a structural token.

**Specified By:**

[Reporter](Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning derived from the location attributes of a structural token.

**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error derived from the location attributes of a structural token.

**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([Token](../lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error derived from the location attributes of a structural token.

**Specified By:**

[Reporter](Reporter.md)


---

### writeString

<span style="font-family: monospace; font-size: 80%;">protected abstract void __writeString__([Diagnostic](Diagnostic.md) diagnostic)</span>




---

### getDiagnosticCollector

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> __getDiagnosticCollector__()</span>




---

### getProblemCollector

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> __getProblemCollector__()</span>




---

### getStringWriter

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getStringWriter__()</span>




---

### disableSystemOutput

<span style="font-family: monospace; font-size: 80%;">protected boolean __disableSystemOutput__()</span>




---

### disableFlush

<span style="font-family: monospace; font-size: 80%;">protected boolean __disableFlush__()</span>




---

### printStackTrace

<span style="font-family: monospace; font-size: 80%;">protected boolean __printStackTrace__()</span>




---

### report

<span style="font-family: monospace; font-size: 80%;">protected void __report__([Diagnostic](Diagnostic.md) diagnostic)</span>




---

### writeString

<span style="font-family: monospace; font-size: 80%;">protected void __writeString__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [Level](Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message)</span>




---

### outputToConsole

<span style="font-family: monospace; font-size: 80%;">protected void __outputToConsole__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [Level](Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message)</span>




---

### buildDiagnostic

<span style="font-family: monospace; font-size: 80%;">protected [Diagnostic](Diagnostic.md) __buildDiagnostic__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

With message string


---

### buildDiagnostic

<span style="font-family: monospace; font-size: 80%;">protected [Diagnostic](Diagnostic.md) __buildDiagnostic__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](Diagnostic.Level.md) level, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

With diagnostic code, and cause


---

### buildDiagnostic

<span style="font-family: monospace; font-size: 80%;">protected [Diagnostic](Diagnostic.md) __buildDiagnostic__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, int startOffset, int endOffset, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](Diagnostic.Level.md) level, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

With diagnostic code, location, and cause


---

### buildDiagnostic

<span style="font-family: monospace; font-size: 80%;">protected [Diagnostic](Diagnostic.md) __buildDiagnostic__([Token](../lang/token/Token.md) token, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](Diagnostic.Level.md) level, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

With diagnostic code, token, and cause


---

### isProblem

<span style="font-family: monospace; font-size: 80%;">protected boolean __isProblem__([Level](Diagnostic.Level.md) level)</span>




---

