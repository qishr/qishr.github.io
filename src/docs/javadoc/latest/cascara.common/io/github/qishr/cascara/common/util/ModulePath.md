Package [io.github.qishr.cascara.common.util](index.md)

# Class ModulePath
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.internal.AbstractClassFinder<br/>
                io.github.qishr.cascara.common.util.ModulePath<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __ModulePath__<br/>extends AbstractClassFinder
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                             | Description |
|-------------------|---------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.util.ModulePath.DiscoveredModule](ModulePath.DiscoveredModule.md) |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ModulePath([Reporter](../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |             |
| ModulePath()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |             |
| ModulePath([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) virtualReferencePath)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |             |
| ModulePath([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) modulePath)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |             |
| ModulePath([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) modulePath, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) virtualReferencePath)                                                                                                                                                                                                                                                                                                                                                                                              |             |
| ModulePath([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> modulePaths, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) virtualReferencePath)                                                                                                                                                                                                                                                                                                     |             |
| ModulePath([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> modulePaths, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> excluded, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) virtualReferencePath)                                                                                                      |             |
| ModulePath([Reporter](../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> modulePaths, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> excluded, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) virtualReferencePath) |             |



## Method Summary

| Modifier and Type                                                                                                              | Method                                                                                                                                                                                                                                                                                                                                               | Description |
|--------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)                                  | [getClasses](#getclasses)()                                                                                                                                                                                                                                                                                                                          |             |
| public boolean                                                                                                                 | [containsClass](#containsclass)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className)                                                                                                                                                                                                              |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)                                  | [getDiscoveredModules](#getdiscoveredmodules)()                                                                                                                                                                                                                                                                                                      |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)                                  | [getModuleNames](#getmodulenames)()                                                                                                                                                                                                                                                                                                                  |             |
| public [ModuleDescriptor](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/module/ModuleDescriptor.html) | [getDescriptor](#getdescriptor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)                                                                                                                                                                                                             |             |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                            | [getPathForModule](#getpathformodule)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)                                                                                                                                                                                                       |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                            | [getModuleForClass](#getmoduleforclass)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className)                                                                                                                                                                                                      |             |
| public boolean                                                                                                                 | [containsModule](#containsmodule)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)                                                                                                                                                                                                           |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                         | [scanDirectoryUrl](#scandirectoryurl)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [URL](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URL.html)[] urls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName) |             |



## Method Details

### getClasses

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html) __getClasses__()</span>




---

### containsClass

<span style="font-family: monospace; font-size: 80%;">public boolean __containsClass__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className)</span>




---

### getDiscoveredModules

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html) __getDiscoveredModules__()</span>




---

### getModuleNames

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html) __getModuleNames__()</span>




---

### getDescriptor

<span style="font-family: monospace; font-size: 80%;">public [ModuleDescriptor](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/module/ModuleDescriptor.html) __getDescriptor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>




---

### getPathForModule

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getPathForModule__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>




---

### getModuleForClass

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getModuleForClass__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className)</span>




---

### containsModule

<span style="font-family: monospace; font-size: 80%;">public boolean __containsModule__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>




---

### scanDirectoryUrl

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __scanDirectoryUrl__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [URL](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URL.html)[] urls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>




---

