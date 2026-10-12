Package [io.github.qishr.cascara.common.exec](index.md)

# Class Response
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.exec.IsolatedExecutor.Response<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.exec.IsolatedExecutor](../../../../../../io/github/qishr/cascara/common/exec/IsolatedExecutor.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __Response__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                             | Method                              | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------|-------------|
| public T                                                                                                                                                                                      | [getPayload](#getpayload)()         |             |
| public T                                                                                                                                                                                      | [orElseThrow](#orelsethrow)()       |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)>      | [getDiagnostics](#getdiagnostics)() |             |
| public boolean                                                                                                                                                                                | [isSuccess](#issuccess)()           |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getCommand](#getcommand)()         |             |
| public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md)                                                                                                      | [getJvmOptions](#getjvmoptions)()   |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getSystemOut](#getsystemout)()     |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getSystemErr](#getsystemerr)()     |             |



## Method Details

### getPayload

<span style="font-family: monospace; font-size: 80%;">public T __getPayload__()</span>




---

### orElseThrow

<span style="font-family: monospace; font-size: 80%;">public T __orElseThrow__()</span>




---

### getDiagnostics

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Diagnostic](../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.md)> __getDiagnostics__()</span>




---

### isSuccess

<span style="font-family: monospace; font-size: 80%;">public boolean __isSuccess__()</span>




---

### getCommand

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getCommand__()</span>




---

### getJvmOptions

<span style="font-family: monospace; font-size: 80%;">public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) __getJvmOptions__()</span>




---

### getSystemOut

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSystemOut__()</span>




---

### getSystemErr

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSystemErr__()</span>




---

