Package [io.github.qishr.cascara.common.diagnostic.format](index.md)

# Class LogFormatConfig
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.util.Config](../../../../../../../io/github/qishr/cascara/common/util/Config.md)<br/>
                io.github.qishr.cascara.common.diagnostic.format.LogFormatConfig<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __LogFormatConfig__<br/>extends [Config](../../../../../../../io/github/qishr/cascara/common/util/Config.md)
</span>


## Constructor Summary

| Constructor       | Description |
|-------------------|-------------|
| LogFormatConfig() |             |



## Method Summary

| Modifier and Type                                                                                                         | Method                                                                                                                                       | Description |
|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md) | [get](#get)()                                                                                                                                |             |
| public static [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md) | [get](#get)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)                         |             |
| public boolean                                                                                                            | [prefixEveryLine](#prefixeveryline)()                                                                                                        |             |
| public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md)        | [setPrefixEveryLine](#setprefixeveryline)(boolean b)                                                                                         |             |
| public boolean                                                                                                            | [includeStackTrace](#includestacktrace)()                                                                                                    |             |
| public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md)        | [setIncludeStackTrace](#setincludestacktrace)(boolean b)                                                                                     |             |
| public [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md)                        | [getStackTraceLevel](#getstacktracelevel)()                                                                                                  |             |
| public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md)        | [setStackTraceLevel](#setstacktracelevel)([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level) |             |
| public boolean                                                                                                            | [includeProblemCodes](#includeproblemcodes)()                                                                                                |             |
| public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md)        | [setIncludeProblemCodes](#setincludeproblemcodes)(boolean b)                                                                                 |             |
| public boolean                                                                                                            | [incluedTime](#incluedtime)()                                                                                                                |             |
| public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md)        | [setIncludeTime](#setincludetime)(boolean b)                                                                                                 |             |
| public boolean                                                                                                            | [incluedPid](#incluedpid)()                                                                                                                  |             |
| public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md)        | [setIncluedPid](#setincluedpid)(boolean b)                                                                                                   |             |
| public boolean                                                                                                            | [incluedThread](#incluedthread)()                                                                                                            |             |
| public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md)        | [setIncluedThread](#setincluedthread)(boolean b)                                                                                             |             |
| public boolean                                                                                                            | [incluedSource](#incluedsource)()                                                                                                            |             |
| public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md)        | [setIncluedSource](#setincluedsource)(boolean b)                                                                                             |             |
| public boolean                                                                                                            | [useSimpleClassName](#usesimpleclassname)()                                                                                                  |             |
| public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md)        | [setUseSimpleClassName](#setusesimpleclassname)(boolean b)                                                                                   |             |


### Methods inherited from [Config](../../../../../../../io/github/qishr/cascara/common/util/Config.md)

ensureInitialized, get, get, get, getAllSettings, getPropertiesPath, getAppliedSettings, init, setFileSystem, getNamespace


## Method Details

### get

<span style="font-family: monospace; font-size: 80%;">public static [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md) __get__()</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public static [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md) __get__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>




---

### prefixEveryLine

<span style="font-family: monospace; font-size: 80%;">public boolean __prefixEveryLine__()</span>




---

### setPrefixEveryLine

<span style="font-family: monospace; font-size: 80%;">public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md) __setPrefixEveryLine__(boolean b)</span>




---

### includeStackTrace

<span style="font-family: monospace; font-size: 80%;">public boolean __includeStackTrace__()</span>




---

### setIncludeStackTrace

<span style="font-family: monospace; font-size: 80%;">public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md) __setIncludeStackTrace__(boolean b)</span>




---

### getStackTraceLevel

<span style="font-family: monospace; font-size: 80%;">public [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) __getStackTraceLevel__()</span>




---

### setStackTraceLevel

<span style="font-family: monospace; font-size: 80%;">public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md) __setStackTraceLevel__([Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level)</span>




---

### includeProblemCodes

<span style="font-family: monospace; font-size: 80%;">public boolean __includeProblemCodes__()</span>




---

### setIncludeProblemCodes

<span style="font-family: monospace; font-size: 80%;">public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md) __setIncludeProblemCodes__(boolean b)</span>




---

### incluedTime

<span style="font-family: monospace; font-size: 80%;">public boolean __incluedTime__()</span>




---

### setIncludeTime

<span style="font-family: monospace; font-size: 80%;">public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md) __setIncludeTime__(boolean b)</span>




---

### incluedPid

<span style="font-family: monospace; font-size: 80%;">public boolean __incluedPid__()</span>




---

### setIncluedPid

<span style="font-family: monospace; font-size: 80%;">public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md) __setIncluedPid__(boolean b)</span>




---

### incluedThread

<span style="font-family: monospace; font-size: 80%;">public boolean __incluedThread__()</span>




---

### setIncluedThread

<span style="font-family: monospace; font-size: 80%;">public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md) __setIncluedThread__(boolean b)</span>




---

### incluedSource

<span style="font-family: monospace; font-size: 80%;">public boolean __incluedSource__()</span>




---

### setIncluedSource

<span style="font-family: monospace; font-size: 80%;">public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md) __setIncluedSource__(boolean b)</span>




---

### useSimpleClassName

<span style="font-family: monospace; font-size: 80%;">public boolean __useSimpleClassName__()</span>




---

### setUseSimpleClassName

<span style="font-family: monospace; font-size: 80%;">public [LogFormatConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md) __setUseSimpleClassName__(boolean b)</span>




---

