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

| Modifier and Type                                                                                                  | Method                                                                                                                                                            | Description |
|--------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>        | [getGenericTypeOfListField](#getgenerictypeoflistfield)([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field) |             |
| public static [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>        | [getGenericTypeOfMapKey](#getgenerictypeofmapkey)([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field)       |             |
| public static [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>        | [getGenericTypeOfMapValue](#getgenerictypeofmapvalue)([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field)   |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)         | [getTestName](#gettestname)()                                                                                                                                     |             |
| public static [Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html) | [getTestMethod](#gettestmethod)()                                                                                                                                 |             |
| public static io.github.qishr.cascara.common.util.Pair<java.lang.Class<?>                                          | [getCaller](#getcaller)()                                                                                                                                         |             |
| public static io.github.qishr.cascara.common.util.Pair<java.lang.Class<?>                                          | [getCaller](#getcaller)(boolean ignoreQueryingClass)                                                                                                              |             |



## Method Details

### getGenericTypeOfListField

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> __getGenericTypeOfListField__([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field)</span>




---

### getGenericTypeOfMapKey

<span style="font-family: monospace; font-size: 80%;">public static [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> __getGenericTypeOfMapKey__([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field)</span>




---

### getGenericTypeOfMapValue

<span style="font-family: monospace; font-size: 80%;">public static [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> __getGenericTypeOfMapValue__([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field)</span>




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

