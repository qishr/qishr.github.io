Package [io.github.qishr.cascara.common.util](index.md)

# Class Cascara
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.Cascara<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __Cascara__</span>


## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                         | Description                                                                                                                                                                                                                                     |
|-----------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static [Cascara](../../../../../../io/github/qishr/cascara/common/util/Cascara.md)           | [instance](#instance)()                                                                                                        |                                                                                                                                                                                                                                                 |
| public static void                                                                                  | [reset](#reset)()                                                                                                              |                                                                                                                                                                                                                                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getHomeEnvVar](#gethomeenvvar)()                                                                                              |                                                                                                                                                                                                                                                 |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getHomePath](#gethomepath)()                                                                                                  |                                                                                                                                                                                                                                                 |
| public void                                                                                         | [setHomePath](#sethomepath)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path) |                                                                                                                                                                                                                                                 |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getContentTypesPath](#getcontenttypespath)()                                                                                  | The path of the content types registry file.                                                                                                                                                                                                    |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getSchemasPath](#getschemaspath)()                                                                                            | The path of the schema store irectory.                                                                                                                                                                                                          |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getSharedPath](#getsharedpath)()                                                                                              |                                                                                                                                                                                                                                                 |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getSplPropertiesPath](#getsplpropertiespath)()                                                                                | The path of the properties file containing definitions of default or preferred service providers If this file is empty, or if a service is not listed in it, when a provider is requested the first  matching provider will be returned by SPL. |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getModulePath](#getmodulepath)()                                                                                              |                                                                                                                                                                                                                                                 |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)     | [getInstalledVersions](#getinstalledversions)()                                                                                |                                                                                                                                                                                                                                                 |
| public [SemVer](../../../../../../io/github/qishr/cascara/common/semver/SemVer.md)                  | [getVersion](#getversion)()                                                                                                    |                                                                                                                                                                                                                                                 |
| public [SemVer](../../../../../../io/github/qishr/cascara/common/semver/SemVer.md)                  | [getCommonVersion](#getcommonversion)()                                                                                        |                                                                                                                                                                                                                                                 |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getActiveVersionPath](#getactiveversionpath)()                                                                                |                                                                                                                                                                                                                                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getActiveVersionString](#getactiveversionstring)()                                                                            |                                                                                                                                                                                                                                                 |
| public boolean                                                                                      | [isFileTimeSupported](#isfiletimesupported)()                                                                                  |                                                                                                                                                                                                                                                 |



## Method Details

### instance

<span style="font-family: monospace; font-size: 80%;">public static [Cascara](../../../../../../io/github/qishr/cascara/common/util/Cascara.md) __instance__()</span>




---

### reset

<span style="font-family: monospace; font-size: 80%;">public static void __reset__()</span>




---

### getHomeEnvVar

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getHomeEnvVar__()</span>




---

### getHomePath

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getHomePath__()</span>




---

### setHomePath

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public void __setHomePath__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path)</span>




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

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getSplPropertiesPath__()</span>

The path of the properties file containing definitions of default or preferred service providers
If this file is empty, or if a service is not listed in it, when a provider is requested the
first  matching provider will be returned by SPL.


---

### getModulePath

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getModulePath__()</span>




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

### getActiveVersionPath

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getActiveVersionPath__()</span>




---

### getActiveVersionString

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getActiveVersionString__()</span>




---

### isFileTimeSupported

<span style="font-family: monospace; font-size: 80%;">public boolean __isFileTimeSupported__()</span>




---

