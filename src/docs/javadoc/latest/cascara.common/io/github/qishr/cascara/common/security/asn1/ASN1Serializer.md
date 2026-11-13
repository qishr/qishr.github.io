Package [io.github.qishr.cascara.common.security.asn1](index.md)

# Class ASN1Serializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.asn1.ASN1Serializer<br/>
<br/>
Direct Known Subtypes:<br/>
    [Serializer](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1TaggedObject.Serializer.md), [Serializer](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Set.Serializer.md), [Serializer](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.Serializer.md), [Serializer](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1ObjectIdentifier.Serializer.md), [Serializer](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1Boolean.Serializer.md), [Serializer](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1Enumerated.Serializer.md), [Serializer](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1Integer.Serializer.md), [Serializer](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1Null.Serializer.md), [Serializer](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1UTCTime.Serializer.md), [Serializer](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1BitString.Serializer.md), [Serializer](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1OctetString.Serializer.md), [Serializer](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1PrintableString.Serializer.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __ASN1Serializer__</span>


## Field Summary

| Modifier and Type           | Field               | Description |
|-----------------------------|---------------------|-------------|
| protected final ASN1Encoder | [encoder](#encoder) |             |



## Constructor Summary

| Constructor                                                                                                                           | Description |
|---------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ASN1Serializer([ASN1Encoder](../../../../../../../io/github/qishr/cascara/common/security/asn1/encodingrules/ASN1Encoder.md) encoder) |             |



## Method Summary

| Modifier and Type    | Method                                                                                                                                                  | Description |
|----------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract int  | [serializedLength](#serializedlength)(T asn1Object)                                                                                                     |             |
| public abstract void | [serialize](#serialize)(T asn1Object, [ASN1OutputStream](../../../../../../../io/github/qishr/cascara/common/security/asn1/ASN1OutputStream.md) stream) |             |



## Field Details

### encoder

<span style="font-family: monospace; font-size: 80%;">protected final ASN1Encoder __encoder__</span>




---


## Method Details

### serializedLength

<span style="font-family: monospace; font-size: 80%;">public abstract int __serializedLength__(T asn1Object)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### serialize

<span style="font-family: monospace; font-size: 80%;">public abstract void __serialize__(T asn1Object, [ASN1OutputStream](../../../../../../../io/github/qishr/cascara/common/security/asn1/ASN1OutputStream.md) stream)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

