Package [io.github.qishr.cascara.common.exec](index.md)

# Class JvmConfig
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.exec.JvmConfig<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __JvmConfig__</span>


## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| JvmConfig() |             |



## Method Summary

| Modifier and Type                                                                                       | Method                                                                                                                                                                                                                                        | Description                                                                                                |
|---------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)           | [getSystemProperties](#getsystemproperties)()                                                                                                                                                                                                 |                                                                                                            |
| public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md)                  | [setSystemProperty](#setsystemproperty)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value) |                                                                                                            |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)           | [getEnv](#getenv)()                                                                                                                                                                                                                           |                                                                                                            |
| public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md)                  | [setEnv](#setenv)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)                       |                                                                                                            |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)         | [getModules](#getmodules)()                                                                                                                                                                                                                   |                                                                                                            |
| public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md)                  | [addModule](#addmodule)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)                                                                                                              |                                                                                                            |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)         | [getOpens](#getopens)()                                                                                                                                                                                                                       |                                                                                                            |
| public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md)                  | [addOpens](#addopens)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) target)                                                                                                                    | Configures JPMS --add-opens syntax: module/package=targetModule e.g., "java.base/java.lang=cascara.common" |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)         | [getReads](#getreads)()                                                                                                                                                                                                                       |                                                                                                            |
| public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md)                  | [addReads](#addreads)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) target)                                                                                                                    | Configures JPMS --add-reads syntax: sourceModule=targetModule                                              |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)     | [getModulePath](#getmodulepath)()                                                                                                                                                                                                             |                                                                                                            |
| public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md)                  | [setModulePath](#setmodulepath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) modulePath)                                                                                                      |                                                                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)     | [getClassPath](#getclasspath)()                                                                                                                                                                                                               |                                                                                                            |
| public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md)                  | [setClassPath](#setclasspath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) classPath)                                                                                                         |                                                                                                            |
| public boolean                                                                                          | [inheritParentModulePath](#inheritparentmodulepath)()                                                                                                                                                                                         |                                                                                                            |
| public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md)                  | [setInheritParentModulePath](#setinheritparentmodulepath)(boolean inherit)                                                                                                                                                                    |                                                                                                            |
| public boolean                                                                                          | [inheritParentClassPath](#inheritparentclasspath)()                                                                                                                                                                                           |                                                                                                            |
| public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md)                  | [setInheritParentClassPath](#setinheritparentclasspath)(boolean inherit)                                                                                                                                                                      |                                                                                                            |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)         | [getArgs](#getargs)()                                                                                                                                                                                                                         |                                                                                                            |
| public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md)                  | [setArg](#setarg)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) arg)                                                                                                                           |                                                                                                            |
| public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md)                  | [setArgs](#setargs)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                      |                                                                                                            |
| public [Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html) | [getTimeout](#gettimeout)()                                                                                                                                                                                                                   |                                                                                                            |
| public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md)                  | [setTimeout](#settimeout)([Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html) timeout)                                                                                                           |                                                                                                            |
| public boolean                                                                                          | [debug](#debug)()                                                                                                                                                                                                                             |                                                                                                            |
| public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md)                  | [setDebug](#setdebug)(boolean enabled)                                                                                                                                                                                                        |                                                                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)     | [getModuleName](#getmodulename)()                                                                                                                                                                                                             |                                                                                                            |
| public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md)                  | [setModuleName](#setmodulename)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                            |                                                                                                            |



## Method Details

### getSystemProperties

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html) __getSystemProperties__()</span>




---

### setSystemProperty

<span style="font-family: monospace; font-size: 80%;">public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) __setSystemProperty__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>




---

### getEnv

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html) __getEnv__()</span>




---

### setEnv

<span style="font-family: monospace; font-size: 80%;">public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) __setEnv__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>




---

### getModules

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getModules__()</span>




---

### addModule

<span style="font-family: monospace; font-size: 80%;">public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) __addModule__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName)</span>




---

### getOpens

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getOpens__()</span>




---

### addOpens

<span style="font-family: monospace; font-size: 80%;">public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) __addOpens__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) target)</span>

Configures JPMS --add-opens syntax: module/package=targetModule
e.g., "java.base/java.lang=cascara.common"


---

### getReads

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getReads__()</span>




---

### addReads

<span style="font-family: monospace; font-size: 80%;">public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) __addReads__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) target)</span>

Configures JPMS --add-reads syntax: sourceModule=targetModule


---

### getModulePath

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getModulePath__()</span>




---

### setModulePath

<span style="font-family: monospace; font-size: 80%;">public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) __setModulePath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) modulePath)</span>




---

### getClassPath

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getClassPath__()</span>




---

### setClassPath

<span style="font-family: monospace; font-size: 80%;">public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) __setClassPath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) classPath)</span>




---

### inheritParentModulePath

<span style="font-family: monospace; font-size: 80%;">public boolean __inheritParentModulePath__()</span>




---

### setInheritParentModulePath

<span style="font-family: monospace; font-size: 80%;">public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) __setInheritParentModulePath__(boolean inherit)</span>




---

### inheritParentClassPath

<span style="font-family: monospace; font-size: 80%;">public boolean __inheritParentClassPath__()</span>




---

### setInheritParentClassPath

<span style="font-family: monospace; font-size: 80%;">public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) __setInheritParentClassPath__(boolean inherit)</span>




---

### getArgs

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getArgs__()</span>




---

### setArg

<span style="font-family: monospace; font-size: 80%;">public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) __setArg__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) arg)</span>




---

### setArgs

<span style="font-family: monospace; font-size: 80%;">public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) __setArgs__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>




---

### getTimeout

<span style="font-family: monospace; font-size: 80%;">public [Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html) __getTimeout__()</span>




---

### setTimeout

<span style="font-family: monospace; font-size: 80%;">public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) __setTimeout__([Duration](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/Duration.html) timeout)</span>




---

### debug

<span style="font-family: monospace; font-size: 80%;">public boolean __debug__()</span>




---

### setDebug

<span style="font-family: monospace; font-size: 80%;">public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) __setDebug__(boolean enabled)</span>




---

### getModuleName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getModuleName__()</span>




---

### setModuleName

<span style="font-family: monospace; font-size: 80%;">public [JvmConfig](../../../../../../io/github/qishr/cascara/common/exec/JvmConfig.md) __setModuleName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

