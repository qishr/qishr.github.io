Package [io.github.qishr.cascara.common.security.asn1.encodingrules.ber](index.md)

# Class BERDecoder
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.asn1.encodingrules.ber.BERDecoder<br/>
<br/>
All Implemented Interfaces:<br/>
    [ASN1Decoder](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/encodingrules/ASN1Decoder.md)

Direct Known Subtypes:<br/>
    [DERDecoder](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/encodingrules/der/DERDecoder.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __BERDecoder__</span>


## Constructor Summary

| Constructor  | Description |
|--------------|-------------|
| BERDecoder() |             |



## Method Summary

| Modifier and Type                                                                                          | Method                                                                                                                                       | Description |
|------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [ASN1Tag](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md) | [readTag](#readtag)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)                 |             |
| public int                                                                                                 | [readLength](#readlength)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)           |             |
| public byte[]                                                                                              | [readValue](#readvalue)(int length, [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is) |             |



## Method Details

### readTag

<span style="font-family: monospace; font-size: 80%;">public [ASN1Tag](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md) __readTag__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>



**Specified By:**

[ASN1Decoder](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/encodingrules/ASN1Decoder.md)


---

### readLength

<span style="font-family: monospace; font-size: 80%;">public int __readLength__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>



**Specified By:**

[ASN1Decoder](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/encodingrules/ASN1Decoder.md)


---

### readValue

<span style="font-family: monospace; font-size: 80%;">public byte[] __readValue__(int length, [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>



**Specified By:**

[ASN1Decoder](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/encodingrules/ASN1Decoder.md)


---

