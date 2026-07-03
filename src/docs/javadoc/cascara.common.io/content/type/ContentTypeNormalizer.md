Package [io.github.qishr.cascara.common.content.type](index.md)

# Class ContentTypeNormalizer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.content.type.ContentTypeNormalizer<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __ContentTypeNormalizer__</span>


## Constructor Summary

| Constructor             | Description |
|-------------------------|-------------|
| ContentTypeNormalizer() |             |



## Method Summary

| Modifier and Type                                                                                                                          | Method                                                                                                                                                                            | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                                | [setReporter](#setreporter)([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)                                                                                  |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[MergedContentType](MergedContentType.md)> | [normalize](#normalize)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../cascara.common/util/ContentType.md)> all) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                        | [normalizeMime](#normalizemime)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mime)                                                |             |
| public boolean                                                                                                                             | [isTextual](#istextual)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mime)                                                        |             |
| public int                                                                                                                                 | [complexityScore](#complexityscore)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mime)                                            |             |



## Method Details

### setReporter

<span style="font-family: monospace; font-size: 80%;">public void __setReporter__([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>




---

### normalize

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[MergedContentType](MergedContentType.md)> __normalize__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../cascara.common/util/ContentType.md)> all)</span>




---

### normalizeMime

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __normalizeMime__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mime)</span>




---

### isTextual

<span style="font-family: monospace; font-size: 80%;">public boolean __isTextual__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mime)</span>




---

### complexityScore

<span style="font-family: monospace; font-size: 80%;">public int __complexityScore__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mime)</span>




---

