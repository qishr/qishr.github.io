Package [io.github.qishr.cascara.ui.vsix](index.md)

# Class VsixPackage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.util.ArchiveFile](../../cascara.common/util/ArchiveFile.md)<br/>
                io.github.qishr.cascara.ui.vsix.VsixPackage<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __VsixPackage__<br/>extends [ArchiveFile](../../cascara.common/util/ArchiveFile.md)
</span>


## Method Summary

| Modifier and Type                                                                                                                                                                             | Method                                                                                                                         | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [VsixPackage](VsixPackage.md)                                                                                                                                                   | [load](#load)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) vsixPath)           |             |
| public static [VsixPackage](VsixPackage.md)                                                                                                                                                   | [fromJson](#fromjson)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) jsonString) |             |
| public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)                                                                                                  | [getDownloadUri](#getdownloaduri)()                                                                                            |             |
| public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)                                                                                                  | [getPreviewUri](#getpreviewuri)()                                                                                              |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getName](#getname)()                                                                                                          |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getDescription](#getdescription)()                                                                                            |             |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                           | [getPath](#getpath)()                                                                                                          |             |
| public [Properties](../../cascara.common/util/Properties.md)                                                                                                                                  | [getProperties](#getproperties)()                                                                                              |             |
| public [Properties](../../cascara.common/util/Properties.md)                                                                                                                                  | [getManifest](#getmanifest)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getIconUri](#geticonuri)()                                                                                                    |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getDisplayName](#getdisplayname)()                                                                                            |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getCategories](#getcategories)()                                                                                              |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[VsixThemeInfo](VsixThemeInfo.md)>                                                            | [getThemes](#getthemes)()                                                                                                      |             |


### Methods inherited from [ArchiveFile](../../cascara.common/util/ArchiveFile.md)

listFiles, extractFile, getInputStream, listFiles, extractFile, listFiles


## Method Details

### load

<span style="font-family: monospace; font-size: 80%;">public static [VsixPackage](VsixPackage.md) __load__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) vsixPath)</span>



**Throws:**

[LocalizableIOException](../../cascara.common/diagnostic/LocalizableIOException.md)


---

### fromJson

<span style="font-family: monospace; font-size: 80%;">public static [VsixPackage](VsixPackage.md) __fromJson__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) jsonString)</span>



**Throws:**

[LocalizableException](../../cascara.common/diagnostic/LocalizableException.md)


---

### getDownloadUri

<span style="font-family: monospace; font-size: 80%;">public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __getDownloadUri__()</span>




---

### getPreviewUri

<span style="font-family: monospace; font-size: 80%;">public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __getPreviewUri__()</span>




---

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### getDescription

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDescription__()</span>




---

### getPath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getPath__()</span>




---

### getProperties

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../cascara.common/util/Properties.md) __getProperties__()</span>




---

### getManifest

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../cascara.common/util/Properties.md) __getManifest__()</span>




---

### getIconUri

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getIconUri__()</span>




---

### getDisplayName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDisplayName__()</span>




---

### getCategories

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getCategories__()</span>




---

### getThemes

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[VsixThemeInfo](VsixThemeInfo.md)> __getThemes__()</span>




---

