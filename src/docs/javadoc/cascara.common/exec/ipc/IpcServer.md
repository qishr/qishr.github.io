Package [io.github.qishr.cascara.common.exec.ipc](index.md)

# Class IpcServer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.exec.ipc.IpcServer<br/>
<br/>
All Implemented Interfaces:<br/>
    [AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)


----

<span style="font-family: monospace; font-size: 80%;">public class __IpcServer__</span>


## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [IpcServer](IpcServer.md)                                                             | [start](#start)([Serializer](../../lang/processor/Serializer.md)<?> serializer, boolean diagnosticForwarding, boolean ipcDebugEnabled) |             |
| public synchronized void                                                                            | [listenAsync](#listenasync)()                                                                                                          |             |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getSocketPath](#getsocketpath)()                                                                                                      |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T>  | [getMessages](#getmessages)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> type)        |             |
| public void                                                                                         | [close](#close)()                                                                                                                      |             |



## Method Details

### start

<span style="font-family: monospace; font-size: 80%;">public static [IpcServer](IpcServer.md) __start__([Serializer](../../lang/processor/Serializer.md)<?> serializer, boolean diagnosticForwarding, boolean ipcDebugEnabled)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### listenAsync

<span style="font-family: monospace; font-size: 80%;">public synchronized void __listenAsync__()</span>




---

### getSocketPath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getSocketPath__()</span>




---

### getMessages

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T> __getMessages__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> type)</span>




---

### close

<span style="font-family: monospace; font-size: 80%;">public void __close__()</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)

**Specified By:**

[AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)


---

