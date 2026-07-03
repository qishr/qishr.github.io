Package [io.github.qishr.cascara.ui.vsix](index.md)

# Class VsixPackageStore
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.vsix.VsixPackageStore<br/>
<br/>
All Implemented Interfaces:<br/>
    [AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)


----

<span style="font-family: monospace; font-size: 80%;">public class __VsixPackageStore__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                 | Method                                                                                                                        | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                                                                       | [close](#close)()                                                                                                             |             |
| public static [VsixPackageStore](VsixPackageStore.md)                                                                                                                             | [instance](#instance)()                                                                                                       |             |
| public [ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<[VsixPackageInfo](VsixPackageInfo.md)> | [getPackages](#getpackages)()                                                                                                 |             |
| public void                                                                                                                                                                       | [install](#install)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) packagePath) |             |



## Method Details

### close

<span style="font-family: monospace; font-size: 80%;">public void __close__()</span>



**Specified By:**

[AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)


---

### instance

<span style="font-family: monospace; font-size: 80%;">public static [VsixPackageStore](VsixPackageStore.md) __instance__()</span>




---

### getPackages

<span style="font-family: monospace; font-size: 80%;">public [ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<[VsixPackageInfo](VsixPackageInfo.md)> __getPackages__()</span>




---

### install

<span style="font-family: monospace; font-size: 80%;">public void __install__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) packagePath)</span>



**Throws:**

[LocalizableIOException](../../cascara.common/diagnostic/LocalizableIOException.md)


---

