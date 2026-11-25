Package [io.github.qishr.cascara.common.util](index.md)

# Class Config
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.Config<br/>
<br/>
Direct Known Subtypes:<br/>
    [LogFormatConfig](../../../../../../io/github/qishr/cascara/common/diagnostic/format/LogFormatConfig.md), [ConsoleLoggerConfig](../../../../../../io/github/qishr/cascara/common/diagnostic/log/ConsoleLoggerConfig.md), [ReporterConfig](../../../../../../io/github/qishr/cascara/common/diagnostic/report/ReporterConfig.md), [I18nConfig](../../../../../../io/github/qishr/cascara/common/i18n/I18nConfig.md), [SplConfig](../../../../../../io/github/qishr/cascara/common/service/SplConfig.md), [TypeConfig](../../../../../../io/github/qishr/cascara/common/type/TypeConfig.md), [Cascara](../../../../../../io/github/qishr/cascara/common/util/Cascara.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __Config__</span>


## Nested Class Summary

| Modifier and Type | Class                                                                   | Description |
|-------------------|-------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.util.Config.Setting](Config.Setting.md) |             |



## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| Config()    |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                                                                                                                                                                                                                                                              | Description |
|-----------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected static T                                                                                  | [get](#get)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> configClass)                                                                                                                                                                                                                                                                                                                              |             |
| protected static T                                                                                  | [get](#get)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> configClass, [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) properties)                                                                                                                                                                                                             |             |
| protected static T                                                                                  | [get](#get)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> configClass, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) file, [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) stream, [FileSystem](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/FileSystem.html) fs) |             |
| protected void                                                                                      | [ensureInitialized](#ensureinitialized)()                                                                                                                                                                                                                                                                                                                                                                                                           |             |
| protected static void                                                                               | [setFileSystem](#setfilesystem)([FileSystem](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/FileSystem.html) fs)                                                                                                                                                                                                                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getNamespace](#getnamespace)()                                                                                                                                                                                                                                                                                                                                                                                                                     |             |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getPropertiesPath](#getpropertiespath)()                                                                                                                                                                                                                                                                                                                                                                                                           |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)     | [getAllSettings](#getallsettings)()                                                                                                                                                                                                                                                                                                                                                                                                                 |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)     | [getAppliedSettings](#getappliedsettings)()                                                                                                                                                                                                                                                                                                                                                                                                         |             |
| protected void                                                                                      | [init](#init)()                                                                                                                                                                                                                                                                                                                                                                                                                                     |             |



## Method Details

### get

<span style="font-family: monospace; font-size: 80%;">protected static T __get__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> configClass)</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">protected static T __get__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> configClass, [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) properties)</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">protected static T __get__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> configClass, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) file, [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) stream, [FileSystem](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/FileSystem.html) fs)</span>




---

### ensureInitialized

<span style="font-family: monospace; font-size: 80%;">protected void __ensureInitialized__()</span>




---

### setFileSystem

<span style="font-family: monospace; font-size: 80%;">protected static void __setFileSystem__([FileSystem](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/FileSystem.html) fs)</span>




---

### getNamespace

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getNamespace__()</span>




---

### getPropertiesPath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getPropertiesPath__()</span>




---

### getAllSettings

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getAllSettings__()</span>




---

### getAppliedSettings

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getAppliedSettings__()</span>




---

### init

<span style="font-family: monospace; font-size: 80%;">protected void __init__()</span>




---

