Package [io.github.qishr.cascara.common.util](index.md)

# Class Cascara
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.Cascara<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __Cascara__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                                    | Method                                                                                                                         | Description                                                                                                                                                                                                                                     |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static boolean                                                                                                                                                                                | [isFileTimeSupported](#isfiletimesupported)()                                                                                  |                                                                                                                                                                                                                                                 |
| public static [SemVer](../../../../../../io/github/qishr/cascara/common/semver/SemVer.md)                                                                                                            | [getVersion](#getversion)()                                                                                                    |                                                                                                                                                                                                                                                 |
| public static [SemVer](../../../../../../io/github/qishr/cascara/common/semver/SemVer.md)                                                                                                            | [getCommonVersion](#getcommonversion)()                                                                                        |                                                                                                                                                                                                                                                 |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getHomeEnvVar](#gethomeenvvar)()                                                                                              |                                                                                                                                                                                                                                                 |
| public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                           | [getHomePath](#gethomepath)()                                                                                                  |                                                                                                                                                                                                                                                 |
| public static void                                                                                                                                                                                   | [setHomePath](#sethomepath)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path) |                                                                                                                                                                                                                                                 |
| public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                           | [getContentTypesPath](#getcontenttypespath)()                                                                                  | The path of the content types registry file.                                                                                                                                                                                                    |
| public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                           | [getSchemasPath](#getschemaspath)()                                                                                            | The path of the schema store irectory.                                                                                                                                                                                                          |
| public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                           | [getSplPropertiesPath](#getsplpropertiespath)()                                                                                | The path of the properties file containing definitions of default or preferred service providers If this file is empty, or if a service is not listed in it, when a provider is requested the first  matching provider will be returned by SPL. |
| public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                           | [getModulePath](#getmodulepath)()                                                                                              |                                                                                                                                                                                                                                                 |
| public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getInstalledVersions](#getinstalledversions)()                                                                                |                                                                                                                                                                                                                                                 |
| public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                           | [getActiveVersionPath](#getactiveversionpath)()                                                                                |                                                                                                                                                                                                                                                 |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getActiveVersionString](#getactiveversionstring)()                                                                            |                                                                                                                                                                                                                                                 |
| public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                           | [getSharedPath](#getsharedpath)()                                                                                              |                                                                                                                                                                                                                                                 |



## Method Details

### isFileTimeSupported

<span style="font-family: monospace; font-size: 80%;">public static boolean __isFileTimeSupported__()</span>




---

### getVersion

<span style="font-family: monospace; font-size: 80%;">public static [SemVer](../../../../../../io/github/qishr/cascara/common/semver/SemVer.md) __getVersion__()</span>




---

### getCommonVersion

<span style="font-family: monospace; font-size: 80%;">public static [SemVer](../../../../../../io/github/qishr/cascara/common/semver/SemVer.md) __getCommonVersion__()</span>




---

### getHomeEnvVar

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getHomeEnvVar__()</span>




---

### getHomePath

<span style="font-family: monospace; font-size: 80%;">public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getHomePath__()</span>




---

### setHomePath

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public static void __setHomePath__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path)</span>




---

### getContentTypesPath

<span style="font-family: monospace; font-size: 80%;">public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getContentTypesPath__()</span>

The path of the content types registry file.


---

### getSchemasPath

<span style="font-family: monospace; font-size: 80%;">public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getSchemasPath__()</span>

The path of the schema store irectory.


---

### getSplPropertiesPath

<span style="font-family: monospace; font-size: 80%;">public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getSplPropertiesPath__()</span>

The path of the properties file containing definitions of default or preferred service providers
If this file is empty, or if a service is not listed in it, when a provider is requested the
first  matching provider will be returned by SPL.


---

### getModulePath

<span style="font-family: monospace; font-size: 80%;">public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getModulePath__()</span>




---

### getInstalledVersions

<span style="font-family: monospace; font-size: 80%;">public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getInstalledVersions__()</span>




---

### getActiveVersionPath

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getActiveVersionPath__()</span>




---

### getActiveVersionString

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getActiveVersionString__()</span>




---

### getSharedPath

<span style="font-family: monospace; font-size: 80%;">public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getSharedPath__()</span>




---

