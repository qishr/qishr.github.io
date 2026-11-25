Package [io.github.qishr.cascara.common.diagnostic.report](index.md)

# Class ReporterConfig
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.util.Config](../../../../../../../io/github/qishr/cascara/common/util/Config.md)<br/>
                io.github.qishr.cascara.common.diagnostic.report.ReporterConfig<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ReporterConfig__<br/>extends [Config](../../../../../../../io/github/qishr/cascara/common/util/Config.md)
</span>


## Method Summary

| Modifier and Type                                                                                                       | Method                                                                                                                   | Description |
|-------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [ReporterConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ReporterConfig.md) | [get](#get)()                                                                                                            |             |
| public static [ReporterConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ReporterConfig.md) | [get](#get)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)     |             |
| public [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md)                      | [getLevel](#getlevel)()                                                                                                  |             |
| public [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md)                      | [getLevel](#getlevel)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fqcn) |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)                           | [getLevels](#getlevels)()                                                                                                |             |
| public boolean                                                                                                          | [allowApiOverride](#allowapioverride)()                                                                                  |             |
| public boolean                                                                                                          | [isConsoleOutputEnabled](#isconsoleoutputenabled)()                                                                      |             |


### Methods inherited from [Config](../../../../../../../io/github/qishr/cascara/common/util/Config.md)

ensureInitialized, get, get, get, getAllSettings, getPropertiesPath, getAppliedSettings, init, setFileSystem, getNamespace


## Method Details

### get

<span style="font-family: monospace; font-size: 80%;">public static [ReporterConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ReporterConfig.md) __get__()</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public static [ReporterConfig](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/ReporterConfig.md) __get__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>




---

### getLevel

<span style="font-family: monospace; font-size: 80%;">public [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) __getLevel__()</span>




---

### getLevel

<span style="font-family: monospace; font-size: 80%;">public [Level](../../../../../../../io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) __getLevel__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fqcn)</span>




---

### getLevels

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html) __getLevels__()</span>




---

### allowApiOverride

<span style="font-family: monospace; font-size: 80%;">public boolean __allowApiOverride__()</span>




---

### isConsoleOutputEnabled

<span style="font-family: monospace; font-size: 80%;">public boolean __isConsoleOutputEnabled__()</span>




---

