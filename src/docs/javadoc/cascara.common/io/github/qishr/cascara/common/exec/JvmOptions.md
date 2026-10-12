Package [io.github.qishr.cascara.common.exec](index.md)

# Class JvmOptions
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.exec.JvmOptions<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Beta<br/>
public class __JvmOptions__</span>


## Constructor Summary

| Constructor  | Description |
|--------------|-------------|
| JvmOptions() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                         | Method                                                                                                                                                                                                                                        | Description                                                                                                |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getSystemProperties](#getsystemproperties)()                                                                                                                                                                                                 |                                                                                                            |
| public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md)                                                                                                                                                                                                  | [setSystemProperty](#setsystemproperty)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |                                                                                                            |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getEnv](#getenv)()                                                                                                                                                                                                                           |                                                                                                            |
| public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md)                                                                                                                                                                                                  | [setEnv](#setenv)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)                       |                                                                                                            |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                                                                                             | [getModules](#getmodules)()                                                                                                                                                                                                                   |                                                                                                            |
| public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md)                                                                                                                                                                                                  | [addModule](#addmodule)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)                                                                                                              |                                                                                                            |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                                                                                             | [getOpens](#getopens)()                                                                                                                                                                                                                       |                                                                                                            |
| public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md)                                                                                                                                                                                                  | [addOpens](#addopens)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) target)                                                                                                                    | Configures JPMS --add-opens syntax: module/package=targetModule e.g., "java.base/java.lang=cascara.common" |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                                                                                             | [getReads](#getreads)()                                                                                                                                                                                                                       |                                                                                                            |
| public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md)                                                                                                                                                                                                  | [addReads](#addreads)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) target)                                                                                                                    | Configures JPMS --add-reads syntax: sourceModule=targetModule                                              |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getModulePath](#getmodulepath)()                                                                                                                                                                                                             |                                                                                                            |
| public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md)                                                                                                                                                                                                  | [setModulePath](#setmodulepath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) modulePath)                                                                                                      |                                                                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getClassPath](#getclasspath)()                                                                                                                                                                                                               |                                                                                                            |
| public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md)                                                                                                                                                                                                  | [setClassPath](#setclasspath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) classPath)                                                                                                         |                                                                                                            |
| public boolean                                                                                                                                                                                                                                                                            | [inheritParentModulePath](#inheritparentmodulepath)()                                                                                                                                                                                         |                                                                                                            |
| public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md)                                                                                                                                                                                                  | [setInheritParentModulePath](#setinheritparentmodulepath)(boolean inherit)                                                                                                                                                                    |                                                                                                            |
| public boolean                                                                                                                                                                                                                                                                            | [inheritParentClassPath](#inheritparentclasspath)()                                                                                                                                                                                           |                                                                                                            |
| public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md)                                                                                                                                                                                                  | [setInheritParentClassPath](#setinheritparentclasspath)(boolean inherit)                                                                                                                                                                      |                                                                                                            |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                                                                                             | [getArgs](#getargs)()                                                                                                                                                                                                                         |                                                                                                            |
| public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md)                                                                                                                                                                                                  | [setArg](#setarg)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) arg)                                                                                                                           |                                                                                                            |
| public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md)                                                                                                                                                                                                  | [setArgs](#setargs)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                      |                                                                                                            |
| public [Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html)                                                                                                                                                                                   | [getTimeout](#gettimeout)()                                                                                                                                                                                                                   |                                                                                                            |
| public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md)                                                                                                                                                                                                  | [setTimeout](#settimeout)([Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html) timeout)                                                                                                           |                                                                                                            |
| public boolean                                                                                                                                                                                                                                                                            | [debug](#debug)()                                                                                                                                                                                                                             |                                                                                                            |
| public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md)                                                                                                                                                                                                  | [setDebug](#setdebug)(boolean enabled)                                                                                                                                                                                                        |                                                                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getModuleName](#getmodulename)()                                                                                                                                                                                                             |                                                                                                            |
| public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md)                                                                                                                                                                                                  | [setModuleName](#setmodulename)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                            |                                                                                                            |



## Method Details

### getSystemProperties

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getSystemProperties__()</span>




---

### setSystemProperty

<span style="font-family: monospace; font-size: 80%;">public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) __setSystemProperty__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>




---

### getEnv

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getEnv__()</span>




---

### setEnv

<span style="font-family: monospace; font-size: 80%;">public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) __setEnv__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>




---

### getModules

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getModules__()</span>




---

### addModule

<span style="font-family: monospace; font-size: 80%;">public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) __addModule__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>




---

### getOpens

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getOpens__()</span>




---

### addOpens

<span style="font-family: monospace; font-size: 80%;">public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) __addOpens__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) target)</span>

Configures JPMS --add-opens syntax: module/package=targetModule
e.g., "java.base/java.lang=cascara.common"


---

### getReads

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getReads__()</span>




---

### addReads

<span style="font-family: monospace; font-size: 80%;">public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) __addReads__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) target)</span>

Configures JPMS --add-reads syntax: sourceModule=targetModule


---

### getModulePath

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getModulePath__()</span>




---

### setModulePath

<span style="font-family: monospace; font-size: 80%;">public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) __setModulePath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) modulePath)</span>




---

### getClassPath

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getClassPath__()</span>




---

### setClassPath

<span style="font-family: monospace; font-size: 80%;">public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) __setClassPath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) classPath)</span>




---

### inheritParentModulePath

<span style="font-family: monospace; font-size: 80%;">public boolean __inheritParentModulePath__()</span>




---

### setInheritParentModulePath

<span style="font-family: monospace; font-size: 80%;">public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) __setInheritParentModulePath__(boolean inherit)</span>




---

### inheritParentClassPath

<span style="font-family: monospace; font-size: 80%;">public boolean __inheritParentClassPath__()</span>




---

### setInheritParentClassPath

<span style="font-family: monospace; font-size: 80%;">public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) __setInheritParentClassPath__(boolean inherit)</span>




---

### getArgs

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getArgs__()</span>




---

### setArg

<span style="font-family: monospace; font-size: 80%;">public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) __setArg__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) arg)</span>




---

### setArgs

<span style="font-family: monospace; font-size: 80%;">public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) __setArgs__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>




---

### getTimeout

<span style="font-family: monospace; font-size: 80%;">public [Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html) __getTimeout__()</span>




---

### setTimeout

<span style="font-family: monospace; font-size: 80%;">public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) __setTimeout__([Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html) timeout)</span>




---

### debug

<span style="font-family: monospace; font-size: 80%;">public boolean __debug__()</span>




---

### setDebug

<span style="font-family: monospace; font-size: 80%;">public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) __setDebug__(boolean enabled)</span>




---

### getModuleName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getModuleName__()</span>




---

### setModuleName

<span style="font-family: monospace; font-size: 80%;">public [JvmOptions](../../../../../../io/github/qishr/cascara/common/exec/JvmOptions.md) __setModuleName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

