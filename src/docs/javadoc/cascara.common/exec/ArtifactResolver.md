Package [io.github.qishr.cascara.common.exec](index.md)

# Class ArtifactResolver
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.exec.ArtifactResolver<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public final class __ArtifactResolver__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                                                                 | Method                                                                                                                                                                                                                                                                                                                                                | Description                                                                                                                                  |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|
| public static [Pair](../util/Pair.md)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [buildModulePath](#buildmodulepath)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> dependencies, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) subprojectName) |                                                                                                                                              |
| public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                                                        | [getProjectPath](#getprojectpath)()                                                                                                                                                                                                                                                                                                                   |                                                                                                                                              |
| public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                                                        | [getRootProjectPath](#getrootprojectpath)()                                                                                                                                                                                                                                                                                                           |                                                                                                                                              |
| public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                                                        | [getModulepathDir](#getmodulepathdir)()                                                                                                                                                                                                                                                                                                               |                                                                                                                                              |
| public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                                                        | [getModulepathDir](#getmodulepathdir)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) projectPath)                                                                                                                                                                                                       |                                                                                                                                              |
| public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                                                        | [resolveJarPath](#resolvejarpath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mavenName)                                                                                                                                                                                                             | Dynamically locates the compiled module JAR file by traversing up from the test class's location (handling both bin/ and build/ structures). |
| public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                                                        | [resolveJarPath](#resolvejarpath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mavenName, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) subprojectName)                                                                                                |                                                                                                                                              |



## Method Details

### buildModulePath

<span style="font-family: monospace; font-size: 80%;">public static [Pair](../util/Pair.md)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __buildModulePath__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> dependencies, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) subprojectName)</span>




---

### getProjectPath

<span style="font-family: monospace; font-size: 80%;">public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getProjectPath__()</span>




---

### getRootProjectPath

<span style="font-family: monospace; font-size: 80%;">public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getRootProjectPath__()</span>




---

### getModulepathDir

<span style="font-family: monospace; font-size: 80%;">public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getModulepathDir__()</span>




---

### getModulepathDir

<span style="font-family: monospace; font-size: 80%;">public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getModulepathDir__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) projectPath)</span>




---

### resolveJarPath

<span style="font-family: monospace; font-size: 80%;">public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __resolveJarPath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mavenName)</span>

Dynamically locates the compiled module JAR file by traversing up
from the test class's location (handling both bin/ and build/ structures).


---

### resolveJarPath

<span style="font-family: monospace; font-size: 80%;">public static [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __resolveJarPath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mavenName, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) subprojectName)</span>




---

