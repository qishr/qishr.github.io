Package [io.github.qishr.cascara.common.security.asn1](index.md)

# Class ASN1Parser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.asn1.ASN1Parser<br/>
<br/>
Direct Known Subtypes:<br/>
    [Parser](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1TaggedObject.Parser.md), [Parser](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Set.Parser.md), [Parser](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.Parser.md), [Parser](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1ObjectIdentifier.Parser.md), [Parser](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1Boolean.Parser.md), [Parser](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1Enumerated.Parser.md), [Parser](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1Integer.Parser.md), [Parser](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1Null.Parser.md), [Parser](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1UTCTime.Parser.md), [Parser](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1BitString.Parser.md), [Parser](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1OctetString.Parser.md), [Parser](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1PrintableString.Parser.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __ASN1Parser__</span>


## Field Summary

| Modifier and Type     | Field               | Description |
|-----------------------|---------------------|-------------|
| protected ASN1Decoder | [decoder](#decoder) |             |



## Constructor Summary

| Constructor                                                                                                                       | Description |
|-----------------------------------------------------------------------------------------------------------------------------------|-------------|
| ASN1Parser([ASN1Decoder](../../../../../../../io/github/qishr/cascara/common/security/asn1/encodingrules/ASN1Decoder.md) decoder) |             |



## Method Summary

| Modifier and Type | Method                                                                                                                                  | Description |
|-------------------|-----------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract T | [parse](#parse)([ASN1Tag](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)<T> asn1Tag, byte[] value) |             |



## Field Details

### decoder

<span style="font-family: monospace; font-size: 80%;">protected ASN1Decoder __decoder__</span>




---


## Method Details

### parse

<span style="font-family: monospace; font-size: 80%;">public abstract T __parse__([ASN1Tag](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)<T> asn1Tag, byte[] value)</span>




---

