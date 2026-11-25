Package [io.github.qishr.cascara.common.util](index.md)

# Class JarFile
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.util.ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md)<br/>
                io.github.qishr.cascara.common.util.JarFile<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __JarFile__<br/>extends [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md)
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                               | Description |
|-------------------|-------------------------------------------------------------------------------------|-------------|
| public            | [io.github.qishr.cascara.common.util.JarFile.JarFileEntry](JarFile.JarFileEntry.md) |             |



## Field Summary

| Modifier and Type                                                                                                | Field                       | Description |
|------------------------------------------------------------------------------------------------------------------|-----------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [MANIFEST_MF](#manifest_mf) |             |



## Method Summary

| Modifier and Type                                                                                           | Method                                                                                                                                        | Description |
|-------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [JarFile](../../../../../../io/github/qishr/cascara/common/util/JarFile.md)                   | [open](#open)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath)                           |             |
| public static [JarFile](../../../../../../io/github/qishr/cascara/common/util/JarFile.md)                   | [open](#open)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath, boolean verify)           |             |
| public [JarManifest](../../../../../../io/github/qishr/cascara/common/util/JarManifest.md)                  | [getManifest](#getmanifest)()                                                                                                                 |             |
| public [JarEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/jar/JarEntry.html) | [getJarEntry](#getjarentry)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)             | [getJarEntries](#getjarentries)()                                                                                                             |             |
| public [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) | [getInputStream](#getinputstream)([ZipEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/zip/ZipEntry.html) entry) |             |
| public [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) | [getInputStream](#getinputstream)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)     |             |
| public byte[]                                                                                               | [extractFile](#extractfile)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)           |             |
| public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md)                | [getMavenProperties](#getmavenproperties)()                                                                                                   |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)         | [getModuleName](#getmodulename)()                                                                                                             |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)               | [getPackages](#getpackages)()                                                                                                                 |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)               | [getClassNames](#getclassnames)()                                                                                                             |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)  | [getClassName](#getclassname)([ZipEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/zip/ZipEntry.html) entry)     |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)  | [getPackageName](#getpackagename)([ZipEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/zip/ZipEntry.html) entry) |             |
| public final boolean                                                                                        | [isMultiRelease](#ismultirelease)()                                                                                                           |             |


### Methods inherited from [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md)

create, addFile, listEntries, addFile, remove, getEntries, addDirectory, addFile, walk, addDirectory, extractFile, getEntries, getEntries, getComment, getEntry, stream, getPath, close, size


## Field Details

### MANIFEST_MF

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __MANIFEST_MF__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### open

<span style="font-family: monospace; font-size: 80%;">public static [JarFile](../../../../../../io/github/qishr/cascara/common/util/JarFile.md) __open__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### open

<span style="font-family: monospace; font-size: 80%;">public static [JarFile](../../../../../../io/github/qishr/cascara/common/util/JarFile.md) __open__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath, boolean verify)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### getManifest

<span style="font-family: monospace; font-size: 80%;">public [JarManifest](../../../../../../io/github/qishr/cascara/common/util/JarManifest.md) __getManifest__()</span>




---

### getJarEntry

<span style="font-family: monospace; font-size: 80%;">public [JarEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/jar/JarEntry.html) __getJarEntry__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getJarEntries

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getJarEntries__()</span>




---

### getInputStream

<span style="font-family: monospace; font-size: 80%;">public [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) __getInputStream__([ZipEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/zip/ZipEntry.html) entry)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### getInputStream

<span style="font-family: monospace; font-size: 80%;">public [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) __getInputStream__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### extractFile

<span style="font-family: monospace; font-size: 80%;">public byte[] __extractFile__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### getMavenProperties

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) __getMavenProperties__()</span>




---

### getModuleName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getModuleName__()</span>




---

### getPackages

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html) __getPackages__()</span>




---

### getClassNames

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html) __getClassNames__()</span>




---

### getClassName

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getClassName__([ZipEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/zip/ZipEntry.html) entry)</span>




---

### getPackageName

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getPackageName__([ZipEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/zip/ZipEntry.html) entry)</span>




---

### isMultiRelease

<span style="font-family: monospace; font-size: 80%;">public final boolean __isMultiRelease__()</span>




---

