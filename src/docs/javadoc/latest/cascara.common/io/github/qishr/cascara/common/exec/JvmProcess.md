Package [io.github.qishr.cascara.common.exec](index.md)

# Class JvmProcess
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.exec.JvmProcess<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __JvmProcess__</span>


## Nested Class Summary

| Modifier and Type | Class                                                                             | Description |
|-------------------|-----------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.exec.JvmProcess.Response](JvmProcess.Response.md) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                              | Method                                                                                                                         | Description                                                                                                    |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| public static [JvmProcess](../../../../../../io/github/qishr/cascara/common/exec/JvmProcess.md)                                                                                                                                | [forClass](#forclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> mainClass) |                                                                                                                |
| public [JvmProcess](../../../../../../io/github/qishr/cascara/common/exec/JvmProcess.md)                                                                                                                                       | [setOptions](#setoptions)([JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) options)           |                                                                                                                |
| public [Response](../../../../../../io/github/qishr/cascara/common/exec/JvmProcess.Response.md)                                                                                                                                | [run](#run)()                                                                                                                  | Synchronous blocking execution (Preserved signature for backwards compatibility).                              |
| public [Response](../../../../../../io/github/qishr/cascara/common/exec/JvmProcess.Response.md)                                                                                                                                | [run](#run)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) input)                | Executes the process synchronously with optional standard input, blocking the calling thread until completion. |
| public [CompletableFuture](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/concurrent/CompletableFuture.html)<[Response](../../../../../../io/github/qishr/cascara/common/exec/JvmProcess.Response.md)> | [runAsync](#runasync)()                                                                                                        | Non-blocking background execution.                                                                             |
| public [CompletableFuture](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/concurrent/CompletableFuture.html)<[Response](../../../../../../io/github/qishr/cascara/common/exec/JvmProcess.Response.md)> | [runAsync](#runasync)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) input)      | Non-blocking background execution with input.                                                                  |



## Method Details

### forClass

<span style="font-family: monospace; font-size: 80%;">public static [JvmProcess](../../../../../../io/github/qishr/cascara/common/exec/JvmProcess.md) __forClass__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> mainClass)</span>




---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public [JvmProcess](../../../../../../io/github/qishr/cascara/common/exec/JvmProcess.md) __setOptions__([JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) options)</span>




---

### run

<span style="font-family: monospace; font-size: 80%;">public [Response](../../../../../../io/github/qishr/cascara/common/exec/JvmProcess.Response.md) __run__()</span>

Synchronous blocking execution (Preserved signature for backwards compatibility).

**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)
, [InterruptedException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/InterruptedException.html)


---

### run

<span style="font-family: monospace; font-size: 80%;">public [Response](../../../../../../io/github/qishr/cascara/common/exec/JvmProcess.Response.md) __run__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) input)</span>

Executes the process synchronously with optional standard input,
blocking the calling thread until completion.

**Parameters:**

`input` - standard input payload to stream to the child process, or null

**Returns:**

the process execution response payload


---

### runAsync

<span style="font-family: monospace; font-size: 80%;">public [CompletableFuture](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/concurrent/CompletableFuture.html)<[Response](../../../../../../io/github/qishr/cascara/common/exec/JvmProcess.Response.md)> __runAsync__()</span>

Non-blocking background execution.


---

### runAsync

<span style="font-family: monospace; font-size: 80%;">public [CompletableFuture](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/concurrent/CompletableFuture.html)<[Response](../../../../../../io/github/qishr/cascara/common/exec/JvmProcess.Response.md)> __runAsync__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) input)</span>

Non-blocking background execution with input.


---

