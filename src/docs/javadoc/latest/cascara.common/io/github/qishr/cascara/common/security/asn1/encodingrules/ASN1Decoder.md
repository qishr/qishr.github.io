Package [io.github.qishr.cascara.common.security.asn1.encodingrules](index.md)

# Interface ASN1Decoder
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.asn1.encodingrules.ASN1Decoder<br/>
<br/>
All Known Implementing Classes:<br/>
    [BERDecoder](../../../../../../../../io/github/qishr/cascara/common/security/asn1/encodingrules/ber/BERDecoder.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ASN1Decoder__</span>


## Method Summary

| Modifier and Type                                                                                                | Method                                                                                                                                       | Description |
|------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md) | [readTag](#readtag)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)                 |             |
| public abstract int                                                                                              | [readLength](#readlength)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)           |             |
| public abstract byte[]                                                                                           | [readValue](#readvalue)(int length, [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is) |             |



## Method Details

### readTag

<span style="font-family: monospace; font-size: 80%;">public abstract [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md) __readTag__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>




---

### readLength

<span style="font-family: monospace; font-size: 80%;">public abstract int __readLength__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>




---

### readValue

<span style="font-family: monospace; font-size: 80%;">public abstract byte[] __readValue__(int length, [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>




---

