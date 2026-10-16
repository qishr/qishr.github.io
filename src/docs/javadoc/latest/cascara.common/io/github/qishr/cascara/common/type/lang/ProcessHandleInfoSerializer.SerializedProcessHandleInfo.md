Package [io.github.qishr.cascara.common.type.lang](index.md)

# Class SerializedProcessHandleInfo
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.type.lang.ProcessHandleInfoSerializer.SerializedProcessHandleInfo<br/>
<br/>
All Implemented Interfaces:<br/>
    Info

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.type.lang.ProcessHandleInfoSerializer](../../../../../../../io/github/qishr/cascara/common/type/lang/ProcessHandleInfoSerializer.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __SerializedProcessHandleInfo__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                              | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| SerializedProcessHandleInfo([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) command, [MapAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapAstNode.md)<?, ?, ?> map) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                         | Method                                  | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------|-------------|
| public [Optional](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Optional.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>     | [command](#command)()                   |             |
| public [Optional](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Optional.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]>   | [arguments](#arguments)()               |             |
| public [Optional](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Optional.html)<[Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html)>   | [startInstant](#startinstant)()         |             |
| public [Optional](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Optional.html)<[Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html)> | [totalCpuDuration](#totalcpuduration)() |             |
| public [Optional](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Optional.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>     | [user](#user)()                         |             |
| public [Optional](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Optional.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>     | [commandLine](#commandline)()           |             |



## Method Details

### command

<span style="font-family: monospace; font-size: 80%;">public [Optional](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Optional.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __command__()</span>




---

### arguments

<span style="font-family: monospace; font-size: 80%;">public [Optional](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Optional.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]> __arguments__()</span>




---

### startInstant

<span style="font-family: monospace; font-size: 80%;">public [Optional](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Optional.html)<[Instant](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Instant.html)> __startInstant__()</span>




---

### totalCpuDuration

<span style="font-family: monospace; font-size: 80%;">public [Optional](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Optional.html)<[Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html)> __totalCpuDuration__()</span>




---

### user

<span style="font-family: monospace; font-size: 80%;">public [Optional](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Optional.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __user__()</span>




---

### commandLine

<span style="font-family: monospace; font-size: 80%;">public [Optional](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Optional.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __commandLine__()</span>




---

