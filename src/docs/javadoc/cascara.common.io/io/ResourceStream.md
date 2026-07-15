Package [io.github.qishr.cascara.common.io](index.md)

# Class ResourceStream
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.io.ResourceStream<br/>
<br/>
All Implemented Interfaces:<br/>
    [AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)


----

<span style="font-family: monospace; font-size: 80%;">public final class __ResourceStream__</span>


## Field Summary

| Modifier and Type        | Field                       | Description |
|--------------------------|-----------------------------|-------------|
| public final ContentType | [contentType](#contenttype) |             |
| public final InputStream | [stream](#stream)           |             |



## Constructor Summary

| Constructor                                                                                                                                                                                      | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ResourceStream([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) stream, [ContentType](../../cascara.common/util/ContentType.md) contentType) |             |



## Method Summary

| Modifier and Type | Method                                                                                                                                | Description |
|-------------------|---------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void       | [close](#close)()                                                                                                                     |             |
| public int        | [read](#read)(byte[] b)                                                                                                               |             |
| public int        | [read](#read)(byte[] b, int off, int len)                                                                                             |             |
| public byte[]     | [readAllBytes](#readallbytes)()                                                                                                       |             |
| public byte[]     | [readNBytes](#readnbytes)(int len)                                                                                                    |             |
| public int        | [readNBytes](#readnbytes)(byte[] b, int off, int len)                                                                                 |             |
| public long       | [skip](#skip)(long n)                                                                                                                 |             |
| public void       | [skipNBytes](#skipnbytes)(long n)                                                                                                     |             |
| public int        | [available](#available)()                                                                                                             |             |
| public long       | [transferTo](#transferto)([OutputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/OutputStream.html) out) |             |



## Field Details

### contentType

<span style="font-family: monospace; font-size: 80%;">public final ContentType __contentType__</span>




---

### stream

<span style="font-family: monospace; font-size: 80%;">public final InputStream __stream__</span>




---


## Method Details

### close

<span style="font-family: monospace; font-size: 80%;">public void __close__()</span>



**Throws:**

[LocalizableIOException](../../cascara.common/diagnostic/LocalizableIOException.md)

**Specified By:**

[AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)


---

### read

<span style="font-family: monospace; font-size: 80%;">public int __read__(byte[] b)</span>



**Throws:**

[LocalizableIOException](../../cascara.common/diagnostic/LocalizableIOException.md)


---

### read

<span style="font-family: monospace; font-size: 80%;">public int __read__(byte[] b, int off, int len)</span>



**Throws:**

[LocalizableIOException](../../cascara.common/diagnostic/LocalizableIOException.md)


---

### readAllBytes

<span style="font-family: monospace; font-size: 80%;">public byte[] __readAllBytes__()</span>



**Throws:**

[LocalizableIOException](../../cascara.common/diagnostic/LocalizableIOException.md)


---

### readNBytes

<span style="font-family: monospace; font-size: 80%;">public byte[] __readNBytes__(int len)</span>



**Throws:**

[LocalizableIOException](../../cascara.common/diagnostic/LocalizableIOException.md)


---

### readNBytes

<span style="font-family: monospace; font-size: 80%;">public int __readNBytes__(byte[] b, int off, int len)</span>



**Throws:**

[LocalizableIOException](../../cascara.common/diagnostic/LocalizableIOException.md)


---

### skip

<span style="font-family: monospace; font-size: 80%;">public long __skip__(long n)</span>



**Throws:**

[LocalizableIOException](../../cascara.common/diagnostic/LocalizableIOException.md)


---

### skipNBytes

<span style="font-family: monospace; font-size: 80%;">public void __skipNBytes__(long n)</span>



**Throws:**

[LocalizableIOException](../../cascara.common/diagnostic/LocalizableIOException.md)


---

### available

<span style="font-family: monospace; font-size: 80%;">public int __available__()</span>



**Throws:**

[LocalizableIOException](../../cascara.common/diagnostic/LocalizableIOException.md)


---

### transferTo

<span style="font-family: monospace; font-size: 80%;">public long __transferTo__([OutputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/OutputStream.html) out)</span>



**Throws:**

[LocalizableIOException](../../cascara.common/diagnostic/LocalizableIOException.md)


---

