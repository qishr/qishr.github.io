Package [io.github.qishr.cascara.common.security.cms](index.md)

# Class Certificate
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.cms.Certificate<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __Certificate__</span>


## Method Summary

| Modifier and Type                                                                                                              | Method                                                                                                                                        | Description |
|--------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [Certificate](../../../../../../../io/github/qishr/cascara/common/security/cms/Certificate.md)                   | [parse](#parse)([ASN1Sequence](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md) sequence) |             |
| public [ASN1Sequence](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md)     | [sequence](#sequence)()                                                                                                                       |             |
| public [X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) | [toX509Certificate](#tox509certificate)()                                                                                                     |             |



## Method Details

### parse

<span style="font-family: monospace; font-size: 80%;">public static [Certificate](../../../../../../../io/github/qishr/cascara/common/security/cms/Certificate.md) __parse__([ASN1Sequence](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md) sequence)</span>




---

### sequence

<span style="font-family: monospace; font-size: 80%;">public [ASN1Sequence](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md) __sequence__()</span>




---

### toX509Certificate

<span style="font-family: monospace; font-size: 80%;">public [X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) __toX509Certificate__()</span>



**Throws:**

[CertificateException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/CertificateException.html)


---

