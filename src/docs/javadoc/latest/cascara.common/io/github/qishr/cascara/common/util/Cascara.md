Package [io.github.qishr.cascara.common.util](index.md)

# Class Cascara
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.util.Config](../../../../../../io/github/qishr/cascara/common/util/Config.md)<br/>
                io.github.qishr.cascara.common.util.Cascara<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __Cascara__<br/>extends [Config](../../../../../../io/github/qishr/cascara/common/util/Config.md)
</span>


## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| Cascara()   |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                       | Description                                                                                                                                                                                                                                     |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| protected void                                                                                      | [init](#init)()                                                                                                              |                                                                                                                                                                                                                                                 |
| public static boolean                                                                               | [isInitialized](#isinitialized)()                                                                                            |                                                                                                                                                                                                                                                 |
| public static [Cascara](../../../../../../io/github/qishr/cascara/common/util/Cascara.md)           | [get](#get)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) homePath)           |                                                                                                                                                                                                                                                 |
| public static [Cascara](../../../../../../io/github/qishr/cascara/common/util/Cascara.md)           | [get](#get)()                                                                                                                |                                                                                                                                                                                                                                                 |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getPath](#getpath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) pathString) |                                                                                                                                                                                                                                                 |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getHomePath](#gethomepath)()                                                                                                |                                                                                                                                                                                                                                                 |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getContentTypesPath](#getcontenttypespath)()                                                                                | The path of the content types registry file.                                                                                                                                                                                                    |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getSchemasPath](#getschemaspath)()                                                                                          | The path of the schema store irectory.                                                                                                                                                                                                          |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getSharedPath](#getsharedpath)()                                                                                            |                                                                                                                                                                                                                                                 |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getSplPropertiesPath](#getsplpropertiespath)()                                                                              | The path of the properties file containing definitions of default or preferred service providers If this file is empty, or if a service is not listed in it, when a provider is requested the first  matching provider will be returned by SPL. |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getPropertiesPath](#getpropertiespath)()                                                                                    |                                                                                                                                                                                                                                                 |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getModulePath](#getmodulepath)()                                                                                            |                                                                                                                                                                                                                                                 |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getActiveVersionPath](#getactiveversionpath)()                                                                              |                                                                                                                                                                                                                                                 |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)     | [getInstalledVersions](#getinstalledversions)()                                                                              |                                                                                                                                                                                                                                                 |
| public [SemVer](../../../../../../io/github/qishr/cascara/common/semver/SemVer.md)                  | [getVersion](#getversion)()                                                                                                  |                                                                                                                                                                                                                                                 |
| public [SemVer](../../../../../../io/github/qishr/cascara/common/semver/SemVer.md)                  | [getCommonVersion](#getcommonversion)()                                                                                      |                                                                                                                                                                                                                                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getActiveVersionString](#getactiveversionstring)()                                                                          |                                                                                                                                                                                                                                                 |
| public boolean                                                                                      | [isFileTimeSupported](#isfiletimesupported)()                                                                                |                                                                                                                                                                                                                                                 |


### Methods inherited from [Config](../../../../../../io/github/qishr/cascara/common/util/Config.md)

ensureInitialized, get, get, get, getAllSettings, getAppliedSettings, setFileSystem, getNamespace


## Method Details

### init

<span style="font-family: monospace; font-size: 80%;">protected void __init__()</span>



**Overrides:**

[Config](../../../../../../../cascara.common/io/github/qishr/cascara/common/util/Config.md#init)


---

### isInitialized

<span style="font-family: monospace; font-size: 80%;">public static boolean __isInitialized__()</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public static [Cascara](../../../../../../io/github/qishr/cascara/common/util/Cascara.md) __get__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) homePath)</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public static [Cascara](../../../../../../io/github/qishr/cascara/common/util/Cascara.md) __get__()</span>




---

### getPath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getPath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) pathString)</span>




---

### getHomePath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getHomePath__()</span>




---

### getContentTypesPath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getContentTypesPath__()</span>

The path of the content types registry file.


---

### getSchemasPath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getSchemasPath__()</span>

The path of the schema store irectory.


---

### getSharedPath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getSharedPath__()</span>




---

### getSplPropertiesPath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getSplPropertiesPath__()</span>

The path of the properties file containing definitions of default or preferred service providers
If this file is empty, or if a service is not listed in it, when a provider is requested the
first  matching provider will be returned by SPL.


---

### getPropertiesPath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getPropertiesPath__()</span>



**Overrides:**

[Config](../../../../../../../cascara.common/io/github/qishr/cascara/common/util/Config.md#getpropertiespath)


---

### getModulePath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getModulePath__()</span>




---

### getActiveVersionPath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getActiveVersionPath__()</span>




---

### getInstalledVersions

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getInstalledVersions__()</span>




---

### getVersion

<span style="font-family: monospace; font-size: 80%;">public [SemVer](../../../../../../io/github/qishr/cascara/common/semver/SemVer.md) __getVersion__()</span>




---

### getCommonVersion

<span style="font-family: monospace; font-size: 80%;">public [SemVer](../../../../../../io/github/qishr/cascara/common/semver/SemVer.md) __getCommonVersion__()</span>




---

### getActiveVersionString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getActiveVersionString__()</span>




---

### isFileTimeSupported

<span style="font-family: monospace; font-size: 80%;">public boolean __isFileTimeSupported__()</span>




---

