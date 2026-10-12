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

| Modifier and Type                                         | Method                                                                                                                                                                                                                                                                                                                                                                                                                           | Description |
|-----------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [IsolatedExecutor](IsolatedExecutor.md)     | [forTask](#fortask)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [AbstractExecutionTask](AbstractExecutionTask.md)<?, ?>> task, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> response)                                                                                                                                  |             |
| public static [Response](IsolatedExecutor.Response.md)<T> | [run](#run)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [AbstractExecutionTask](AbstractExecutionTask.md)<?, ?>> task, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> response, [JvmOptions](JvmOptions.md) options) |             |
| public [IsolatedExecutor](IsolatedExecutor.md)            | [setOptions](#setoptions)([JvmOptions](JvmOptions.md) options)                                                                                                                                                                                                                                                                                                                                                                   |             |
| public [IsolatedExecutor](IsolatedExecutor.md)            | [setIpcDebugEnabled](#setipcdebugenabled)(boolean enabled)                                                                                                                                                                                                                                                                                                                                                                       |             |
| public [IsolatedExecutor](IsolatedExecutor.md)            | [setDiagnosticForwardingEnabled](#setdiagnosticforwardingenabled)(boolean enabled)                                                                                                                                                                                                                                                                                                                                               |             |
| public [Response](IsolatedExecutor.Response.md)<T>        | [run](#run)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input)                                                                                                                                                                                                                                                                                                                  |             |
| public [Response](IsolatedExecutor.Response.md)<T>        | [run](#run)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input, [JvmOptions](JvmOptions.md) options)                                                                                                                                                                                                                                                                             |             |



## Field Details

### SERIALIZATION_FORMAT

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SERIALIZATION_FORMAT__</span>



**See Also:**


[Constant Field Values](../constant-values.md)



---


## Method Details

### forTask

<span style="font-family: monospace; font-size: 80%;">public static [IsolatedExecutor](IsolatedExecutor.md) __forTask__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [AbstractExecutionTask](AbstractExecutionTask.md)<?, ?>> task, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> response)</span>




---

### run

<span style="font-family: monospace; font-size: 80%;">public static [Response](IsolatedExecutor.Response.md)<T> __run__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [AbstractExecutionTask](AbstractExecutionTask.md)<?, ?>> task, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> response, [JvmOptions](JvmOptions.md) options)</span>




---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public [IsolatedExecutor](IsolatedExecutor.md) __setOptions__([JvmOptions](JvmOptions.md) options)</span>




---

### setIpcDebugEnabled

<span style="font-family: monospace; font-size: 80%;">public [IsolatedExecutor](IsolatedExecutor.md) __setIpcDebugEnabled__(boolean enabled)</span>




---

### setDiagnosticForwardingEnabled

<span style="font-family: monospace; font-size: 80%;">public [IsolatedExecutor](IsolatedExecutor.md) __setDiagnosticForwardingEnabled__(boolean enabled)</span>




---

### run

<span style="font-family: monospace; font-size: 80%;">public [Response](IsolatedExecutor.Response.md)<T> __run__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)
, [InterruptedException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/InterruptedException.html)


---

### run

<span style="font-family: monospace; font-size: 80%;">public [Response](IsolatedExecutor.Response.md)<T> __run__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) input, [JvmOptions](JvmOptions.md) options)</span>




---

