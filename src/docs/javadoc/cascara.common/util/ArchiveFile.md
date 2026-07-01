Package [io.github.qishr.cascara.common.util](index.md)

# Class ArchiveFile
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.ArchiveFile<br/>
<br/>
Direct Known Subtypes:<br/>
    [JarFile](JarFile.md), [VsixPackage](../../cascara.ui/vsix/VsixPackage.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __ArchiveFile__</span>


## Nested Class Summary

| Modifier and Type | Class                                                                               | Description |
|-------------------|-------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.util.ArchiveFile.FileInfo](ArchiveFile.FileInfo.md) |             |



## Field Summary

| Modifier and Type | Field                       | Description |
|-------------------|-----------------------------|-------------|
| protected Path    | [archivePath](#archivepath) |             |



## Constructor Summary

| Constructor                                                                                                           | Description |
|-----------------------------------------------------------------------------------------------------------------------|-------------|
| ArchiveFile([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath) |             |



## Method Summary

| Modifier and Type                                                                                                                              | Method                                                                                                                                                                                                                                       | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [ArchiveFile](ArchiveFile.md)                                                                                                    | [load](#load)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath)                                                                                                                      |             |
| public [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html)                                    | [getInputStream](#getinputstream)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) filePath)                                                                                                     |             |
| public byte[]                                                                                                                                  | [extractFile](#extractfile)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) filePath)                                                                                                           |             |
| protected static byte[]                                                                                                                        | [extractFile](#extractfile)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) filePath) |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[FileInfo](ArchiveFile.FileInfo.md)>           | [listFiles](#listfiles)()                                                                                                                                                                                                                    |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[FileInfo](ArchiveFile.FileInfo.md)>           | [listFiles](#listfiles)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) dirPath)                                                                                                                |             |
| protected static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[FileInfo](ArchiveFile.FileInfo.md)> | [listFiles](#listfiles)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) dirPath)      |             |



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

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[FileInfo](ArchiveFile.FileInfo.md)> __listFiles__()</span>



**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

### listFiles

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[FileInfo](ArchiveFile.FileInfo.md)> __listFiles__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) dirPath)</span>



**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

### listFiles

<span style="font-family: monospace; font-size: 80%;">protected static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[FileInfo](ArchiveFile.FileInfo.md)> __listFiles__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) archivePath, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) dirPath)</span>



**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

