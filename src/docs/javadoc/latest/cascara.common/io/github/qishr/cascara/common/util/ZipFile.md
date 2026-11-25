Package [io.github.qishr.cascara.common.util](index.md)

# Class ZipFile
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.ZipFile<br/>
<br/>
All Implemented Interfaces:<br/>
    [ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)<[ZipEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/zip/ZipEntry.html)>

Direct Known Subtypes:<br/>
    [JarFile](../../../../../../io/github/qishr/cascara/common/util/JarFile.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __ZipFile__</span>


## Field Summary

| Modifier and Type | Field                       | Description |
|-------------------|-----------------------------|-------------|
| protected Path    | [archivePath](#archivepath) |             |



## Constructor Summary

| Constructor                                                                                                                       | Description |
|-----------------------------------------------------------------------------------------------------------------------------------|-------------|
| ZipFile([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath, boolean create) |             |



## Method Summary

| Modifier and Type                                                                                           | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Description |
|-------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md)                   | [open](#open)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |             |
| public static [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md)                   | [create](#create)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |             |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)         | [getPath](#getpath)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |             |
| public void                                                                                                 | [close](#close)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |             |
| public [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) | [getInputStream](#getinputstream)([ZipEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/zip/ZipEntry.html) entry)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |             |
| public [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) | [getInputStream](#getinputstream)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |             |
| public byte[]                                                                                               | [extractFile](#extractfile)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |             |
| public [ZipEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/zip/ZipEntry.html) | [getEntry](#getentry)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)             | [getEntries](#getentries)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)             | [getEntries](#getentries)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)             | [getEntries](#getentries)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName, boolean subDirContents)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |             |
| public [Stream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html)  | [stream](#stream)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |             |
| public int                                                                                                  | [size](#size)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)         | [getComment](#getcomment)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |             |
| public [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md)                          | [addDirectory](#adddirectory)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) entryName)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |             |
| public [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md)                          | [addDirectory](#adddirectory)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) sourcePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |             |
| public [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md)                          | [addFile](#addfile)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) sourcePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |             |
| public [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md)                          | [addFile](#addfile)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |             |
| public [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md)                          | [addFile](#addfile)(byte[] content, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |             |
| public [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md)                          | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |             |
| protected void                                                                                              | [walk](#walk)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) sourcePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)> exceptions, [BiConsumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/BiConsumer.html)<[Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html), [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)> run) |             |
| protected static byte[]                                                                                     | [extractFile](#extractfile)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |             |
| protected static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)   | [listEntries](#listentries)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName, boolean subDirContents)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |             |



## Field Details

### archivePath

<span style="font-family: monospace; font-size: 80%;">protected Path __archivePath__</span>




---


## Method Details

### open

<span style="font-family: monospace; font-size: 80%;">public static [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md) __open__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### create

<span style="font-family: monospace; font-size: 80%;">public static [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md) __create__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### getPath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getPath__()</span>




---

### close

<span style="font-family: monospace; font-size: 80%;">public void __close__()</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)

**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


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

**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


---

### extractFile

<span style="font-family: monospace; font-size: 80%;">public byte[] __extractFile__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)

**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


---

### getEntry

<span style="font-family: monospace; font-size: 80%;">public [ZipEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/zip/ZipEntry.html) __getEntry__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>



**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getEntries__()</span>



**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getEntries__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getEntries__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName, boolean subDirContents)</span>



**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


---

### stream

<span style="font-family: monospace; font-size: 80%;">public [Stream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html) __stream__()</span>



**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


---

### size

<span style="font-family: monospace; font-size: 80%;">public int __size__()</span>



**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


---

### getComment

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getComment__()</span>



**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


---

### addDirectory

<span style="font-family: monospace; font-size: 80%;">public [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md) __addDirectory__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)

**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


---

### addDirectory

<span style="font-family: monospace; font-size: 80%;">public [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md) __addDirectory__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) sourcePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)

**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


---

### addFile

<span style="font-family: monospace; font-size: 80%;">public [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md) __addFile__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) sourcePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)

**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


---

### addFile

<span style="font-family: monospace; font-size: 80%;">public [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md) __addFile__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)

**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


---

### addFile

<span style="font-family: monospace; font-size: 80%;">public [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md) __addFile__(byte[] content, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)

**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


---

### remove

<span style="font-family: monospace; font-size: 80%;">public [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md) __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)

**Specified By:**

[ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)


---

### walk

<span style="font-family: monospace; font-size: 80%;">protected void __walk__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) sourcePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)> exceptions, [BiConsumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/BiConsumer.html)<[Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html), [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)> run)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### extractFile

<span style="font-family: monospace; font-size: 80%;">protected static byte[] __extractFile__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### listEntries

<span style="font-family: monospace; font-size: 80%;">protected static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __listEntries__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName, boolean subDirContents)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

