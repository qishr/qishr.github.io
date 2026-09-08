Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Class NoOpReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.NoOpReporter<br/>
<br/>
All Implemented Interfaces:<br/>
    [Reporter](Reporter.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __NoOpReporter__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                  | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| NoOpReporter([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> writer) |             |
| NoOpReporter()                                                                                                                                                                                                               |             |



## Method Summary

| Modifier and Type                      | Method                                                                                                                                                                                                                                                                                                                                                                                                          | Description |
|----------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public boolean                         | [collectsProblems](#collectsproblems)()                                                                                                                                                                                                                                                                                                                                                                         |             |
| public [Level](Diagnostic.Level.md)    | [getLevel](#getlevel)()                                                                                                                                                                                                                                                                                                                                                                                         |             |
| public boolean                         | [isSilent](#issilent)()                                                                                                                                                                                                                                                                                                                                                                                         |             |
| public [NoOpReporter](NoOpReporter.md) | [setLevel](#setlevel)([Level](Diagnostic.Level.md) level)                                                                                                                                                                                                                                                                                                                                                       |             |
| public [Reporter](Reporter.md)         | [setLineConsumer](#setlineconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> logger)                                                                                                                                                             |             |
| public [NoOpReporter](NoOpReporter.md) | [setDiagnosticConsumer](#setdiagnosticconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> diagnosticCollector)                                                                                                                                                                                                     |             |
| public [NoOpReporter](NoOpReporter.md) | [setProblemConsumer](#setproblemconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> diagnosticCollector)                                                                                                                                                                                                           |             |
| public [NoOpReporter](NoOpReporter.md) | [setDisableSystemOutput](#setdisablesystemoutput)(boolean b)                                                                                                                                                                                                                                                                                                                                                    |             |
| public [ReportWriter](ReportWriter.md) | [getWriter](#getwriter)([Level](Diagnostic.Level.md) level)                                                                                                                                                                                                                                                                                                                                                     |             |
| public void                            | [error](#error)([Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html) e)                                                                                                                                                                                                                                                                                           |             |
| public void                            | [trace](#trace)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                       |             |
| public void                            | [debug](#debug)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                       |             |
| public void                            | [info](#info)([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                                               |             |
| public void                            | [warn](#warn)([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                                               |             |
| public void                            | [error](#error)([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                                             |             |
| public void                            | [error](#error)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                   |             |
| public void                            | [infoAt](#infoat)(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                     |             |
| public void                            | [warnAt](#warnat)(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                     |             |
| public void                            | [errorAt](#errorat)(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                   |             |
| public void                            | [errorAt](#errorat)(int line, int column, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                         |             |
| public void                            | [infoAt](#infoat)(int line, int column, int start, int end, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                 |             |
| public void                            | [warnAt](#warnat)(int line, int column, int start, int end, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                 |             |
| public void                            | [errorAt](#errorat)(int line, int column, int start, int end, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                               |             |
| public void                            | [errorAt](#errorat)(int line, int column, int start, int end, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                     |             |
| public void                            | [infoAt](#infoat)([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                    |             |
| public void                            | [warnAt](#warnat)([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                    |             |
| public void                            | [errorAt](#errorat)([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                  |             |
| public void                            | [errorAt](#errorat)([Token](../lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                        |             |
| public void                            | [warnAt](#warnat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                          |             |
| public void                            | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                        |             |
| public void                            | [warnAt](#warnat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                         |             |
| public void                            | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                       |             |
| public void                            | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args) |             |
| public boolean                         | [reportsDebug](#reportsdebug)()                                                                                                                                                                                                                                                                                                                                                                                 |             |
| public boolean                         | [reportsTrace](#reportstrace)()                                                                                                                                                                                                                                                                                                                                                                                 |             |



## Method Details

### collectsProblems

<span style="font-family: monospace; font-size: 80%;">public boolean __collectsProblems__()</span>



**Specified By:**

[Reporter](Reporter.md)


---

### getLevel

<span style="font-family: monospace; font-size: 80%;">public [Level](Diagnostic.Level.md) __getLevel__()</span>



**Specified By:**

[Reporter](Reporter.md)


---

### isSilent

<span style="font-family: monospace; font-size: 80%;">public boolean __isSilent__()</span>



**Specified By:**

[Reporter](Reporter.md)


---

### setLevel

<span style="font-family: monospace; font-size: 80%;">public [NoOpReporter](NoOpReporter.md) __setLevel__([Level](Diagnostic.Level.md) level)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### setLineConsumer

<span style="font-family: monospace; font-size: 80%;">public [Reporter](Reporter.md) __setLineConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> logger)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### setDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">public [NoOpReporter](NoOpReporter.md) __setDiagnosticConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> diagnosticCollector)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### setProblemConsumer

<span style="font-family: monospace; font-size: 80%;">public [NoOpReporter](NoOpReporter.md) __setProblemConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> diagnosticCollector)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### setDisableSystemOutput

<span style="font-family: monospace; font-size: 80%;">public [NoOpReporter](NoOpReporter.md) __setDisableSystemOutput__(boolean b)</span>




---

### getWriter

<span style="font-family: monospace; font-size: 80%;">public [ReportWriter](ReportWriter.md) __getWriter__([Level](Diagnostic.Level.md) level)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">public void __error__([Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html) e)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### trace

<span style="font-family: monospace; font-size: 80%;">public void __trace__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### debug

<span style="font-family: monospace; font-size: 80%;">public void __debug__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### info

<span style="font-family: monospace; font-size: 80%;">public void __info__([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### warn

<span style="font-family: monospace; font-size: 80%;">public void __warn__([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">public void __error__([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">public void __error__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public void __infoAt__(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public void __infoAt__(int line, int column, int start, int end, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__(int line, int column, int start, int end, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, int start, int end, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, int start, int end, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public void __infoAt__([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([Token](../lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### reportsDebug

<span style="font-family: monospace; font-size: 80%;">public boolean __reportsDebug__()</span>



**Specified By:**

[Reporter](Reporter.md)


---

### reportsTrace

<span style="font-family: monospace; font-size: 80%;">public boolean __reportsTrace__()</span>



**Specified By:**

[Reporter](Reporter.md)


---

