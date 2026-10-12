Package [io.github.qishr.cascara.common.util](index.md)

# Class ClassPath
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.util.AbstractLibraryScanner](../../../../../../io/github/qishr/cascara/common/util/AbstractLibraryScanner.md)<br/>
                io.github.qishr.cascara.common.util.ClassPath<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ClassPath__<br/>extends [AbstractLibraryScanner](../../../../../../io/github/qishr/cascara/common/util/AbstractLibraryScanner.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ClassPath()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |             |
| ClassPath([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) classPath)                                                                                                                                                                                                                                                                                                                                                                                                            |             |
| ClassPath([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) classPath, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) virtualReferencePath)                                                                                                                                                                                                                                                                                         |             |
| ClassPath([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> classPaths, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) virtualReferencePath)                                                                                                                                                                                                |             |
| ClassPath([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> classPaths, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> excluded)                                                                                                                    |             |
| ClassPath([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> classPaths, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> excluded, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) virtualReferencePath) |             |



## Method Summary

| Modifier and Type                                                                                      | Method                                                                                                                                                                                                                                                                                                                                               | Description |
|--------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected void                                                                                         | [addModuleDescriptor](#addmoduledescriptor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [ModuleDescriptor](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/module/ModuleDescriptor.html) descriptor)                                                             |             |
| protected void                                                                                         | [addModuleLocation](#addmodulelocation)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path)                                                                                                  |             |
| protected void                                                                                         | [addClassToModule](#addclasstomodule)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)                                                                                               |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [scanDirectoryUrl](#scandirectoryurl)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [URL](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URL.html)[] urls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName) |             |


### Methods inherited from [AbstractLibraryScanner](../../../../../../io/github/qishr/cascara/common/util/AbstractLibraryScanner.md)

getClasses, scanDirectory, pathSet, scanJar, error, scanClassFile, addClass, isExcluded


## Method Details

### addModuleDescriptor

<span style="font-family: monospace; font-size: 80%;">protected void __addModuleDescriptor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [ModuleDescriptor](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/module/ModuleDescriptor.html) descriptor)</span>



**Overrides:**

[AbstractLibraryScanner](../../../../../../../cascara.common/io/github/qishr/cascara/common/util/AbstractLibraryScanner.md#addmoduledescriptor)


---

### addModuleLocation

<span style="font-family: monospace; font-size: 80%;">protected void __addModuleLocation__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path)</span>



**Overrides:**

[AbstractLibraryScanner](../../../../../../../cascara.common/io/github/qishr/cascara/common/util/AbstractLibraryScanner.md#addmodulelocation)


---

### addClassToModule

<span style="font-family: monospace; font-size: 80%;">protected void __addClassToModule__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>



**Overrides:**

[AbstractLibraryScanner](../../../../../../../cascara.common/io/github/qishr/cascara/common/util/AbstractLibraryScanner.md#addclasstomodule)


---

### scanDirectoryUrl

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __scanDirectoryUrl__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [URL](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URL.html)[] urls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>




---

