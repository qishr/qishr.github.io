Package [io.github.qishr.cascara.common.security.asn1](index.md)

# Class ASN1InputStream
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.io.InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html)<br/>
                [java.io.FilterInputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/FilterInputStream.html)<br/>
                        io.github.qishr.cascara.common.security.asn1.ASN1InputStream<br/>
<br/>
All Implemented Interfaces:<br/>
    [Iterable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html)<[ASN1Object](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<?>>


----

<span style="font-family: monospace; font-size: 80%;">public class __ASN1InputStream__<br/>extends [FilterInputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/FilterInputStream.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                          | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ASN1InputStream([ASN1Decoder](../../../../../../../io/github/qishr/cascara/common/security/asn1/encodingrules/ASN1Decoder.md) decoder, [InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) wrapped) |             |
| ASN1InputStream([ASN1Decoder](../../../../../../../io/github/qishr/cascara/common/security/asn1/encodingrules/ASN1Decoder.md) decoder, byte[] value)                                                                                                 |             |



## Method Summary

| Modifier and Type                                                                                       | Method                              | Description |
|---------------------------------------------------------------------------------------------------------|-------------------------------------|-------------|
| public T                                                                                                | [readObject](#readobject)()         |             |
| public byte[]                                                                                           | [readValue](#readvalue)(int length) |             |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html) | [iterator](#iterator)()             |             |
| public [ASN1Tag](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)    | [readTag](#readtag)()               |             |
| public int                                                                                              | [readLength](#readlength)()         |             |



## Method Details

### readObject

<span style="font-family: monospace; font-size: 80%;">public T __readObject__()</span>




---

### readValue

<span style="font-family: monospace; font-size: 80%;">public byte[] __readValue__(int length)</span>




---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html) __iterator__()</span>



**Specified By:**

[Iterable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html)


---

### readTag

<span style="font-family: monospace; font-size: 80%;">public [ASN1Tag](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md) __readTag__()</span>




---

### readLength

<span style="font-family: monospace; font-size: 80%;">public int __readLength__()</span>




---

