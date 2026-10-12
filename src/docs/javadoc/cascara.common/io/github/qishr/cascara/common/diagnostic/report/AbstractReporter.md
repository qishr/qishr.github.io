Package [io.github.qishr.cascara.common.diagnostic.report](index.md)

# Class AbstractReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.report.AbstractReporter<br/>
<br/>
All Implemented Interfaces:<br/>
    [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)

Direct Known Subtypes:<br/>
    [SilentCollectingReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/SilentCollectingReporter.md), [LocalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/LocalReporter.md), [GlobalReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/GlobalReporter.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractReporter__</span>


## Field Summary

| Modifier and Type              | Field                                       | Description                                                                                                |
|--------------------------------|---------------------------------------------|------------------------------------------------------------------------------------------------------------|
| protected static final ZoneId  | [UTC](#utc)                                 |                                                                                                            |
| protected boolean              | [ansiColoringEnabled](#ansicoloringenabled) |                                                                                                            |
| protected ConsoleLogger        | [consoleLogger](#consolelogger)             |                                                                                                            |
| protected Consumer<Diagnostic> | [diagnosticConsumer](#diagnosticconsumer)   | Consumes diagnostics included in the current Level or more important, with ERROR being the most important. |
| protected boolean              | [flushEnabled](#flushenabled)               |                                                                                                            |
| protected Level                | [level](#level)                             |                                                                                                            |
| protected LineLogger           | [lineLogger](#linelogger)                   |                                                                                                            |
| protected List<Logger>         | [loggers](#loggers)                         |                                                                                                            |
| protected boolean              | [prefixEveryLine](#prefixeveryline)         |                                                                                                            |
| protected Consumer<Diagnostic> | [problemConsumer](#problemconsumer)         | Consumes ERROR, WARN, and INFO diagnostics.                                                                |
| protected Serializer<?>        | [serializer](#serializer)                   |                                                                                                            |
| protected boolean              | [showProblemCodes](#showproblemcodes)       |                                                                                                            |
| protected String               | [source](#source)                           | The simple name of the class that made the report                                                          |
| protected boolean              | [stackTraceEnabled](#stacktraceenabled)     |                                                                                                            |
| protected boolean              | [systemErrorEnabled](#systemerrorenabled)   |                                                                                                            |
| protected boolean              | [systemOutputEnabled](#systemoutputenabled) |                                                                                                            |
| protected ReportWriter[]       | [writers](#writers)                         |                                                                                                            |



## Constructor Summary

| Constructor        | Description |
|--------------------|-------------|
| AbstractReporter() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                               | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                  |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| protected abstract T                                                                                                                                                                                            | [self](#self)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |                                                                                              |
| public T                                                                                                                                                                                                        | [addLogger](#addlogger)([Logger](../../../../../../../io/github/qishr/cascara/common/diagnostic/log/Logger.md) logger)                                                                                                                                                                                                                                                                                                                                                                                                                          |                                                                                              |
| public boolean                                                                                                                                                                                                  | [collectsProblems](#collectsproblems)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Checks whether any active listener or collector is tracking problems.                        |
| public T                                                                                                                                                                                                        | [setLevel](#setlevel)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)                                                                                                                                                                                                                                                                                                                                                                                                                        | Sets the level of output when logging directly to the console.                               |
| public T                                                                                                                                                                                                        | [setLineConsumer](#setlineconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> consumer)                                                                                                                                                                                                                                                                                           |                                                                                              |
| public T                                                                                                                                                                                                        | [setDiagnosticConsumer](#setdiagnosticconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)                                                                                                                                                                                                                                                                                 | Registers a collector to receive all diagnostics processed by this reporter.                 |
| public T                                                                                                                                                                                                        | [setProblemConsumer](#setproblemconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)                                                                                                                                                                                                                                                                                       | Registers a specialized collector to receive only problem-level diagnostics.                 |
| public T                                                                                                                                                                                                        | [setSystemOutputEnabled](#setsystemoutputenabled)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |                                                                                              |
| public T                                                                                                                                                                                                        | [setFlushEnabled](#setflushenabled)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |                                                                                              |
| public T                                                                                                                                                                                                        | [setStackTraceEnabled](#setstacktraceenabled)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |                                                                                              |
| public T                                                                                                                                                                                                        | [setSystemErrorEnabled](#setsystemerrorenabled)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |                                                                                              |
| public T                                                                                                                                                                                                        | [setAnsiColoringEnabled](#setansicoloringenabled)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |                                                                                              |
| public T                                                                                                                                                                                                        | [setPrefixEveryLine](#setprefixeveryline)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |                                                                                              |
| public T                                                                                                                                                                                                        | [setShowProblemCodes](#setshowproblemcodes)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |                                                                                              |
| public [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md)                                                                                                              | [getLevel](#getlevel)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |                                                                                              |
| public boolean                                                                                                                                                                                                  | [isSilent](#issilent)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |                                                                                              |
| public boolean                                                                                                                                                                                                  | [reportsDebug](#reportsdebug)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |                                                                                              |
| public boolean                                                                                                                                                                                                  | [reportsTrace](#reportstrace)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |                                                                                              |
| public [ReportWriter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ReportWriter.md)                                                                                                    | [getWriter](#getwriter)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)                                                                                                                                                                                                                                                                                                                                                                                                                      |                                                                                              |
| public void                                                                                                                                                                                                     | [error](#error)([Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html) e)                                                                                                                                                                                                                                                                                                                                                                                                                           | Reports an Exception                                                                         |
| public void                                                                                                                                                                                                     | [trace](#trace)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                   | Reports a trace message through the reporter.                                                |
| public void                                                                                                                                                                                                     | [debug](#debug)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                   | Reports a debug message through the reporter.                                                |
| public void                                                                                                                                                                                                     | [info](#info)([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                    | Reports an informational message through the reporter.                                       |
| public void                                                                                                                                                                                                     | [warn](#warn)([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                    | Reports a warning message including location information.                                    |
| public void                                                                                                                                                                                                     | [error](#error)([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                  | Reports an error message including location information.                                     |
| public void                                                                                                                                                                                                     | [error](#error)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                        | Reports an error message including location information.                                     |
| public void                                                                                                                                                                                                     | [infoAt](#infoat)(int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                          | Reports an informational message anchored to a resource location by line and column.         |
| public void                                                                                                                                                                                                     | [warnAt](#warnat)(int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                          | Reports a warning anchored to a resource location by line and column.                        |
| public void                                                                                                                                                                                                     | [errorAt](#errorat)(int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                        | Reports an error anchored to a resource location by line and column.                         |
| public void                                                                                                                                                                                                     | [errorAt](#errorat)(int line, int column, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                              | Reports an error anchored to a resource location by line and column.                         |
| public void                                                                                                                                                                                                     | [infoAt](#infoat)(int line, int column, int startOffset, int endOffset, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                          | Reports an informational message anchored to a precise character span within a resource.     |
| public void                                                                                                                                                                                                     | [warnAt](#warnat)(int line, int column, int startOffset, int endOffset, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                          | Reports a warning anchored to a precise character span within a resource.                    |
| public void                                                                                                                                                                                                     | [errorAt](#errorat)(int line, int column, int startOffset, int endOffset, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                        | Reports an error anchored to a precise character span within a resource.                     |
| public void                                                                                                                                                                                                     | [errorAt](#errorat)(int line, int column, int startOffset, int endOffset, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                              | Reports an error anchored to a precise character span within a resource.                     |
| public void                                                                                                                                                                                                     | [infoAt](#infoat)([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                        | Reports an informational message derived from the location attributes of a structural token. |
| public void                                                                                                                                                                                                     | [warnAt](#warnat)([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                        | Reports a warning derived from the location attributes of a structural token.                |
| public void                                                                                                                                                                                                     | [errorAt](#errorat)([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                      | Reports an error derived from the location attributes of a structural token.                 |
| public void                                                                                                                                                                                                     | [errorAt](#errorat)([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                            | Reports an error derived from the location attributes of a structural token.                 |
| public void                                                                                                                                                                                                     | [warnAt](#warnat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                               |                                                                                              |
| public void                                                                                                                                                                                                     | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                             |                                                                                              |
| public void                                                                                                                                                                                                     | [warnAt](#warnat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                             |                                                                                              |
| public void                                                                                                                                                                                                     | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |                                                                                              |
| public void                                                                                                                                                                                                     | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |                                                                                              |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> | [getDiagnosticConsumer](#getdiagnosticconsumer)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |                                                                                              |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> | [getProblemConsumer](#getproblemconsumer)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |                                                                                              |
| protected boolean                                                                                                                                                                                               | [isSystemOutputEnabled](#issystemoutputenabled)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |                                                                                              |
| protected boolean                                                                                                                                                                                               | [isFlushEnabled](#isflushenabled)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |                                                                                              |
| protected boolean                                                                                                                                                                                               | [isStackTraceEnabled](#isstacktraceenabled)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |                                                                                              |
| protected boolean                                                                                                                                                                                               | [isProblem](#isproblem)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)                                                                                                                                                                                                                                                                                                                                                                                                                      |                                                                                              |
| protected void                                                                                                                                                                                                  | [report](#report)([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)                                                                                                                                                                                                                                                                                                                                                                                                                        | Central reporting method.                                                                    |
| protected void                                                                                                                                                                                                  | [reportAnyLevel](#reportanylevel)([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)                                                                                                                                                                                                                                                                                                                                                                                                        |                                                                                              |
| protected void                                                                                                                                                                                                  | [log](#log)([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)                                                                                                                                                                                                                                                                                                                                                                                                                              |                                                                                              |
| protected void                                                                                                                                                                                                  | [logLine](#logline)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine)                                                                                                                                                                                                                                                                                                                    |                                                                                              |



## Field Details

### UTC

<span style="font-family: monospace; font-size: 80%;">protected static final ZoneId __UTC__</span>




---

### ansiColoringEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __ansiColoringEnabled__</span>




---

### consoleLogger

<span style="font-family: monospace; font-size: 80%;">protected ConsoleLogger __consoleLogger__</span>




---

### diagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">protected Consumer<Diagnostic> __diagnosticConsumer__</span>

Consumes diagnostics included in the current Level or more
important, with ERROR being the most important.


---

### flushEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __flushEnabled__</span>




---

### level

<span style="font-family: monospace; font-size: 80%;">protected Level __level__</span>




---

### lineLogger

<span style="font-family: monospace; font-size: 80%;">protected LineLogger __lineLogger__</span>




---

### loggers

<span style="font-family: monospace; font-size: 80%;">protected List<Logger> __loggers__</span>




---

### prefixEveryLine

<span style="font-family: monospace; font-size: 80%;">protected boolean __prefixEveryLine__</span>




---

### problemConsumer

<span style="font-family: monospace; font-size: 80%;">protected Consumer<Diagnostic> __problemConsumer__</span>

Consumes ERROR, WARN, and INFO diagnostics.


---

### serializer

<span style="font-family: monospace; font-size: 80%;">protected Serializer<?> __serializer__</span>




---

### showProblemCodes

<span style="font-family: monospace; font-size: 80%;">protected boolean __showProblemCodes__</span>




---

### source

<span style="font-family: monospace; font-size: 80%;">protected String __source__</span>

The simple name of the class that made the report


---

### stackTraceEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __stackTraceEnabled__</span>




---

### systemErrorEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __systemErrorEnabled__</span>




---

### systemOutputEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __systemOutputEnabled__</span>




---

### writers

<span style="font-family: monospace; font-size: 80%;">protected ReportWriter[] __writers__</span>




---


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected abstract T __self__()</span>




---

### addLogger

<span style="font-family: monospace; font-size: 80%;">public T __addLogger__([Logger](../../../../../../../io/github/qishr/cascara/common/diagnostic/log/Logger.md) logger)</span>




---

### collectsProblems

<span style="font-family: monospace; font-size: 80%;">public boolean __collectsProblems__()</span>

Checks whether any active listener or collector is tracking problems.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### setLevel

<span style="font-family: monospace; font-size: 80%;">public T __setLevel__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)</span>

Sets the level of output when logging directly to the console.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### setLineConsumer

<span style="font-family: monospace; font-size: 80%;">public T __setLineConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> consumer)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### setDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">public T __setDiagnosticConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Registers a collector to receive all diagnostics processed by this reporter.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### setProblemConsumer

<span style="font-family: monospace; font-size: 80%;">public T __setProblemConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> consumer)</span>

Registers a specialized collector to receive only problem-level diagnostics.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### setSystemOutputEnabled

<span style="font-family: monospace; font-size: 80%;">public T __setSystemOutputEnabled__(boolean b)</span>




---

### setFlushEnabled

<span style="font-family: monospace; font-size: 80%;">public T __setFlushEnabled__(boolean b)</span>




---

### setStackTraceEnabled

<span style="font-family: monospace; font-size: 80%;">public T __setStackTraceEnabled__(boolean b)</span>




---

### setSystemErrorEnabled

<span style="font-family: monospace; font-size: 80%;">public T __setSystemErrorEnabled__(boolean b)</span>




---

### setAnsiColoringEnabled

<span style="font-family: monospace; font-size: 80%;">public T __setAnsiColoringEnabled__(boolean b)</span>




---

### setPrefixEveryLine

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public T __setPrefixEveryLine__(boolean b)</span>




---

### setShowProblemCodes

<span style="font-family: monospace; font-size: 80%;">public T __setShowProblemCodes__(boolean b)</span>




---

### getLevel

<span style="font-family: monospace; font-size: 80%;">public [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) __getLevel__()</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### isSilent

<span style="font-family: monospace; font-size: 80%;">public boolean __isSilent__()</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### reportsDebug

<span style="font-family: monospace; font-size: 80%;">public boolean __reportsDebug__()</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### reportsTrace

<span style="font-family: monospace; font-size: 80%;">public boolean __reportsTrace__()</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### getWriter

<span style="font-family: monospace; font-size: 80%;">public [ReportWriter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ReportWriter.md) __getWriter__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">public void __error__([Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html) e)</span>

Reports an Exception

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### trace

<span style="font-family: monospace; font-size: 80%;">public void __trace__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a trace message through the reporter.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### debug

<span style="font-family: monospace; font-size: 80%;">public void __debug__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a debug message through the reporter.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### info

<span style="font-family: monospace; font-size: 80%;">public void __info__([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message through the reporter.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### warn

<span style="font-family: monospace; font-size: 80%;">public void __warn__([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning message including location information.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">public void __error__([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error message including location information.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">public void __error__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error message including location information.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public void __infoAt__(int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message anchored to a resource location by line and column.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__(int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning anchored to a resource location by line and column.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a resource location by line and column.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a resource location by line and column.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public void __infoAt__(int line, int column, int startOffset, int endOffset, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message anchored to a precise character span within a resource.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__(int line, int column, int startOffset, int endOffset, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning anchored to a precise character span within a resource.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, int startOffset, int endOffset, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a precise character span within a resource.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, int startOffset, int endOffset, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error anchored to a precise character span within a resource.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public void __infoAt__([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an informational message derived from the location attributes of a structural token.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports a warning derived from the location attributes of a structural token.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error derived from the location attributes of a structural token.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Reports an error derived from the location attributes of a structural token.

**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### getDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> __getDiagnosticConsumer__()</span>




---

### getProblemConsumer

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> __getProblemConsumer__()</span>




---

### isSystemOutputEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __isSystemOutputEnabled__()</span>




---

### isFlushEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __isFlushEnabled__()</span>




---

### isStackTraceEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __isStackTraceEnabled__()</span>




---

### isProblem

<span style="font-family: monospace; font-size: 80%;">protected boolean __isProblem__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)</span>




---

### report

<span style="font-family: monospace; font-size: 80%;">protected void __report__([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)</span>

Central reporting method.All other rporting methods call this.


---

### reportAnyLevel

<span style="font-family: monospace; font-size: 80%;">protected void __reportAnyLevel__([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)</span>




---

### log

<span style="font-family: monospace; font-size: 80%;">protected void __log__([Diagnostic](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md) diagnostic)</span>




---

### logLine

<span style="font-family: monospace; font-size: 80%;">protected void __logLine__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine)</span>




---

