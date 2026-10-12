Package [io.github.qishr.cascara.common.exec](index.md)

# Class IsolatedExecutor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.exec.IsolatedExecutor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Beta<br/>
public class __IsolatedExecutor__</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                         | Description |
|-------------------|-----------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.exec.IsolatedExecutor.Response](IsolatedExecutor.Response.md) |             |



## Field Summary

| Modifier and Type                                                                                                | Field                                         | Description |
|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [SERIALIZATION_FORMAT](#serialization_format) |             |



## Method Summary

| Modifier and Type                                                                                               | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | Description |
|-----------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md)     | [forTask](#fortask)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [AbstractExecutionTask](../../../../../../io/github/qishr/cascara/common/exec/AbstractExecutionTask.md)<?, ?>> task, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> response)                                                                                                                                                                                        |             |
| public static [Response](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.Response.md)<T> | [run](#run)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [AbstractExecutionTask](../../../../../../io/github/qishr/cascara/common/exec/AbstractExecutionTask.md)<?, ?>> task, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> response, [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) options) |             |
| public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md)            | [setOptions](#setoptions)([JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) options)                                                                                                                                                                                                                                                                                                                                                                                                                         |             |
| public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md)            | [setIpcDebugEnabled](#setipcdebugenabled)(boolean enabled)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |             |
| public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md)            | [setDiagnosticForwardingEnabled](#setdiagnosticforwardingenabled)(boolean enabled)                                                                                                                                                                                                                                                                                                                                                                                                                                                           |             |
| public [Response](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.Response.md)<T>        | [run](#run)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input)                                                                                                                                                                                                                                                                                                                                                                                                                              |             |
| public [Response](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.Response.md)<T>        | [run](#run)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input, [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) options)                                                                                                                                                                                                                                                                                                                                   |             |



## Field Details

### SERIALIZATION_FORMAT

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SERIALIZATION_FORMAT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### forTask

<span style="font-family: monospace; font-size: 80%;">public static [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md) __forTask__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [AbstractExecutionTask](../../../../../../io/github/qishr/cascara/common/exec/AbstractExecutionTask.md)<?, ?>> task, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> response)</span>




---

### run

<span style="font-family: monospace; font-size: 80%;">public static [Response](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.Response.md)<T> __run__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [AbstractExecutionTask](../../../../../../io/github/qishr/cascara/common/exec/AbstractExecutionTask.md)<?, ?>> task, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> response, [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) options)</span>




---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md) __setOptions__([JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) options)</span>




---

### setIpcDebugEnabled

<span style="font-family: monospace; font-size: 80%;">public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md) __setIpcDebugEnabled__(boolean enabled)</span>




---

### setDiagnosticForwardingEnabled

<span style="font-family: monospace; font-size: 80%;">public [IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md) __setDiagnosticForwardingEnabled__(boolean enabled)</span>




---

### run

<span style="font-family: monospace; font-size: 80%;">public [Response](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.Response.md)<T> __run__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)
, [InterruptedException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/InterruptedException.html)


---

### run

<span style="font-family: monospace; font-size: 80%;">public [Response](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.Response.md)<T> __run__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input, [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) options)</span>




---

