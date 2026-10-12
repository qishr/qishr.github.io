Package [io.github.qishr.cascara.common.exec.ipc](index.md)

# Class IpcClient
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.exec.ipc.IpcClient<br/>
<br/>
All Implemented Interfaces:<br/>
    [AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)


----

<span style="font-family: monospace; font-size: 80%;">public final class __IpcClient__</span>


## Field Summary

| Modifier and Type                                                                                                | Field                       | Description |
|------------------------------------------------------------------------------------------------------------------|-----------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [DEBUG_PROP](#debug_prop)   |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [SOCKET_PROP](#socket_prop) |             |



## Method Summary

| Modifier and Type                                                                                    | Method                                                                                                                                  | Description |
|------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [IpcClient](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcClient.md) | [tryConnect](#tryconnect)([Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<?> serializer) |             |
| public long                                                                                          | [getServerProcessId](#getserverprocessid)()                                                                                             |             |
| public synchronized void                                                                             | [send](#send)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) message)                     |             |
| public void                                                                                          | [close](#close)()                                                                                                                       |             |



## Field Details

### DEBUG_PROP

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __DEBUG_PROP__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---

### SOCKET_PROP

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SOCKET_PROP__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---


## Method Details

### tryConnect

<span style="font-family: monospace; font-size: 80%;">public static [IpcClient](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcClient.md) __tryConnect__([Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<?> serializer)</span>




---

### getServerProcessId

<span style="font-family: monospace; font-size: 80%;">public long __getServerProcessId__()</span>




---

### send

<span style="font-family: monospace; font-size: 80%;">public synchronized void __send__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) message)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### close

<span style="font-family: monospace; font-size: 80%;">public void __close__()</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)

**Specified By:**

[AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)


---

