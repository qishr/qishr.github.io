Package [io.github.qishr.cascara.common.util](index.md)

# Class JreUtils
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.JreUtils<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __JreUtils__</span>


## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| JreUtils()  |             |



## Method Summary

| Modifier and Type                                                                                                        | Method                                                                                                                                                                                                                                              | Description                                  |
|--------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------|
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)               | [getResourceAsString](#getresourceasstring)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path) |                                              |
| public static [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html)       | [getResourceAsStream](#getresourceasstream)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path) | Returns an `InputStream` for a JRE resource. |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)               | [getPackageNameFromResourcePath](#getpackagenamefromresourcepath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path)                                                                                |                                              |
| public static [ProcessHandle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/ProcessHandle.html) | [parentProcess](#parentprocess)()                                                                                                                                                                                                                   |                                              |
| public static boolean                                                                                                    | [isRunningInTerminal](#isrunninginterminal)()                                                                                                                                                                                                       |                                              |
| public static boolean                                                                                                    | [isRunningViaGradle](#isrunningviagradle)()                                                                                                                                                                                                         |                                              |
| public static boolean                                                                                                    | [isRunningViaEclipse](#isrunningviaeclipse)()                                                                                                                                                                                                       |                                              |



## Method Details

### getResourceAsString

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getResourceAsString__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### getResourceAsStream

<span style="font-family: monospace; font-size: 80%;">public static [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) __getResourceAsStream__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path)</span>

Returns an `InputStream` for a JRE resource.

**Returns:**

The `InputStream` returned by `Class.getResourceAsStream`.

**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

### getPackageNameFromResourcePath

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getPackageNameFromResourcePath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path)</span>




---

### parentProcess

<span style="font-family: monospace; font-size: 80%;">public static [ProcessHandle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/ProcessHandle.html) __parentProcess__()</span>




---

### isRunningInTerminal

<span style="font-family: monospace; font-size: 80%;">public static boolean __isRunningInTerminal__()</span>




---

### isRunningViaGradle

<span style="font-family: monospace; font-size: 80%;">public static boolean __isRunningViaGradle__()</span>




---

### isRunningViaEclipse

<span style="font-family: monospace; font-size: 80%;">public static boolean __isRunningViaEclipse__()</span>




---

