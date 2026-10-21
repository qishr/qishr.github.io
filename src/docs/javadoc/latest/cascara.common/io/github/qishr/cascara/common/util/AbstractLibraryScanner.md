Package [io.github.qishr.cascara.common.util](index.md)

# Class AbstractLibraryScanner
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.AbstractLibraryScanner<br/>
<br/>
Direct Known Subtypes:<br/>
    [ClassPath](../../../../../../io/github/qishr/cascara/common/util/ClassPath.md), [ModulePath](../../../../../../io/github/qishr/cascara/common/util/ModulePath.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractLibraryScanner__</span>


## Field Summary

| Modifier and Type                                                                                                   | Field                                         | Description |
|---------------------------------------------------------------------------------------------------------------------|-----------------------------------------------|-------------|
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [DOT_CLASS](#dot_class)                       |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [DOT_JAR](#dot_jar)                           |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [MODULE_INFO](#module_info)                   |             |
| protected Set<String>                                                                                               | [classNames](#classnames)                     |             |
| protected Set<String>                                                                                               | [excluded](#excluded)                         |             |
| protected Reporter                                                                                                  | [reporter](#reporter)                         |             |
| protected Path                                                                                                      | [virtualReferencePath](#virtualreferencepath) |             |



## Constructor Summary

| Constructor              | Description |
|--------------------------|-------------|
| AbstractLibraryScanner() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                     | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected abstract void                                                                                                                                                                               | [addModuleDescriptor](#addmoduledescriptor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [ModuleDescriptor](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/module/ModuleDescriptor.html) descriptor)                                                                                                                                                                                                                                                                                                                                                                                      |             |
| protected abstract void                                                                                                                                                                               | [addModuleLocation](#addmodulelocation)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path)                                                                                                                                                                                                                                                                                                                                                                                                                           |             |
| protected abstract void                                                                                                                                                                               | [addClassToModule](#addclasstomodule)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)                                                                                                                                                                                                                                                                                                                                                                                                                        |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>           | [getClasses](#getclasses)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |             |
| protected static [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [pathSet](#pathset)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) classPath)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                | [scanJar](#scanjar)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)                                                                                                                                                                                                                                                                                                                                                                                                                                               |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                | [scanDirectory](#scandirectory)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)                                                                                                                                                                                                                                                                                                                                                                                                                              |             |
| protected boolean                                                                                                                                                                                     | [isExcluded](#isexcluded)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |             |
| protected void                                                                                                                                                                                        | [addClass](#addclass)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |             |
| protected abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                       | [scanDirectoryUrl](#scandirectoryurl)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [URL](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URL.html)[] urls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)                                                                                                                                                                                                                                                                                                                          |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                   | [scanClassFile](#scanclassfile)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) file, [URLClassLoader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URLClassLoader.html) classLoader, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> discovered) |             |
| protected void                                                                                                                                                                                        | [error](#error)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |             |



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

### addModuleDescriptor

<span style="font-family: monospace; font-size: 80%;">protected abstract void __addModuleDescriptor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [ModuleDescriptor](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/module/ModuleDescriptor.html) descriptor)</span>




---

### addModuleLocation

<span style="font-family: monospace; font-size: 80%;">protected abstract void __addModuleLocation__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path)</span>




---

### addClassToModule

<span style="font-family: monospace; font-size: 80%;">protected abstract void __addClassToModule__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>




---

### getClasses

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getClasses__()</span>




---

### pathSet

<span style="font-family: monospace; font-size: 80%;">protected static [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __pathSet__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) classPath)</span>




---

### scanJar

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __scanJar__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>




---

### scanDirectory

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __scanDirectory__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>




---

### isExcluded

<span style="font-family: monospace; font-size: 80%;">protected boolean __isExcluded__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className)</span>




---

### addClass

<span style="font-family: monospace; font-size: 80%;">protected void __addClass__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className)</span>




---

### scanDirectoryUrl

<span style="font-family: monospace; font-size: 80%;">protected abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __scanDirectoryUrl__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [URL](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URL.html)[] urls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>




---

### scanClassFile

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __scanClassFile__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) file, [URLClassLoader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URLClassLoader.html) classLoader, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> discovered)</span>



**Throws:**

[LocalizableIOException](../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableIOException.md)


---

### error

<span style="font-family: monospace; font-size: 80%;">protected void __error__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)</span>




---

