Package [io.github.qishr.cascara.common.io](index.md)

# Class ResourceStream
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.io.InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html)<br/>
                io.github.qishr.cascara.common.io.ResourceStream<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __ResourceStream__<br/>extends [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html)
</span>


## Field Summary

| Modifier and Type        | Field                       | Description |
|--------------------------|-----------------------------|-------------|
| public ContentType       | [contentType](#contenttype) |             |
| public final InputStream | [stream](#stream)           |             |



## Constructor Summary

| Constructor                                                                                                                                                                                      | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ResourceStream([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) stream, [ContentType](../../cascara.common/util/ContentType.md) contentType) |             |



## Method Summary

| Modifier and Type                          | Method                                                                                                                                | Description |
|--------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [ResourceStream](ResourceStream.md) | [setContentType](#setcontenttype)([ContentType](../../cascara.common/util/ContentType.md) contentType)                                |             |
| public void                                | [close](#close)()                                                                                                                     |             |
| public int                                 | [read](#read)(byte[] b)                                                                                                               |             |
| public int                                 | [read](#read)(byte[] b, int off, int len)                                                                                             |             |
| public byte[]                              | [readAllBytes](#readallbytes)()                                                                                                       |             |
| public byte[]                              | [readNBytes](#readnbytes)(int len)                                                                                                    |             |
| public int                                 | [readNBytes](#readnbytes)(byte[] b, int off, int len)                                                                                 |             |
| public long                                | [skip](#skip)(long n)                                                                                                                 |             |
| public void                                | [skipNBytes](#skipnbytes)(long n)                                                                                                     |             |
| public int                                 | [available](#available)()                                                                                                             |             |
| public long                                | [transferTo](#transferto)([OutputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/OutputStream.html) out) |             |
| public int                                 | [read](#read)()                                                                                                                       |             |



## Field Details

### contentType

<span style="font-family: monospace; font-size: 80%;">public ContentType __contentType__</span>




---

### stream

<span style="font-family: monospace; font-size: 80%;">public final InputStream __stream__</span>




---


## Method Details

### setContentType

<span style="font-family: monospace; font-size: 80%;">public [ResourceStream](ResourceStream.md) __setContentType__([ContentType](../../cascara.common/util/ContentType.md) contentType)</span>




---

### close

<span style="font-family: monospace; font-size: 80%;">public void __close__()</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)

**Overrides:**

[InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html#close)


---

### read

<span style="font-family: monospace; font-size: 80%;">public int __read__(byte[] b)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### read

<span style="font-family: monospace; font-size: 80%;">public int __read__(byte[] b, int off, int len)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### readAllBytes

<span style="font-family: monospace; font-size: 80%;">public byte[] __readAllBytes__()</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### readNBytes

<span style="font-family: monospace; font-size: 80%;">public byte[] __readNBytes__(int len)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### readNBytes

<span style="font-family: monospace; font-size: 80%;">public int __readNBytes__(byte[] b, int off, int len)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### skip

<span style="font-family: monospace; font-size: 80%;">public long __skip__(long n)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### skipNBytes

<span style="font-family: monospace; font-size: 80%;">public void __skipNBytes__(long n)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### available

<span style="font-family: monospace; font-size: 80%;">public int __available__()</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### transferTo

<span style="font-family: monospace; font-size: 80%;">public long __transferTo__([OutputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/OutputStream.html) out)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### read

<span style="font-family: monospace; font-size: 80%;">public int __read__()</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)

**Overrides:**

[InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html#read)


---

