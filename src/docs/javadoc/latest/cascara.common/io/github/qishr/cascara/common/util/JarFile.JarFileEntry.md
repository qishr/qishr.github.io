Package [io.github.qishr.cascara.common.util](index.md)

# Class JarFileEntry
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.util.zip.ZipEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/zip/ZipEntry.html)<br/>
                [java.util.jar.JarEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/jar/JarEntry.html)<br/>
                        io.github.qishr.cascara.common.util.JarFile.JarFileEntry<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.JarFile](../../../../../../io/github/qishr/cascara/common/util/JarFile.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __JarFileEntry__<br/>extends [JarEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/jar/JarEntry.html)
</span>


## Constructor Summary

| Constructor                                                                                                           | Description |
|-----------------------------------------------------------------------------------------------------------------------|-------------|
| JarFileEntry([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)       |             |
| JarFileEntry([ZipEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/zip/ZipEntry.html) ze) |             |



## Method Summary

| Modifier and Type                                                                                                        | Method                                | Description |
|--------------------------------------------------------------------------------------------------------------------------|---------------------------------------|-------------|
| public [Attributes](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/jar/Attributes.html)          | [getAttributes](#getattributes)()     |             |
| public [Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/Certificate.html)[] | [getCertificates](#getcertificates)() |             |
| public [CodeSigner](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/CodeSigner.html)[]        | [getCodeSigners](#getcodesigners)()   |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [getRealName](#getrealname)()         |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [getName](#getname)()                 |             |



## Method Details

### getAttributes

<span style="font-family: monospace; font-size: 80%;">public [Attributes](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/jar/Attributes.html) __getAttributes__()</span>




---

### getCertificates

<span style="font-family: monospace; font-size: 80%;">public [Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/Certificate.html)[] __getCertificates__()</span>



**Overrides:**

[JarEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/jar/JarEntry.html#getcertificates)


---

### getCodeSigners

<span style="font-family: monospace; font-size: 80%;">public [CodeSigner](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/CodeSigner.html)[] __getCodeSigners__()</span>



**Overrides:**

[JarEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/jar/JarEntry.html#getcodesigners)


---

### getRealName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getRealName__()</span>




---

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>



**Overrides:**

[JarEntry](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/jar/JarEntry.html#getname)


---

