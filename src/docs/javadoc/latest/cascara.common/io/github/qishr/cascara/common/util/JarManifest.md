Package [io.github.qishr.cascara.common.util](index.md)

# Class JarManifest
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.util.jar.Manifest](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/jar/Manifest.html)<br/>
                io.github.qishr.cascara.common.util.JarManifest<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __JarManifest__<br/>extends [Manifest](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/jar/Manifest.html)
</span>


## Constructor Summary

| Constructor   | Description |
|---------------|-------------|
| JarManifest() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                                                | Description                                                                                                                      |
|-----------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| public static [JarManifest](../../../../../../io/github/qishr/cascara/common/util/JarManifest.md)   | [parse](#parse)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                                    | Parses the content of a MANIFEST.MF file string, handles line continuations, and prints the resulting property names and values. |
| public static [JarManifest](../../../../../../io/github/qishr/cascara/common/util/JarManifest.md)   | [of](#of)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                        |                                                                                                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getString](#getstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                            |                                                                                                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getString](#getstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultValue) |                                                                                                                                  |
| public [SemVer](../../../../../../io/github/qishr/cascara/common/semver/SemVer.md)                  | [getVersion](#getversion)()                                                                                                                                                                                                           |                                                                                                                                  |



## Method Details

### parse

<span style="font-family: monospace; font-size: 80%;">public static [JarManifest](../../../../../../io/github/qishr/cascara/common/util/JarManifest.md) __parse__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>

Parses the content of a MANIFEST.MF file string, handles line continuations,
and prints the resulting property names and values.

**Parameters:**

`text` - The string containing the MANIFEST.MF file content.


---

### of

<span style="font-family: monospace; font-size: 80%;">public static [JarManifest](../../../../../../io/github/qishr/cascara/common/util/JarManifest.md) __of__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### getString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultValue)</span>




---

### getVersion

<span style="font-family: monospace; font-size: 80%;">public [SemVer](../../../../../../io/github/qishr/cascara/common/semver/SemVer.md) __getVersion__()</span>




---

