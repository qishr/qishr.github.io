Package [io.github.qishr.cascara.common.util](index.md)

# Class ArchiveFile
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.ArchiveFile<br/>
<br/>
All Implemented Interfaces:<br/>
    [AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)

Direct Known Subtypes:<br/>
    [JarFile](JarFile.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __ArchiveFile__</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                 | Description |
|-------------------|---------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.util.ArchiveFile.EntryInfo](ArchiveFile.EntryInfo.md) |             |



## Field Summary

| Modifier and Type | Field                       | Description |
|-------------------|-----------------------------|-------------|
| protected Path    | [archivePath](#archivepath) |             |



## Constructor Summary

| Constructor                                                                                                                           | Description |
|---------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ArchiveFile([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath, boolean create) |             |



## Method Summary

| Modifier and Type                                                                                                                                | Method                                                                                                                                                                                                                                         | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [ArchiveFile](ArchiveFile.md)                                                                                                      | [load](#load)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath)                                                                                                                        |             |
| public static [ArchiveFile](ArchiveFile.md)                                                                                                      | [create](#create)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath)                                                                                                                    |             |
| public void                                                                                                                                      | [close](#close)()                                                                                                                                                                                                                              |             |
| public [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html)                                      | [getInputStream](#getinputstream)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) filePath)                                                                                                       |             |
| public byte[]                                                                                                                                    | [extractFile](#extractfile)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) filePath)                                                                                                             |             |
| protected static byte[]                                                                                                                          | [extractFile](#extractfile)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) filePath)   |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[EntryInfo](ArchiveFile.EntryInfo.md)>           | [listFiles](#listfiles)()                                                                                                                                                                                                                      |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[EntryInfo](ArchiveFile.EntryInfo.md)>           | [listFiles](#listfiles)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) dirPath)                                                                                                                  |             |
| public void                                                                                                                                      | [addDirectory](#adddirectory)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) dirPath)                                                                                                            |             |
| public void                                                                                                                                      | [addDirectory](#adddirectory)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) sourcePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName) |             |
| public void                                                                                                                                      | [addFile](#addfile)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) sourcePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)           |             |
| public void                                                                                                                                      | [addFile](#addfile)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)              |             |
| protected static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[EntryInfo](ArchiveFile.EntryInfo.md)> | [listFiles](#listfiles)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) dirPath)        |             |



## Field Details

### archivePath

<span style="font-family: monospace; font-size: 80%;">protected Path __archivePath__</span>




---


## Method Details

### load

<span style="font-family: monospace; font-size: 80%;">public static [ArchiveFile](ArchiveFile.md) __load__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath)</span>



**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

### create

<span style="font-family: monospace; font-size: 80%;">public static [ArchiveFile](ArchiveFile.md) __create__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath)</span>



**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

### close

<span style="font-family: monospace; font-size: 80%;">public void __close__()</span>



**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)

**Specified By:**

[AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)


---

### getInputStream

<span style="font-family: monospace; font-size: 80%;">public [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) __getInputStream__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) filePath)</span>




---

### extractFile

<span style="font-family: monospace; font-size: 80%;">public byte[] __extractFile__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) filePath)</span>




---

### extractFile

<span style="font-family: monospace; font-size: 80%;">protected static byte[] __extractFile__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) filePath)</span>




---

### listFiles

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[EntryInfo](ArchiveFile.EntryInfo.md)> __listFiles__()</span>



**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

### listFiles

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[EntryInfo](ArchiveFile.EntryInfo.md)> __listFiles__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) dirPath)</span>



**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

### addDirectory

<span style="font-family: monospace; font-size: 80%;">public void __addDirectory__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) dirPath)</span>



**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

### addDirectory

<span style="font-family: monospace; font-size: 80%;">public void __addDirectory__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) sourcePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

### addFile

<span style="font-family: monospace; font-size: 80%;">public void __addFile__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) sourcePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

### addFile

<span style="font-family: monospace; font-size: 80%;">public void __addFile__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

### listFiles

<span style="font-family: monospace; font-size: 80%;">protected static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[EntryInfo](ArchiveFile.EntryInfo.md)> __listFiles__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) dirPath)</span>



**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

