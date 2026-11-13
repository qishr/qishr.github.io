Package [io.github.qishr.cascara.common.util](index.md)

# Class ClassPath
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.util.AbstractClassFinder](../../../../../../io/github/qishr/cascara/common/util/AbstractClassFinder.md)<br/>
                io.github.qishr.cascara.common.util.ClassPath<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ClassPath__<br/>extends [AbstractClassFinder](../../../../../../io/github/qishr/cascara/common/util/AbstractClassFinder.md)
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
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [scanDirectoryUrl](#scandirectoryurl)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [URL](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URL.html)[] urls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName) |             |


### Methods inherited from [AbstractClassFinder](../../../../../../io/github/qishr/cascara/common/util/AbstractClassFinder.md)

getClasses, getPath, scanDirectory, register, pathSet, scanJar, getDiscoveredModules, error, scanClassFile, addModuleDescriptor, isExcluded, containsClass


## Method Details

### scanDirectoryUrl

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __scanDirectoryUrl__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) directory, [URL](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URL.html)[] urls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>




---

