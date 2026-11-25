Package [io.github.qishr.cascara.common.exec](index.md)

# Class IsolatedExecutor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.exec.IsolatedExecutor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __IsolatedExecutor__</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                         | Description |
|-------------------|-----------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.exec.IsolatedExecutor.Response](IsolatedExecutor.Response.md) |             |



## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | Description                                                                                    |
|--------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------|
| public static [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md)  | [forTask](#fortask)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [AbstractExecutionTask](../../../../../../io/github/qishr/cascara/common/exec/AbstractExecutionTask.md)<?, ?>> task, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> response)                                                                                                                                                                                        |                                                                                                |
| public static [Response](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.Response.md) | [run](#run)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [AbstractExecutionTask](../../../../../../io/github/qishr/cascara/common/exec/AbstractExecutionTask.md)<?, ?>> task, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> response, [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) jvmConfig) |                                                                                                |
| public [Serializer](../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)           | [getSerializer](#getserializer)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |                                                                                                |
| public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md)                       | [getJvmConfig](#getjvmconfig)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |                                                                                                |
| public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md)         | [setJvmConfig](#setjvmconfig)([JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) jvmConfig)                                                                                                                                                                                                                                                                                                                                                                                                                     |                                                                                                |
| public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md)         | [setIpcDebug](#setipcdebug)(boolean enabled)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Enable debug output of IPC communications.                                                     |
| public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md)         | [setDiagnosticForwarding](#setdiagnosticforwarding)(boolean enabled)                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Forward diagnostics from the child JVM process to this process's GlobalReporter.               |
| public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md)         | [setExceptionForwarding](#setexceptionforwarding)(boolean enabled)                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Forward thrown exception to the parent JVM                                                     |
| public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md)         | [setFilterDiagnosticsByLevel](#setfilterdiagnosticsbylevel)(boolean enabled)                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Filter forwarded diagnostic reporting by the level specified in this process's GlobalReporter. |
| public [Response](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.Response.md)        | [run](#run)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input)                                                                                                                                                                                                                                                                                                                                                                                                                              |                                                                                                |
| public [Response](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.Response.md)        | [run](#run)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input, [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) jvmConfig)                                                                                                                                                                                                                                                                                                                                   |                                                                                                |
| public [Response](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.Response.md)        | [getResponse](#getresponse)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                                                |



## Method Details

### forTask

<span style="font-family: monospace; font-size: 80%;">public static [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md) __forTask__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [AbstractExecutionTask](../../../../../../io/github/qishr/cascara/common/exec/AbstractExecutionTask.md)<?, ?>> task, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> response)</span>




---

### run

<span style="font-family: monospace; font-size: 80%;">public static [Response](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.Response.md) __run__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [AbstractExecutionTask](../../../../../../io/github/qishr/cascara/common/exec/AbstractExecutionTask.md)<?, ?>> task, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> response, [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) jvmConfig)</span>



**Throws:**

[Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)


---

### getSerializer

<span style="font-family: monospace; font-size: 80%;">public [Serializer](../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md) __getSerializer__()</span>




---

### getJvmConfig

<span style="font-family: monospace; font-size: 80%;">public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) __getJvmConfig__()</span>




---

### setJvmConfig

<span style="font-family: monospace; font-size: 80%;">public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md) __setJvmConfig__([JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) jvmConfig)</span>




---

### setIpcDebug

<span style="font-family: monospace; font-size: 80%;">public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md) __setIpcDebug__(boolean enabled)</span>

Enable debug output of IPC communications.


---

### setDiagnosticForwarding

<span style="font-family: monospace; font-size: 80%;">public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md) __setDiagnosticForwarding__(boolean enabled)</span>

Forward diagnostics from the child JVM process to this
process's GlobalReporter.


---

### setExceptionForwarding

<span style="font-family: monospace; font-size: 80%;">public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md) __setExceptionForwarding__(boolean enabled)</span>

Forward thrown exception to the parent JVM


---

### setFilterDiagnosticsByLevel

<span style="font-family: monospace; font-size: 80%;">public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md) __setFilterDiagnosticsByLevel__(boolean enabled)</span>

Filter forwarded diagnostic reporting by the level specified in
this process's GlobalReporter.WHen true, this process's GlobalReporter will not reveive
diagnostics from the isolated JVM if their level is not included
in this process's GlobalReporter level for the class they're
reported from.


---

### run

<span style="font-family: monospace; font-size: 80%;">public [Response](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.Response.md) __run__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input)</span>



**Throws:**

[Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)


---

### run

<span style="font-family: monospace; font-size: 80%;">public [Response](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.Response.md) __run__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input, [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) jvmConfig)</span>



**Throws:**

[Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)


---

### getResponse

<span style="font-family: monospace; font-size: 80%;">public [Response](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.Response.md) __getResponse__()</span>




---

