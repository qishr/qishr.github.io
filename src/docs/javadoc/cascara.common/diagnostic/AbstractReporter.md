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

| Modifier and Type               | Field                                           | Description                                                                                                |
|---------------------------------|-------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| protected static final boolean  | [CAN_USE_ANSI_COLORING](#can_use_ansi_coloring) |                                                                                                            |
| protected boolean               | [ansiColoringEnabled](#ansicoloringenabled)     |                                                                                                            |
| protected Consumer<Diagnostic>  | [diagnosticConsumer](#diagnosticconsumer)       | Consumes diagnostics included in the current Level or more important, with ERROR being the most important. |
| protected boolean               | [flushEnabled](#flushenabled)                   |                                                                                                            |
| protected Level                 | [level](#level)                                 |                                                                                                            |
| protected static final String[] | [levelColors](#levelcolors)                     |                                                                                                            |
| protected Consumer<String>      | [lineConsumer](#lineconsumer)                   | Consumes every line of diagnostic output as a String.                                                      |
| protected boolean               | [prefixEveryLine](#prefixeveryline)             |                                                                                                            |
| protected Consumer<Diagnostic>  | [problemConsumer](#problemconsumer)             | Consumes ERROR, WARN, and INFO diagnostics.                                                                |
| protected boolean               | [showProblemCodes](#showproblemcodes)           |                                                                                                            |
| protected String                | [source](#source)                               | The simple name of the class that made the report                                                          |
| protected boolean               | [stackTraceEnabled](#stacktraceenabled)         |                                                                                                            |
| protected boolean               | [systemErrorEnabled](#systemerrorenabled)       |                                                                                                            |
| protected boolean               | [systemOutputEnabled](#systemoutputenabled)     |                                                                                                            |
| protected ReportWriter[]        | [writers](#writers)                             |                                                                                                            |



## Constructor Summary

| Constructor                                                                                                                                                                                                                      | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| AbstractReporter()                                                                                                                                                                                                               |             |
| AbstractReporter([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> logger) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                 | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Description                                                                                  |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| protected abstract T                                                                                                                                                                                              | [self](#self)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                                              |
| public boolean                                                                                                                                                                                                    | [collectsProblems](#collectsproblems)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Checks whether any active listener or collector is tracking problems.                        |
| public T                                                                                                                                                                                                          | [setLevel](#setlevel)([Level](Diagnostic.Level.md) level)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | Sets the level of output when logging directly to the console.                               |
| public T                                                                                                                                                                                                          | [setLineConsumer](#setlineconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> logger)                                                                                                                                                                                                                                                                                                                                            |                                                                                              |
| public T                                                                                                                                                                                                          | [setDiagnosticConsumer](#setdiagnosticconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)                                                                                                                                                                                                                                                                                                                                                                                              | Registers a collector to receive all diagnostics processed by this reporter.                 |
| public T                                                                                                                                                                                                          | [setProblemConsumer](#setproblemconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)                                                                                                                                                                                                                                                                                                                                                                                                    | Registers a specialized collector to receive only problem-level diagnostics.                 |
| public T                                                                                                                                                                                                          | [setSystemOutputEnabled](#setsystemoutputenabled)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |                                                                                              |
| public T                                                                                                                                                                                                          | [setFlushEnabled](#setflushenabled)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |                                                                                              |
| public T                                                                                                                                                                                                          | [setStackTraceEnabled](#setstacktraceenabled)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |                                                                                              |
| public T                                                                                                                                                                                                          | [setSystemErrorEnabled](#setsystemerrorenabled)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |                                                                                              |
| public T                                                                                                                                                                                                          | [setAnsiColoringEnabled](#setansicoloringenabled)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |                                                                                              |
| public T                                                                                                                                                                                                          | [setPrefixEveryLine](#setprefixeveryline)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |                                                                                              |
| public T                                                                                                                                                                                                          | [setShowProblemCodes](#setshowproblemcodes)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |                                                                                              |
| public [Level](Diagnostic.Level.md)                                                                                                                                                                               | [getLevel](#getlevel)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |                                                                                              |
| public boolean                                                                                                                                                                                                    | [isSilent](#issilent)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |                                                                                              |
| public [ReportWriter](ReportWriter.md)                                                                                                                                                                            | [getWriter](#getwriter)([Level](Diagnostic.Level.md) level)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |                                                                                              |
| public void                                                                                                                                                                                                       | [error](#error)([Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html) e)                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Reports an Exception                                                                         |
| public void                                                                                                                                                                                                       | [trace](#trace)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                  | Reports a trace message through the reporter.                                                |
| public void                                                                                                                                                                                                       | [debug](#debug)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                  | Reports a debug message through the reporter.                                                |
| public void                                                                                                                                                                                                       | [info](#info)([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                                                           | Reports an informational message through the reporter.                                       |
| public void                                                                                                                                                                                                       | [warn](#warn)([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                                                           | Reports a warning message including location information.                                    |
| public void                                                                                                                                                                                                       | [error](#error)([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                                                         | Reports an error message including location information.                                     |
| public void                                                                                                                                                                                                       | [error](#error)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                               | Reports an error message including location information.                                     |
| public void                                                                                                                                                                                                       | [infoAt](#infoat)(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                                 | Reports an informational message anchored to a resource location by line and column.         |
| public void                                                                                                                                                                                                       | [warnAt](#warnat)(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                                 | Reports a warning anchored to a resource location by line and column.                        |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)(int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                               | Reports an error anchored to a resource location by line and column.                         |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)(int line, int column, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                     | Reports an error anchored to a resource location by line and column.                         |
| public void                                                                                                                                                                                                       | [infoAt](#infoat)(int line, int column, int startOffset, int endOffset, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                 | Reports an informational message anchored to a precise character span within a resource.     |
| public void                                                                                                                                                                                                       | [warnAt](#warnat)(int line, int column, int startOffset, int endOffset, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                 | Reports a warning anchored to a precise character span within a resource.                    |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)(int line, int column, int startOffset, int endOffset, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                               | Reports an error anchored to a precise character span within a resource.                     |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)(int line, int column, int startOffset, int endOffset, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                     | Reports an error anchored to a precise character span within a resource.                     |
| public void                                                                                                                                                                                                       | [infoAt](#infoat)([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                | Reports an informational message derived from the location attributes of a structural token. |
| public void                                                                                                                                                                                                       | [warnAt](#warnat)([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                                | Reports a warning derived from the location attributes of a structural token.                |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)([Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                                                                                              | Reports an error derived from the location attributes of a structural token.                 |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)([Token](../lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                    | Reports an error derived from the location attributes of a structural token.                 |
| public void                                                                                                                                                                                                       | [warnAt](#warnat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                      |                                                                                              |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                                    |                                                                                              |
| public void                                                                                                                                                                                                       | [warnAt](#warnat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                     |                                                                                              |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                                                                                                   |                                                                                              |
| public void                                                                                                                                                                                                       | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                             |                                                                                              |
| protected abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                   | [formatMessage](#formatmessage)([Diagnostic](Diagnostic.md) diagnostic, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) line, int lineNumber, boolean ansiColoring)                                                                                                                                                                                                                                                                                                                                                                               |                                                                                              |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)>                                                                  | [getDiagnosticConsumer](#getdiagnosticconsumer)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |                                                                                              |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)>                                                                  | [getProblemConsumer](#getproblemconsumer)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |                                                                                              |
| protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getLineConsumer](#getlineconsumer)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |                                                                                              |
| protected boolean                                                                                                                                                                                                 | [isSystemOutputEnabled](#issystemoutputenabled)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |                                                                                              |
| protected boolean                                                                                                                                                                                                 | [isFlushEnabled](#isflushenabled)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |                                                                                              |
| protected boolean                                                                                                                                                                                                 | [isStackTraceEnabled](#isstacktraceenabled)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |                                                                                              |
| protected void                                                                                                                                                                                                    | [report](#report)([Diagnostic](Diagnostic.md) diagnostic)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |                                                                                              |
| protected void                                                                                                                                                                                                    | [writeString](#writestring)([Diagnostic](Diagnostic.md) diagnostic)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |                                                                                              |
| protected void                                                                                                                                                                                                    | [logLine](#logline)([Level](Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine, int msgLineNumber)                                                                                                                                                                                                                                                                                                                                                                                                               |                                                                                              |
| protected void                                                                                                                                                                                                    | [displayLine](#displayline)([Level](Diagnostic.Level.md) diagnosticLevel, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine, int msgLineNumber)                                                                                                                                                                                                                                                                                                                                                                                             |                                                                                              |
| protected [Diagnostic](Diagnostic.md)                                                                                                                                                                             | [buildDiagnostic](#builddiagnostic)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                                                                     | With message string                                                                          |
| protected [Diagnostic](Diagnostic.md)                                                                                                                                                                             | [buildDiagnostic](#builddiagnostic)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](Diagnostic.Level.md) level, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                                  | With diagnostic code, and cause                                                              |
| protected [Diagnostic](Diagnostic.md)                                                                                                                                                                             | [buildDiagnostic](#builddiagnostic)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, int startOffset, int endOffset, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](Diagnostic.Level.md) level, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | With diagnostic code, location, and cause                                                    |
| protected [Diagnostic](Diagnostic.md)                                                                                                                                                                             | [buildDiagnostic](#builddiagnostic)([Token](../lang/token/Token.md) token, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source, [Level](Diagnostic.Level.md) level, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           | With diagnostic code, token, and cause                                                       |
| protected boolean                                                                                                                                                                                                 | [isProblem](#isproblem)([Level](Diagnostic.Level.md) level)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |                                                                                              |
| public boolean                                                                                                                                                                                                    | [reportsDebug](#reportsdebug)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                                              |
| public boolean                                                                                                                                                                                                    | [reportsTrace](#reportstrace)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                                              |



## Field Details

### CAN_USE_ANSI_COLORING

<span style="font-family: monospace; font-size: 80%;">protected static final boolean __CAN_USE_ANSI_COLORING__</span>




---

### ansiColoringEnabled

<span style="font-family: monospace; font-size: 80%;">protected boolean __ansiColoringEnabled__</span>




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

### levelColors

<span style="font-family: monospace; font-size: 80%;">protected static final String[] __levelColors__</span>




---

### lineConsumer

<span style="font-family: monospace; font-size: 80%;">protected Consumer<String> __lineConsumer__</span>

Consumes every line of diagnostic output as a String.


---

### prefixEveryLine

<span style="font-family: monospace; font-size: 80%;">protected boolean __prefixEveryLine__</span>




---

### problemConsumer

<span style="font-family: monospace; font-size: 80%;">protected Consumer<Diagnostic> __problemConsumer__</span>

Consumes ERROR, WARN, and INFO diagnostics.


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

### setLineConsumer

<span style="font-family: monospace; font-size: 80%;">public T __setLineConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> logger)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### setDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">public T __setDiagnosticConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)</span>

Registers a collector to receive all diagnostics processed by this reporter.

**Specified By:**

[Reporter](Reporter.md)


---

### setProblemConsumer

<span style="font-family: monospace; font-size: 80%;">public T __setProblemConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> collector)</span>

Registers a specialized collector to receive only problem-level diagnostics.

**Specified By:**

[Reporter](Reporter.md)


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

<span style="font-family: monospace; font-size: 80%;">public [Level](Diagnostic.Level.md) __getLevel__()</span>



**Specified By:**

[Reporter](Reporter.md)


---

### isSilent

<span style="font-family: monospace; font-size: 80%;">public boolean __isSilent__()</span>



**Specified By:**

[Reporter](Reporter.md)


---

### getWriter

<span style="font-family: monospace; font-size: 80%;">public [ReportWriter](ReportWriter.md) __getWriter__([Level](Diagnostic.Level.md) level)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">public void __error__([Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html) e)</span>

Reports an Exception

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

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../lang/token/Token.md) token, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>



**Specified By:**

[Reporter](Reporter.md)


---

### formatMessage

<span style="font-family: monospace; font-size: 80%;">protected abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatMessage__([Diagnostic](Diagnostic.md) diagnostic, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) line, int lineNumber, boolean ansiColoring)</span>




---

### getDiagnosticConsumer

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> __getDiagnosticConsumer__()</span>




---

### getProblemConsumer

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Diagnostic](Diagnostic.md)> __getProblemConsumer__()</span>




---

### getLineConsumer

<span style="font-family: monospace; font-size: 80%;">protected [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getLineConsumer__()</span>




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

### report

<span style="font-family: monospace; font-size: 80%;">protected void __report__([Diagnostic](Diagnostic.md) diagnostic)</span>




---

### writeString

<span style="font-family: monospace; font-size: 80%;">protected void __writeString__([Diagnostic](Diagnostic.md) diagnostic)</span>




---

### logLine

<span style="font-family: monospace; font-size: 80%;">protected void __logLine__([Level](Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine, int msgLineNumber)</span>




---

### displayLine

<span style="font-family: monospace; font-size: 80%;">protected void __displayLine__([Level](Diagnostic.Level.md) diagnosticLevel, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msgLine, int msgLineNumber)</span>




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

