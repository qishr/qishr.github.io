Package [io.github.qishr.cascara.common.util](index.md)

# Class AbstractClassFinder
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.AbstractClassFinder<br/>
<br/>
Direct Known Subtypes:<br/>
    [ClassPath](../../../../../../io/github/qishr/cascara/common/util/ClassPath.md), [ModulePath](../../../../../../io/github/qishr/cascara/common/util/ModulePath.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractClassFinder__</span>


## Field Summary

| Modifier and Type                                                                                                   | Field                                         | Description |
|---------------------------------------------------------------------------------------------------------------------|-----------------------------------------------|-------------|
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [DOT_CLASS](#dot_class)                       |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [DOT_JAR](#dot_jar)                           |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [MODULE_INFO](#module_info)                   |             |
| protected Set<String>                                                                                               | [classNames](#classnames)                     |             |
| protected Map<String, String>                                                                                       | [classToModule](#classtomodule)               |             |
| protected Map<String, ModuleDescriptor>                                                                             | [descriptors](#descriptors)                   |             |
| protected Map<String, DiscoveredModule>                                                                             | [discoveredModules](#discoveredmodules)       |             |
| protected Set<String>                                                                                               | [excluded](#excluded)                         |             |
| protected Reporter                                                                                                  | [reporter](#reporter)                         |             |
| protected Path                                                                                                      | [virtualReferencePath](#virtualreferencepath) |             |



## Constructor Summary

| Constructor           | Description |
|-----------------------|-------------|
| AbstractClassFinder() |             |



## Method Summary

| Modifier and Type                                                                                               | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Description                                                                        |
|-----------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------|
| protected abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [scanDirectoryUrl](#scandirectoryurl)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [URL](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URL.html)[] urls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)                                                                                                                                                                                                                                                                                                                          |                                                                                    |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)                   | [getClasses](#getclasses)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |                                                                                    |
| public boolean                                                                                                  | [containsClass](#containsclass)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |                                                                                    |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)                   | [getDiscoveredModules](#getdiscoveredmodules)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |                                                                                    |
| protected static [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)         | [pathSet](#pathset)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) classPath)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |                                                                                    |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)          | [scanJar](#scanjar)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)                                                                                                                                                                                                                                                                                                                                                                                                                                               |                                                                                    |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)          | [scanDirectory](#scandirectory)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)                                                                                                                                                                                                                                                                                                                                                                                                                              |                                                                                    |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)          | [scanClassFile](#scanclassfile)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) file, [URLClassLoader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URLClassLoader.html) classLoader, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> discovered) |                                                                                    |
| protected void                                                                                                  | [register](#register)([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> discovered, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath)                                                                                                                                                                                                                                         |                                                                                    |
| protected void                                                                                                  | [addModuleDescriptor](#addmoduledescriptor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [ModuleDescriptor](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/module/ModuleDescriptor.html) descriptor)                                                                                                                                                                                                                                                                                                                                                                                      |                                                                                    |
| protected [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)          | [getPath](#getpath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) pathString)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Parse path using virtual file system if provided, otherwise default OS file system |
| protected boolean                                                                                               | [isExcluded](#isexcluded)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) classOrPkgName)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |                                                                                    |
| protected void                                                                                                  | [error](#error)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |                                                                                    |



## Field Details

### DOT_CLASS

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __DOT_CLASS__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### DOT_JAR

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __DOT_JAR__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### MODULE_INFO

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __MODULE_INFO__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### classNames

<span style="font-family: monospace; font-size: 80%;">protected Set<String> __classNames__</span>




---

### classToModule

<span style="font-family: monospace; font-size: 80%;">protected Map<String, String> __classToModule__</span>




---

### descriptors

<span style="font-family: monospace; font-size: 80%;">protected Map<String, ModuleDescriptor> __descriptors__</span>




---

### discoveredModules

<span style="font-family: monospace; font-size: 80%;">protected Map<String, DiscoveredModule> __discoveredModules__</span>




---

### excluded

<span style="font-family: monospace; font-size: 80%;">protected Set<String> __excluded__</span>




---

### reporter

<span style="font-family: monospace; font-size: 80%;">protected Reporter __reporter__</span>




---

### virtualReferencePath

<span style="font-family: monospace; font-size: 80%;">protected Path __virtualReferencePath__</span>




---


## Method Details

### scanDirectoryUrl

<span style="font-family: monospace; font-size: 80%;">protected abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __scanDirectoryUrl__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [URL](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URL.html)[] urls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>




---

### getClasses

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html) __getClasses__()</span>




---

### containsClass

<span style="font-family: monospace; font-size: 80%;">public boolean __containsClass__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className)</span>




---

### getDiscoveredModules

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html) __getDiscoveredModules__()</span>




---

### pathSet

<span style="font-family: monospace; font-size: 80%;">protected static [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html) __pathSet__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) classPath)</span>




---

### scanJar

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __scanJar__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>




---

### scanDirectory

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __scanDirectory__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>




---

### scanClassFile

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __scanClassFile__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) file, [URLClassLoader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URLClassLoader.html) classLoader, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> discovered)</span>



**Throws:**

[LocalizableIOException](../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableIOException.md)


---

### register

<span style="font-family: monospace; font-size: 80%;">protected void __register__([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> discovered, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath)</span>




---

### addModuleDescriptor

<span style="font-family: monospace; font-size: 80%;">protected void __addModuleDescriptor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [ModuleDescriptor](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/module/ModuleDescriptor.html) descriptor)</span>




---

### getPath

<span style="font-family: monospace; font-size: 80%;">protected [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getPath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) pathString)</span>

Parse path using virtual file system if provided, otherwise default OS file system


---

### isExcluded

<span style="font-family: monospace; font-size: 80%;">protected boolean __isExcluded__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) classOrPkgName)</span>




---

### error

<span style="font-family: monospace; font-size: 80%;">protected void __error__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)</span>




---

