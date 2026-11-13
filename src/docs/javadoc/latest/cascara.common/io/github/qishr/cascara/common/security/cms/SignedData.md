Package [io.github.qishr.cascara.common.security.cms](index.md)

# Class SignedData
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.cms.SignedData<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __SignedData__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| SignedData([ASN1Integer](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1Integer.md) version, [ASN1Set](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Set.md) digestAlgorithms, [ASN1Sequence](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md) contentInfo, [ASN1TaggedObject](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1TaggedObject.md) certificates, [ASN1Set](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Set.md) signerInfos) |             |



## Method Summary

| Modifier and Type                                                                                                                  | Method                                                                                                                                   | Description |
|------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [ASN1Integer](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1Integer.md)             | [version](#version)()                                                                                                                    |             |
| public [ASN1Set](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Set.md)                   | [digestAlgorithms](#digestalgorithms)()                                                                                                  |             |
| public [ASN1Sequence](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md)         | [contentInfo](#contentinfo)()                                                                                                            |             |
| public [ASN1TaggedObject](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1TaggedObject.md) | [certificates](#certificates)()                                                                                                          |             |
| public [ASN1Set](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Set.md)                   | [signerInfos](#signerinfos)()                                                                                                            |             |
| public static [SignedData](../../../../../../../io/github/qishr/cascara/common/security/cms/SignedData.md)                         | [parse](#parse)([ASN1Sequence](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md) seq) |             |



## Method Details

### version

<span style="font-family: monospace; font-size: 80%;">public [ASN1Integer](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1Integer.md) __version__()</span>




---

### digestAlgorithms

<span style="font-family: monospace; font-size: 80%;">public [ASN1Set](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Set.md) __digestAlgorithms__()</span>




---

### contentInfo

<span style="font-family: monospace; font-size: 80%;">public [ASN1Sequence](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md) __contentInfo__()</span>




---

### certificates

<span style="font-family: monospace; font-size: 80%;">public [ASN1TaggedObject](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1TaggedObject.md) __certificates__()</span>




---

### signerInfos

<span style="font-family: monospace; font-size: 80%;">public [ASN1Set](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Set.md) __signerInfos__()</span>




---

### parse

<span style="font-family: monospace; font-size: 80%;">public static [SignedData](../../../../../../../io/github/qishr/cascara/common/security/cms/SignedData.md) __parse__([ASN1Sequence](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md) seq)</span>




---

