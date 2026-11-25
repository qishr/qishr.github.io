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



## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| IpcServer() |             |



## Method Summary

| Modifier and Type                                                                                         | Method                                                                                                                          | Description                                                                                    |
|-----------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------|
| public [IpcServer](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcServer.md)             | [setDiagnosticForwarding](#setdiagnosticforwarding)(boolean enabled)                                                            |                                                                                                |
| public [IpcServer](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcServer.md)             | [setFilterDiagnosticsByLevel](#setfilterdiagnosticsbylevel)(boolean enabled)                                                    | Filter forwarded diagnostic reporting by the level specified in this process's GlobalReporter. |
| public [IpcServer](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcServer.md)             | [setExceptionForwarding](#setexceptionforwarding)(boolean enabled)                                                              |                                                                                                |
| public [IpcServer](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcServer.md)             | [setIpcDebug](#setipcdebug)(boolean enabled)                                                                                    |                                                                                                |
| public [IpcServer](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcServer.md)             | [start](#start)()                                                                                                               | Start listening for client connections.                                                        |
| public [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) | [getClientException](#getclientexception)()                                                                                     |                                                                                                |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)       | [getSocketPath](#getsocketpath)()                                                                                               |                                                                                                |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)           | [getMessages](#getmessages)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> type) |                                                                                                |
| public void                                                                                               | [close](#close)()                                                                                                               | Close server socket.                                                                           |



## Field Details

### SERIALIZATION_FORMAT

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SERIALIZATION_FORMAT__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---


## Method Details

### setDiagnosticForwarding

<span style="font-family: monospace; font-size: 80%;">public [IpcServer](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcServer.md) __setDiagnosticForwarding__(boolean enabled)</span>




---

### setFilterDiagnosticsByLevel

<span style="font-family: monospace; font-size: 80%;">public [IpcServer](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcServer.md) __setFilterDiagnosticsByLevel__(boolean enabled)</span>

Filter forwarded diagnostic reporting by the level specified in
this process's GlobalReporter.WHen true, this process's GlobalReporter will not reveive
diagnostics from the isolated JVM if their level is not included
in this process's GlobalReporter level for the class they're
reported from.


---

### setExceptionForwarding

<span style="font-family: monospace; font-size: 80%;">public [IpcServer](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcServer.md) __setExceptionForwarding__(boolean enabled)</span>




---

### setIpcDebug

<span style="font-family: monospace; font-size: 80%;">public [IpcServer](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcServer.md) __setIpcDebug__(boolean enabled)</span>




---

### start

<span style="font-family: monospace; font-size: 80%;">public [IpcServer](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcServer.md) __start__()</span>

Start listening for client connections.

**Throws:**

[IpcException](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcException.md)


---

### getClientException

<span style="font-family: monospace; font-size: 80%;">public [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) __getClientException__()</span>




---

### getSocketPath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getSocketPath__()</span>




---

### getMessages

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getMessages__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> type)</span>




---

### close

<span style="font-family: monospace; font-size: 80%;">public void __close__()</span>

Close server socket.

**Throws:**

[IpcException](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcException.md)

**Specified By:**

[AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)


---

