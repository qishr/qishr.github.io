Package [io.github.qishr.cascara.common.util](index.md)

# Interface ArchiveFile
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.ArchiveFile<br/>
<br/>
All Implemented Interfaces:<br/>
    [Closeable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Closeable.html)

All Known Implementing Classes:<br/>
    [ZipFile](../../../../../../io/github/qishr/cascara/common/util/ZipFile.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ArchiveFile__</span>


## Method Summary

| Modifier and Type                                                                                                    | Method                                                                                                                                                                                                                                         | Description |
|----------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract T                                                                                                    | [getEntry](#getentry)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                       |             |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)             | [getEntries](#getentries)()                                                                                                                                                                                                                    |             |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)             | [getEntries](#getentries)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                              |             |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)             | [getEntries](#getentries)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName, boolean subDirContents)                                                                                      |             |
| public abstract [Stream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html)  | [stream](#stream)()                                                                                                                                                                                                                            |             |
| public abstract int                                                                                                  | [size](#size)()                                                                                                                                                                                                                                |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)         | [getComment](#getcomment)()                                                                                                                                                                                                                    |             |
| public abstract [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) | [getInputStream](#getinputstream)(T entry)                                                                                                                                                                                                     |             |
| public abstract [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) | [getInputStream](#getinputstream)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                      |             |
| public abstract byte[]                                                                                               | [extractFile](#extractfile)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                            |             |
| public abstract [ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)                  | [addDirectory](#adddirectory)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) entryName)                                                                                                          |             |
| public abstract [ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)                  | [addDirectory](#adddirectory)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) sourcePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName) |             |
| public abstract [ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)                  | [addFile](#addfile)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) sourcePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)           |             |
| public abstract [ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)                  | [addFile](#addfile)(byte[] content, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                    |             |
| public abstract [ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)                  | [addFile](#addfile)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)              |             |
| public abstract [ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md)                  | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                                      |             |
| public abstract void                                                                                                 | [close](#close)()                                                                                                                                                                                                                              |             |



## Method Details

### getEntry

<span style="font-family: monospace; font-size: 80%;">public abstract T __getEntry__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getEntries__()</span>




---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getEntries__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>




---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getEntries__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName, boolean subDirContents)</span>




---

### stream

<span style="font-family: monospace; font-size: 80%;">public abstract [Stream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html) __stream__()</span>




---

### size

<span style="font-family: monospace; font-size: 80%;">public abstract int __size__()</span>




---

### getComment

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getComment__()</span>




---

### getInputStream

<span style="font-family: monospace; font-size: 80%;">public abstract [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) __getInputStream__(T entry)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### getInputStream

<span style="font-family: monospace; font-size: 80%;">public abstract [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) __getInputStream__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### extractFile

<span style="font-family: monospace; font-size: 80%;">public abstract byte[] __extractFile__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### addDirectory

<span style="font-family: monospace; font-size: 80%;">public abstract [ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md) __addDirectory__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### addDirectory

<span style="font-family: monospace; font-size: 80%;">public abstract [ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md) __addDirectory__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) sourcePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### addFile

<span style="font-family: monospace; font-size: 80%;">public abstract [ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md) __addFile__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) sourcePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### addFile

<span style="font-family: monospace; font-size: 80%;">public abstract [ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md) __addFile__(byte[] content, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### addFile

<span style="font-family: monospace; font-size: 80%;">public abstract [ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md) __addFile__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### remove

<span style="font-family: monospace; font-size: 80%;">public abstract [ArchiveFile](../../../../../../io/github/qishr/cascara/common/util/ArchiveFile.md) __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### close

<span style="font-family: monospace; font-size: 80%;">public abstract void __close__()</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)

**Specified By:**

[Closeable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Closeable.html)


---

