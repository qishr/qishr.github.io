Package [io.github.qishr.cascara.common.util](index.md)

# Class JarFile
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.util.ArchiveFile](ArchiveFile.md)<br/>
                io.github.qishr.cascara.common.util.JarFile<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __JarFile__<br/>extends [ArchiveFile](ArchiveFile.md)
</span>


## Method Summary

| Modifier and Type                                                                                                                                                                           | Method                                                                                                              | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|-------------|
| public static [JarFile](JarFile.md)                                                                                                                                                         | [open](#open)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath) |             |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                         | [getPath](#getpath)()                                                                                               |             |
| public [JarManifest](JarManifest.md)                                                                                                                                                        | [getManifest](#getmanifest)()                                                                                       |             |
| public [Properties](../property/Properties.md)                                                                                                                                              | [getMavenProperties](#getmavenproperties)()                                                                         |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                         | [getModuleName](#getmodulename)()                                                                                   |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getPackages](#getpackages)()                                                                                       |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getClassNames](#getclassnames)()                                                                                   |             |
| public java.lang.@io.github.qishr.cascara.common.annotation.Experimental String                                                                                                             | [guessoduleName](#guessodulename)()                                                                                 |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                  | [getClassName](#getclassname)([EntryInfo](ArchiveFile.EntryInfo.md) fileInfo)                                       |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                  | [getPackageName](#getpackagename)([EntryInfo](ArchiveFile.EntryInfo.md) fileInfo)                                   |             |


### Methods inherited from [ArchiveFile](ArchiveFile.md)

create, getInputStream, addFile, addFile, listFiles, addDirectory, listFiles, walk, extractFile, addDirectory, listFiles, extractFile, close


## Method Details

### open

<span style="font-family: monospace; font-size: 80%;">public static [JarFile](JarFile.md) __open__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath)</span>



**Throws:**

[LocalizableIOException](../diagnostic/exception/LocalizableIOException.md)


---

### getPath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getPath__()</span>




---

### getManifest

<span style="font-family: monospace; font-size: 80%;">public [JarManifest](JarManifest.md) __getManifest__()</span>




---

### getMavenProperties

<span style="font-family: monospace; font-size: 80%;">public [Properties](../property/Properties.md) __getMavenProperties__()</span>




---

### getModuleName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getModuleName__()</span>




---

### getPackages

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getPackages__()</span>




---

### getClassNames

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getClassNames__()</span>




---

### guessoduleName

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public java.lang.@io.github.qishr.cascara.common.annotation.Experimental String __guessoduleName__()</span>




---

### getClassName

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getClassName__([EntryInfo](ArchiveFile.EntryInfo.md) fileInfo)</span>




---

### getPackageName

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getPackageName__([EntryInfo](ArchiveFile.EntryInfo.md) fileInfo)</span>




---

