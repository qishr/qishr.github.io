Package [io.github.qishr.cascara.common.exec.ipc](index.md)

# Class IpcServer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.exec.ipc.IpcServer<br/>
<br/>
All Implemented Interfaces:<br/>
    [AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)


----

<span style="font-family: monospace; font-size: 80%;">public class __IpcServer__</span>


## Field Summary

| Modifier and Type                                                                                                | Field                                         | Description |
|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [SERIALIZATION_FORMAT](#serialization_format) |             |



## Method Summary

| Modifier and Type                                                                                    | Method                                                                                                                          | Description |
|------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [IpcServer](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcServer.md) | [start](#start)(boolean diagnosticForwarding, boolean ipcDebugEnabled)                                                          |             |
| public synchronized void                                                                             | [listenAsync](#listenasync)()                                                                                                   |             |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)  | [getSocketPath](#getsocketpath)()                                                                                               |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T>   | [getMessages](#getmessages)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> type) |             |
| public void                                                                                          | [close](#close)()                                                                                                               |             |



## Field Details

### SERIALIZATION_FORMAT

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SERIALIZATION_FORMAT__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---


## Method Details

### start

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public static [IpcServer](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcServer.md) __start__(boolean diagnosticForwarding, boolean ipcDebugEnabled)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### listenAsync

<span style="font-family: monospace; font-size: 80%;">public synchronized void __listenAsync__()</span>




---

### getSocketPath

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getSocketPath__()</span>




---

### getMessages

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T> __getMessages__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> type)</span>




---

### close

<span style="font-family: monospace; font-size: 80%;">public void __close__()</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)

**Specified By:**

[AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)


---

