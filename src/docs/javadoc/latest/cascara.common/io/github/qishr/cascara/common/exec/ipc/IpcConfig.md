Package [io.github.qishr.cascara.common.exec.ipc](index.md)

# Class IpcConfig
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.exec.ipc.IpcConfig<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __IpcConfig__</span>


## Field Summary

| Modifier and Type                                                                                                | Field                                         | Description |
|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [DEBUG_PROP](#debug_prop)                     |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [IPC_SERIALIZER](#ipc_serializer)             |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [IPC_SERVER_PID](#ipc_server_pid)             |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [SERIALIZATION_FORMAT](#serialization_format) |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [SERIALIZER_CLASS](#serializer_class)         |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [VERSION](#version)                           |             |



## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| IpcConfig() |             |



## Method Summary

| Modifier and Type                                                                                               | Method                                                                                                                                                                                                            | Description |
|-----------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<?> | [createSerializer](#createserializer)()                                                                                                                                                                           |             |
| public void                                                                                                     | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) header)                                                                                                  |             |
| public void                                                                                                     | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)             | [toString](#tostring)()                                                                                                                                                                                           |             |
| public [SemVer](../../../../../../../io/github/qishr/cascara/common/semver/SemVer.md)                           | [version](#version)()                                                                                                                                                                                             |             |
| public void                                                                                                     | [setVersion](#setversion)([SemVer](../../../../../../../io/github/qishr/cascara/common/semver/SemVer.md) v)                                                                                                       |             |
| public long                                                                                                     | [ipcServerPid](#ipcserverpid)()                                                                                                                                                                                   |             |
| public void                                                                                                     | [setIpcServerPid](#setipcserverpid)(long v)                                                                                                                                                                       |             |
| public boolean                                                                                                  | [ipcDebug](#ipcdebug)()                                                                                                                                                                                           |             |
| public void                                                                                                     | [setIpcDebug](#setipcdebug)(boolean v)                                                                                                                                                                            |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)             | [ipcSerializer](#ipcserializer)()                                                                                                                                                                                 |             |
| public void                                                                                                     | [setIpcSerializer](#setipcserializer)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) v)                                                                             |             |



## Field Details

### DEBUG_PROP

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __DEBUG_PROP__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---

### IPC_SERIALIZER

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __IPC_SERIALIZER__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---

### IPC_SERVER_PID

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __IPC_SERVER_PID__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---

### SERIALIZATION_FORMAT

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SERIALIZATION_FORMAT__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---

### SERIALIZER_CLASS

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SERIALIZER_CLASS__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---

### VERSION

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __VERSION__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---


## Method Details

### createSerializer

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<?> __createSerializer__()</span>




---

### set

<span style="font-family: monospace; font-size: 80%;">public void __set__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) header)</span>




---

### set

<span style="font-family: monospace; font-size: 80%;">public void __set__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>




---

### version

<span style="font-family: monospace; font-size: 80%;">public [SemVer](../../../../../../../io/github/qishr/cascara/common/semver/SemVer.md) __version__()</span>




---

### setVersion

<span style="font-family: monospace; font-size: 80%;">public void __setVersion__([SemVer](../../../../../../../io/github/qishr/cascara/common/semver/SemVer.md) v)</span>




---

### ipcServerPid

<span style="font-family: monospace; font-size: 80%;">public long __ipcServerPid__()</span>




---

### setIpcServerPid

<span style="font-family: monospace; font-size: 80%;">public void __setIpcServerPid__(long v)</span>




---

### ipcDebug

<span style="font-family: monospace; font-size: 80%;">public boolean __ipcDebug__()</span>




---

### setIpcDebug

<span style="font-family: monospace; font-size: 80%;">public void __setIpcDebug__(boolean v)</span>




---

### ipcSerializer

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __ipcSerializer__()</span>




---

### setIpcSerializer

<span style="font-family: monospace; font-size: 80%;">public void __setIpcSerializer__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) v)</span>




---

