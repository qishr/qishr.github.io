Package [io.github.qishr.cascara.common.util](index.md)

# Class JarManifest
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.JarManifest<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __JarManifest__</span>


## Constructor Summary

| Constructor   | Description |
|---------------|-------------|
| JarManifest() |             |



## Method Summary

| Modifier and Type                         | Method                                                                                                                 | Description                                                                                                                      |
|-------------------------------------------|------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| public static [Properties](Properties.md) | [parse](#parse)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) manifest) | Parses the content of a MANIFEST.MF file string, handles line continuations, and prints the resulting property names and values. |



## Method Details

### parse

<span style="font-family: monospace; font-size: 80%;">public static [Properties](Properties.md) __parse__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) manifest)</span>

Parses the content of a MANIFEST.MF file string, handles line continuations,
and prints the resulting property names and values.

**Parameters:**

`manifest` - The string containing the MANIFEST.MF file content.


---

