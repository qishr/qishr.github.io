Package [io.github.qishr.cascara.common.io](index.md)

# Class IOUtils
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.io.IOUtils<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __IOUtils__</span>


## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| IOUtils()   |             |



## Method Summary

| Modifier and Type                                                                                                  | Method                                                                                                                                                                                                                                                                  | Description |
|--------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static void                                                                                                 | [setResourceProvider](#setresourceprovider)([UriScheme](../../../../../../../cascara.common/io/github/qishr/cascara/common/util/UriScheme.md) uriScheme, [ResourceProvider](../../../../../../io/github/qishr/cascara/common/io/provider/ResourceProvider.md) provider) |             |
| public static [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) | [getContentAsStream](#getcontentasstream)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)                                                                                                                                    |             |
| public static [ResourceContent](../../../../../../io/github/qishr/cascara/common/content/ResourceContent.md)       | [getResource](#getresource)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)                                                                                                                                                  |             |
| public static [ResourceStream](../../../../../../io/github/qishr/cascara/common/io/ResourceStream.md)              | [getResourceAsStream](#getresourceasstream)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)                                                                                                                                  |             |
| public static [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)                | [normalizeUri](#normalizeuri)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) string)                                                                                                                                      |             |
| public static [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)                | [normalizeUri](#normalizeuri)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)                                                                                                                                                |             |
| public static [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) | [getContentAsStream](#getcontentasstream)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) uri)                                                                                                                             |             |
| public static [ResourceContent](../../../../../../io/github/qishr/cascara/common/content/ResourceContent.md)       | [getResource](#getresource)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) uri)                                                                                                                                           |             |
| public static [ResourceStream](../../../../../../io/github/qishr/cascara/common/io/ResourceStream.md)              | [getResourceAsStream](#getresourceasstream)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) uri)                                                                                                                           |             |



## Method Details

### setResourceProvider

<span style="font-family: monospace; font-size: 80%;">public static void __setResourceProvider__([UriScheme](../../../../../../../cascara.common/io/github/qishr/cascara/common/util/UriScheme.md) uriScheme, [ResourceProvider](../../../../../../io/github/qishr/cascara/common/io/provider/ResourceProvider.md) provider)</span>




---

### getContentAsStream

<span style="font-family: monospace; font-size: 80%;">public static [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) __getContentAsStream__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)</span>



**Throws:**

[LocalizableIOException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocalizableIOException.md)


---

### getResource

<span style="font-family: monospace; font-size: 80%;">public static [ResourceContent](../../../../../../io/github/qishr/cascara/common/content/ResourceContent.md) __getResource__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)</span>



**Throws:**

[LocalizableIOException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocalizableIOException.md)


---

### getResourceAsStream

<span style="font-family: monospace; font-size: 80%;">public static [ResourceStream](../../../../../../io/github/qishr/cascara/common/io/ResourceStream.md) __getResourceAsStream__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)</span>



**Throws:**

[LocalizableIOException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocalizableIOException.md)


---

### normalizeUri

<span style="font-family: monospace; font-size: 80%;">public static [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __normalizeUri__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) string)</span>



**Throws:**

[LocalizableIOException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocalizableIOException.md)


---

### normalizeUri

<span style="font-family: monospace; font-size: 80%;">public static [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __normalizeUri__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)</span>



**Throws:**

[LocalizableIOException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocalizableIOException.md)


---

### getContentAsStream

<span style="font-family: monospace; font-size: 80%;">public static [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) __getContentAsStream__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) uri)</span>



**Throws:**

[LocalizableIOException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocalizableIOException.md)


---

### getResource

<span style="font-family: monospace; font-size: 80%;">public static [ResourceContent](../../../../../../io/github/qishr/cascara/common/content/ResourceContent.md) __getResource__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) uri)</span>



**Throws:**

[LocalizableIOException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocalizableIOException.md)


---

### getResourceAsStream

<span style="font-family: monospace; font-size: 80%;">public static [ResourceStream](../../../../../../io/github/qishr/cascara/common/io/ResourceStream.md) __getResourceAsStream__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) uri)</span>



**Throws:**

[LocalizableIOException](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocalizableIOException.md)


---

