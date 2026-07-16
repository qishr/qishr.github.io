Package [io.github.qishr.cascara.common.util](index.md)

# Class JreUtil
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.JreUtil<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __JreUtil__</span>


## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| JreUtil()   |             |



## Method Summary

| Modifier and Type                                                                                                  | Method                                                                                                                                                                                                                                              | Description                                  |
|--------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------|
| public static [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) | [getResourceAsStream](#getresourceasstream)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path) | Returns an `InputStream `for a JRE resource. |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)         | [getPackageNameFromResourcePath](#getpackagenamefromresourcepath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path)                                                                                |                                              |



## Method Details

### getResourceAsStream

<span style="font-family: monospace; font-size: 80%;">public static [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) __getResourceAsStream__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path)</span>

Returns an `InputStream `for a JRE resource.

**Returns:**

The `InputStream` returned by `Class.getResourceAsStream`.

**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

### getPackageNameFromResourcePath

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getPackageNameFromResourcePath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path)</span>




---

