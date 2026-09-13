Package [io.github.qishr.cascara.common.util](index.md)

# Class JarManifest
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.property.Properties](../property/Properties.md)<br/>
                io.github.qishr.cascara.common.util.JarManifest<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __JarManifest__<br/>extends [Properties](../property/Properties.md)
</span>


## Method Summary

| Modifier and Type                           | Method                                                                                                                 | Description                                                                                                                      |
|---------------------------------------------|------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| public static [JarManifest](JarManifest.md) | [parse](#parse)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) manifest) | Parses the content of a MANIFEST.MF file string, handles line continuations, and prints the resulting property names and values. |
| public static [JarManifest](JarManifest.md) | [of](#of)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)         |                                                                                                                                  |
| public [SemVer](../semver/SemVer.md)        | [getVersion](#getversion)()                                                                                            |                                                                                                                                  |


### Methods inherited from [Properties](../property/Properties.md)

set, isEmpty, getValue, toString, getBoolean, getString, remove, set, getString, duplicate, set, containsKey, addAll, remove, getValues, getLong, add, getInt, set, getDouble, asList, getValuesMap, clear


## Method Details

### parse

<span style="font-family: monospace; font-size: 80%;">public static [JarManifest](JarManifest.md) __parse__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) manifest)</span>

Parses the content of a MANIFEST.MF file string, handles line continuations,
and prints the resulting property names and values.

**Parameters:**

`manifest` - The string containing the MANIFEST.MF file content.


---

### of

<span style="font-family: monospace; font-size: 80%;">public static [JarManifest](JarManifest.md) __of__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### getVersion

<span style="font-family: monospace; font-size: 80%;">public [SemVer](../semver/SemVer.md) __getVersion__()</span>




---

