Package [io.github.qishr.cascara.common.util](index.md)

# Class JarFile
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.util.ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)<br/>
                io.github.qishr.cascara.common.util.JarFile<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __JarFile__<br/>extends [ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)
</span>


## Method Summary

| Modifier and Type                                                                                                                                                                           | Method                                                                                                                                  | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [JarFile](../../../../../../io/github/qishr/cascara/common/util/JarFile.md)                                                                                                   | [open](#open)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath)                     |             |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                         | [getPath](#getpath)()                                                                                                                   |             |
| public [JarManifest](../../../../../../io/github/qishr/cascara/common/util/JarManifest.md)                                                                                                  | [getManifest](#getmanifest)()                                                                                                           |             |
| public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md)                                                                                                | [getMavenProperties](#getmavenproperties)()                                                                                             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                         | [getModuleName](#getmodulename)()                                                                                                       |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getPackages](#getpackages)()                                                                                                           |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getClassNames](#getclassnames)()                                                                                                       |             |
| public java.lang.@io.github.qishr.cascara.common.annotation.Experimental String                                                                                                             | [guessoduleName](#guessodulename)()                                                                                                     |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                  | [getClassName](#getclassname)([EntryInfo](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.EntryInfo.md) fileInfo)     |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                  | [getPackageName](#getpackagename)([EntryInfo](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.EntryInfo.md) fileInfo) |             |


### Methods inherited from [ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)

create, getInputStream, addFile, addFile, listFiles, addDirectory, listFiles, walk, extractFile, addDirectory, listFiles, extractFile, close


## Method Details

### open

<span style="font-family: monospace; font-size: 80%;">public static [JarFile](../../../../../../io/github/qishr/cascara/common/util/JarFile.md) __open__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath)</span>



**Throws:**

[LocalizableIOException](../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableIOException.md)


---

### getPath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getPath__()</span>




---

### getManifest

<span style="font-family: monospace; font-size: 80%;">public [JarManifest](../../../../../../io/github/qishr/cascara/common/util/JarManifest.md) __getManifest__()</span>




---

### getMavenProperties

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) __getMavenProperties__()</span>




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

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getClassName__([EntryInfo](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.EntryInfo.md) fileInfo)</span>




---

### getPackageName

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getPackageName__([EntryInfo](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.EntryInfo.md) fileInfo)</span>




---

