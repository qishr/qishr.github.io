Package [io.github.qishr.cascara.common.util](index.md)

# Class ReflectionUtils
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.ReflectionUtils<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ReflectionUtils__</span>


## Constructor Summary

| Constructor       | Description |
|-------------------|-------------|
| ReflectionUtils() |             |



## Method Summary

| Modifier and Type                                                                                                  | Method                                                                                                                                                                                                                                          | Description |
|--------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static boolean                                                                                              | [isInstance](#isinstance)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) thisInstance, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) thatType) |             |
| public static boolean                                                                                              | [canAssign](#canassign)([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) fromThis, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> toThat)        |             |
| public static C                                                                                                    | [getRawClass](#getrawclass)([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType)                                                                                                           |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)         | [getTypeName](#gettypename)([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType)                                                                                                           |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)         | [getTestName](#gettestname)()                                                                                                                                                                                                                   |             |
| public static [Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html) | [getTestMethod](#gettestmethod)()                                                                                                                                                                                                               |             |
| public static io.github.qishr.cascara.common.util.Pair<java.lang.Class<?>                                          | [getCaller](#getcaller)()                                                                                                                                                                                                                       |             |
| public static io.github.qishr.cascara.common.util.Pair<java.lang.Class<?>                                          | [getCaller](#getcaller)(boolean ignoreQueryingClass)                                                                                                                                                                                            |             |



## Method Details

### isInstance

<span style="font-family: monospace; font-size: 80%;">public static boolean __isInstance__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) thisInstance, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) thatType)</span>




---

### canAssign

<span style="font-family: monospace; font-size: 80%;">public static boolean __canAssign__([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) fromThis, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> toThat)</span>




---

### getRawClass

<span style="font-family: monospace; font-size: 80%;">public static C __getRawClass__([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType)</span>




---

### getTypeName

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTypeName__([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType)</span>




---

### getTestName

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTestName__()</span>




---

### getTestMethod

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static [Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html) __getTestMethod__()</span>




---

### getCaller

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static io.github.qishr.cascara.common.util.Pair<java.lang.Class<?> __getCaller__()</span>




---

### getCaller

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static io.github.qishr.cascara.common.util.Pair<java.lang.Class<?> __getCaller__(boolean ignoreQueryingClass)</span>




---

