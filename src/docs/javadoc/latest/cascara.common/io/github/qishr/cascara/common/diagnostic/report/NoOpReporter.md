Package [io.github.qishr.cascara.common.diagnostic.report](index.md)

# Class NoOpReporter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.report.NoOpReporter<br/>
<br/>
All Implemented Interfaces:<br/>
    [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __NoOpReporter__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                  | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| NoOpReporter([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> writer) |             |
| NoOpReporter()                                                                                                                                                                                                               |             |



## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description |
|--------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public boolean                                                                                               | [collectsProblems](#collectsproblems)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |             |
| public [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md)           | [getLevel](#getlevel)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |             |
| public boolean                                                                                               | [isSilent](#issilent)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |             |
| public [NoOpReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/NoOpReporter.md) | [setLevel](#setlevel)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)                                                                                                                                                                                                                                                                                                                                                                                                        |             |
| public [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)         | [setLineConsumer](#setlineconsumer)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> logger)                                                                                                                                                                                                                                                                             |             |
| public [NoOpReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/NoOpReporter.md) | [setDisableSystemOutput](#setdisablesystemoutput)(boolean b)                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |             |
| public [ReportWriter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ReportWriter.md) | [getWriter](#getwriter)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)                                                                                                                                                                                                                                                                                                                                                                                                      |             |
| public void                                                                                                  | [warn](#warn)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) exception)                                                                                                                                                                                                                                                                                                                                                                                                     |             |
| public void                                                                                                  | [error](#error)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) e)                                                                                                                                                                                                                                                                                                                                                                                                           |             |
| public void                                                                                                  | [trace](#trace)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                                                                                                       |             |
| public void                                                                                                  | [debug](#debug)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                                                                                                       |             |
| public void                                                                                                  | [info](#info)([LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                                                                                                |             |
| public void                                                                                                  | [warn](#warn)([LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                                                                                                |             |
| public void                                                                                                  | [error](#error)([LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                                                                                              |             |
| public void                                                                                                  | [error](#error)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                    |             |
| public void                                                                                                  | [infoAt](#infoat)(int line, int column, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                                                                      |             |
| public void                                                                                                  | [warnAt](#warnat)(int line, int column, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                                                                      |             |
| public void                                                                                                  | [errorAt](#errorat)(int line, int column, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                                                                    |             |
| public void                                                                                                  | [errorAt](#errorat)(int line, int column, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                          |             |
| public void                                                                                                  | [infoAt](#infoat)(int line, int column, int start, int end, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                                                  |             |
| public void                                                                                                  | [warnAt](#warnat)(int line, int column, int start, int end, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                                                  |             |
| public void                                                                                                  | [errorAt](#errorat)(int line, int column, int start, int end, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                                                                |             |
| public void                                                                                                  | [errorAt](#errorat)(int line, int column, int start, int end, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                      |             |
| public void                                                                                                  | [infoAt](#infoat)([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                    |             |
| public void                                                                                                  | [warnAt](#warnat)([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                    |             |
| public void                                                                                                  | [errorAt](#errorat)([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                                                  |             |
| public void                                                                                                  | [errorAt](#errorat)([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                        |             |
| public void                                                                                                  | [warnAt](#warnat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                           |             |
| public void                                                                                                  | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                                                         |             |
| public void                                                                                                  | [warnAt](#warnat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                         |             |
| public void                                                                                                  | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                       |             |
| public void                                                                                                  | [errorAt](#errorat)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args) |             |
| public boolean                                                                                               | [reportsDebug](#reportsdebug)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |             |
| public boolean                                                                                               | [reportsTrace](#reportstrace)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |             |



## Method Details

### collectsProblems

<span style="font-family: monospace; font-size: 80%;">public boolean __collectsProblems__()</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


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

### setLevel

<span style="font-family: monospace; font-size: 80%;">public [NoOpReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/NoOpReporter.md) __setLevel__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### setLineConsumer

<span style="font-family: monospace; font-size: 80%;">public [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) __setLineConsumer__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> logger)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### setDisableSystemOutput

<span style="font-family: monospace; font-size: 80%;">public [NoOpReporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/NoOpReporter.md) __setDisableSystemOutput__(boolean b)</span>




---

### getWriter

<span style="font-family: monospace; font-size: 80%;">public [ReportWriter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ReportWriter.md) __getWriter__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### warn

<span style="font-family: monospace; font-size: 80%;">public void __warn__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) exception)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">public void __error__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) e)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### trace

<span style="font-family: monospace; font-size: 80%;">public void __trace__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### debug

<span style="font-family: monospace; font-size: 80%;">public void __debug__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### info

<span style="font-family: monospace; font-size: 80%;">public void __info__([LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### warn

<span style="font-family: monospace; font-size: 80%;">public void __warn__([LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">public void __error__([LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">public void __error__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public void __infoAt__(int line, int column, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__(int line, int column, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public void __infoAt__(int line, int column, int start, int end, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__(int line, int column, int start, int end, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, int start, int end, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__(int line, int column, int start, int end, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### infoAt

<span style="font-family: monospace; font-size: 80%;">public void __infoAt__([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### warnAt

<span style="font-family: monospace; font-size: 80%;">public void __warnAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md)


---

### errorAt

<span style="font-family: monospace; font-size: 80%;">public void __errorAt__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Token](../../../../../../../io/github/qishr/cascara/common/lang/token/Token.md) token, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



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

