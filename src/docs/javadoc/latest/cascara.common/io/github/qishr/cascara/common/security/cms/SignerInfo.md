Package [io.github.qishr.cascara.common.security.cms](index.md)

# Class SignerInfo
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.cms.SignerInfo<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __SignerInfo__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| SignerInfo([BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html) version, [IssuerAndSerialNumber](../../../../../../../io/github/qishr/cascara/common/security/cms/IssuerAndSerialNumber.md) sid, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) digestAlgorithmOid, [ASN1Set](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Set.md) signedAttrs, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) signatureAlgorithmOid, byte[] signatureBytes) |             |



## Method Summary

| Modifier and Type                                                                                                              | Method                                                                                                                                                                                                                                                                                    | Description                                                                     |
|--------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------|
| public [BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html)                    | [version](#version)()                                                                                                                                                                                                                                                                     |                                                                                 |
| public [IssuerAndSerialNumber](../../../../../../../io/github/qishr/cascara/common/security/cms/IssuerAndSerialNumber.md)      | [signerIdentifier](#signeridentifier)()                                                                                                                                                                                                                                                   |                                                                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                            | [digestAlgorithmOid](#digestalgorithmoid)()                                                                                                                                                                                                                                               |                                                                                 |
| public [ASN1Set](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Set.md)               | [signedAttrs](#signedattrs)()                                                                                                                                                                                                                                                             |                                                                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                            | [signatureAlgorithmOid](#signaturealgorithmoid)()                                                                                                                                                                                                                                         |                                                                                 |
| public byte[]                                                                                                                  | [signatureBytes](#signaturebytes)()                                                                                                                                                                                                                                                       |                                                                                 |
| public static [SignerInfo](../../../../../../../io/github/qishr/cascara/common/security/cms/SignerInfo.md)                     | [parse](#parse)([ASN1Sequence](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md) seq)                                                                                                                                                  |                                                                                 |
| public [X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) | [findSigningCertificate](#findsigningcertificate)([Iterable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html)<[X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html)> certificates) | Finds the matching X509Certificate from a list of candidate certs.              |
| public boolean                                                                                                                 | [verifySignature](#verifysignature)([X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) cert, byte[] sfFileBytes)                                                                                                     | Verifies the signature bytes against the raw bytes of the .SF (Signature File). |



## Method Details

### version

<span style="font-family: monospace; font-size: 80%;">public [BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html) __version__()</span>




---

### signerIdentifier

<span style="font-family: monospace; font-size: 80%;">public [IssuerAndSerialNumber](../../../../../../../io/github/qishr/cascara/common/security/cms/IssuerAndSerialNumber.md) __signerIdentifier__()</span>




---

### digestAlgorithmOid

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __digestAlgorithmOid__()</span>




---

### signedAttrs

<span style="font-family: monospace; font-size: 80%;">public [ASN1Set](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Set.md) __signedAttrs__()</span>




---

### signatureAlgorithmOid

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __signatureAlgorithmOid__()</span>




---

### signatureBytes

<span style="font-family: monospace; font-size: 80%;">public byte[] __signatureBytes__()</span>




---

### parse

<span style="font-family: monospace; font-size: 80%;">public static [SignerInfo](../../../../../../../io/github/qishr/cascara/common/security/cms/SignerInfo.md) __parse__([ASN1Sequence](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md) seq)</span>




---

### findSigningCertificate

<span style="font-family: monospace; font-size: 80%;">public [X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) __findSigningCertificate__([Iterable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html)<[X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html)> certificates)</span>

Finds the matching X509Certificate from a list of candidate certs.


---

### verifySignature

<span style="font-family: monospace; font-size: 80%;">public boolean __verifySignature__([X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) cert, byte[] sfFileBytes)</span>

Verifies the signature bytes against the raw bytes of the .SF (Signature File).

**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)


---

